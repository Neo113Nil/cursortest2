package o2;

import j2.AbstractC0720j;
import j2.C0716f;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public int f8932d;

    /* renamed from: h, reason: collision with root package name */
    public final C0716f f8936h;

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f8929a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Stack f8930b = new Stack();

    /* renamed from: c, reason: collision with root package name */
    public int f8931c = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8933e = true;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8934f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8935g = new ArrayList();

    public h(C0716f c0716f) {
        this.f8936h = c0716f;
    }

    public final g2.e a(int i2) {
        C0924c[] c0924cArr = new C0924c[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            c0924cArr[i4] = (C0924c) this.f8930b.get(i4);
        }
        return new g2.e(c0924cArr);
    }

    public final void b() {
        AbstractC0720j.b("Can't end range without starting a range!", this.f8929a != null);
        for (int i2 = 0; i2 < this.f8932d; i2++) {
            this.f8929a.append(")");
        }
        this.f8929a.append(")");
        g2.e a4 = a(this.f8931c);
        this.f8935g.add(AbstractC0720j.e(this.f8929a.toString()));
        this.f8934f.add(a4);
        this.f8929a = null;
    }

    public final void c() {
        if (this.f8929a != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        this.f8929a = sb;
        sb.append("(");
        d2.l lVar = new d2.l(a(this.f8932d));
        while (lVar.hasNext()) {
            this.f8929a.append(AbstractC0720j.f(((C0924c) lVar.next()).f8920d));
            this.f8929a.append(":(");
        }
        this.f8933e = false;
    }
}
