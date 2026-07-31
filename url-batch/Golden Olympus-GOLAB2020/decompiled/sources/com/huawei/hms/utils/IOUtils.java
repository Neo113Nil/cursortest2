package com.huawei.hms.utils;

import android.content.res.AssetManager;
import com.huawei.hms.support.log.HMSLog;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(Reader reader) {
        closeQuietly((Closeable) reader);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        return copy(inputStream, outputStream, new byte[Base64Utils.IO_BUFFER_SIZE]);
    }

    public static byte[] readAssetsFile(AssetManager assetManager, String str) {
        if (assetManager == null || str == null) {
            HMSLog.e("IOUtils", "readAssetFile args error");
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            try {
                inputStream = assetManager.open(str);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        closeQuietly(inputStream);
                        closeQuietly((OutputStream) byteArrayOutputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e4) {
                HMSLog.e("IOUtils", String.format(Locale.ROOT, "Failed to open %s", str), e4);
                closeQuietly(inputStream);
                closeQuietly((OutputStream) byteArrayOutputStream);
                return new byte[0];
            }
        } catch (Throwable th) {
            closeQuietly(inputStream);
            closeQuietly((OutputStream) byteArrayOutputStream);
            throw th;
        }
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static InputStream toInputStream(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public static void closeQuietly(Writer writer) {
        closeQuietly((Closeable) writer);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        long j4 = 0;
        if (inputStream != null && outputStream != null) {
            if (bArr == null) {
                bArr = new byte[Base64Utils.IO_BUFFER_SIZE];
            }
            while (true) {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                j4 += read;
            }
        }
        return j4;
    }

    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HMSLog.e("IOUtils", "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }
}
