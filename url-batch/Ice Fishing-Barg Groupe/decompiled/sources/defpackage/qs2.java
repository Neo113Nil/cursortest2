package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qs2 implements Runnable {
    public final /* synthetic */ xs2 OPXfSBeufaJ8;
    public final /* synthetic */ ValueAnimator dgRBjINgWbAK;
    public final /* synthetic */ View rtx2ld2ELZv4;
    public final /* synthetic */ cr1 wdg6QnbFHrFF;

    public qs2(View view, xs2 xs2Var, cr1 cr1Var, ValueAnimator valueAnimator) {
        this.rtx2ld2ELZv4 = view;
        this.OPXfSBeufaJ8 = xs2Var;
        this.wdg6QnbFHrFF = cr1Var;
        this.dgRBjINgWbAK = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ss2.OPXfSBeufaJ8(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF);
        this.dgRBjINgWbAK.start();
    }
}
