package x1;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f8611f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, int i) {
        super(1);
        this.f8610e = i;
        this.f8611f = a0Var;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f8610e) {
            case 0:
                a0 a0Var = this.f8611f;
                return Boolean.valueOf(a0Var.f8330d.getParent().requestSendAccessibilityEvent(a0Var.f8330d, (AccessibilityEvent) obj));
            default:
                o1 o1Var = (o1) obj;
                if (o1Var.f8520e.contains(o1Var)) {
                    a0 a0Var2 = this.f8611f;
                    a0Var2.f8330d.getSnapshotObserver().a(o1Var, a0Var2.P, new a2.b(7, o1Var, a0Var2));
                }
                return c6.m.f1757a;
        }
    }
}
