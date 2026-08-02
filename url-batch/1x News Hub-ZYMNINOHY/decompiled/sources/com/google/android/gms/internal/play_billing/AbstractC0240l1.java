package com.google.android.gms.internal.play_billing;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.play_billing.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0240l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2880a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2881b;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        f2880a = Charset.forName(CharEncoding.UTF_8);
        Charset.forName(CharEncoding.ISO_8859_1);
        byte[] bArr = new byte[0];
        f2881b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
