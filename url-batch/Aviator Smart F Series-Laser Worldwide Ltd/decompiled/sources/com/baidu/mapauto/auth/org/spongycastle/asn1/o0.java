package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class o0 implements d, p1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f7814a;

    public o0(v vVar) {
        this.f7814a = vVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        try {
            return new n0(this.f7814a.b());
        } catch (IllegalArgumentException e8) {
            throw new g(e8.getMessage(), e8);
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        try {
            return a();
        } catch (IOException e8) {
            throw new q("unable to get DER object", e8);
        } catch (IllegalArgumentException e9) {
            throw new q("unable to get DER object", e9);
        }
    }
}
