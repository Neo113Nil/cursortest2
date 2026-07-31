package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Il {

    /* renamed from: a, reason: collision with root package name */
    public final C0451qa f895a = new C0451qa();
    public final HashMap b = new HashMap();
    public C0209gm c = null;
    public final Gl d = new Gl(this);

    public static final Il a() {
        return Hl.f878a;
    }

    public final Bm a(Context context, R4 r4, C0054am c0054am) {
        Bm bm = (Bm) this.b.get(r4.f1025a);
        boolean z = true;
        if (bm == null) {
            synchronized (this.b) {
                bm = (Bm) this.b.get(r4.f1025a);
                if (bm == null) {
                    bm = new Bm(new Cm(context, r4.f1025a, c0054am, this.d));
                    bm.f();
                    this.b.put(r4.f1025a, bm);
                    z = false;
                }
            }
        }
        if (z) {
            bm.a(c0054am);
        }
        return bm;
    }

    public final void a(R4 r4, Rl rl) {
        synchronized (this.b) {
            this.f895a.a(r4.f1025a, rl);
            C0209gm c0209gm = this.c;
            if (c0209gm != null) {
                rl.a(c0209gm);
            }
        }
    }
}
