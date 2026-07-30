package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2994bg implements InterfaceC4156x8 {

    /* renamed from: u, reason: collision with root package name */
    public final t2.E f29528u;

    /* renamed from: v, reason: collision with root package name */
    public final C2881Yl f29529v;

    /* renamed from: w, reason: collision with root package name */
    public final C2939ag f29530w;

    /* renamed from: n, reason: collision with root package name */
    public final Object f29527n = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f29531x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f29532y = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public boolean f29533z = false;

    public C2994bg(String str, t2.E e6) {
        this.f29530w = new C2939ag(str, e6);
        this.f29528u = e6;
        C2881Yl c2881Yl = new C2881Yl(19, false);
        c2881Yl.f28862u = BigInteger.ONE;
        c2881Yl.f28863v = "0";
        this.f29529v = c2881Yl;
    }

    public final void a(C2824Vf c2824Vf) {
        synchronized (this.f29527n) {
            this.f29531x.add(c2824Vf);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4156x8
    public final void i0(boolean z8) {
        long j9;
        int i;
        p2.j.f39798C.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (z8) {
            t2.E e6 = this.f29528u;
            e6.i();
            synchronized (e6.f40830a) {
                j9 = e6.f40843o;
            }
            if (currentTimeMillis - j9 > ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31410C1)).longValue()) {
                this.f29530w.f29244d = -1;
            } else {
                C2939ag c2939ag = this.f29530w;
                e6.i();
                synchronized (e6.f40830a) {
                    i = e6.f40845q;
                }
                c2939ag.f29244d = i;
            }
            this.f29533z = true;
            return;
        }
        t2.E e9 = this.f29528u;
        e9.i();
        synchronized (e9.f40830a) {
            try {
                if (e9.f40843o != currentTimeMillis) {
                    e9.f40843o = currentTimeMillis;
                    SharedPreferences.Editor editor = e9.f40836g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", currentTimeMillis);
                        e9.f40836g.apply();
                    }
                    e9.j();
                }
            } finally {
            }
        }
        int i4 = this.f29530w.f29244d;
        e9.i();
        synchronized (e9.f40830a) {
            try {
                if (e9.f40845q == i4) {
                    return;
                }
                e9.f40845q = i4;
                SharedPreferences.Editor editor2 = e9.f40836g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i4);
                    e9.f40836g.apply();
                }
                e9.j();
            } finally {
            }
        }
    }
}
