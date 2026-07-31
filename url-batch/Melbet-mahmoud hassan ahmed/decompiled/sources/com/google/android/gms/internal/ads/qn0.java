package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class qn0 extends a3.b0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ tn0 f10760c;

    qn0(tn0 tn0Var) {
        this.f10760c = tn0Var;
    }

    @Override // a3.b0
    public final void a() {
        Context context;
        po0 po0Var;
        Object obj;
        r10 r10Var;
        context = this.f10760c.f12275e;
        po0Var = this.f10760c.f12276f;
        p10 p10Var = new p10(context, po0Var.f10301f);
        obj = this.f10760c.f12271a;
        synchronized (obj) {
            try {
                y2.t.f();
                r10Var = this.f10760c.f12277g;
                s10.a(r10Var, p10Var);
            } catch (IllegalArgumentException e7) {
                io0.h("Cannot config CSI reporter.", e7);
            }
        }
    }
}
