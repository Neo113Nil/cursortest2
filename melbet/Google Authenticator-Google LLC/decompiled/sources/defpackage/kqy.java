package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kqy extends kqu {
    public kqy(kqj kqjVar) {
        super(kqjVar);
        if (kqjVar != null && kqjVar.bU() != kqo.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.kqj
    public final kqn bU() {
        return kqo.a;
    }
}
