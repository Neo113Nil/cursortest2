package d2;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f3451e;

    public /* synthetic */ k(v vVar, int i3) {
        this.f3450d = i3;
        this.f3451e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3450d) {
            case 0:
                kotlin.collections.s sVar = this.f3451e.f3576v;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!sVar.isEmpty()) {
                    try {
                        ((Function0) sVar.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                v vVar = this.f3451e;
                vVar.Q0 = false;
                MotionEvent motionEvent = vVar.I0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    vVar.I(motionEvent);
                    return;
                } else {
                    kotlin.collections.i0.l("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                v.p(this.f3451e.getRoot());
                return;
            default:
                v.p(this.f3451e.getRoot());
                return;
        }
    }
}
