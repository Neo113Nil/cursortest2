package o3;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class c1 extends b1 {

    /* renamed from: t, reason: collision with root package name */
    public h3.b f7381t;

    /* renamed from: u, reason: collision with root package name */
    public h3.b f7382u;

    /* renamed from: v, reason: collision with root package name */
    public h3.b f7383v;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f7381t = null;
        this.f7382u = null;
        this.f7383v = null;
    }

    @Override // o3.h1
    public h3.b k() {
        Insets mandatorySystemGestureInsets;
        if (this.f7382u == null) {
            mandatorySystemGestureInsets = this.f7460c.getMandatorySystemGestureInsets();
            this.f7382u = h3.b.c(mandatorySystemGestureInsets);
        }
        return this.f7382u;
    }

    @Override // o3.h1
    public h3.b m() {
        Insets systemGestureInsets;
        if (this.f7381t == null) {
            systemGestureInsets = this.f7460c.getSystemGestureInsets();
            this.f7381t = h3.b.c(systemGestureInsets);
        }
        return this.f7381t;
    }

    @Override // o3.h1
    public h3.b o() {
        Insets tappableElementInsets;
        if (this.f7383v == null) {
            tappableElementInsets = this.f7460c.getTappableElementInsets();
            this.f7383v = h3.b.c(tappableElementInsets);
        }
        return this.f7383v;
    }

    @Override // o3.z0, o3.h1
    public k1 r(int i3, int i10, int i11, int i12) {
        WindowInsets inset;
        inset = this.f7460c.inset(i3, i10, i11, i12);
        return k1.c(inset, null);
    }

    public c1(k1 k1Var, c1 c1Var) {
        super(k1Var, c1Var);
        this.f7381t = null;
        this.f7382u = null;
        this.f7383v = null;
    }

    @Override // o3.a1, o3.h1
    public void z(h3.b bVar) {
    }
}
