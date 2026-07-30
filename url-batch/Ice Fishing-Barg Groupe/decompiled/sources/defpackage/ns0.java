package defpackage;

import com.ice.fishing.grenza.data.db.AppDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ns0 {
    public static final ms0 Companion = new ms0();
    public final AppDatabase_Impl PxuCJdSBwIXG;
    public final Object RAsUl2FVSrh6;
    public final LinkedHashMap TSizfFm2Yiuu;
    public final ReentrantLock Y1f8riQaR6yg;
    public final kb a92UlCVFR9N8;
    public final kb e9gEMXR7LXtO;
    public final gm2 lS5Rgt96tfkO;

    public ns0(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.PxuCJdSBwIXG = appDatabase_Impl;
        gm2 gm2Var = new gm2(appDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, appDatabase_Impl.wdg6QnbFHrFF, new RAsUl2FVSrh6(1, this, ns0.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 1));
        this.lS5Rgt96tfkO = gm2Var;
        this.TSizfFm2Yiuu = new LinkedHashMap();
        this.Y1f8riQaR6yg = new ReentrantLock();
        this.e9gEMXR7LXtO = new kb(this, 17);
        this.a92UlCVFR9N8 = new kb(this, 18);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.RAsUl2FVSrh6 = new Object();
        gm2Var.dgRBjINgWbAK = new o5(16, this);
    }
}
