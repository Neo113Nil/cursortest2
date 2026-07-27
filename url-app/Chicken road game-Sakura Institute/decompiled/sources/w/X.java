package w;

import A0.C0036g;
import a.AbstractC0345a;
import java.util.List;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f11118a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.L f11119b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11120c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11121d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11122e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11123f;

    /* renamed from: g, reason: collision with root package name */
    public final M0.b f11124g;

    /* renamed from: h, reason: collision with root package name */
    public final F0.d f11125h;

    /* renamed from: i, reason: collision with root package name */
    public final List f11126i;

    /* renamed from: j, reason: collision with root package name */
    public A0.q f11127j;

    /* renamed from: k, reason: collision with root package name */
    public M0.k f11128k;

    public X(C0036g c0036g, A0.L l4, int i2, int i4, boolean z4, int i5, M0.b bVar, F0.d dVar, List list) {
        this.f11118a = c0036g;
        this.f11119b = l4;
        this.f11120c = i2;
        this.f11121d = i4;
        this.f11122e = z4;
        this.f11123f = i5;
        this.f11124g = bVar;
        this.f11125h = dVar;
        this.f11126i = list;
        if (i2 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i4 > i2) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public final void a(M0.k kVar) {
        A0.q qVar = this.f11127j;
        if (qVar == null || kVar != this.f11128k || qVar.b()) {
            this.f11128k = kVar;
            qVar = new A0.q(this.f11118a, AbstractC0345a.E(this.f11119b, kVar), this.f11126i, this.f11124g, this.f11125h);
        }
        this.f11127j = qVar;
    }
}
