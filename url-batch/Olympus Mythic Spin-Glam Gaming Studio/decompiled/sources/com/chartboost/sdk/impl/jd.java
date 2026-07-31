package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class jd {
    public Context a;
    public boolean b;
    public gb c;
    public gb d;

    public jd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.c = new gb(0, 0, 0, 0, 15, null);
        this.d = new gb(0, 0, 0, 0, 15, null);
    }

    public final gb b() {
        return this.d;
    }

    public final void a(gb gbVar, gb gbVar2) {
        s6 s6Var = s6.a;
        gbVar2.c(s6Var.a(gbVar.c(), this.a));
        gbVar2.d(s6Var.a(gbVar.d(), this.a));
        gbVar2.b(s6Var.a(gbVar.b(), this.a));
        gbVar2.a(s6Var.a(gbVar.a(), this.a));
    }

    public String toString() {
        return "width: " + this.d.b() + " height: " + this.d.a() + " + x: " + this.d.c() + " y: " + this.d.d();
    }

    public final boolean a() {
        if (!this.b) {
            return false;
        }
        this.b = false;
        return true;
    }

    public final void a(int i, int i2) {
        if (this.c.b() == i && this.c.a() == i2) {
            return;
        }
        gb gbVar = this.c;
        gbVar.c(0);
        gbVar.d(0);
        gbVar.b(i);
        gbVar.a(i2);
        a(this.c, this.d);
        this.b = true;
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (Intrinsics.areEqual(new gb(i, i2, i3, i4), this.c)) {
            return;
        }
        gb gbVar = this.c;
        gbVar.c(i);
        gbVar.d(i2);
        gbVar.b(i3);
        gbVar.a(i4);
        a(this.c, this.d);
        this.b = true;
    }
}
