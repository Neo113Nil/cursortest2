package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
final class n21 implements nb3<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p21 f8886a;

    n21(p21 p21Var) {
        this.f8886a = p21Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(String str) {
        ts2 ts2Var;
        zx2 zx2Var;
        ds2 ds2Var;
        rr2 rr2Var;
        rr2 rr2Var2;
        Context context;
        String str2 = str;
        ts2Var = this.f8886a.f10023m;
        zx2Var = this.f8886a.f10022l;
        ds2Var = this.f8886a.f10020j;
        rr2Var = this.f8886a.f10021k;
        rr2Var2 = this.f8886a.f10021k;
        List<String> b7 = zx2Var.b(ds2Var, rr2Var, false, "", str2, rr2Var2.f11371c);
        y2.t.q();
        context = this.f8886a.f10016f;
        ts2Var.c(b7, true == a3.g2.j(context) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
    }
}
