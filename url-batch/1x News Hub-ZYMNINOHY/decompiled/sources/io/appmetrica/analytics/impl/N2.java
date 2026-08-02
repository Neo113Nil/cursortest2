package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class N2 {

    /* renamed from: a, reason: collision with root package name */
    public final Kf f6357a;

    /* renamed from: b, reason: collision with root package name */
    public final La f6358b;

    public N2(Kf kf, La la) {
        this.f6357a = kf;
        this.f6358b = la;
    }

    public final boolean a(W5 w5, M2 m22) {
        Iterator it = ((C0410c9) this.f6357a.a(w5.f6818d)).f7131a.iterator();
        while (it.hasNext()) {
            if (m22.a(it.next(), w5)) {
                return true;
            }
        }
        return false;
    }

    public final Kf b() {
        return this.f6357a;
    }

    public final La a() {
        return this.f6358b;
    }
}
