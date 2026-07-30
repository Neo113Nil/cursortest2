package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class x1 implements u0, t {
    public static final x1 INSTANCE = new x1();

    private x1() {
    }

    @Override // kotlinx.coroutines.t
    public boolean childCancelled(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.u0
    public void dispose() {
    }

    @Override // kotlinx.coroutines.t
    public l1 getParent() {
        return null;
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}
