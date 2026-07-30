package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class As {

    /* renamed from: a, reason: collision with root package name */
    public final int f23911a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23912b;

    /* renamed from: c, reason: collision with root package name */
    public int f23913c;

    /* renamed from: d, reason: collision with root package name */
    public int f23914d;

    /* renamed from: e, reason: collision with root package name */
    public long f23915e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23916f;

    /* renamed from: g, reason: collision with root package name */
    public long f23917g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4313b f23918h;

    public As(C4313b c4313b, int i) {
        Objects.requireNonNull(c4313b);
        this.f23918h = c4313b;
        this.f23911a = i;
    }

    public final void a() {
        C4313b c4313b = this.f23918h;
        C3093dO c3093dO = (C3093dO) c4313b.f35811a;
        boolean z8 = c3093dO.m1() == 3 && c3093dO.p1() && c3093dO.n1() == 0;
        C3709ot c3709ot = (C3709ot) c4313b.f35815e;
        if (!z8) {
            if (this.f23916f) {
                c3709ot.d(2);
            }
            this.f23916f = false;
            return;
        }
        C3093dO c3093dO2 = (C3093dO) c4313b.f35811a;
        AbstractC3832r8 r12 = c3093dO2.r1();
        Object f6 = r12.g() ? null : r12.f(c3093dO2.O1());
        int m8 = c3093dO2.m();
        int U12 = c3093dO2.U1();
        long Q12 = c3093dO2.Q1();
        if (f6 != null && m8 == -1) {
            r12.o(f6, (L7) c4313b.f35814d);
            Q12 -= AbstractC3548lu.t(0L);
            m8 = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = this.f23916f;
        int i = this.f23911a;
        if (z9 && Objects.equals(f6, this.f23912b) && m8 == this.f23913c && U12 == this.f23914d && Q12 == this.f23915e) {
            if (elapsedRealtime - this.f23917g >= i) {
                Zs zs = new Zs(2, i);
                VN vn = (VN) c4313b.f35813c;
                vn.getClass();
                vn.f28243n.A1(new RN(2, zs, 1003));
                return;
            }
            return;
        }
        this.f23916f = true;
        this.f23917g = elapsedRealtime;
        this.f23912b = f6;
        this.f23913c = m8;
        this.f23914d = U12;
        this.f23915e = Q12;
        c3709ot.d(2);
        c3709ot.f33230a.sendEmptyMessageDelayed(2, i);
    }
}
