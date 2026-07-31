package u0;

import android.os.SystemClock;
import android.view.MotionEvent;
import e2.InterfaceC0422a;

/* renamed from: u0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120q extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1123s f9439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1120q(C1123s c1123s, int i3) {
        super(0);
        this.f9438e = i3;
        this.f9439f = c1123s;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        int actionMasked;
        C1110l c1110l;
        switch (this.f9438e) {
            case 0:
                C1123s c1123s = this.f9439f;
                MotionEvent motionEvent = c1123s.f9502p0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c1123s.q0 = SystemClock.uptimeMillis();
                    c1123s.post(c1123s.f9509t0);
                }
                return R1.y.f4171a;
            default:
                c1110l = this.f9439f.get_viewTreeOwners();
                return c1110l;
        }
    }
}
