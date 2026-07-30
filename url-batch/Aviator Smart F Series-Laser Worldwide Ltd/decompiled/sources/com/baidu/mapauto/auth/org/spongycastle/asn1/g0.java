package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class g0 implements d, p1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f7784a;

    public g0(v vVar) {
        this.f7784a = vVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return new f0(this.f7784a.b());
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        try {
            return a();
        } catch (IOException e8) {
            throw new q(e8.getMessage(), e8);
        }
    }
}
