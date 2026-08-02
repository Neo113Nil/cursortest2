package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqo implements Serializable, kqn {
    public static final kqo a = new kqo();
    private static final long serialVersionUID = 0;

    private kqo() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.kqn
    public final kql get(kqm kqmVar) {
        kqmVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.kqn
    public final kqn minusKey(kqm kqmVar) {
        kqmVar.getClass();
        return this;
    }

    @Override // defpackage.kqn
    public final kqn plus(kqn kqnVar) {
        kqnVar.getClass();
        return kqnVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.kqn
    public final Object fold(Object obj, krx krxVar) {
        return obj;
    }
}
