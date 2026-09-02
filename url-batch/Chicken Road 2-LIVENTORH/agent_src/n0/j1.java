package n0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class j1 extends i1 {

    /* renamed from: o, reason: collision with root package name */
    public f0.c f2746o;

    /* renamed from: p, reason: collision with root package name */
    public f0.c f2747p;

    /* renamed from: q, reason: collision with root package name */
    public f0.c f2748q;

    public j1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
        this.f2746o = null;
        this.f2747p = null;
        this.f2748q = null;
    }

    @Override // n0.n1
    public f0.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f2747p == null) {
            mandatorySystemGestureInsets = this.f2739c.getMandatorySystemGestureInsets();
            this.f2747p = f0.c.d(mandatorySystemGestureInsets);
        }
        return this.f2747p;
    }

    @Override // n0.n1
    public f0.c j() {
        Insets systemGestureInsets;
        if (this.f2746o == null) {
            systemGestureInsets = this.f2739c.getSystemGestureInsets();
            this.f2746o = f0.c.d(systemGestureInsets);
        }
        return this.f2746o;
    }

    @Override // n0.n1
    public f0.c l() {
        Insets tappableElementInsets;
        if (this.f2748q == null) {
            tappableElementInsets = this.f2739c.getTappableElementInsets();
            this.f2748q = f0.c.d(tappableElementInsets);
        }
        return this.f2748q;
    }

    @Override // n0.g1, n0.n1
    public q1 m(int i, int i4, int i5, int i6) {
        WindowInsets inset;
        inset = this.f2739c.inset(i, i4, i5, i6);
        return q1.g(null, inset);
    }

    @Override // n0.h1, n0.n1
    public void r(f0.c cVar) {
    }
}
