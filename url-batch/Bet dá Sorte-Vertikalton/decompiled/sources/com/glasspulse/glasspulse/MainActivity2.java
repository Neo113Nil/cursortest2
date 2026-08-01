package com.glasspulse.glasspulse;

import S0.c;
import android.content.Intent;
import android.os.Bundle;
import g.AbstractActivityC0128i;
import o0.C0262e;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0128i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1611z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final c f1612y = new c(new C0262e(this, 1));

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(((q0.c) this.f1612y.a()).f3482a);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
