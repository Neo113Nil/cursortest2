package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvi {
    public static final kqn a(kqn kqnVar, kqn kqnVar2) {
        return !e(kqnVar2) ? kqnVar.plus(kqnVar2) : d(kqnVar, kqnVar2, false);
    }

    public static final kqn b(kvm kvmVar, kqn kqnVar) {
        kqn d = d(kvmVar.bV(), kqnVar, true);
        kqn plus = kvo.a ? d.plus(new kvk(kvo.c.incrementAndGet())) : d;
        kvj kvjVar = kwa.a;
        return (d == kvjVar || d.get(kqk.b) != null) ? plus : plus.plus(kvjVar);
    }

    public static final kya c(kqj kqjVar, kqn kqnVar, Object obj) {
        kya kyaVar = null;
        if (!(kqjVar instanceof kqx)) {
            return null;
        }
        if (kqnVar.get(kyb.a) != null) {
            kqx kqxVar = (kqx) kqjVar;
            while (true) {
                if ((kqxVar instanceof kvx) || (kqxVar = kqxVar.g()) == null) {
                    break;
                }
                if (kqxVar instanceof kya) {
                    kyaVar = (kya) kqxVar;
                    break;
                }
            }
            if (kyaVar != null) {
                kyaVar.R(kqnVar, obj);
            }
        }
        return kyaVar;
    }

    private static final kqn d(kqn kqnVar, kqn kqnVar2, final boolean z) {
        boolean e = e(kqnVar);
        boolean e2 = e(kqnVar2);
        if (!e && !e2) {
            return kqnVar.plus(kqnVar2);
        }
        final ksw kswVar = new ksw();
        kswVar.a = kqnVar2;
        kqo kqoVar = kqo.a;
        kqn kqnVar3 = (kqn) kqnVar.fold(kqoVar, new krx() { // from class: kvh
            @Override // defpackage.krx
            public final Object a(Object obj, Object obj2) {
                kqn kqnVar4 = (kqn) obj;
                kql kqlVar = (kql) obj2;
                if (!(kqlVar instanceof gwe)) {
                    return kqnVar4.plus(kqlVar);
                }
                ksw kswVar2 = ksw.this;
                kql kqlVar2 = ((kqn) kswVar2.a).get(kqlVar.getKey());
                if (kqlVar2 == null) {
                    return kqnVar4.plus(z ? ((gwe) kqlVar).c() : (gwe) kqlVar);
                }
                kswVar2.a = ((kqn) kswVar2.a).minusKey(kqlVar.getKey());
                return kqnVar4.plus(new gwe(((gwe) kqlVar).b, gta.a));
            }
        });
        if (e2) {
            kswVar.a = ((kqn) kswVar.a).fold(kqoVar, new gjo(7));
        }
        return kqnVar3.plus((kqn) kswVar.a);
    }

    private static final boolean e(kqn kqnVar) {
        return ((Boolean) kqnVar.fold(false, new gjo(6))).booleanValue();
    }
}
