package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hz2 {

    /* renamed from: f, reason: collision with root package name */
    private static hz2 f6467f;

    /* renamed from: a, reason: collision with root package name */
    private float f6468a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final zy2 f6469b;

    /* renamed from: c, reason: collision with root package name */
    private final xy2 f6470c;

    /* renamed from: d, reason: collision with root package name */
    private yy2 f6471d;

    /* renamed from: e, reason: collision with root package name */
    private az2 f6472e;

    public hz2(zy2 zy2Var, xy2 xy2Var) {
        this.f6469b = zy2Var;
        this.f6470c = xy2Var;
    }

    public static hz2 b() {
        if (f6467f == null) {
            f6467f = new hz2(new zy2(), new xy2());
        }
        return f6467f;
    }

    public final float a() {
        return this.f6468a;
    }

    public final void c(Context context) {
        this.f6471d = new yy2(new Handler(), context, new wy2(), this, null);
    }

    public final void d(float f7) {
        this.f6468a = f7;
        if (this.f6472e == null) {
            this.f6472e = az2.a();
        }
        Iterator<py2> it = this.f6472e.b().iterator();
        while (it.hasNext()) {
            it.next().g().h(f7);
        }
    }

    public final void e() {
        cz2.a().g(this);
        cz2.a().d();
        if (cz2.a().f()) {
            e03.d().i();
        }
        this.f6471d.a();
    }

    public final void f() {
        e03.d().j();
        cz2.a().e();
        this.f6471d.b();
    }
}
