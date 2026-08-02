package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqi implements Serializable, kqn {
    private final kqn a;
    private final kql b;

    public kqi(kqn kqnVar, kql kqlVar) {
        kqnVar.getClass();
        this.a = kqnVar;
        this.b = kqlVar;
    }

    private final int a() {
        int i = 2;
        while (true) {
            kqn kqnVar = this.a;
            this = kqnVar instanceof kqi ? (kqi) kqnVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(kql kqlVar) {
        return ksp.b(get(kqlVar.getKey()), kqlVar);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int a = a();
        final kqn[] kqnVarArr = new kqn[a];
        final ksv ksvVar = new ksv();
        fold(kow.a, new krx() { // from class: kqg
            @Override // defpackage.krx
            public final Object a(Object obj, Object obj2) {
                kql kqlVar = (kql) obj2;
                ((kow) obj).getClass();
                kqlVar.getClass();
                ksv ksvVar2 = ksvVar;
                int i = ksvVar2.a;
                ksvVar2.a = i + 1;
                kqnVarArr[i] = kqlVar;
                return kow.a;
            }
        });
        if (ksvVar.a == a) {
            return new kqh(kqnVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kqi) {
            kqi kqiVar = (kqi) obj;
            if (kqiVar.a() == a()) {
                while (true) {
                    if (!kqiVar.b(this.b)) {
                        break;
                    }
                    kqn kqnVar = this.a;
                    if (kqnVar instanceof kqi) {
                        this = (kqi) kqnVar;
                    } else if (kqiVar.b((kql) kqnVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.kqn
    public final Object fold(Object obj, krx krxVar) {
        return krxVar.a(this.a.fold(obj, krxVar), this.b);
    }

    @Override // defpackage.kqn
    public final kql get(kqm kqmVar) {
        kqmVar.getClass();
        while (true) {
            kql kqlVar = this.b.get(kqmVar);
            if (kqlVar != null) {
                return kqlVar;
            }
            kqn kqnVar = this.a;
            if (!(kqnVar instanceof kqi)) {
                return kqnVar.get(kqmVar);
            }
            this = (kqi) kqnVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.kqn
    public final kqn minusKey(kqm kqmVar) {
        kqmVar.getClass();
        kql kqlVar = this.b;
        kql kqlVar2 = kqlVar.get(kqmVar);
        kqn kqnVar = this.a;
        if (kqlVar2 != null) {
            return kqnVar;
        }
        kqn minusKey = kqnVar.minusKey(kqmVar);
        return minusKey != kqnVar ? minusKey == kqo.a ? kqlVar : new kqi(minusKey, kqlVar) : this;
    }

    @Override // defpackage.kqn
    public final /* bridge */ kqn plus(kqn kqnVar) {
        return ixe.i(this, kqnVar);
    }

    public final String toString() {
        return "[" + fold("", new gjo(4)) + "]";
    }
}
