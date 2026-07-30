package w;

import android.graphics.Insets;
import android.view.WindowInsets;
import p.C0217c;

/* loaded from: classes.dex */
public class N extends M {

    /* renamed from: n, reason: collision with root package name */
    public C0217c f3039n;

    /* renamed from: o, reason: collision with root package name */
    public C0217c f3040o;

    /* renamed from: p, reason: collision with root package name */
    public C0217c f3041p;

    public N(S s2, WindowInsets windowInsets) {
        super(s2, windowInsets);
        this.f3039n = null;
        this.f3040o = null;
        this.f3041p = null;
    }

    @Override // w.P
    public C0217c f() {
        Insets mandatorySystemGestureInsets;
        if (this.f3040o == null) {
            mandatorySystemGestureInsets = this.f3033c.getMandatorySystemGestureInsets();
            this.f3040o = C0217c.b(mandatorySystemGestureInsets);
        }
        return this.f3040o;
    }

    @Override // w.P
    public C0217c h() {
        Insets systemGestureInsets;
        if (this.f3039n == null) {
            systemGestureInsets = this.f3033c.getSystemGestureInsets();
            this.f3039n = C0217c.b(systemGestureInsets);
        }
        return this.f3039n;
    }

    @Override // w.P
    public C0217c j() {
        Insets tappableElementInsets;
        if (this.f3041p == null) {
            tappableElementInsets = this.f3033c.getTappableElementInsets();
            this.f3041p = C0217c.b(tappableElementInsets);
        }
        return this.f3041p;
    }

    @Override // w.K, w.P
    public void p(C0217c c0217c) {
    }
}
