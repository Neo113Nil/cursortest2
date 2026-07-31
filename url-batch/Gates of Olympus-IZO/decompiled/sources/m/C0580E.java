package m;

import I.C0089d;
import I.C0102j0;
import I.X0;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580E implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public Float f5568d;

    /* renamed from: e, reason: collision with root package name */
    public Float f5569e;

    /* renamed from: f, reason: collision with root package name */
    public final C0102j0 f5570f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f5571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5572h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5573i;

    /* renamed from: j, reason: collision with root package name */
    public long f5574j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0583H f5575k;

    public C0580E(C0583H c0583h, Float f3, Float f4, C0579D c0579d) {
        y0 y0Var = z0.f5885a;
        this.f5575k = c0583h;
        this.f5568d = f3;
        this.f5569e = f4;
        this.f5570f = C0089d.J(f3, I.X.f2228i);
        this.f5571g = new j0(c0579d, y0Var, this.f5568d, this.f5569e, null);
    }

    @Override // I.X0
    public final Object getValue() {
        return this.f5570f.getValue();
    }
}
