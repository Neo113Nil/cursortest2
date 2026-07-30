package com.crrepa.c1;

import com.crrepa.f.l;

/* loaded from: classes3.dex */
public class a extends com.crrepa.b1.a {

    /* renamed from: n, reason: collision with root package name */
    private boolean f12333n;

    public a(boolean z7) {
        this.f12333n = z7;
    }

    @Override // com.crrepa.l0.b
    public byte[] a(boolean z7) {
        return l.a(z7, this.f12333n);
    }

    @Override // com.crrepa.l0.b
    protected byte[] b(int i8) {
        return l.a(i8, this.f12333n);
    }
}
