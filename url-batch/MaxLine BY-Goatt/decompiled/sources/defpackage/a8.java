package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a8 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ b8 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8(b8 b8Var, int i) {
        super(1);
        this.m = i;
        this.n = b8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        b8 b8Var = this.n;
        switch (i) {
            case 0:
                View view = b8Var.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                ef2 ef2Var = (ef2) obj;
                if (ef2Var.n.contains(ef2Var)) {
                    b8Var.d.getSnapshotObserver().a(ef2Var, b8Var.P, new k7(2, ef2Var, b8Var));
                }
                return Unit.a;
        }
    }
}
