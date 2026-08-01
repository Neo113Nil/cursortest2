package f8;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ boolean a(Unsafe unsafe, r rVar, long j, q qVar, q qVar2) {
        while (!unsafe.compareAndSwapObject(rVar, j, qVar, qVar2)) {
            if (unsafe.getObject(rVar, j) != qVar) {
                return false;
            }
        }
        return true;
    }
}
