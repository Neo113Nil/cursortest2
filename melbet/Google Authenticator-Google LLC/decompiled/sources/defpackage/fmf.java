package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.apps.authenticator2.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmf extends flw {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final Property i = new fme(Float.class);
    public final Interpolator[] c;
    public final flb d;
    public int e;
    public boolean f;
    public float g;
    aqc h;
    private ObjectAnimator l;
    private ObjectAnimator m;

    public fmf(Context context, fmg fmgVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = fmgVar;
        this.c = new Interpolator[]{ym.r(context, R.anim.linear_indeterminate_line1_head_interpolator), ym.r(context, R.anim.linear_indeterminate_line1_tail_interpolator), ym.r(context, R.anim.linear_indeterminate_line2_head_interpolator), ym.r(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    private final void i() {
        if (this.l == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<fmf, Float>) i, 0.0f, 1.0f);
            this.l = ofFloat;
            ofFloat.setDuration((long) (this.d.n * 1800.0f));
            this.l.setInterpolator(null);
            this.l.setRepeatCount(-1);
            this.l.addListener(new fmc(this));
        }
        if (this.m == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<fmf, Float>) i, 1.0f);
            this.m = ofFloat2;
            ofFloat2.setDuration((long) (this.d.n * 1800.0f));
            this.m.setInterpolator(null);
            this.m.addListener(new fmd(this));
        }
    }

    @Override // defpackage.flw
    public final void a() {
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.flw
    public final void b() {
        i();
        flb flbVar = this.d;
        ObjectAnimator objectAnimator = this.l;
        long j = (long) (flbVar.n * 1800.0f);
        objectAnimator.setDuration(j);
        this.m.setDuration(j);
        e();
    }

    @Override // defpackage.flw
    public final void c(aqc aqcVar) {
        this.h = aqcVar;
    }

    @Override // defpackage.flw
    public final void d() {
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.j.isVisible()) {
            this.m.setFloatValues(this.g, 1.0f);
            this.m.setDuration((long) ((1.0f - this.g) * 1800.0f));
            this.m.start();
        }
    }

    final void e() {
        this.e = 0;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((flu) it.next()).c = this.d.e[0];
        }
    }

    @Override // defpackage.flw
    public final void f() {
        i();
        e();
        this.l.start();
    }

    @Override // defpackage.flw
    public final void g() {
        this.h = null;
    }
}
