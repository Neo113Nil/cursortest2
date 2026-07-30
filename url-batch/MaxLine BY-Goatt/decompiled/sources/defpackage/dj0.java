package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dj0 {
    public static final u30 c = new u30(10);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final t21 b;

    public dj0(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
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
        this.a = reentrantLock;
        this.b = z ? new t21(str) : null;
    }
}
