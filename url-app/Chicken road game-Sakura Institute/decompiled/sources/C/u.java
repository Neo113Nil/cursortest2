package C;

import Z.C0323u;
import Z.K;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p.C0937m;

/* loaded from: classes.dex */
public final class u extends View {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f1128l = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1129m = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public H f1130d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f1131e;

    /* renamed from: i, reason: collision with root package name */
    public Long f1132i;

    /* renamed from: j, reason: collision with root package name */
    public t f1133j;

    /* renamed from: k, reason: collision with root package name */
    public M2.p f1134k;

    private final void setRippleState(boolean z4) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1133j;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l4 = this.f1132i;
        long longValue = currentAnimationTimeMillis - (l4 != null ? l4.longValue() : 0L);
        if (z4 || longValue >= 5) {
            int[] iArr = z4 ? f1128l : f1129m;
            H h4 = this.f1130d;
            if (h4 != null) {
                h4.setState(iArr);
            }
        } else {
            t tVar = new t(0, this);
            this.f1133j = tVar;
            postDelayed(tVar, 50L);
        }
        this.f1132i = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(u uVar) {
        H h4 = uVar.f1130d;
        if (h4 != null) {
            h4.setState(f1129m);
        }
        uVar.f1133j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0937m c0937m, boolean z4, long j4, int i2, long j5, float f4, Function0 function0) {
        if (this.f1130d == null || !Boolean.valueOf(z4).equals(this.f1131e)) {
            H h4 = new H(z4);
            setBackground(h4);
            this.f1130d = h4;
            this.f1131e = Boolean.valueOf(z4);
        }
        H h5 = this.f1130d;
        Intrinsics.c(h5);
        this.f1134k = (M2.p) function0;
        Integer num = h5.f1059i;
        if (num == null || num.intValue() != i2) {
            h5.f1059i = Integer.valueOf(i2);
            G.f1056a.a(h5, i2);
        }
        e(j4, j5, f4);
        if (z4) {
            h5.setHotspot(Y.c.d(c0937m.f8974a), Y.c.e(c0937m.f8974a));
        } else {
            h5.setHotspot(h5.getBounds().centerX(), h5.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f1134k = null;
        t tVar = this.f1133j;
        if (tVar != null) {
            removeCallbacks(tVar);
            t tVar2 = this.f1133j;
            Intrinsics.c(tVar2);
            tVar2.run();
        } else {
            H h4 = this.f1130d;
            if (h4 != null) {
                h4.setState(f1129m);
            }
        }
        H h5 = this.f1130d;
        if (h5 == null) {
            return;
        }
        h5.setVisible(false, false);
        unscheduleDrawable(h5);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j4, long j5, float f4) {
        H h4 = this.f1130d;
        if (h4 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f4 *= 2;
        }
        long b4 = C0323u.b(kotlin.ranges.b.b(f4, 1.0f), j5);
        C0323u c0323u = h4.f1058e;
        if (!(c0323u == null ? false : C0323u.c(c0323u.f4549a, b4))) {
            h4.f1058e = new C0323u(b4);
            h4.setColor(ColorStateList.valueOf(K.D(b4)));
        }
        Rect rect = new Rect(0, 0, O2.c.a(Y.f.d(j4)), O2.c.a(Y.f.b(j4)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        h4.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r12 = this.f1134k;
        if (r12 != 0) {
            r12.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
