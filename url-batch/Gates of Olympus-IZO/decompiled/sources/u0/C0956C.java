package u0;

import I.C0125v0;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: u0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956C extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0959F f8117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0956C(C0959F c0959f, int i3) {
        super(1);
        this.f8116e = i3;
        this.f8117f = c0959f;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f8116e) {
            case 0:
                C0959F c0959f = this.f8117f;
                return Boolean.valueOf(c0959f.f8136d.getParent().requestSendAccessibilityEvent(c0959f.f8136d, (AccessibilityEvent) obj));
            default:
                C1006x0 c1006x0 = (C1006x0) obj;
                C0959F c0959f2 = this.f8117f;
                c0959f2.getClass();
                if (c1006x0.f8496e.contains(c1006x0)) {
                    c0959f2.f8136d.getSnapshotObserver().a(c1006x0, c0959f2.f8135M, new C0125v0(c1006x0, 12, c0959f2));
                }
                return L1.z.f2729a;
        }
    }
}
