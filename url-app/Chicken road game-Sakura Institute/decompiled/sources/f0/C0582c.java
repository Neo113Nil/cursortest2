package f0;

import A.g0;
import B1.C0097d;
import Z.AbstractC0319p;
import Z.C0313j;
import Z.C0323u;
import Z.K;
import Z.S;
import b0.InterfaceC0496d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import w2.C1294c;
import z2.C1405I;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582c extends AbstractC0572C {

    /* renamed from: b, reason: collision with root package name */
    public float[] f6334b;

    /* renamed from: h, reason: collision with root package name */
    public C0313j f6340h;

    /* renamed from: i, reason: collision with root package name */
    public M2.p f6341i;

    /* renamed from: l, reason: collision with root package name */
    public float f6344l;

    /* renamed from: m, reason: collision with root package name */
    public float f6345m;

    /* renamed from: n, reason: collision with root package name */
    public float f6346n;

    /* renamed from: q, reason: collision with root package name */
    public float f6349q;

    /* renamed from: r, reason: collision with root package name */
    public float f6350r;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6335c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f6336d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f6337e = C0323u.f4547g;

    /* renamed from: f, reason: collision with root package name */
    public List f6338f = AbstractC0576G.f6305a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6339g = true;

    /* renamed from: j, reason: collision with root package name */
    public final g0 f6342j = new g0(11, this);

    /* renamed from: k, reason: collision with root package name */
    public String f6343k = "";

    /* renamed from: o, reason: collision with root package name */
    public float f6347o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f6348p = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6351s = true;

    @Override // f0.AbstractC0572C
    public final void a(InterfaceC0496d interfaceC0496d) {
        if (this.f6351s) {
            float[] fArr = this.f6334b;
            if (fArr == null) {
                fArr = Z.E.a();
                this.f6334b = fArr;
            } else {
                Z.E.d(fArr);
            }
            Z.E.h(fArr, this.f6349q + this.f6345m, this.f6350r + this.f6346n, 0.0f);
            Z.E.e(fArr, this.f6344l);
            Z.E.f(fArr, this.f6347o, this.f6348p, 1.0f);
            Z.E.h(fArr, -this.f6345m, -this.f6346n, 0.0f);
            this.f6351s = false;
        }
        if (this.f6339g) {
            if (!this.f6338f.isEmpty()) {
                C0313j c0313j = this.f6340h;
                if (c0313j == null) {
                    c0313j = K.h();
                    this.f6340h = c0313j;
                }
                AbstractC0581b.d(this.f6338f, c0313j);
            }
            this.f6339g = false;
        }
        C0097d Y3 = interfaceC0496d.Y();
        long s4 = Y3.s();
        Y3.k().g();
        try {
            C1294c c1294c = (C1294c) Y3.f987e;
            float[] fArr2 = this.f6334b;
            C0097d c0097d = (C0097d) c1294c.f11388d;
            if (fArr2 != null) {
                c0097d.k().n(fArr2);
            }
            C0313j c0313j2 = this.f6340h;
            if (!this.f6338f.isEmpty() && c0313j2 != null) {
                c0097d.k().k(c0313j2, 1);
            }
            ArrayList arrayList = this.f6335c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC0572C) arrayList.get(i2)).a(interfaceC0496d);
            }
        } finally {
            Y3.k().b();
            Y3.G(s4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // f0.AbstractC0572C
    public final Function1 b() {
        return this.f6341i;
    }

    @Override // f0.AbstractC0572C
    public final void d(g0 g0Var) {
        this.f6341i = g0Var;
    }

    public final void e(int i2, AbstractC0572C abstractC0572C) {
        ArrayList arrayList = this.f6335c;
        if (i2 < arrayList.size()) {
            arrayList.set(i2, abstractC0572C);
        } else {
            arrayList.add(abstractC0572C);
        }
        g(abstractC0572C);
        abstractC0572C.d(this.f6342j);
        c();
    }

    public final void f(long j4) {
        if (this.f6336d && j4 != 16) {
            long j5 = this.f6337e;
            if (j5 == 16) {
                this.f6337e = j4;
                return;
            }
            C1405I c1405i = AbstractC0576G.f6305a;
            if (C0323u.h(j5) == C0323u.h(j4) && C0323u.g(j5) == C0323u.g(j4) && C0323u.e(j5) == C0323u.e(j4)) {
                return;
            }
            this.f6336d = false;
            this.f6337e = C0323u.f4547g;
        }
    }

    public final void g(AbstractC0572C abstractC0572C) {
        if (!(abstractC0572C instanceof C0587h)) {
            if (abstractC0572C instanceof C0582c) {
                C0582c c0582c = (C0582c) abstractC0572C;
                if (c0582c.f6336d && this.f6336d) {
                    f(c0582c.f6337e);
                    return;
                } else {
                    this.f6336d = false;
                    this.f6337e = C0323u.f4547g;
                    return;
                }
            }
            return;
        }
        C0587h c0587h = (C0587h) abstractC0572C;
        AbstractC0319p abstractC0319p = c0587h.f6388b;
        if (this.f6336d && abstractC0319p != null) {
            if (abstractC0319p instanceof S) {
                f(((S) abstractC0319p).f4508a);
            } else {
                this.f6336d = false;
                this.f6337e = C0323u.f4547g;
            }
        }
        AbstractC0319p abstractC0319p2 = c0587h.f6393g;
        if (this.f6336d && abstractC0319p2 != null) {
            if (abstractC0319p2 instanceof S) {
                f(((S) abstractC0319p2).f4508a);
            } else {
                this.f6336d = false;
                this.f6337e = C0323u.f4547g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f6343k);
        ArrayList arrayList = this.f6335c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0572C abstractC0572C = (AbstractC0572C) arrayList.get(i2);
            sb.append("\t");
            sb.append(abstractC0572C.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
