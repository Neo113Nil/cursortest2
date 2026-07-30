package c0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.c0;
import z0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1485k = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f1486l = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public y f1487f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f1488g;

    /* renamed from: h, reason: collision with root package name */
    public Long f1489h;

    /* renamed from: i, reason: collision with root package name */
    public c0 f1490i;

    /* renamed from: j, reason: collision with root package name */
    public q6.a f1491j;

    private final void setRippleState(boolean z8) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1490i;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l8 = this.f1489h;
        long longValue = currentAnimationTimeMillis - (l8 != null ? l8.longValue() : 0L);
        if (z8 || longValue >= 5) {
            int[] iArr = z8 ? f1485k : f1486l;
            y yVar = this.f1487f;
            if (yVar != null) {
                yVar.setState(iArr);
            }
        } else {
            c0 c0Var = new c0(4, this);
            this.f1490i = c0Var;
            postDelayed(c0Var, 50L);
        }
        this.f1489h = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(n nVar) {
        y yVar = nVar.f1487f;
        if (yVar != null) {
            yVar.setState(f1486l);
        }
        nVar.f1490i = null;
    }

    public final void b(p.l lVar, boolean z8, long j8, int i7, long j9, float f9, q6.a aVar) {
        if (this.f1487f == null || !Boolean.valueOf(z8).equals(this.f1488g)) {
            y yVar = new y(z8);
            setBackground(yVar);
            this.f1487f = yVar;
            this.f1488g = Boolean.valueOf(z8);
        }
        y yVar2 = this.f1487f;
        r6.k.c(yVar2);
        this.f1491j = aVar;
        Integer num = yVar2.f1521h;
        if (num == null || num.intValue() != i7) {
            yVar2.f1521h = Integer.valueOf(i7);
            x.f1518a.a(yVar2, i7);
        }
        e(f9, j8, j9);
        if (z8) {
            yVar2.setHotspot(y0.c.d(lVar.f6978a), y0.c.e(lVar.f6978a));
        } else {
            yVar2.setHotspot(yVar2.getBounds().centerX(), yVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f1491j = null;
        c0 c0Var = this.f1490i;
        if (c0Var != null) {
            removeCallbacks(c0Var);
            c0 c0Var2 = this.f1490i;
            r6.k.c(c0Var2);
            c0Var2.run();
        } else {
            y yVar = this.f1487f;
            if (yVar != null) {
                yVar.setState(f1486l);
            }
        }
        y yVar2 = this.f1487f;
        if (yVar2 == null) {
            return;
        }
        yVar2.setVisible(false, false);
        unscheduleDrawable(yVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f9, long j8, long j9) {
        y yVar = this.f1487f;
        if (yVar == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f9 *= 2;
        }
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        long b9 = z0.u.b(j9, f9);
        z0.u uVar = yVar.f1520g;
        if (!(uVar == null ? false : z0.u.c(uVar.f10059a, b9))) {
            yVar.f1520g = new z0.u(b9);
            yVar.setColor(ColorStateList.valueOf(l0.w(b9)));
        }
        Rect rect = new Rect(0, 0, t6.a.O(y0.f.d(j8)), t6.a.O(y0.f.b(j8)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        yVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        q6.a aVar = this.f1491j;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i7, int i8, int i9, int i10) {
    }
}
