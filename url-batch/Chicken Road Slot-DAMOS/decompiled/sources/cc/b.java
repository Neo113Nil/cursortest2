package cc;

import a2.r;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, ld.a aVar, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
            return null;
        }
        if ((i3 & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, aVar);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i3, boolean z10, String str, boolean z11, ld.a aVar, int i10, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: markAsConsumed");
            return null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return dVar.markAsConsumed(i3, z10, str2, z11, aVar);
    }
}
