package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class elr extends elu {
    public static final elr a = new elr();

    @Override // defpackage.elu
    public final /* bridge */ /* synthetic */ jll a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        jkj k = lel.a.k();
        if (!k.b.M()) {
            k.t();
        }
        lel lelVar = (lel) k.b;
        lelVar.b |= 1;
        lelVar.c = intValue;
        if (str != null) {
            lem p = eos.p(str);
            if (!k.b.M()) {
                k.t();
            }
            lel lelVar2 = (lel) k.b;
            p.getClass();
            lelVar2.d = p;
            lelVar2.b |= 2;
        }
        return (lel) k.q();
    }

    @Override // defpackage.elu
    public final /* synthetic */ jll b(jll jllVar, jll jllVar2) {
        int i;
        lel lelVar = (lel) jllVar;
        lel lelVar2 = (lel) jllVar2;
        if (lelVar == null || lelVar2 == null) {
            return lelVar;
        }
        if ((lelVar.b & 1) == 0 || (i = lelVar.c - lelVar2.c) == 0) {
            return null;
        }
        jkj k = lel.a.k();
        if ((lelVar.b & 2) != 0) {
            lem lemVar = lelVar.d;
            if (lemVar == null) {
                lemVar = lem.a;
            }
            if (!k.b.M()) {
                k.t();
            }
            lel lelVar3 = (lel) k.b;
            lemVar.getClass();
            lelVar3.d = lemVar;
            lelVar3.b |= 2;
        }
        if (!k.b.M()) {
            k.t();
        }
        lel lelVar4 = (lel) k.b;
        lelVar4.b |= 1;
        lelVar4.c = i;
        return (lel) k.q();
    }

    @Override // defpackage.elu
    public final /* bridge */ /* synthetic */ String c(jll jllVar) {
        lem lemVar = ((lel) jllVar).d;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        return lemVar.d;
    }
}
