package l;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class n extends l {

    /* renamed from: n, reason: collision with root package name */
    public h.a f753n;

    /* renamed from: o, reason: collision with root package name */
    public h.a f754o;

    /* renamed from: p, reason: collision with root package name */
    public h.a f755p;

    public n(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
        this.f753n = null;
        this.f754o = null;
        this.f755p = null;
    }

    @Override // l.p
    public h.a f() {
        Insets mandatorySystemGestureInsets;
        if (this.f754o == null) {
            mandatorySystemGestureInsets = this.f748c.getMandatorySystemGestureInsets();
            this.f754o = h.a.b(mandatorySystemGestureInsets);
        }
        return this.f754o;
    }

    @Override // l.p
    public h.a h() {
        Insets systemGestureInsets;
        if (this.f753n == null) {
            systemGestureInsets = this.f748c.getSystemGestureInsets();
            this.f753n = h.a.b(systemGestureInsets);
        }
        return this.f753n;
    }

    @Override // l.p
    public h.a j() {
        Insets tappableElementInsets;
        if (this.f755p == null) {
            tappableElementInsets = this.f748c.getTappableElementInsets();
            this.f755p = h.a.b(tappableElementInsets);
        }
        return this.f755p;
    }

    @Override // l.k, l.p
    public void p(h.a aVar) {
    }
}
