package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ws, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4139ws {

    /* renamed from: a, reason: collision with root package name */
    public final int f35075a;

    /* renamed from: b, reason: collision with root package name */
    public Object f35076b;

    /* renamed from: c, reason: collision with root package name */
    public int f35077c;

    /* renamed from: d, reason: collision with root package name */
    public int f35078d;

    /* renamed from: e, reason: collision with root package name */
    public long f35079e;

    /* renamed from: f, reason: collision with root package name */
    public long f35080f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35081g;

    /* renamed from: h, reason: collision with root package name */
    public long f35082h;
    public final /* synthetic */ C4313b i;

    public C4139ws(C4313b c4313b, int i) {
        Objects.requireNonNull(c4313b);
        this.i = c4313b;
        this.f35075a = i;
    }

    public final void a() {
        C4313b c4313b = this.i;
        int m12 = ((C3093dO) c4313b.f35811a).m1();
        C3709ot c3709ot = (C3709ot) c4313b.f35815e;
        if (m12 == 2) {
            C3093dO c3093dO = (C3093dO) c4313b.f35811a;
            if (c3093dO.p1() && c3093dO.n1() == 0) {
                AbstractC3832r8 r12 = c3093dO.r1();
                Object f6 = r12.g() ? null : r12.f(c3093dO.O1());
                int m8 = c3093dO.m();
                int U12 = c3093dO.U1();
                long R12 = c3093dO.R1();
                long max = Math.max(0L, c3093dO.S1() - Math.max(0L, R12 - c3093dO.Q1()));
                if (f6 != null && m8 == -1) {
                    r12.o(f6, (L7) c4313b.f35814d);
                    R12 -= AbstractC3548lu.t(0L);
                    m8 = -1;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean z8 = this.f35081g;
                int i = this.f35075a;
                if (z8 && Objects.equals(f6, this.f35076b) && m8 == this.f35077c && U12 == this.f35078d && R12 == this.f35079e && max == this.f35080f) {
                    if (elapsedRealtime - this.f35082h >= i) {
                        Zs zs = new Zs(1, i);
                        VN vn = (VN) c4313b.f35813c;
                        vn.getClass();
                        vn.f28243n.A1(new RN(2, zs, 1003));
                        return;
                    }
                    return;
                }
                this.f35081g = true;
                this.f35082h = elapsedRealtime;
                this.f35076b = f6;
                this.f35077c = m8;
                this.f35078d = U12;
                this.f35079e = R12;
                this.f35080f = max;
                c3709ot.d(1);
                c3709ot.f33230a.sendEmptyMessageDelayed(1, i);
                return;
            }
        }
        if (this.f35081g) {
            c3709ot.d(1);
        }
        this.f35081g = false;
    }
}
