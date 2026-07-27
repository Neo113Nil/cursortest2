package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.play_billing.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0349l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5205a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5206b;

    static {
        Charset.forName("US-ASCII");
        f5205a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5206b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
