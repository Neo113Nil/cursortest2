package com.anythink.basead.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import com.anythink.basead.ui.BaseATActivity;
import com.anythink.core.basead.a;
import com.anythink.core.basead.b.c;
import com.anythink.core.common.d.t;
import com.anythink.core.common.l.f.a.a;

/* loaded from: classes.dex */
public class ATMixSplashActivity extends BaseATActivity {

    /* renamed from: o, reason: collision with root package name */
    private String f10586o;

    /* renamed from: p, reason: collision with root package name */
    private FrameLayout f10587p;

    public static void b(Activity activity, c cVar) {
        if (cVar == null) {
            return;
        }
        Context g9 = t.b().g();
        if (activity == null || activity.isFinishing()) {
            Log.i("anythink_BaseATActivity", "Activity is null");
        } else {
            g9 = activity;
        }
        Intent intent = new Intent(g9, (Class<?>) ATMixSplashActivity.class);
        intent.putExtra(a.C0071a.f12026d, cVar.f12077d);
        if (!(g9 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        g9.startActivity(intent);
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.anythink.basead.ui.BaseATActivity
    public final void a(Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(this);
        this.f10587p = frameLayout;
        setContentView(frameLayout);
        try {
            this.f10586o = getIntent().getStringExtra(a.C0071a.f12026d);
            a.InterfaceC0083a c4 = com.anythink.basead.mixad.a.a().c(this.f10586o);
            if (c4 != null) {
                c4.a(this, this.f10587p);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.BaseATActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    private void a() {
        this.f10586o = getIntent().getStringExtra(a.C0071a.f12026d);
    }

    private void b() {
        a.InterfaceC0083a c4 = com.anythink.basead.mixad.a.a().c(this.f10586o);
        if (c4 != null) {
            c4.a(this, this.f10587p);
        }
    }
}
