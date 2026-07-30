package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g70 {
    public static final f70 Companion = new f70();
    public static final LinkedHashMap TSizfFm2Yiuu = new LinkedHashMap();
    public final ReentrantLock PxuCJdSBwIXG;
    public final op0 lS5Rgt96tfkO;

    public g70(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (Companion) {
            try {
                LinkedHashMap linkedHashMap = TSizfFm2Yiuu;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.PxuCJdSBwIXG = reentrantLock;
        this.lS5Rgt96tfkO = z ? new op0(str) : null;
    }
}
