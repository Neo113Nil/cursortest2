package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class z implements d, p1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7857a;

    /* renamed from: b, reason: collision with root package name */
    public final v f7858b;

    public z(int i8, v vVar) {
        this.f7857a = i8;
        this.f7858b = vVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return new y(this.f7857a, this.f7858b.b());
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
