package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final Ka f37670a = new Ka();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f37671b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C2633fm f37672c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f37673d = new Fl(this);

    public static final Hl a() {
        return Gl.f37589a;
    }

    public final Bm a(Context context, C2772l5 c2772l5, Zl zl) {
        Bm bm = (Bm) this.f37671b.get(c2772l5.f39374a);
        boolean z4 = true;
        if (bm == null) {
            synchronized (this.f37671b) {
                try {
                    bm = (Bm) this.f37671b.get(c2772l5.f39374a);
                    if (bm == null) {
                        bm = new Bm(new Cm(context, c2772l5.f39374a, zl, this.f37673d));
                        bm.f();
                        this.f37671b.put(c2772l5.f39374a, bm);
                        z4 = false;
                    }
                } finally {
                }
            }
        }
        if (z4) {
            bm.a(zl);
        }
        return bm;
    }

    public final void a(C2772l5 c2772l5, Ql ql) {
        synchronized (this.f37671b) {
            try {
                this.f37670a.a(c2772l5.f39374a, ql);
                C2633fm c2633fm = this.f37672c;
                if (c2633fm != null) {
                    ql.a(c2633fm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
