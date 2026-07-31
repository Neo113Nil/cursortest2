package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
public final class wm3 implements bd3 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f13868f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final zm3 f13869a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13870b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f13871c;

    /* renamed from: d, reason: collision with root package name */
    private final um3 f13872d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13873e;

    public wm3(ECPublicKey eCPublicKey, byte[] bArr, String str, int i7, um3 um3Var) {
        an3.c(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f13869a = new zm3(eCPublicKey);
        this.f13871c = bArr;
        this.f13870b = str;
        this.f13873e = i7;
        this.f13872d = um3Var;
    }

    @Override // com.google.android.gms.internal.ads.bd3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ym3 a7 = this.f13869a.a(this.f13870b, this.f13871c, bArr2, this.f13872d.zza(), this.f13873e);
        byte[] a8 = this.f13872d.a(a7.b()).a(bArr, f13868f);
        byte[] a9 = a7.a();
        return ByteBuffer.allocate(a9.length + a8.length).put(a9).put(a8).array();
    }
}
