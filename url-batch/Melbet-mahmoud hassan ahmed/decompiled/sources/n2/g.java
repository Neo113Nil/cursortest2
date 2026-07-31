package n2;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19414a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<p0> f19415b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f19416c;

    /* renamed from: d, reason: collision with root package name */
    private p f19417d;

    protected g(boolean z6) {
        this.f19414a = z6;
    }

    @Override // n2.l
    public final void d(p0 p0Var) {
        o2.a.e(p0Var);
        if (this.f19415b.contains(p0Var)) {
            return;
        }
        this.f19415b.add(p0Var);
        this.f19416c++;
    }

    @Override // n2.l
    public /* synthetic */ Map g() {
        return k.a(this);
    }

    protected final void q(int i7) {
        p pVar = (p) o2.m0.j(this.f19417d);
        for (int i8 = 0; i8 < this.f19416c; i8++) {
            this.f19415b.get(i8).g(this, pVar, this.f19414a, i7);
        }
    }

    protected final void r() {
        p pVar = (p) o2.m0.j(this.f19417d);
        for (int i7 = 0; i7 < this.f19416c; i7++) {
            this.f19415b.get(i7).d(this, pVar, this.f19414a);
        }
        this.f19417d = null;
    }

    protected final void s(p pVar) {
        for (int i7 = 0; i7 < this.f19416c; i7++) {
            this.f19415b.get(i7).h(this, pVar, this.f19414a);
        }
    }

    protected final void t(p pVar) {
        this.f19417d = pVar;
        for (int i7 = 0; i7 < this.f19416c; i7++) {
            this.f19415b.get(i7).a(this, pVar, this.f19414a);
        }
    }
}
