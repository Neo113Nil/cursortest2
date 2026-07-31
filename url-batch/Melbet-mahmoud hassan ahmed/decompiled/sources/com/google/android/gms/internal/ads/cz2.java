package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cz2 {

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final cz2 f4015f = new cz2();

    /* renamed from: a, reason: collision with root package name */
    private Context f4016a;

    /* renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f4017b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4018c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4019d;

    /* renamed from: e, reason: collision with root package name */
    private hz2 f4020e;

    private cz2() {
    }

    public static cz2 a() {
        return f4015f;
    }

    static /* bridge */ /* synthetic */ void b(cz2 cz2Var, boolean z6) {
        if (cz2Var.f4019d != z6) {
            cz2Var.f4019d = z6;
            if (cz2Var.f4018c) {
                cz2Var.h();
                if (cz2Var.f4020e != null) {
                    if (cz2Var.f()) {
                        e03.d().i();
                    } else {
                        e03.d().h();
                    }
                }
            }
        }
    }

    private final void h() {
        boolean z6 = this.f4019d;
        Iterator<py2> it = az2.a().c().iterator();
        while (it.hasNext()) {
            oz2 g7 = it.next().g();
            if (g7.k()) {
                gz2.a().b(g7.a(), "setState", true != z6 ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void c(Context context) {
        this.f4016a = context.getApplicationContext();
    }

    public final void d() {
        this.f4017b = new bz2(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f4016a.registerReceiver(this.f4017b, intentFilter);
        this.f4018c = true;
        h();
    }

    public final void e() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f4016a;
        if (context != null && (broadcastReceiver = this.f4017b) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f4017b = null;
        }
        this.f4018c = false;
        this.f4019d = false;
        this.f4020e = null;
    }

    public final boolean f() {
        return !this.f4019d;
    }

    public final void g(hz2 hz2Var) {
        this.f4020e = hz2Var;
    }
}
