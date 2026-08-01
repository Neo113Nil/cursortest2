package com.winpower.neonfit;

import Q0.ViewOnClickListenerC0030a;
import T0.m;
import W0.g;
import android.os.Bundle;
import h.AbstractActivityC0132i;

/* loaded from: classes.dex */
public final class TargetCrashActivity extends AbstractActivityC0132i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2613z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2614y = new g(new m(this, 2));

    @Override // h.AbstractActivityC0132i, b.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g gVar = this.f2614y;
        setContentView(((U0.g) gVar.a()).f1261a);
        ((U0.g) gVar.a()).f1262b.setOnClickListener(new ViewOnClickListenerC0030a(4, this));
    }
}
