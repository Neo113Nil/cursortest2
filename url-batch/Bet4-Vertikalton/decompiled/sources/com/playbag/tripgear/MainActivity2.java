package com.playbag.tripgear;

import P0.d;
import Q0.c;
import R0.e;
import android.content.Intent;
import android.os.Bundle;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0106i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2003z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f2004y = new e(new d(this, 2));

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(((c) this.f2004y.a()).f758a);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
