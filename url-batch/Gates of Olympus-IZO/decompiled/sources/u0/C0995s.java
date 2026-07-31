package u0;

import android.os.SystemClock;
import android.view.MotionEvent;

/* renamed from: u0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995s extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0997t f8406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0995s(C0997t c0997t, int i3) {
        super(0);
        this.f8405e = i3;
        this.f8406f = c0997t;
    }

    @Override // Y1.a
    public final Object b() {
        int actionMasked;
        C0982l c0982l;
        switch (this.f8405e) {
            case 0:
                C0997t c0997t = this.f8406f;
                MotionEvent motionEvent = c0997t.f8456o0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c0997t.f8457p0 = SystemClock.uptimeMillis();
                    c0997t.post(c0997t.f8462s0);
                }
                return L1.z.f2729a;
            default:
                c0982l = this.f8406f.get_viewTreeOwners();
                return c0982l;
        }
    }
}
