package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

/* loaded from: classes.dex */
public final class vm3 implements ad3 {

    /* renamed from: a, reason: collision with root package name */
    private final ECPrivateKey f13451a;

    /* renamed from: b, reason: collision with root package name */
    private final xm3 f13452b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13453c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f13454d;

    /* renamed from: e, reason: collision with root package name */
    private final um3 f13455e;

    public vm3(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i7, um3 um3Var) {
        this.f13451a = eCPrivateKey;
        this.f13452b = new xm3(eCPrivateKey);
        this.f13454d = bArr;
        this.f13453c = str;
        this.f13455e = um3Var;
    }
}
