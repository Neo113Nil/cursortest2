package d2;

import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        fVar.enqueue(gVar, z5);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z5, InterfaceC0564d interfaceC0564d, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        return fVar.enqueueAndWait(gVar, z5, interfaceC0564d);
    }
}
