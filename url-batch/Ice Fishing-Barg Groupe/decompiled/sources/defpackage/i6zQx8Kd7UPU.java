package defpackage;

import android.app.Application;
import com.ice.fishing.grenza.MainActivity;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i6zQx8Kd7UPU implements jg0 {
    public final Object OPXfSBeufaJ8 = new Object();
    public final g dgRBjINgWbAK;
    public volatile nv rtx2ld2ELZv4;
    public final MainActivity wdg6QnbFHrFF;
    public gp x50lh2ztY7Y5;

    public i6zQx8Kd7UPU(MainActivity mainActivity) {
        this.wdg6QnbFHrFF = mainActivity;
        this.dgRBjINgWbAK = new g(mainActivity);
    }

    public final nv PxuCJdSBwIXG() {
        String str;
        MainActivity mainActivity = this.wdg6QnbFHrFF;
        if (mainActivity.getApplication() instanceof jg0) {
            pv pvVar = (pv) ((TVHukqbqS4tB) ov2.aF05bpZJlKEP(this.dgRBjINgWbAK, TVHukqbqS4tB.class));
            return new nv(pvVar.PxuCJdSBwIXG, pvVar.lS5Rgt96tfkO);
        }
        if (Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }

    @Override // defpackage.jg0
    public final Object Y1f8riQaR6yg() {
        if (this.rtx2ld2ELZv4 == null) {
            synchronized (this.OPXfSBeufaJ8) {
                try {
                    if (this.rtx2ld2ELZv4 == null) {
                        this.rtx2ld2ELZv4 = PxuCJdSBwIXG();
                    }
                } finally {
                }
            }
        }
        return this.rtx2ld2ELZv4;
    }
}
