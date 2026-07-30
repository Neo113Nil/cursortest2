package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p3 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ d4 e;

    public /* synthetic */ p3(d4 d4Var, int i) {
        this.d = i;
        this.e = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        d4 d4Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m9 m9Var = d4Var.l;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!m9Var.isEmpty()) {
                    try {
                        ((Function0) m9Var.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            default:
                d4Var.E0 = false;
                MotionEvent motionEvent = d4Var.w0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    d4Var.G(motionEvent);
                    return;
                } else {
                    dd0.j("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
