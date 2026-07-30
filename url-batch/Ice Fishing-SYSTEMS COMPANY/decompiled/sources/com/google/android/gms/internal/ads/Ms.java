package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Ms {

    /* renamed from: a, reason: collision with root package name */
    public final int f26387a;

    /* renamed from: b, reason: collision with root package name */
    public int f26388b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26389c;

    /* renamed from: d, reason: collision with root package name */
    public long f26390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4313b f26391e;

    public Ms(C4313b c4313b, int i) {
        Objects.requireNonNull(c4313b);
        this.f26391e = c4313b;
        this.f26387a = i;
    }

    public final void a() {
        C4313b c4313b = this.f26391e;
        int n1 = ((C3093dO) c4313b.f35811a).n1();
        C3093dO c3093dO = (C3093dO) c4313b.f35811a;
        boolean p1 = c3093dO.p1();
        C3709ot c3709ot = (C3709ot) c4313b.f35815e;
        if (!p1 || c3093dO.m1() == 1 || c3093dO.m1() == 4 || n1 == 0 || n1 == 1) {
            if (this.f26389c) {
                c3709ot.d(4);
            }
            this.f26389c = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z8 = this.f26389c;
        int i = this.f26387a;
        if (!z8 || this.f26388b != n1) {
            this.f26389c = true;
            this.f26390d = elapsedRealtime;
            this.f26388b = n1;
            c3709ot.d(4);
            c3709ot.f33230a.sendEmptyMessageDelayed(4, i);
            return;
        }
        if (elapsedRealtime - this.f26390d >= i) {
            Zs zs = new Zs(4, i);
            VN vn = (VN) c4313b.f35813c;
            vn.getClass();
            vn.f28243n.A1(new RN(2, zs, 1003));
        }
    }
}
