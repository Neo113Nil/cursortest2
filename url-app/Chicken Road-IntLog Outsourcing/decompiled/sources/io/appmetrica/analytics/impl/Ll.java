package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Ll {

    /* renamed from: a, reason: collision with root package name */
    public final C1079wa f7107a = new C1079wa();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7108b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C0754jm f7109c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Jl f7110d = new Jl(this);

    public static final Ll a() {
        return Kl.f7050a;
    }

    public final Em a(Context context, X4 x42, C0600dm c0600dm) {
        Em em = (Em) this.f7108b.get(x42.f7697a);
        boolean z = true;
        if (em == null) {
            synchronized (this.f7108b) {
                try {
                    em = (Em) this.f7108b.get(x42.f7697a);
                    if (em == null) {
                        em = new Em(new Fm(context, x42.f7697a, c0600dm, this.f7110d));
                        em.f();
                        this.f7108b.put(x42.f7697a, em);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            em.a(c0600dm);
        }
        return em;
    }

    public final void a(X4 x42, Ul ul) {
        synchronized (this.f7108b) {
            try {
                this.f7107a.a(x42.f7697a, ul);
                C0754jm c0754jm = this.f7109c;
                if (c0754jm != null) {
                    ul.a(c0754jm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
