package com.google.android.gms.internal.play_billing;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5803a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5804b;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        f5803a = Charset.forName(CharEncoding.UTF_8);
        Charset.forName(CharEncoding.ISO_8859_1);
        byte[] bArr = new byte[0];
        f5804b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
