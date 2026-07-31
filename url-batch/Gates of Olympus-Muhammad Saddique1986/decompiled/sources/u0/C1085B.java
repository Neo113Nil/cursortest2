package u0;

import android.view.accessibility.AccessibilityEvent;
import e2.InterfaceC0424c;

/* renamed from: u0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1085B extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E f9129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1085B(E e3, int i3) {
        super(1);
        this.f9128e = i3;
        this.f9129f = e3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f9128e) {
            case 0:
                E e3 = this.f9129f;
                return Boolean.valueOf(e3.f9151d.getParent().requestSendAccessibilityEvent(e3.f9151d, (AccessibilityEvent) obj));
            default:
                H0 h02 = (H0) obj;
                E e4 = this.f9129f;
                e4.getClass();
                if (h02.f9193e.contains(h02)) {
                    e4.f9151d.getSnapshotObserver().a(h02, e4.f9150M, new B.f0(h02, 12, e4));
                }
                return R1.y.f4171a;
        }
    }
}
