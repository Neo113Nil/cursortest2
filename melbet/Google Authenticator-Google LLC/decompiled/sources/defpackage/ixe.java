package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ixe {
    public static Object b(krx krxVar, Object obj, kqj kqjVar) {
        krxVar.getClass();
        kqn bU = kqjVar.bU();
        Object kqsVar = bU == kqo.a ? new kqs(kqjVar) : new kqt(kqjVar, bU);
        ksy.b(krxVar, 2);
        return krxVar.a(obj, kqsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kqj c(krx krxVar, Object obj, kqj kqjVar) {
        if (krxVar instanceof kqu) {
            return ((kqu) krxVar).c(obj, kqjVar);
        }
        kqn bU = kqjVar.bU();
        return bU == kqo.a ? new kqq(kqjVar, krxVar, obj) : new kqr(kqjVar, bU, krxVar, obj);
    }

    public static kqj d(kqj kqjVar) {
        kqjVar.getClass();
        kqw kqwVar = kqjVar instanceof kqw ? (kqw) kqjVar : null;
        if (kqwVar != null && (kqjVar = kqwVar.l) == null) {
            kqk kqkVar = (kqk) kqwVar.bU().get(kqk.b);
            kqjVar = kqkVar != null ? kqkVar.bS(kqwVar) : kqwVar;
            kqwVar.l = kqjVar;
        }
        return kqjVar;
    }

    public static Object e(kql kqlVar, Object obj, krx krxVar) {
        krxVar.getClass();
        return krxVar.a(obj, kqlVar);
    }

    public static kql f(kql kqlVar, kqm kqmVar) {
        kqmVar.getClass();
        if (ksp.b(kqlVar.getKey(), kqmVar)) {
            return kqlVar;
        }
        return null;
    }

    public static kqn g(kql kqlVar, kqm kqmVar) {
        kqmVar.getClass();
        return ksp.b(kqlVar.getKey(), kqmVar) ? kqo.a : kqlVar;
    }

    public static kqn h(kql kqlVar, kqn kqnVar) {
        kqnVar.getClass();
        return i(kqlVar, kqnVar);
    }

    public static kqn i(kqn kqnVar, kqn kqnVar2) {
        kqnVar2.getClass();
        return kqnVar2 == kqo.a ? kqnVar : (kqn) kqnVar2.fold(kqnVar, new gjo(5));
    }

    public static int j(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public void a(kbi kbiVar) {
        throw null;
    }
}
