package io.appmetrica.analytics.coreutils.internal.io;

import O3.l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class GZIPUtils {
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    public static final byte[] gzipBytes(byte[] bArr) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            CloseableUtilsKt.closeSafely(gZIPOutputStream);
            CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            CloseableUtilsKt.closeSafely(gZIPOutputStream);
            CloseableUtilsKt.closeSafely(byteArrayOutputStream2);
            throw th;
        }
    }

    public static final byte[] unGzipBytes(byte[] bArr) throws IOException {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream3);
                try {
                    byte[] t4 = l.t(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(byteArrayInputStream3);
                    return t4;
                } catch (Throwable th2) {
                    byteArrayInputStream = byteArrayInputStream3;
                    th = th2;
                    byteArrayInputStream2 = byteArrayInputStream;
                    CloseableUtilsKt.closeSafely(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(byteArrayInputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                byteArrayInputStream = byteArrayInputStream3;
                th = th3;
                gZIPInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            gZIPInputStream = null;
        }
    }
}
