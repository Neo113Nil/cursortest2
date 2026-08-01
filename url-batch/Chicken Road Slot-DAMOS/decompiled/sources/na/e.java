package na;

import a2.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: enqueue");
            return;
        }
        if ((i3 & 2) != 0) {
            z10 = false;
        }
        fVar.enqueue(gVar, z10);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z10, ld.a aVar, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: enqueueAndWait");
            return null;
        }
        if ((i3 & 2) != 0) {
            z10 = false;
        }
        return fVar.enqueueAndWait(gVar, z10, aVar);
    }
}
