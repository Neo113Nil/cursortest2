package y;

import android.graphics.Insets;
import android.view.WindowInsets;
import r.C0224c;

/* loaded from: classes.dex */
public class M extends L {

    /* renamed from: n, reason: collision with root package name */
    public C0224c f3124n;

    /* renamed from: o, reason: collision with root package name */
    public C0224c f3125o;

    /* renamed from: p, reason: collision with root package name */
    public C0224c f3126p;

    public M(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
        this.f3124n = null;
        this.f3125o = null;
        this.f3126p = null;
    }

    @Override // y.O
    public C0224c f() {
        Insets mandatorySystemGestureInsets;
        if (this.f3125o == null) {
            mandatorySystemGestureInsets = this.f3118c.getMandatorySystemGestureInsets();
            this.f3125o = C0224c.b(mandatorySystemGestureInsets);
        }
        return this.f3125o;
    }

    @Override // y.O
    public C0224c h() {
        Insets systemGestureInsets;
        if (this.f3124n == null) {
            systemGestureInsets = this.f3118c.getSystemGestureInsets();
            this.f3124n = C0224c.b(systemGestureInsets);
        }
        return this.f3124n;
    }

    @Override // y.O
    public C0224c j() {
        Insets tappableElementInsets;
        if (this.f3126p == null) {
            tappableElementInsets = this.f3118c.getTappableElementInsets();
            this.f3126p = C0224c.b(tappableElementInsets);
        }
        return this.f3126p;
    }

    @Override // y.J, y.O
    public void p(C0224c c0224c) {
    }
}
