package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class j40 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final k40 f27461m;

    public j40(List<byte[]> list) {
        sf1 sf1Var = new sf1(list.get(0));
        this.f27461m = new k40(sf1Var.z(), sf1Var.z());
    }

    @Override // com.yandex.mobile.ads.impl.jy1
    protected final c32 a(byte[] bArr, int i4, boolean z4) {
        if (z4) {
            this.f27461m.d();
        }
        return new l40(this.f27461m.a(i4, bArr));
    }
}
