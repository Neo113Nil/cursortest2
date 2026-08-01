package com.visualfortune.eyerest;

import L0.ViewOnClickListenerC0025a;
import P0.a;
import Q0.d;
import android.os.Bundle;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final class GuideActivity extends AbstractActivityC0131i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1923z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f1924y = new d(new O0.d(this, 0));

    @Override // g.AbstractActivityC0131i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f1924y;
        setContentView(((a) dVar.a()).f639a);
        ((a) dVar.a()).f640b.setOnClickListener(new ViewOnClickListenerC0025a(3, this));
    }
}
