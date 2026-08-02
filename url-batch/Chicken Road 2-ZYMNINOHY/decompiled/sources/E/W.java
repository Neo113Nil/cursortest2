package E;

import android.graphics.Insets;
import android.view.WindowInsets;
import x.C1513b;

/* loaded from: classes.dex */
public class W extends V {
    public C1513b o;

    /* renamed from: p, reason: collision with root package name */
    public C1513b f396p;

    /* renamed from: q, reason: collision with root package name */
    public C1513b f397q;

    public W(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
        this.o = null;
        this.f396p = null;
        this.f397q = null;
    }

    @Override // E.a0
    public C1513b f() {
        Insets mandatorySystemGestureInsets;
        if (this.f396p == null) {
            mandatorySystemGestureInsets = this.f390c.getMandatorySystemGestureInsets();
            this.f396p = C1513b.b(mandatorySystemGestureInsets);
        }
        return this.f396p;
    }

    @Override // E.a0
    public C1513b h() {
        Insets systemGestureInsets;
        if (this.o == null) {
            systemGestureInsets = this.f390c.getSystemGestureInsets();
            this.o = C1513b.b(systemGestureInsets);
        }
        return this.o;
    }

    @Override // E.a0
    public C1513b j() {
        Insets tappableElementInsets;
        if (this.f397q == null) {
            tappableElementInsets = this.f390c.getTappableElementInsets();
            this.f397q = C1513b.b(tappableElementInsets);
        }
        return this.f397q;
    }

    @Override // E.U, E.a0
    public void p(C1513b c1513b) {
    }
}
