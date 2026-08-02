package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Ll {

    /* renamed from: a, reason: collision with root package name */
    public final C0928wa f6299a = new C0928wa();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6300b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C0603jm f6301c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Jl f6302d = new Jl(this);

    public static final Ll a() {
        return Kl.f6245a;
    }

    public final Em a(Context context, X4 x4, C0449dm c0449dm) {
        Em em = (Em) this.f6300b.get(x4.f6860a);
        boolean z = true;
        if (em == null) {
            synchronized (this.f6300b) {
                try {
                    em = (Em) this.f6300b.get(x4.f6860a);
                    if (em == null) {
                        em = new Em(new Fm(context, x4.f6860a, c0449dm, this.f6302d));
                        em.f();
                        this.f6300b.put(x4.f6860a, em);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            em.a(c0449dm);
        }
        return em;
    }

    public final void a(X4 x4, Ul ul) {
        synchronized (this.f6300b) {
            try {
                this.f6299a.a(x4.f6860a, ul);
                C0603jm c0603jm = this.f6301c;
                if (c0603jm != null) {
                    ul.a(c0603jm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
