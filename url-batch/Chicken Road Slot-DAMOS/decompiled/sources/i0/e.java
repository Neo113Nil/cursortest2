package i0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.d0;
import k1.p;
import k1.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f4564t = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4565u = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public i f4566d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f4567e;

    /* renamed from: i, reason: collision with root package name */
    public Long f4568i;

    /* renamed from: r, reason: collision with root package name */
    public d0 f4569r;

    /* renamed from: s, reason: collision with root package name */
    public a1.b f4570s;

    private final void setRippleState(boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f4569r;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f4568i;
        long longValue = currentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || longValue >= 5) {
            int[] iArr = z10 ? f4564t : f4565u;
            i iVar = this.f4566d;
            if (iVar != null) {
                iVar.setState(iArr);
            }
        } else {
            d0 d0Var = new d0(15, this);
            this.f4569r = d0Var;
            postDelayed(d0Var, 50L);
        }
        this.f4568i = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(e eVar) {
        i iVar = eVar.f4566d;
        if (iVar != null) {
            iVar.setState(f4565u);
        }
        eVar.f4569r = null;
    }

    public final void b(z.h hVar, boolean z10, long j, int i3, long j3, a1.b bVar) {
        if (this.f4566d == null || !Boolean.valueOf(z10).equals(this.f4567e)) {
            i iVar = new i(z10);
            setBackground(iVar);
            this.f4566d = iVar;
            this.f4567e = Boolean.valueOf(z10);
        }
        i iVar2 = this.f4566d;
        iVar2.getClass();
        this.f4570s = bVar;
        e(i3, j, j3);
        if (z10) {
            iVar2.setHotspot(Float.intBitsToFloat((int) (hVar.f10689a >> 32)), Float.intBitsToFloat((int) (hVar.f10689a & 4294967295L)));
        } else {
            iVar2.setHotspot(iVar2.getBounds().centerX(), iVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f4570s = null;
        d0 d0Var = this.f4569r;
        if (d0Var != null) {
            removeCallbacks(d0Var);
            d0 d0Var2 = this.f4569r;
            d0Var2.getClass();
            d0Var2.run();
        } else {
            i iVar = this.f4566d;
            if (iVar != null) {
                iVar.setState(f4565u);
            }
        }
        i iVar2 = this.f4566d;
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

    public final void e(int i3, long j, long j3) {
        i iVar = this.f4566d;
        if (iVar == null) {
            return;
        }
        if (iVar.getRadius() != i3) {
            iVar.setRadius(i3);
        }
        float f3 = Build.VERSION.SDK_INT < 28 ? 0.1f * 2 : 0.1f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        long b10 = p.b(j3, f3);
        p pVar = iVar.f4581e;
        if (!(pVar == null ? false : p.c(pVar.f5342a, b10))) {
            iVar.f4581e = new p(b10);
            iVar.setColor(ColorStateList.valueOf(v.r(b10)));
        }
        Rect rect = new Rect(0, 0, yd.c.a(Float.intBitsToFloat((int) (j >> 32))), yd.c.a(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        iVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        a1.b bVar = this.f4570s;
        if (bVar != null) {
            bVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
    }
}
