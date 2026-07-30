package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class i0 implements d, p1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7793b;

    /* renamed from: c, reason: collision with root package name */
    public final v f7794c;

    public i0(boolean z7, int i8, v vVar) {
        this.f7792a = z7;
        this.f7793b = i8;
        this.f7794c = vVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return this.f7794c.a(this.f7792a, this.f7793b);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        try {
            return a();
        } catch (IOException e8) {
            throw new q(e8.getMessage());
        }
    }
}
