package a1;

import android.graphics.Insets;
import android.view.WindowInsets;

/* renamed from: a1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0378N extends C0377M {

    /* renamed from: n, reason: collision with root package name */
    public V0.c f4864n;

    /* renamed from: o, reason: collision with root package name */
    public V0.c f4865o;

    /* renamed from: p, reason: collision with root package name */
    public V0.c f4866p;

    public C0378N(C0383T c0383t, WindowInsets windowInsets) {
        super(c0383t, windowInsets);
        this.f4864n = null;
        this.f4865o = null;
        this.f4866p = null;
    }

    @Override // a1.C0380P
    public V0.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f4865o == null) {
            mandatorySystemGestureInsets = this.f4858c.getMandatorySystemGestureInsets();
            this.f4865o = V0.c.c(mandatorySystemGestureInsets);
        }
        return this.f4865o;
    }

    @Override // a1.C0380P
    public V0.c j() {
        Insets systemGestureInsets;
        if (this.f4864n == null) {
            systemGestureInsets = this.f4858c.getSystemGestureInsets();
            this.f4864n = V0.c.c(systemGestureInsets);
        }
        return this.f4864n;
    }

    @Override // a1.C0380P
    public V0.c l() {
        Insets tappableElementInsets;
        if (this.f4866p == null) {
            tappableElementInsets = this.f4858c.getTappableElementInsets();
            this.f4866p = V0.c.c(tappableElementInsets);
        }
        return this.f4866p;
    }

    @Override // a1.C0376L, a1.C0380P
    public void r(V0.c cVar) {
    }
}
