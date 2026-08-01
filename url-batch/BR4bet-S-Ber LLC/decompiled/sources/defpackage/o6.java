package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class o6 extends mz {
    public static volatile o6 k;
    public final xg j = new xg();

    public static o6 V() {
        if (k != null) {
            return k;
        }
        synchronized (o6.class) {
            try {
                if (k == null) {
                    k = new o6();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k;
    }
}
