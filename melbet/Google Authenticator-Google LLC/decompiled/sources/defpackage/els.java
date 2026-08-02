package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class els extends elu {
    public static final els a = new els();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    @Override // defpackage.elu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ jll a(String str, Object obj) {
        Map map;
        len lenVar;
        boolean hasMeasurements;
        HealthStats m3m = a$$ExternalSyntheticApiModelOutline0.m3m(obj);
        jkj k = len.a.k();
        k.H(elv.a.e(eos.o(m3m, 40001)));
        elr elrVar = elr.a;
        if (m3m != null) {
            hasMeasurements = m3m.hasMeasurements(40002);
            if (hasMeasurements) {
                map = m3m.getMeasurements(40002);
                k.I(elrVar.e(map));
                if (str != null) {
                    lem p = eos.p(str);
                    if (!k.b.M()) {
                        k.t();
                    }
                    len lenVar2 = (len) k.b;
                    p.getClass();
                    lenVar2.e = p;
                    lenVar2.b |= 1;
                }
                lenVar = (len) k.q();
                if (eos.t(lenVar)) {
                    return lenVar;
                }
                return null;
            }
        }
        map = Collections.EMPTY_MAP;
        k.I(elrVar.e(map));
        if (str != null) {
        }
        lenVar = (len) k.q();
        if (eos.t(lenVar)) {
        }
    }

    @Override // defpackage.elu
    public final /* synthetic */ jll b(jll jllVar, jll jllVar2) {
        len lenVar = (len) jllVar;
        len lenVar2 = (len) jllVar2;
        if (lenVar == null || lenVar2 == null) {
            return lenVar;
        }
        jkj k = len.a.k();
        k.H(elv.a.f(lenVar.c, lenVar2.c));
        k.I(elr.a.f(lenVar.d, lenVar2.d));
        lem lemVar = lenVar.e;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        if (!k.b.M()) {
            k.t();
        }
        len lenVar3 = (len) k.b;
        lemVar.getClass();
        lenVar3.e = lemVar;
        lenVar3.b |= 1;
        len lenVar4 = (len) k.q();
        if (eos.t(lenVar4)) {
            return null;
        }
        return lenVar4;
    }

    @Override // defpackage.elu
    public final /* bridge */ /* synthetic */ String c(jll jllVar) {
        lem lemVar = ((len) jllVar).e;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        return lemVar.d;
    }
}
