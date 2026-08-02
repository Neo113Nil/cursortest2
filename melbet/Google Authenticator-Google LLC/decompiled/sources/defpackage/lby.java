package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lby implements kvm {
    public final kqn a;
    private final /* synthetic */ int b;

    public lby(kqn kqnVar, int i) {
        this.b = i;
        this.a = kqnVar;
    }

    @Override // defpackage.kvm
    public final kqn bV() {
        return this.a;
    }

    public final String toString() {
        int i = this.b;
        kqn kqnVar = this.a;
        if (i != 0) {
            return "CoroutineScope(coroutineContext=" + kqnVar + ")";
        }
        return "CoroutineScope(coroutineContext=" + kqnVar + ")";
    }
}
