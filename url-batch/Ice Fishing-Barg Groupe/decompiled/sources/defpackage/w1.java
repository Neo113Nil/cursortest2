package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w1 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ x1 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(x1 x1Var, int i) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = x1Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.OPXfSBeufaJ8;
        x1 x1Var = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                View view = x1Var.dgRBjINgWbAK;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                m02 m02Var = (m02) obj;
                if (m02Var.OPXfSBeufaJ8.contains(m02Var)) {
                    hi1 snapshotObserver = x1Var.dgRBjINgWbAK.getSnapshotObserver();
                    snapshotObserver.PxuCJdSBwIXG.Y1f8riQaR6yg(m02Var, x1Var.wLFCmsViZrNT, new i1(1, m02Var, x1Var));
                }
                return no2.PxuCJdSBwIXG;
        }
    }
}
