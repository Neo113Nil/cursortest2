package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q7 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ t7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(t7 t7Var, int i) {
        super(0);
        this.m = i;
        this.n = t7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        h7 h7Var;
        int i = this.m;
        t7 t7Var = this.n;
        switch (i) {
            case 0:
                MotionEvent motionEvent = t7Var.D0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    t7Var.E0 = SystemClock.uptimeMillis();
                    t7Var.post(t7Var.J0);
                }
                return Unit.a;
            default:
                h7Var = t7Var.get_viewTreeOwners();
                return h7Var;
        }
    }
}
