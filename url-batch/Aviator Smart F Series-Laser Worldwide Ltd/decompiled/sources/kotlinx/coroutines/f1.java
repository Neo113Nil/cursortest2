package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class f1 implements g1 {
    private final w1 list;

    public f1(w1 w1Var) {
        this.list = w1Var;
    }

    @Override // kotlinx.coroutines.g1
    public w1 getList() {
        return this.list;
    }

    @Override // kotlinx.coroutines.g1
    public boolean isActive() {
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
