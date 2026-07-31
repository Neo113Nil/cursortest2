package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class x91 implements lc1, rb1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f14093f;

    /* renamed from: g, reason: collision with root package name */
    private final rr2 f14094g;

    /* renamed from: h, reason: collision with root package name */
    private final eh0 f14095h;

    public x91(Context context, rr2 rr2Var, eh0 eh0Var, byte[] bArr) {
        this.f14093f = context;
        this.f14094g = rr2Var;
        this.f14095h = eh0Var;
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void f(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final void m() {
        fh0 fh0Var = this.f14094g.f11368a0;
        if (fh0Var == null || !fh0Var.f5108a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f14094g.f11368a0.f5109b.isEmpty()) {
            return;
        }
        arrayList.add(this.f14094g.f11368a0.f5109b);
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void r(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void y(Context context) {
    }
}
