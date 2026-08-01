package com.winworm.neongrid;

import P0.d;
import U0.e;
import android.content.Intent;
import android.os.Bundle;
import com.winworm.neongrid.ui.HomeActivity;
import g.AbstractActivityC0108i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0108i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2028z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final e f2029y = new e(new d(this, 0));

    @Override // g.AbstractActivityC0108i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(((R0.d) this.f2029y.a()).f751a);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
