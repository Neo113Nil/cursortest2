package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class evy implements gzf {
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        etn etnVar = (etn) obj;
        jkj k = ewd.a.k();
        if (etnVar == null) {
            return (ewd) k.q();
        }
        for (eto etoVar : etnVar.f) {
            jkj k2 = ewe.a.k();
            String str = etoVar.e;
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar = k2.b;
            ewe eweVar = (ewe) jkpVar;
            str.getClass();
            eweVar.b |= 1;
            eweVar.e = str;
            int i = etoVar.c;
            int L = eos.L(i);
            if (L == 0) {
                throw null;
            }
            int i2 = L - 1;
            if (i2 == 0) {
                long longValue = i == 1 ? ((Long) etoVar.d).longValue() : 0L;
                if (!k2.b.M()) {
                    k2.t();
                }
                ewe eweVar2 = (ewe) k2.b;
                eweVar2.c = 2;
                eweVar2.d = Long.valueOf(longValue);
            } else if (i2 == 1) {
                boolean booleanValue = i == 2 ? ((Boolean) etoVar.d).booleanValue() : false;
                if (!k2.b.M()) {
                    k2.t();
                }
                ewe eweVar3 = (ewe) k2.b;
                eweVar3.c = 3;
                eweVar3.d = Boolean.valueOf(booleanValue);
            } else if (i2 == 2) {
                double doubleValue = i == 3 ? ((Double) etoVar.d).doubleValue() : 0.0d;
                if (!k2.b.M()) {
                    k2.t();
                }
                ewe eweVar4 = (ewe) k2.b;
                eweVar4.c = 4;
                eweVar4.d = Double.valueOf(doubleValue);
            } else if (i2 == 3) {
                String str2 = i == 4 ? (String) etoVar.d : "";
                if (!jkpVar.M()) {
                    k2.t();
                }
                ewe eweVar5 = (ewe) k2.b;
                str2.getClass();
                eweVar5.c = 5;
                eweVar5.d = str2;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("No known flag type");
                }
                jjq jjqVar = i == 5 ? (jjq) etoVar.d : jjq.d;
                if (!k2.b.M()) {
                    k2.t();
                }
                ewe eweVar6 = (ewe) k2.b;
                jjqVar.getClass();
                eweVar6.c = 6;
                eweVar6.d = jjqVar;
            }
            ewe eweVar7 = (ewe) k2.q();
            if (!k.b.M()) {
                k.t();
            }
            ewd ewdVar = (ewd) k.b;
            eweVar7.getClass();
            jkx jkxVar = ewdVar.g;
            if (!jkxVar.c()) {
                ewdVar.g = jkp.A(jkxVar);
            }
            ewdVar.g.add(eweVar7);
        }
        String str3 = etnVar.e;
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        ewd ewdVar2 = (ewd) jkpVar2;
        str3.getClass();
        ewdVar2.b = 4 | ewdVar2.b;
        ewdVar2.e = str3;
        String str4 = etnVar.c;
        if (!jkpVar2.M()) {
            k.t();
        }
        jkp jkpVar3 = k.b;
        ewd ewdVar3 = (ewd) jkpVar3;
        str4.getClass();
        ewdVar3.b = 1 | ewdVar3.b;
        ewdVar3.c = str4;
        long j = etnVar.i;
        if (!jkpVar3.M()) {
            k.t();
        }
        jkp jkpVar4 = k.b;
        ewd ewdVar4 = (ewd) jkpVar4;
        ewdVar4.b |= 8;
        ewdVar4.f = j;
        if ((etnVar.b & 2) != 0) {
            jjq jjqVar2 = etnVar.d;
            if (!jkpVar4.M()) {
                k.t();
            }
            ewd ewdVar5 = (ewd) k.b;
            jjqVar2.getClass();
            ewdVar5.b |= 2;
            ewdVar5.d = jjqVar2;
        }
        return (ewd) k.q();
    }
}
