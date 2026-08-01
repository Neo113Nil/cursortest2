package l;

import android.graphics.Insets;
import android.view.WindowInsets;
import h.C0037a;

/* loaded from: classes.dex */
public class m extends k {

    /* renamed from: n, reason: collision with root package name */
    public C0037a f971n;

    /* renamed from: o, reason: collision with root package name */
    public C0037a f972o;

    /* renamed from: p, reason: collision with root package name */
    public C0037a f973p;

    public m(q qVar, WindowInsets windowInsets) {
        super(qVar, windowInsets);
        this.f971n = null;
        this.f972o = null;
        this.f973p = null;
    }

    @Override // l.o
    public C0037a f() {
        Insets mandatorySystemGestureInsets;
        if (this.f972o == null) {
            mandatorySystemGestureInsets = this.f965c.getMandatorySystemGestureInsets();
            this.f972o = C0037a.b(mandatorySystemGestureInsets);
        }
        return this.f972o;
    }

    @Override // l.o
    public C0037a h() {
        Insets systemGestureInsets;
        if (this.f971n == null) {
            systemGestureInsets = this.f965c.getSystemGestureInsets();
            this.f971n = C0037a.b(systemGestureInsets);
        }
        return this.f971n;
    }

    @Override // l.o
    public C0037a j() {
        Insets tappableElementInsets;
        if (this.f973p == null) {
            tappableElementInsets = this.f965c.getTappableElementInsets();
            this.f973p = C0037a.b(tappableElementInsets);
        }
        return this.f973p;
    }

    @Override // l.j, l.o
    public void p(C0037a c0037a) {
    }
}
