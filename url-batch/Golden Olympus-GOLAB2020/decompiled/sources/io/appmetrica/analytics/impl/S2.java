package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class S2 {

    /* renamed from: a, reason: collision with root package name */
    public final Qf f38223a;

    /* renamed from: b, reason: collision with root package name */
    public final Za f38224b;

    public S2(Qf qf, Za za) {
        this.f38223a = qf;
        this.f38224b = za;
    }

    public final boolean a(@NonNull C2773l6 c2773l6, @NonNull R2 r22) {
        Iterator it = ((C2906q9) this.f38223a.a(c2773l6.f39379d)).f39651a.iterator();
        while (it.hasNext()) {
            if (r22.a(it.next(), c2773l6)) {
                return true;
            }
        }
        return false;
    }

    public final Qf b() {
        return this.f38223a;
    }

    public final Za a() {
        return this.f38224b;
    }
}
