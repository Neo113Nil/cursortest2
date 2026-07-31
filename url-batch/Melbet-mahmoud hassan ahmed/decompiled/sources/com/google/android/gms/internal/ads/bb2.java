package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class bb2 {

    /* renamed from: a, reason: collision with root package name */
    private final gk1 f3315a;

    public bb2(Context context, gk1 gk1Var) {
        this.f3315a = gk1Var;
    }

    public final /* bridge */ /* synthetic */ Object a(ds2 ds2Var, rr2 rr2Var, View view, xa2 xa2Var) {
        jj1 c7 = this.f3315a.c(new l71(ds2Var, rr2Var, null), new za2(this, new pk1() { // from class: com.google.android.gms.internal.ads.ya2
            @Override // com.google.android.gms.internal.ads.pk1
            public final void a(boolean z6, Context context, jb1 jb1Var) {
            }
        }));
        xa2Var.d(new ab2(this, c7));
        return c7.i();
    }
}
