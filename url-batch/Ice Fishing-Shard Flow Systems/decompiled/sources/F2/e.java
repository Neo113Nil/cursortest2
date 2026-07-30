package F2;

/* loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z7, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i2 & 2) != 0) {
            z7 = false;
        }
        fVar.enqueue(gVar, z7);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z7, V5.b bVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
        }
        if ((i2 & 2) != 0) {
            z7 = false;
        }
        return fVar.enqueueAndWait(gVar, z7, bVar);
    }
}
