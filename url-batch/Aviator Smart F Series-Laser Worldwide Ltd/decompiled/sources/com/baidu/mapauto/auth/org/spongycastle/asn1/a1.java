package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class a1 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v f7762a;

    public a1(v vVar) {
        this.f7762a = vVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return new z0(this.f7762a.b());
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        try {
            return a();
        } catch (IOException e8) {
            throw new IllegalStateException(e8.getMessage());
        }
    }
}
