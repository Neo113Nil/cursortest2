package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import com.ice.fishing.grenza.MainActivity;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class gd implements Runnable {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ Object cpQdD2nAriOS;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;
    public final /* synthetic */ Object x50lh2ztY7Y5;

    public /* synthetic */ gd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
        this.dgRBjINgWbAK = obj3;
        this.x50lh2ztY7Y5 = obj4;
        this.cpQdD2nAriOS = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.cpQdD2nAriOS;
        Object obj2 = this.x50lh2ztY7Y5;
        Object obj3 = this.dgRBjINgWbAK;
        Object obj4 = this.wdg6QnbFHrFF;
        Object obj5 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                dj2 dj2Var = (dj2) obj5;
                cw0 cw0Var = (cw0) obj4;
                String str = (String) obj3;
                hy hyVar = (hy) obj2;
                ob0 ob0Var = (ob0) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    j72.Companion.getClass();
                    b91 RAsUl2FVSrh6 = i72.RAsUl2FVSrh6(null, null);
                    try {
                        j72 wdg6QnbFHrFF = RAsUl2FVSrh6.wdg6QnbFHrFF();
                        try {
                            dj2 ozEBbv0hFTAB = th0.ozEBbv0hFTAB(dj2Var, cw0Var);
                            p50 p50Var = p50.rtx2ld2ELZv4;
                            q4 q4Var = new q4(str, ozEBbv0hFTAB, p50Var, p50Var, ob0Var, hyVar);
                            q4Var.TSizfFm2Yiuu();
                            q4Var.PxuCJdSBwIXG();
                            j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                            RAsUl2FVSrh6.S2OOm9zPNm0h().QrzZRwfaDlRX();
                            RAsUl2FVSrh6.TSizfFm2Yiuu();
                            return;
                        } catch (Throwable th) {
                            j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                            throw th;
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            default:
                l40 l40Var = (l40) obj5;
                wc2 wc2Var = (wc2) obj4;
                wc2 wc2Var2 = (wc2) obj3;
                View view = (View) obj;
                Window window = ((MainActivity) obj2).getWindow();
                window.getClass();
                le0 le0Var = wc2Var.Y1f8riQaR6yg;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) le0Var.OPXfSBeufaJ8(resources)).booleanValue();
                le0 le0Var2 = wc2Var2.Y1f8riQaR6yg;
                Resources resources2 = view.getResources();
                resources2.getClass();
                l40Var.lS5Rgt96tfkO(wc2Var, wc2Var2, window, view, booleanValue, ((Boolean) le0Var2.OPXfSBeufaJ8(resources2)).booleanValue());
                return;
        }
    }
}
