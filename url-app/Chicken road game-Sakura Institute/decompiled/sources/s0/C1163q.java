package s0;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: s0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163q extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1166s f10287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1163q(C1166s c1166s, int i2) {
        super(0);
        this.f10286d = i2;
        this.f10287e = c1166s;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        C1153l c1153l;
        switch (this.f10286d) {
            case 0:
                C1166s c1166s = this.f10287e;
                MotionEvent motionEvent = c1166s.f10371s0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c1166s.t0 = SystemClock.uptimeMillis();
                    c1166s.post(c1166s.f10378w0);
                }
                return Unit.f7487a;
            default:
                c1153l = this.f10287e.get_viewTreeOwners();
                return c1153l;
        }
    }
}
