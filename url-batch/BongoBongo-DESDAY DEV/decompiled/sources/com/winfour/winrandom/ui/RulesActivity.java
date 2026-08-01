package com.winfour.winrandom.ui;

import N0.ViewOnClickListenerC0028a;
import S0.f;
import U0.g;
import V0.d;
import android.os.Bundle;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0106i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2126z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f2127y = new d(new g(this, 2));

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f2127y;
        setContentView(((f) dVar.a()).f820a);
        ((f) dVar.a()).f821b.setOnClickListener(new ViewOnClickListenerC0028a(4, this));
    }
}
