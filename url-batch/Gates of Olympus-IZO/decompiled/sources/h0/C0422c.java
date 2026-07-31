package h0;

import D1.C0014b;
import F.C0047j0;
import b0.AbstractC0259J;
import b0.C0265P;
import b0.C0278k;
import b0.C0288u;
import d0.InterfaceC0323d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422c extends AbstractC0419C {

    /* renamed from: b, reason: collision with root package name */
    public float[] f4921b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4922c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f4923d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f4924e = C0288u.f4296f;

    /* renamed from: f, reason: collision with root package name */
    public List f4925f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4926g;

    /* renamed from: h, reason: collision with root package name */
    public C0278k f4927h;

    /* renamed from: i, reason: collision with root package name */
    public Z1.j f4928i;

    /* renamed from: j, reason: collision with root package name */
    public final C0047j0 f4929j;

    /* renamed from: k, reason: collision with root package name */
    public String f4930k;

    /* renamed from: l, reason: collision with root package name */
    public float f4931l;

    /* renamed from: m, reason: collision with root package name */
    public float f4932m;

    /* renamed from: n, reason: collision with root package name */
    public float f4933n;

    /* renamed from: o, reason: collision with root package name */
    public float f4934o;
    public float p;

    /* renamed from: q, reason: collision with root package name */
    public float f4935q;

    /* renamed from: r, reason: collision with root package name */
    public float f4936r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4937s;

    public C0422c() {
        int i3 = G.f4893a;
        this.f4925f = M1.u.f2803d;
        this.f4926g = true;
        this.f4929j = new C0047j0(16, this);
        this.f4930k = "";
        this.f4934o = 1.0f;
        this.p = 1.0f;
        this.f4937s = true;
    }

    @Override // h0.AbstractC0419C
    public final void a(InterfaceC0323d interfaceC0323d) {
        if (this.f4937s) {
            float[] fArr = this.f4921b;
            if (fArr == null) {
                fArr = AbstractC0259J.l();
                this.f4921b = fArr;
            } else {
                AbstractC0259J.w(fArr);
            }
            AbstractC0259J.H(fArr, this.f4935q + this.f4932m, this.f4936r + this.f4933n);
            AbstractC0259J.x(fArr, this.f4931l);
            AbstractC0259J.y(fArr, this.f4934o, this.p, 1.0f);
            AbstractC0259J.H(fArr, -this.f4932m, -this.f4933n);
            this.f4937s = false;
        }
        if (this.f4926g) {
            if (!this.f4925f.isEmpty()) {
                C0278k c0278k = this.f4927h;
                if (c0278k == null) {
                    c0278k = AbstractC0259J.g();
                    this.f4927h = c0278k;
                }
                AbstractC0421b.d(this.f4925f, c0278k);
            }
            this.f4926g = false;
        }
        C0014b P2 = interfaceC0323d.P();
        long m3 = P2.m();
        P2.h().f();
        try {
            A2.g gVar = (A2.g) P2.f536b;
            float[] fArr2 = this.f4921b;
            C0014b c0014b = (C0014b) gVar.f83b;
            if (fArr2 != null) {
                c0014b.h().o(fArr2);
            }
            C0278k c0278k2 = this.f4927h;
            if (!this.f4925f.isEmpty() && c0278k2 != null) {
                c0014b.h().i(c0278k2, 1);
            }
            ArrayList arrayList = this.f4922c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0419C) arrayList.get(i3)).a(interfaceC0323d);
            }
        } finally {
            P2.h().a();
            P2.y(m3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.c, Z1.j] */
    @Override // h0.AbstractC0419C
    public final Y1.c b() {
        return this.f4928i;
    }

    @Override // h0.AbstractC0419C
    public final void d(C0047j0 c0047j0) {
        this.f4928i = c0047j0;
    }

    public final void e(int i3, AbstractC0419C abstractC0419C) {
        ArrayList arrayList = this.f4922c;
        if (i3 < arrayList.size()) {
            arrayList.set(i3, abstractC0419C);
        } else {
            arrayList.add(abstractC0419C);
        }
        g(abstractC0419C);
        abstractC0419C.d(this.f4929j);
        c();
    }

    public final void f(long j3) {
        if (this.f4923d && j3 != 16) {
            long j4 = this.f4924e;
            if (j4 == 16) {
                this.f4924e = j3;
                return;
            }
            int i3 = G.f4893a;
            if (C0288u.h(j4) == C0288u.h(j3) && C0288u.g(j4) == C0288u.g(j3) && C0288u.e(j4) == C0288u.e(j3)) {
                return;
            }
            this.f4923d = false;
            this.f4924e = C0288u.f4296f;
        }
    }

    public final void g(AbstractC0419C abstractC0419C) {
        if (!(abstractC0419C instanceof C0427h)) {
            if (abstractC0419C instanceof C0422c) {
                C0422c c0422c = (C0422c) abstractC0419C;
                if (c0422c.f4923d && this.f4923d) {
                    f(c0422c.f4924e);
                    return;
                } else {
                    this.f4923d = false;
                    this.f4924e = C0288u.f4296f;
                    return;
                }
            }
            return;
        }
        C0427h c0427h = (C0427h) abstractC0419C;
        AbstractC0259J abstractC0259J = c0427h.f4974b;
        if (this.f4923d && abstractC0259J != null) {
            if (abstractC0259J instanceof C0265P) {
                f(((C0265P) abstractC0259J).f4257e);
            } else {
                this.f4923d = false;
                this.f4924e = C0288u.f4296f;
            }
        }
        AbstractC0259J abstractC0259J2 = c0427h.f4979g;
        if (this.f4923d && abstractC0259J2 != null) {
            if (abstractC0259J2 instanceof C0265P) {
                f(((C0265P) abstractC0259J2).f4257e);
            } else {
                this.f4923d = false;
                this.f4924e = C0288u.f4296f;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f4930k);
        ArrayList arrayList = this.f4922c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0419C abstractC0419C = (AbstractC0419C) arrayList.get(i3);
            sb.append("\t");
            sb.append(abstractC0419C.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
