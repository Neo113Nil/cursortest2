package defpackage;

import android.app.Application;
import com.moontiko.really.admiralcasino.MainActivity2;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements rn {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.rn
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                d2 d2Var = (d2) obj;
                m3 D = d2Var.D();
                Application application = d2Var.D().getApplication();
                application.getClass();
                return (ry) new pw(D, kr.A(application)).d(ry.class);
            case 1:
                MainActivity2 mainActivity2 = (MainActivity2) obj;
                int i2 = MainActivity2.H;
                Application application2 = mainActivity2.getApplication();
                application2.getClass();
                return (ry) new pw(mainActivity2, kr.A(application2)).d(ry.class);
            default:
                return new fz((hz) obj);
        }
    }
}
