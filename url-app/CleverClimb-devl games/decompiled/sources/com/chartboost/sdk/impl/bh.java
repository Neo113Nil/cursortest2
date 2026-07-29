package com.chartboost.sdk.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class bh {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f3795a = BigInteger.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f3796b = f3795a.multiply(f3795a);

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f3797c = f3795a.multiply(f3796b);

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f3798d = f3795a.multiply(f3797c);
    public static final BigInteger e = f3795a.multiply(f3798d);
    public static final BigInteger f = f3795a.multiply(e);
    public static final BigInteger g = BigInteger.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID).multiply(BigInteger.valueOf(1152921504606846976L));
    public static final BigInteger h = f3795a.multiply(g);
    public static final File[] i = new File[0];
    private static final Charset j = Charset.forName("UTF-8");

    public static FileInputStream a(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canRead()) {
                throw new IOException("File '" + file + "' cannot be read");
            }
            return new FileInputStream(file);
        }
        throw new FileNotFoundException("File '" + file + "' does not exist");
    }

    public static byte[] b(File file) throws IOException {
        FileInputStream fileInputStream;
        try {
            fileInputStream = a(file);
            try {
                byte[] a2 = bi.a(fileInputStream, file.length());
                bi.a((InputStream) fileInputStream);
                return a2;
            } catch (Throwable th) {
                th = th;
                bi.a((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
