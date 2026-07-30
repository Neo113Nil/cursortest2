package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z92 {
    public static final ReentrantLock TSizfFm2Yiuu = new ReentrantLock();
    public static z92 Y1f8riQaR6yg;
    public final ReentrantLock PxuCJdSBwIXG = new ReentrantLock();
    public final SharedPreferences lS5Rgt96tfkO;

    public z92(Context context) {
        this.lS5Rgt96tfkO = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String PxuCJdSBwIXG(String str) {
        ReentrantLock reentrantLock = this.PxuCJdSBwIXG;
        reentrantLock.lock();
        try {
            return this.lS5Rgt96tfkO.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
