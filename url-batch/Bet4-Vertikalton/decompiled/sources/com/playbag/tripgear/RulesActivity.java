package com.playbag.tripgear;

import M0.ViewOnClickListenerC0028a;
import P0.d;
import R0.e;
import android.os.Bundle;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0106i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2005z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f2006y = new e(new d(this, 3));

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.f2006y;
        setContentView(((Q0.e) eVar.a()).f760a);
        ((Q0.e) eVar.a()).f761b.setOnClickListener(new ViewOnClickListenerC0028a(3, this));
    }
}
