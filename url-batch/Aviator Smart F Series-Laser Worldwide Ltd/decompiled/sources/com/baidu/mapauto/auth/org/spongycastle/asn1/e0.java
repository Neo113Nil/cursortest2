package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class e0 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v f7779a;

    public e0(v vVar) {
        this.f7779a = vVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return new d0(this.f7779a.b());
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
