package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class c1 implements d, p1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f7776a;

    public c1(v vVar) {
        this.f7776a = vVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return new b1(this.f7776a.b());
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
