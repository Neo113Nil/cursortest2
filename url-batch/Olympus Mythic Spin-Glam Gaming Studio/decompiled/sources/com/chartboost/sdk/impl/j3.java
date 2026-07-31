package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j3 {
    public final Context a;

    public j3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final boolean e() {
        return k5.d(this.a);
    }

    public final j5 c() {
        j5 j5Var;
        Context context = this.a;
        if (!k5.d(context)) {
            j5Var = j5.d;
        } else if (k5.e(context)) {
            j5Var = j5.e;
        } else if (k5.c(context)) {
            j5Var = j5.f;
        } else {
            j5Var = j5.c;
        }
        xb.a("NETWORK TYPE: " + j5Var, (Throwable) null, 2, (Object) null);
        return j5Var;
    }

    public final yd f() {
        return k5.g(this.a);
    }

    public final String b() {
        return k5.g(this.a).b();
    }

    public final int a() {
        return k5.f(this.a);
    }

    public final boolean d() {
        return c() == j5.f;
    }
}
