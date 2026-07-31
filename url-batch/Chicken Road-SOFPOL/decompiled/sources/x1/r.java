package x1;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f8534f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i) {
        super(0);
        this.f8533e = i;
        this.f8534f = tVar;
    }

    @Override // p6.a
    public final Object b() {
        int actionMasked;
        m mVar;
        switch (this.f8533e) {
            case 0:
                t tVar = this.f8534f;
                MotionEvent motionEvent = tVar.f8576t0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    tVar.f8578u0 = SystemClock.uptimeMillis();
                    tVar.post(tVar.f8588z0);
                }
                return c6.m.f1757a;
            default:
                mVar = this.f8534f.get_viewTreeOwners();
                return mVar;
        }
    }
}
