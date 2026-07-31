package x;

import C0.C0031g;
import a.AbstractC0235a;
import java.util.List;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f10039a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.K f10040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10041c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10042d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10043e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10044f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.b f10045g;

    /* renamed from: h, reason: collision with root package name */
    public final H0.d f10046h;

    /* renamed from: i, reason: collision with root package name */
    public final List f10047i;

    /* renamed from: j, reason: collision with root package name */
    public C0.q f10048j;

    /* renamed from: k, reason: collision with root package name */
    public O0.k f10049k;

    public Y(C0031g c0031g, C0.K k3, int i3, int i4, boolean z3, int i5, O0.b bVar, H0.d dVar, List list) {
        this.f10039a = c0031g;
        this.f10040b = k3;
        this.f10041c = i3;
        this.f10042d = i4;
        this.f10043e = z3;
        this.f10044f = i5;
        this.f10045g = bVar;
        this.f10046h = dVar;
        this.f10047i = list;
        if (i3 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i4 > i3) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public final void a(O0.k kVar) {
        C0.q qVar = this.f10048j;
        if (qVar == null || kVar != this.f10049k || qVar.b()) {
            this.f10049k = kVar;
            qVar = new C0.q(this.f10039a, AbstractC0235a.G(this.f10040b, kVar), this.f10047i, this.f10045g, this.f10046h);
        }
        this.f10048j = qVar;
    }
}
