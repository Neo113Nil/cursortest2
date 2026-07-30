package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sa implements nr1 {
    public static final ra Companion = new ra();
    public ah TSizfFm2Yiuu;
    public ah Y1f8riQaR6yg;
    public IOException e9gEMXR7LXtO;
    public final AtomicBoolean PxuCJdSBwIXG = new AtomicBoolean(false);
    public final CountDownLatch lS5Rgt96tfkO = new CountDownLatch(1);
    public final String a92UlCVFR9N8 = "PublicSuffixDatabase.list";

    public final vp0 PxuCJdSBwIXG() {
        km1.Companion.getClass();
        Object obj = km1.PxuCJdSBwIXG;
        ms msVar = obj != null ? (ms) obj : null;
        Context lS5Rgt96tfkO = msVar != null ? msVar.lS5Rgt96tfkO() : null;
        AssetManager assets = lS5Rgt96tfkO != null ? lS5Rgt96tfkO.getAssets() : null;
        if (assets != null) {
            InputStream open = assets.open(this.a92UlCVFR9N8);
            open.getClass();
            return new vp0(open, new yj2());
        }
        if (Build.FINGERPRINT == null) {
            u9.S9EYkSpbGuxq("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        u9.S9EYkSpbGuxq("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public final void lS5Rgt96tfkO() {
        try {
            es1 es1Var = new es1(PxuCJdSBwIXG());
            try {
                ah x50lh2ztY7Y5 = es1Var.x50lh2ztY7Y5(es1Var.readInt());
                ah x50lh2ztY7Y52 = es1Var.x50lh2ztY7Y5(es1Var.readInt());
                es1Var.close();
                synchronized (this) {
                    x50lh2ztY7Y5.getClass();
                    this.TSizfFm2Yiuu = x50lh2ztY7Y5;
                    x50lh2ztY7Y52.getClass();
                    this.Y1f8riQaR6yg = x50lh2ztY7Y52;
                }
            } finally {
            }
        } finally {
            this.lS5Rgt96tfkO.countDown();
        }
    }
}
