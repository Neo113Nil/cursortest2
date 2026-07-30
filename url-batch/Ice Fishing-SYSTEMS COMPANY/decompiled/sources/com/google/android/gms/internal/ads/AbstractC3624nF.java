package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.nF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3624nF implements InterfaceC3572mH {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f32841n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f32842u = new ArrayList(1);

    /* renamed from: v, reason: collision with root package name */
    public int f32843v;

    /* renamed from: w, reason: collision with root package name */
    public C3197fJ f32844w;

    public AbstractC3624nF(boolean z8) {
        this.f32841n = z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void a(DN dn) {
        dn.getClass();
        ArrayList arrayList = this.f32842u;
        if (arrayList.contains(dn)) {
            return;
        }
        arrayList.add(dn);
        this.f32843v++;
    }

    public final void b(C3197fJ c3197fJ) {
        for (int i = 0; i < this.f32843v; i++) {
            ((DN) this.f32842u.get(i)).getClass();
        }
    }

    public final void c(C3197fJ c3197fJ) {
        this.f32844w = c3197fJ;
        for (int i = 0; i < this.f32843v; i++) {
            ((DN) this.f32842u.get(i)).e(this, c3197fJ, this.f32841n);
        }
    }

    public final void d(int i) {
        C3197fJ c3197fJ = this.f32844w;
        String str = AbstractC3548lu.f32613a;
        for (int i4 = 0; i4 < this.f32843v; i4++) {
            ((DN) this.f32842u.get(i4)).g(c3197fJ, this.f32841n, i);
        }
    }

    public final void e() {
        C3197fJ c3197fJ = this.f32844w;
        String str = AbstractC3548lu.f32613a;
        for (int i = 0; i < this.f32843v; i++) {
            ((DN) this.f32842u.get(i)).k(c3197fJ, this.f32841n);
        }
        this.f32844w = null;
    }
}
