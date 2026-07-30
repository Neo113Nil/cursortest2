package defpackage;

import android.view.View;
import android.view.Window;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.MainActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sj implements sg0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ sj(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // defpackage.sg0
    public final void e(vg0 vg0Var, ng0 ng0Var) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (ng0Var == ng0.ON_STOP) {
                    Window window = this.e.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 1:
                if (ng0Var == ng0.ON_DESTROY) {
                    this.e.e.b = null;
                    if (!this.e.isChangingConfigurations()) {
                        LinkedHashMap linkedHashMap = this.e.g().a;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((tn1) it.next()).b();
                        }
                        linkedHashMap.clear();
                    }
                    vj vjVar = this.e.m;
                    MainActivity mainActivity = vjVar.h;
                    mainActivity.getWindow().getDecorView().removeCallbacks(vjVar);
                    mainActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vjVar);
                    break;
                }
                break;
            default:
                MainActivity mainActivity2 = this.e;
                if (mainActivity2.j == null) {
                    uj ujVar = (uj) mainActivity2.getLastNonConfigurationInstance();
                    if (ujVar != null) {
                        mainActivity2.j = ujVar.a;
                    }
                    if (mainActivity2.j == null) {
                        mainActivity2.j = new mj0(1);
                    }
                }
                mainActivity2.h.f(this);
                break;
        }
    }
}
