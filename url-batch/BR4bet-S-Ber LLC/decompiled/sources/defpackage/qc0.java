package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qc0 {
    public final ky a = new ky(15);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                f60.g(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
