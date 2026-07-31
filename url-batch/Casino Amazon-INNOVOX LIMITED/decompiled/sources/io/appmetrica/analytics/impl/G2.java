package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class G2 {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f855a;
    public final Fa b;

    public G2(Gf gf, Fa fa) {
        this.f855a = gf;
        this.b = fa;
    }

    public final boolean a(Q5 q5, F2 f2) {
        Iterator it = ((W8) this.f855a.a(q5.d)).f1102a.iterator();
        while (it.hasNext()) {
            if (f2.a(it.next(), q5)) {
                return true;
            }
        }
        return false;
    }

    public final Gf b() {
        return this.f855a;
    }

    public final Fa a() {
        return this.b;
    }
}
