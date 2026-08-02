package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final C0869pa f10382a = new C0869pa();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10383b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C0622fm f10384c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f10385d = new Fl(this);

    public static final Hl a() {
        return Gl.f10339a;
    }

    public final Am a(Context context, Q4 q4, Zl zl) {
        Am am = (Am) this.f10383b.get(q4.f10836a);
        boolean z = true;
        if (am == null) {
            synchronized (this.f10383b) {
                try {
                    am = (Am) this.f10383b.get(q4.f10836a);
                    if (am == null) {
                        am = new Am(new Bm(context, q4.f10836a, zl, this.f10385d));
                        am.f();
                        this.f10383b.put(q4.f10836a, am);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            am.a(zl);
        }
        return am;
    }

    public final void a(Q4 q4, Ql ql) {
        synchronized (this.f10383b) {
            try {
                this.f10382a.a(q4.f10836a, ql);
                C0622fm c0622fm = this.f10384c;
                if (c0622fm != null) {
                    ql.a(c0622fm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
