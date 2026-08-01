package com.winfour.neondrop.ui;

import O0.ViewOnClickListenerC0025a;
import T0.f;
import V0.a;
import W0.d;
import android.os.Bundle;
import g.AbstractActivityC0110i;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0110i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2119z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f2120y = new d(new a(this, 1));

    @Override // g.AbstractActivityC0110i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f2120y;
        setContentView(((f) dVar.a()).f822a);
        ((f) dVar.a()).f823b.setOnClickListener(new ViewOnClickListenerC0025a(6, this));
    }
}
