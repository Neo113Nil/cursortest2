package D4;

import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        fVar.enqueue(gVar, z8);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z8, InterfaceC5133d interfaceC5133d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        return fVar.enqueueAndWait(gVar, z8, interfaceC5133d);
    }
}
