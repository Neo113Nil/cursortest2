package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t {
    private static final Map<String, q0> taskCache = new HashMap();
    private static final byte[] MAGIC = {80, 75, 3, 4};

    private t() {
    }

    private static q0 cache(@Nullable final String str, Callable<o0> callable) {
        final h hVar = str == null ? null : com.airbnb.lottie.model.f.getInstance().get(str);
        if (hVar != null) {
            return new q0(new Callable() { // from class: com.airbnb.lottie.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    o0 lambda$cache$8;
                    lambda$cache$8 = t.lambda$cache$8(h.this);
                    return lambda$cache$8;
                }
            });
        }
        if (str != null) {
            Map<String, q0> map = taskCache;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        q0 q0Var = new q0(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            q0Var.addListener(new k0() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.k0
                public final void onResult(Object obj) {
                    t.lambda$cache$9(str, atomicBoolean, (h) obj);
                }
            });
            q0Var.addFailureListener(new k0() { // from class: com.airbnb.lottie.o
                @Override // com.airbnb.lottie.k0
                public final void onResult(Object obj) {
                    t.lambda$cache$10(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                taskCache.put(str, q0Var);
            }
        }
        return q0Var;
    }

    public static void clearCache(Context context) {
        taskCache.clear();
        com.airbnb.lottie.model.f.getInstance().clear();
        c.networkCache(context).clear();
    }

    @Nullable
    private static j0 findImageAssetForFileName(h hVar, String str) {
        for (j0 j0Var : hVar.getImages().values()) {
            if (j0Var.getFileName().equals(str)) {
                return j0Var;
            }
        }
        return null;
    }

    public static q0 fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    @WorkerThread
    public static o0 fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    @Deprecated
    public static q0 fromJson(final JSONObject jSONObject, @Nullable final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 fromJsonSync;
                fromJsonSync = t.fromJsonSync(jSONObject, str);
                return fromJsonSync;
            }
        });
    }

    public static q0 fromJsonInputStream(final InputStream inputStream, @Nullable final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 fromJsonInputStreamSync;
                fromJsonInputStreamSync = t.fromJsonInputStreamSync(inputStream, str);
                return fromJsonInputStreamSync;
            }
        });
    }

    @WorkerThread
    public static o0 fromJsonInputStreamSync(InputStream inputStream, @Nullable String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static q0 fromJsonReader(final JsonReader jsonReader, @Nullable final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 fromJsonReaderSync;
                fromJsonReaderSync = t.fromJsonReaderSync(JsonReader.this, str);
                return fromJsonReaderSync;
            }
        });
    }

    @WorkerThread
    public static o0 fromJsonReaderSync(JsonReader jsonReader, @Nullable String str) {
        return fromJsonReaderSyncInternal(jsonReader, str, true);
    }

    private static o0 fromJsonReaderSyncInternal(JsonReader jsonReader, @Nullable String str, boolean z7) {
        try {
            try {
                h parse = com.airbnb.lottie.parser.w.parse(jsonReader);
                if (str != null) {
                    com.airbnb.lottie.model.f.getInstance().put(str, parse);
                }
                o0 o0Var = new o0(parse);
                if (z7) {
                    com.airbnb.lottie.utils.j.closeQuietly(jsonReader);
                }
                return o0Var;
            } catch (Exception e8) {
                o0 o0Var2 = new o0((Throwable) e8);
                if (z7) {
                    com.airbnb.lottie.utils.j.closeQuietly(jsonReader);
                }
                return o0Var2;
            }
        } catch (Throwable th) {
            if (z7) {
                com.airbnb.lottie.utils.j.closeQuietly(jsonReader);
            }
            throw th;
        }
    }

    public static q0 fromJsonString(final String str, @Nullable final String str2) {
        return cache(str2, new Callable() { // from class: com.airbnb.lottie.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 fromJsonStringSync;
                fromJsonStringSync = t.fromJsonStringSync(str, str2);
                return fromJsonStringSync;
            }
        });
    }

    @WorkerThread
    public static o0 fromJsonStringSync(String str, @Nullable String str2) {
        return fromJsonReaderSync(JsonReader.of(okio.j0.buffer(okio.j0.source(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @WorkerThread
    @Deprecated
    public static o0 fromJsonSync(JSONObject jSONObject, @Nullable String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static q0 fromRawRes(Context context, @RawRes int i8) {
        return fromRawRes(context, i8, rawResCacheKey(context, i8));
    }

    @WorkerThread
    public static o0 fromRawResSync(Context context, @RawRes int i8) {
        return fromRawResSync(context, i8, rawResCacheKey(context, i8));
    }

    public static q0 fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    @WorkerThread
    public static o0 fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static q0 fromZipStream(final ZipInputStream zipInputStream, @Nullable final String str) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 fromZipStreamSync;
                fromZipStreamSync = t.fromZipStreamSync(zipInputStream, str);
                return fromZipStreamSync;
            }
        });
    }

    @WorkerThread
    public static o0 fromZipStreamSync(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return fromZipStreamSyncInternal(zipInputStream, str);
        } finally {
            com.airbnb.lottie.utils.j.closeQuietly(zipInputStream);
        }
    }

    @WorkerThread
    private static o0 fromZipStreamSyncInternal(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            h hVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    hVar = (h) fromJsonReaderSyncInternal(JsonReader.of(okio.j0.buffer(okio.j0.source(zipInputStream))), null, false).getValue();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (hVar == null) {
                return new o0((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                j0 findImageAssetForFileName = findImageAssetForFileName(hVar, (String) entry.getKey());
                if (findImageAssetForFileName != null) {
                    findImageAssetForFileName.setBitmap(com.airbnb.lottie.utils.j.resizeBitmapIfNeeded((Bitmap) entry.getValue(), findImageAssetForFileName.getWidth(), findImageAssetForFileName.getHeight()));
                }
            }
            for (Map.Entry<String, j0> entry2 : hVar.getImages().entrySet()) {
                if (entry2.getValue().getBitmap() == null) {
                    return new o0((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().getFileName()));
                }
            }
            if (str != null) {
                com.airbnb.lottie.model.f.getInstance().put(str, hVar);
            }
            return new o0(hVar);
        } catch (IOException e8) {
            return new o0((Throwable) e8);
        }
    }

    private static boolean isNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean isZipCompressed(okio.e eVar) {
        try {
            okio.e peek = eVar.peek();
            for (byte b8 : MAGIC) {
                if (peek.readByte() != b8) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e8) {
            com.airbnb.lottie.utils.f.error("Failed to check zip file header", e8);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cache$10(String str, AtomicBoolean atomicBoolean, Throwable th) {
        taskCache.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0 lambda$cache$8(h hVar) {
        return new o0(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cache$9(String str, AtomicBoolean atomicBoolean, h hVar) {
        taskCache.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0 lambda$fromRawRes$2(WeakReference weakReference, Context context, int i8, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fromRawResSync(context, i8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0 lambda$fromUrl$0(Context context, String str, String str2) {
        o0 fetchSync = c.networkFetcher(context).fetchSync(str, str2);
        if (str2 != null && fetchSync.getValue() != null) {
            com.airbnb.lottie.model.f.getInstance().put(str2, (h) fetchSync.getValue());
        }
        return fetchSync;
    }

    private static String rawResCacheKey(Context context, @RawRes int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(isNightMode(context) ? "_night_" : "_day_");
        sb.append(i8);
        return sb.toString();
    }

    public static void setMaxCacheSize(int i8) {
        com.airbnb.lottie.model.f.getInstance().resize(i8);
    }

    @WorkerThread
    private static o0 fromJsonInputStreamSync(InputStream inputStream, @Nullable String str, boolean z7) {
        try {
            return fromJsonReaderSync(JsonReader.of(okio.j0.buffer(okio.j0.source(inputStream))), str);
        } finally {
            if (z7) {
                com.airbnb.lottie.utils.j.closeQuietly(inputStream);
            }
        }
    }

    public static q0 fromRawRes(Context context, @RawRes final int i8, @Nullable final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return cache(str, new Callable() { // from class: com.airbnb.lottie.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 lambda$fromRawRes$2;
                lambda$fromRawRes$2 = t.lambda$fromRawRes$2(weakReference, applicationContext, i8, str);
                return lambda$fromRawRes$2;
            }
        });
    }

    @WorkerThread
    public static o0 fromRawResSync(Context context, @RawRes int i8, @Nullable String str) {
        try {
            okio.e buffer = okio.j0.buffer(okio.j0.source(context.getResources().openRawResource(i8)));
            return isZipCompressed(buffer).booleanValue() ? fromZipStreamSync(new ZipInputStream(buffer.inputStream()), str) : fromJsonInputStreamSync(buffer.inputStream(), str);
        } catch (Resources.NotFoundException e8) {
            return new o0((Throwable) e8);
        }
    }

    public static q0 fromUrl(final Context context, final String str, @Nullable final String str2) {
        return cache(str2, new Callable() { // from class: com.airbnb.lottie.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 lambda$fromUrl$0;
                lambda$fromUrl$0 = t.lambda$fromUrl$0(context, str, str2);
                return lambda$fromUrl$0;
            }
        });
    }

    @WorkerThread
    public static o0 fromUrlSync(Context context, String str, @Nullable String str2) {
        o0 fetchSync = c.networkFetcher(context).fetchSync(str, str2);
        if (str2 != null && fetchSync.getValue() != null) {
            com.airbnb.lottie.model.f.getInstance().put(str2, (h) fetchSync.getValue());
        }
        return fetchSync;
    }

    public static q0 fromAsset(Context context, final String str, @Nullable final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return cache(str2, new Callable() { // from class: com.airbnb.lottie.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 fromAssetSync;
                fromAssetSync = t.fromAssetSync(applicationContext, str, str2);
                return fromAssetSync;
            }
        });
    }

    @WorkerThread
    public static o0 fromAssetSync(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return fromJsonInputStreamSync(context.getAssets().open(str), str2);
            }
            return fromZipStreamSync(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e8) {
            return new o0((Throwable) e8);
        }
    }
}
