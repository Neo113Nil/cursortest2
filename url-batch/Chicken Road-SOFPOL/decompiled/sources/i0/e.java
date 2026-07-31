package i0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.m0;
import f1.p;
import f1.s;
import v.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends View {
    public static final int[] i = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f3271j = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public i f3272d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f3273e;

    /* renamed from: f, reason: collision with root package name */
    public Long f3274f;

    /* renamed from: g, reason: collision with root package name */
    public a1.a f3275g;

    /* renamed from: h, reason: collision with root package name */
    public m0 f3276h;

    private final void setRippleState(boolean z3) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f3275g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l3 = this.f3274f;
        long longValue = currentAnimationTimeMillis - (l3 != null ? l3.longValue() : 0L);
        if (z3 || longValue >= 5) {
            int[] iArr = z3 ? i : f3271j;
            i iVar = this.f3272d;
            if (iVar != null) {
                iVar.setState(iArr);
            }
        } else {
            a1.a aVar = new a1.a(6, this);
            this.f3275g = aVar;
            postDelayed(aVar, 50L);
        }
        this.f3274f = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(e eVar) {
        i iVar = eVar.f3272d;
        if (iVar != null) {
            iVar.setState(f3271j);
        }
        eVar.f3275g = null;
    }

    public final void b(l lVar, boolean z3, long j7, int i8, long j8, m0 m0Var) {
        if (this.f3272d == null || !Boolean.valueOf(z3).equals(this.f3273e)) {
            i iVar = new i(z3);
            setBackground(iVar);
            this.f3272d = iVar;
            this.f3273e = Boolean.valueOf(z3);
        }
        i iVar2 = this.f3272d;
        q6.i.b(iVar2);
        this.f3276h = m0Var;
        e(i8, j7, j8);
        if (z3) {
            iVar2.setHotspot(Float.intBitsToFloat((int) (lVar.f7421a >> 32)), Float.intBitsToFloat((int) (lVar.f7421a & 4294967295L)));
        } else {
            iVar2.setHotspot(iVar2.getBounds().centerX(), iVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f3276h = null;
        a1.a aVar = this.f3275g;
        if (aVar != null) {
            removeCallbacks(aVar);
            a1.a aVar2 = this.f3275g;
            q6.i.b(aVar2);
            aVar2.run();
        } else {
            i iVar = this.f3272d;
            if (iVar != null) {
                iVar.setState(f3271j);
            }
        }
        i iVar2 = this.f3272d;
        if (iVar2 == null) {
            return;
        }
        iVar2.setVisible(false, false);
        unscheduleDrawable(iVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i8, long j7, long j8) {
        i iVar = this.f3272d;
        if (iVar == null) {
            return;
        }
        Integer num = iVar.f3289f;
        if (num == null || num.intValue() != i8) {
            iVar.f3289f = Integer.valueOf(i8);
            iVar.setRadius(i8);
        }
        float f6 = Build.VERSION.SDK_INT < 28 ? 0.1f * 2 : 0.1f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        long b8 = s.b(j8, f6);
        s sVar = iVar.f3288e;
        if (!(sVar == null ? false : s.c(sVar.f2705a, b8))) {
            iVar.f3288e = new s(b8);
            iVar.setColor(ColorStateList.valueOf(p.u(b8)));
        }
        Rect rect = new Rect(0, 0, s6.a.B(Float.intBitsToFloat((int) (j7 >> 32))), s6.a.B(Float.intBitsToFloat((int) (j7 & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        iVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        m0 m0Var = this.f3276h;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i8, int i9, int i10, int i11) {
    }
}
