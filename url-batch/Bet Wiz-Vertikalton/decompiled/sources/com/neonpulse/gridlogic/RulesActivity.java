package com.neonpulse.gridlogic;

import L0.ViewOnClickListenerC0025a;
import O0.k;
import R0.f;
import V0.d;
import android.os.Bundle;
import g.AbstractActivityC0132i;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0132i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1988z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f1989y = new d(new k(this, 1));

    @Override // g.AbstractActivityC0132i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f1989y;
        setContentView(((f) dVar.a()).f750a);
        ((f) dVar.a()).f751b.setOnClickListener(new ViewOnClickListenerC0025a(6, this));
    }
}
