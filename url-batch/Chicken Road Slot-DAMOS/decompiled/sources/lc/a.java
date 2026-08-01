package lc;

import a2.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Object processNotification$default(b bVar, cc.c cVar, int i3, ld.a aVar, int i10, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: processNotification");
            return null;
        }
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        return bVar.processNotification(cVar, i3, aVar);
    }
}
