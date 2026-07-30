package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.h;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t;
import com.crrepa.ble.nrf.dfu.DfuBaseService;
import com.yanzhenjie.kalle.i;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class g {

    @NonNull
    private final e fetcher;

    @NonNull
    private final f networkCache;

    public g(@NonNull f fVar, @NonNull e eVar) {
        this.networkCache = fVar;
        this.fetcher = eVar;
    }

    @Nullable
    @WorkerThread
    private h fetchFromCache(@NonNull String str, @Nullable String str2) {
        Pair<FileExtension, InputStream> fetch;
        if (str2 == null || (fetch = this.networkCache.fetch(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) fetch.first;
        InputStream inputStream = (InputStream) fetch.second;
        o0 fromZipStreamSync = fileExtension == FileExtension.ZIP ? t.fromZipStreamSync(new ZipInputStream(inputStream), str) : t.fromJsonInputStreamSync(inputStream, str);
        if (fromZipStreamSync.getValue() != null) {
            return (h) fromZipStreamSync.getValue();
        }
        return null;
    }

    @NonNull
    @WorkerThread
    private o0 fetchFromNetwork(@NonNull String str, @Nullable String str2) {
        com.airbnb.lottie.utils.f.debug("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                c fetchSync = this.fetcher.fetchSync(str);
                if (!fetchSync.isSuccessful()) {
                    o0 o0Var = new o0((Throwable) new IllegalArgumentException(fetchSync.error()));
                    try {
                        fetchSync.close();
                    } catch (IOException e8) {
                        com.airbnb.lottie.utils.f.warning("LottieFetchResult close failed ", e8);
                    }
                    return o0Var;
                }
                o0 fromInputStream = fromInputStream(str, fetchSync.bodyByteStream(), fetchSync.contentType(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(fromInputStream.getValue() != null);
                com.airbnb.lottie.utils.f.debug(sb.toString());
                try {
                    fetchSync.close();
                } catch (IOException e9) {
                    com.airbnb.lottie.utils.f.warning("LottieFetchResult close failed ", e9);
                }
                return fromInputStream;
            } catch (Exception e10) {
                o0 o0Var2 = new o0((Throwable) e10);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e11) {
                        com.airbnb.lottie.utils.f.warning("LottieFetchResult close failed ", e11);
                    }
                }
                return o0Var2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e12) {
                    com.airbnb.lottie.utils.f.warning("LottieFetchResult close failed ", e12);
                }
            }
            throw th;
        }
    }

    @NonNull
    private o0 fromInputStream(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) {
        FileExtension fileExtension;
        o0 fromZipStream;
        if (str2 == null) {
            str2 = i.VALUE_APPLICATION_JSON;
        }
        if (str2.contains(DfuBaseService.MIME_TYPE_ZIP) || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.f.debug("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            fromZipStream = fromZipStream(str, inputStream, str3);
        } else {
            com.airbnb.lottie.utils.f.debug("Received json response.");
            fileExtension = FileExtension.JSON;
            fromZipStream = fromJsonStream(str, inputStream, str3);
        }
        if (str3 != null && fromZipStream.getValue() != null) {
            this.networkCache.renameTempFile(str, fileExtension);
        }
        return fromZipStream;
    }

    @NonNull
    private o0 fromJsonStream(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) {
        return str2 == null ? t.fromJsonInputStreamSync(inputStream, null) : t.fromJsonInputStreamSync(new FileInputStream(this.networkCache.writeTempCacheFile(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    @NonNull
    private o0 fromZipStream(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) {
        return str2 == null ? t.fromZipStreamSync(new ZipInputStream(inputStream), null) : t.fromZipStreamSync(new ZipInputStream(new FileInputStream(this.networkCache.writeTempCacheFile(str, inputStream, FileExtension.ZIP))), str);
    }

    @NonNull
    @WorkerThread
    public o0 fetchSync(@NonNull String str, @Nullable String str2) {
        h fetchFromCache = fetchFromCache(str, str2);
        if (fetchFromCache != null) {
            return new o0(fetchFromCache);
        }
        com.airbnb.lottie.utils.f.debug("Animation for " + str + " not found in cache. Fetching from network.");
        return fetchFromNetwork(str, str2);
    }
}
