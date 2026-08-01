package d2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f3329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i3) {
        super(1);
        this.f3328d = i3;
        this.f3329e = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3328d) {
            case 0:
                View view = this.f3329e.f3338r;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                u1 u1Var = (u1) obj;
                if (u1Var.f3544e.contains(u1Var)) {
                    b0 b0Var = this.f3329e;
                    c2.q1 snapshotObserver = b0Var.f3338r.getSnapshotObserver();
                    snapshotObserver.f1645a.c(u1Var, b0Var.X, new a2.a0(u1Var, b0Var));
                }
                return Unit.f5554a;
        }
    }
}
