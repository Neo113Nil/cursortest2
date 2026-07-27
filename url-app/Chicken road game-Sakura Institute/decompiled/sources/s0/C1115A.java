package s0;

import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: s0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115A extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1118D f9982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1115A(C1118D c1118d, int i2) {
        super(1);
        this.f9981d = i2;
        this.f9982e = c1118d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9981d) {
            case 0:
                C1118D c1118d = this.f9982e;
                return Boolean.valueOf(c1118d.f10011d.getParent().requestSendAccessibilityEvent(c1118d.f10011d, (AccessibilityEvent) obj));
            default:
                I0 i02 = (I0) obj;
                C1118D c1118d2 = this.f9982e;
                c1118d2.getClass();
                if (i02.f10057e.contains(i02)) {
                    c1118d2.f10011d.getSnapshotObserver().a(i02, c1118d2.f10010M, new A.f0(i02, 11, c1118d2));
                }
                return Unit.f7487a;
        }
    }
}
