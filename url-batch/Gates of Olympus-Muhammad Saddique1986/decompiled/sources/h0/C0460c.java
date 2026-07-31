package h0;

import B.Y;
import b0.AbstractC0347p;
import b0.C0341j;
import b0.C0352v;
import b0.M;
import b0.T;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460c extends AbstractC0450C {

    /* renamed from: b, reason: collision with root package name */
    public float[] f5910b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5911c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f5912d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f5913e = C0352v.f5439g;

    /* renamed from: f, reason: collision with root package name */
    public List f5914f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5915g;

    /* renamed from: h, reason: collision with root package name */
    public C0341j f5916h;

    /* renamed from: i, reason: collision with root package name */
    public f2.k f5917i;

    /* renamed from: j, reason: collision with root package name */
    public final A0.l f5918j;

    /* renamed from: k, reason: collision with root package name */
    public String f5919k;

    /* renamed from: l, reason: collision with root package name */
    public float f5920l;

    /* renamed from: m, reason: collision with root package name */
    public float f5921m;

    /* renamed from: n, reason: collision with root package name */
    public float f5922n;

    /* renamed from: o, reason: collision with root package name */
    public float f5923o;

    /* renamed from: p, reason: collision with root package name */
    public float f5924p;

    /* renamed from: q, reason: collision with root package name */
    public float f5925q;

    /* renamed from: r, reason: collision with root package name */
    public float f5926r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5927s;

    public C0460c() {
        int i3 = AbstractC0454G.f5881a;
        this.f5914f = S1.u.f4320d;
        this.f5915g = true;
        this.f5918j = new A0.l(18, this);
        this.f5919k = "";
        this.f5923o = 1.0f;
        this.f5924p = 1.0f;
        this.f5927s = true;
    }

    @Override // h0.AbstractC0450C
    public final void a(InterfaceC0403d interfaceC0403d) {
        if (this.f5927s) {
            float[] fArr = this.f5910b;
            if (fArr == null) {
                fArr = b0.G.a();
                this.f5910b = fArr;
            } else {
                b0.G.d(fArr);
            }
            b0.G.h(fArr, this.f5925q + this.f5921m, this.f5926r + this.f5922n, 0.0f);
            b0.G.e(fArr, this.f5920l);
            b0.G.f(fArr, this.f5923o, this.f5924p, 1.0f);
            b0.G.h(fArr, -this.f5921m, -this.f5922n, 0.0f);
            this.f5927s = false;
        }
        if (this.f5915g) {
            if (!this.f5914f.isEmpty()) {
                C0341j c0341j = this.f5916h;
                if (c0341j == null) {
                    c0341j = M.h();
                    this.f5916h = c0341j;
                }
                AbstractC0459b.d(this.f5914f, c0341j);
            }
            this.f5915g = false;
        }
        G1.m S3 = interfaceC0403d.S();
        long n3 = S3.n();
        S3.h().f();
        try {
            Y y3 = (Y) S3.f2116b;
            float[] fArr2 = this.f5910b;
            G1.m mVar = (G1.m) y3.f334d;
            if (fArr2 != null) {
                mVar.h().o(fArr2);
            }
            C0341j c0341j2 = this.f5916h;
            if (!this.f5914f.isEmpty() && c0341j2 != null) {
                mVar.h().i(c0341j2, 1);
            }
            ArrayList arrayList = this.f5911c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0450C) arrayList.get(i3)).a(interfaceC0403d);
            }
        } finally {
            A.k.q(S3, n3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.c, f2.k] */
    @Override // h0.AbstractC0450C
    public final InterfaceC0424c b() {
        return this.f5917i;
    }

    @Override // h0.AbstractC0450C
    public final void d(A0.l lVar) {
        this.f5917i = lVar;
    }

    public final void e(int i3, AbstractC0450C abstractC0450C) {
        ArrayList arrayList = this.f5911c;
        if (i3 < arrayList.size()) {
            arrayList.set(i3, abstractC0450C);
        } else {
            arrayList.add(abstractC0450C);
        }
        g(abstractC0450C);
        abstractC0450C.d(this.f5918j);
        c();
    }

    public final void f(long j3) {
        if (this.f5912d && j3 != 16) {
            long j4 = this.f5913e;
            if (j4 == 16) {
                this.f5913e = j3;
                return;
            }
            int i3 = AbstractC0454G.f5881a;
            if (C0352v.h(j4) == C0352v.h(j3) && C0352v.g(j4) == C0352v.g(j3) && C0352v.e(j4) == C0352v.e(j3)) {
                return;
            }
            this.f5912d = false;
            this.f5913e = C0352v.f5439g;
        }
    }

    public final void g(AbstractC0450C abstractC0450C) {
        if (!(abstractC0450C instanceof C0465h)) {
            if (abstractC0450C instanceof C0460c) {
                C0460c c0460c = (C0460c) abstractC0450C;
                if (c0460c.f5912d && this.f5912d) {
                    f(c0460c.f5913e);
                    return;
                } else {
                    this.f5912d = false;
                    this.f5913e = C0352v.f5439g;
                    return;
                }
            }
            return;
        }
        C0465h c0465h = (C0465h) abstractC0450C;
        AbstractC0347p abstractC0347p = c0465h.f5964b;
        if (this.f5912d && abstractC0347p != null) {
            if (abstractC0347p instanceof T) {
                f(((T) abstractC0347p).f5399a);
            } else {
                this.f5912d = false;
                this.f5913e = C0352v.f5439g;
            }
        }
        AbstractC0347p abstractC0347p2 = c0465h.f5969g;
        if (this.f5912d && abstractC0347p2 != null) {
            if (abstractC0347p2 instanceof T) {
                f(((T) abstractC0347p2).f5399a);
            } else {
                this.f5912d = false;
                this.f5913e = C0352v.f5439g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f5919k);
        ArrayList arrayList = this.f5911c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0450C abstractC0450C = (AbstractC0450C) arrayList.get(i3);
            sb.append("\t");
            sb.append(abstractC0450C.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
