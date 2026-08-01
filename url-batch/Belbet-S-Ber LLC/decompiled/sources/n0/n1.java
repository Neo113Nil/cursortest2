package n0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class n1 extends m1 {

    /* renamed from: s, reason: collision with root package name */
    public f0.c f2809s;

    /* renamed from: t, reason: collision with root package name */
    public f0.c f2810t;

    /* renamed from: u, reason: collision with root package name */
    public f0.c f2811u;

    public n1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
        this.f2809s = null;
        this.f2810t = null;
        this.f2811u = null;
    }

    @Override // n0.s1
    public f0.c j() {
        Insets mandatorySystemGestureInsets;
        if (this.f2810t == null) {
            mandatorySystemGestureInsets = this.f2797c.getMandatorySystemGestureInsets();
            this.f2810t = f0.c.d(mandatorySystemGestureInsets);
        }
        return this.f2810t;
    }

    @Override // n0.s1
    public f0.c l() {
        Insets systemGestureInsets;
        if (this.f2809s == null) {
            systemGestureInsets = this.f2797c.getSystemGestureInsets();
            this.f2809s = f0.c.d(systemGestureInsets);
        }
        return this.f2809s;
    }

    @Override // n0.s1
    public f0.c n() {
        Insets tappableElementInsets;
        if (this.f2811u == null) {
            tappableElementInsets = this.f2797c.getTappableElementInsets();
            this.f2811u = f0.c.d(tappableElementInsets);
        }
        return this.f2811u;
    }

    @Override // n0.k1, n0.s1
    public v1 q(int i, int i4, int i5, int i6) {
        WindowInsets inset;
        inset = this.f2797c.inset(i, i4, i5, i6);
        return v1.g(null, inset);
    }

    @Override // n0.l1, n0.s1
    public void w(f0.c cVar) {
    }
}
