package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.ice.fishing.grenza.MainActivity;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class wm implements ae0 {
    public final /* synthetic */ MainActivity OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ wm(MainActivity mainActivity, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = mainActivity;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        int i2 = 0;
        MainActivity mainActivity = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                mainActivity.reportFullyDrawn();
                return no2.PxuCJdSBwIXG;
            case 1:
                return new zd0(mainActivity.cpQdD2nAriOS, new wm(mainActivity, i2));
            case 2:
                b00 b00Var = new b00();
                mainActivity.PxuCJdSBwIXG().lS5Rgt96tfkO(b00Var);
                return b00Var;
            case 3:
                return new rz1(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            default:
                uf1 uf1Var = new uf1(new vm(mainActivity, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (cs0.wdg6QnbFHrFF(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity.rtx2ld2ELZv4.PxuCJdSBwIXG(new xm(uf1Var, mainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new l2(1, mainActivity, uf1Var));
                    }
                }
                return uf1Var;
        }
    }
}
