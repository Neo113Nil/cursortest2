package com.glasspulse.glasspulse;

import P0.ViewOnClickListenerC0025a;
import S0.c;
import android.os.Bundle;
import g.AbstractActivityC0128i;
import o0.C0262e;
import q0.e;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0128i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1613z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final c f1614y = new c(new C0262e(this, 2));

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = this.f1614y;
        setContentView(((e) cVar.a()).f3484a);
        ((e) cVar.a()).f3485b.setOnClickListener(new ViewOnClickListenerC0025a(4, this));
    }
}
