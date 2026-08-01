package com.winworm.neongrid.ui;

import M0.ViewOnClickListenerC0028a;
import P0.d;
import R0.g;
import U0.e;
import android.os.Bundle;
import g.AbstractActivityC0108i;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0108i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2060z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f2061y = new e(new d(this, 2));

    @Override // g.AbstractActivityC0108i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.f2061y;
        setContentView(((g) eVar.a()).f759a);
        ((g) eVar.a()).f760b.setOnClickListener(new ViewOnClickListenerC0028a(5, this));
    }
}
