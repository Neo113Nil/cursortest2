package defpackage;

import com.ice.fishing.grenza.MainActivity;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g implements jg0 {
    public final MainActivity OPXfSBeufaJ8;
    public final Object dgRBjINgWbAK = new Object();
    public final MainActivity rtx2ld2ELZv4;
    public volatile pv wdg6QnbFHrFF;

    public g(MainActivity mainActivity) {
        this.rtx2ld2ELZv4 = mainActivity;
        this.OPXfSBeufaJ8 = mainActivity;
    }

    @Override // defpackage.jg0
    public final Object Y1f8riQaR6yg() {
        if (this.wdg6QnbFHrFF == null) {
            synchronized (this.dgRBjINgWbAK) {
                try {
                    if (this.wdg6QnbFHrFF == null) {
                        MainActivity mainActivity = this.rtx2ld2ELZv4;
                        c cVar = new c(0, this.OPXfSBeufaJ8);
                        or2 RAsUl2FVSrh6 = mainActivity.RAsUl2FVSrh6();
                        zu EpkonXwzFgDB = ki0.EpkonXwzFgDB(mainActivity);
                        EpkonXwzFgDB.getClass();
                        e0 e0Var = new e0(RAsUl2FVSrh6, cVar, EpkonXwzFgDB);
                        ck PxuCJdSBwIXG = bu1.PxuCJdSBwIXG(e.class);
                        String lS5Rgt96tfkO = PxuCJdSBwIXG.lS5Rgt96tfkO();
                        if (lS5Rgt96tfkO == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.wdg6QnbFHrFF = ((e) e0Var.wdg6QnbFHrFF(PxuCJdSBwIXG, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(lS5Rgt96tfkO))).lS5Rgt96tfkO;
                    }
                } finally {
                }
            }
        }
        return this.wdg6QnbFHrFF;
    }
}
