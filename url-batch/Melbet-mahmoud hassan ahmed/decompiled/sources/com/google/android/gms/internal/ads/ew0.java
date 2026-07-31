package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ew0 {

    /* renamed from: a, reason: collision with root package name */
    private final po0 f4781a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4782b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f4783c;

    /* synthetic */ ew0(cw0 cw0Var, dw0 dw0Var) {
        po0 po0Var;
        Context context;
        WeakReference<Context> weakReference;
        po0Var = cw0Var.f3964a;
        this.f4781a = po0Var;
        context = cw0Var.f3965b;
        this.f4782b = context;
        weakReference = cw0Var.f3966c;
        this.f4783c = weakReference;
    }

    final Context a() {
        return this.f4782b;
    }

    public final gb b() {
        return new gb(new y2.i(this.f4782b, this.f4781a));
    }

    final u30 c() {
        return new u30(this.f4782b);
    }

    final po0 d() {
        return this.f4781a;
    }

    final String e() {
        return y2.t.q().L(this.f4782b, this.f4781a.f10301f);
    }

    final WeakReference<Context> f() {
        return this.f4783c;
    }
}
