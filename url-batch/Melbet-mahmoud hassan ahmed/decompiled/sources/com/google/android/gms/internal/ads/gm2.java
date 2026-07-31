package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Collections;

/* loaded from: classes.dex */
final class gm2 implements bd2<c41> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hm2 f5684a;

    gm2(hm2 hm2Var) {
        this.f5684a = hm2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (r0.f10303h < ((java.lang.Integer) com.google.android.gms.internal.ads.sw.c().b(com.google.android.gms.internal.ads.m10.I3)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.bd2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void a(c41 c41Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        pv a7;
        ViewGroup viewGroup5;
        pv a8;
        in2 in2Var;
        po0 po0Var;
        c41 c41Var2 = c41Var;
        c41 c41Var3 = this.f5684a.f6350p;
        if (c41Var3 != null) {
            c41Var3.a();
        }
        hm2 hm2Var = this.f5684a;
        hm2Var.f6350p = c41Var2;
        viewGroup = hm2Var.f6342h;
        viewGroup.removeAllViews();
        viewGroup2 = this.f5684a.f6342h;
        viewGroup2.addView(c41Var2.i(), y2.t.r().j());
        if (!c41Var2.l()) {
            po0Var = this.f5684a.f6347m;
        }
        z2.t u6 = hm2.u6(this.f5684a, c41Var2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != c41Var2.o() ? 9 : 11);
        u6.b(c41Var2.n() && !c41Var2.m());
        viewGroup3 = this.f5684a.f6342h;
        viewGroup3.addView(u6, layoutParams);
        c41Var2.k(this.f5684a);
        viewGroup4 = this.f5684a.f6342h;
        a7 = os2.a(r1.f6341g, Collections.singletonList(this.f5684a.f6350p.j()));
        viewGroup4.setMinimumHeight(a7.f10378h);
        viewGroup5 = this.f5684a.f6342h;
        a8 = os2.a(r1.f6341g, Collections.singletonList(this.f5684a.f6350p.j()));
        viewGroup5.setMinimumWidth(a8.f10381k);
        in2Var = this.f5684a.f6346l;
        in2Var.e(new p41(c41Var2, this.f5684a));
        c41Var2.b();
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final void zza() {
        this.f5684a.f6350p = null;
    }
}
