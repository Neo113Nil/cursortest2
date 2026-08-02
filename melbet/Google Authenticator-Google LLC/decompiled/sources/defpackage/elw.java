package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class elw extends elu {
    public static final elw a = new elw();

    @Override // defpackage.elu
    public final /* synthetic */ jll a(String str, Object obj) {
        return eos.s(str, a$$ExternalSyntheticApiModelOutline0.m6m(obj));
    }

    @Override // defpackage.elu
    public final /* synthetic */ jll b(jll jllVar, jll jllVar2) {
        return eos.r((ler) jllVar, (ler) jllVar2);
    }

    @Override // defpackage.elu
    public final /* bridge */ /* synthetic */ String c(jll jllVar) {
        ler lerVar = (ler) jllVar;
        lem lemVar = lerVar.e;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        if ((lemVar.b & 2) != 0) {
            lem lemVar2 = lerVar.e;
            if (lemVar2 == null) {
                lemVar2 = lem.a;
            }
            return lemVar2.d;
        }
        lem lemVar3 = lerVar.e;
        if (lemVar3 == null) {
            lemVar3 = lem.a;
        }
        return Long.toHexString(lemVar3.c);
    }
}
