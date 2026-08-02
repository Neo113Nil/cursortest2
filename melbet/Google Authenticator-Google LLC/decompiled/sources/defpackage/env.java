package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class env {
    public final Context a;
    final koe b;
    final koe c;
    final koe d;
    public final koe e;
    public final koe f;
    public final koe g;
    public final koe h;
    public final koe i;
    public final koe j;
    public final koe k;
    public final koe l;
    public final koe m;
    public final koe n;
    public final eqm o;

    public env(Context context, eqm eqmVar, koe koeVar, koe koeVar2, koe koeVar3, koe koeVar4, koe koeVar5, koe koeVar6, koe koeVar7, koe koeVar8, koe koeVar9, koe koeVar10, koe koeVar11, koe koeVar12, koe koeVar13) {
        this.a = context;
        this.o = eqmVar;
        this.b = koeVar;
        this.c = koeVar2;
        this.d = koeVar3;
        this.e = koeVar4;
        this.h = koeVar7;
        this.i = koeVar8;
        this.j = koeVar9;
        this.f = koeVar5;
        this.g = koeVar6;
        this.k = koeVar10;
        this.l = koeVar11;
        this.m = koeVar12;
        this.n = koeVar13;
    }

    public static hel a(jog jogVar, Map map, long j) {
        int i = hel.d;
        heg hegVar = new heg(4);
        long j2 = 0;
        for (joe joeVar : jogVar.c) {
            if (j >= 0) {
                long j3 = 1 + j2;
                if (j2 >= j) {
                    break;
                }
                j2 = j3;
            }
            jkj k = jns.a.k();
            long j4 = joeVar.b;
            if (!k.b.M()) {
                k.t();
            }
            jns jnsVar = (jns) k.b;
            jnsVar.b |= 1;
            jnsVar.c = j4;
            if (!joeVar.c.isEmpty()) {
                String str = joeVar.c;
                if (!k.b.M()) {
                    k.t();
                }
                jns jnsVar2 = (jns) k.b;
                str.getClass();
                jnsVar2.b |= 2;
                jnsVar2.d = str;
            }
            bsh bshVar = (bsh) map.get(joeVar.e);
            if (bshVar != null) {
                if (!k.b.M()) {
                    k.t();
                }
                jns jnsVar3 = (jns) k.b;
                jnsVar3.b |= 4;
                jnsVar3.e = bshVar.a;
            }
            hegVar.h((jns) k.q());
        }
        return hegVar.g();
    }
}
