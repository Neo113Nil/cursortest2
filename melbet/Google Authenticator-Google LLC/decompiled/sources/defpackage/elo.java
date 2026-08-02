package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class elo implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;
    private final jsb h;
    private final jsb i;
    private final jsb j;
    private final /* synthetic */ int k;

    public elo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, int i) {
        this.k = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
        this.h = jsbVar8;
        this.i = jsbVar9;
        this.j = jsbVar10;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = this.k;
        if (i == 0) {
            jsb jsbVar = this.c;
            jsb jsbVar2 = this.b;
            ldt b = ((emj) this.a).b();
            Context b2 = ((jrk) jsbVar2).b();
            bry bryVar = (bry) jsbVar.b();
            ekv ekvVar = (ekv) this.d.b();
            hvm hvmVar = (hvm) this.e.b();
            jsb jsbVar3 = this.j;
            jsb jsbVar4 = this.g;
            jpt a = jrv.a(this.f);
            bry b3 = ((ely) jsbVar4).b();
            Executor executor = (Executor) jsbVar3.b();
            return new eln(b, b2, bryVar, ekvVar, hvmVar, a, b3, this.h, this.i, executor);
        }
        int i2 = 1;
        if (i == 1) {
            ThreadFactory threadFactory = (ThreadFactory) this.e.b();
            hvm hvmVar2 = (hvm) this.f.b();
            int intValue = ((emp) this.b).a().intValue();
            diq b4 = ((dfw) this.i).b();
            bst b5 = ((dfy) this.j).b();
            dhm b6 = ((dhu) this.a).b();
            gzp gzpVar = (gzp) ((jrx) this.c).a;
            gzp gzpVar2 = (gzp) ((jrx) this.h).a;
            cbp cbpVar = (cbp) this.g.b();
            dhr b7 = ((dhs) this.d).b();
            dio dioVar = new dio("BG", intValue, ((Boolean) gzpVar2.d(false)).booleanValue(), b4);
            return new dgh(hnu.aB(dgn.a(gzpVar, dja.c(dioVar, b6, new dfv(b5, dja.d(dioVar.a, new dgs(threadFactory, 0)), new StrictMode.ThreadPolicy.Builder()), dja.f(cbpVar, dioVar), b7))), hvmVar2);
        }
        int i3 = 2;
        if (i != 2) {
            cfe cfeVar = (cfe) ((jrx) this.e).a;
            hvl hvlVar = (hvl) this.f.b();
            jsb jsbVar5 = this.i;
            jsb jsbVar6 = this.h;
            Object obj = ((jrx) this.g).a;
            frv b8 = ((gmu) this.b).b();
            giw giwVar = (giw) obj;
            fxl a2 = ((fxm) jsbVar6).a();
            fym fymVar = (fym) jsbVar5.b();
            Map map = (Map) ((jrx) this.j).a;
            Set set = (Set) ((jrx) this.d).a;
            jsb jsbVar7 = this.a;
            fuj b9 = ((fuk) this.c).b();
            cfe b10 = ((ghs) jsbVar7).b();
            cfeVar.getClass();
            hvlVar.getClass();
            giwVar.getClass();
            fymVar.getClass();
            map.getClass();
            set.getClass();
            return cfeVar.i(ggh.b, new dwd(a2, 17), hvlVar, map, gjb.a, new gdg((Object) giwVar, 9, (char[][]) null), new gja(fymVar, b8, i3), new avb(b9, b8, b10, 4), set);
        }
        Object obj2 = ((jrx) this.j).a;
        giw giwVar2 = (giw) ((jrx) this.g).a;
        cfe cfeVar2 = (cfe) obj2;
        Object obj3 = ((jrx) this.f).a;
        frv b11 = ((gmu) this.b).b();
        Map map2 = (Map) obj3;
        jsb jsbVar8 = this.i;
        fxl a3 = ((fxm) this.h).a();
        fym fymVar2 = (fym) jsbVar8.b();
        Set set2 = (Set) ((jrx) this.e).a;
        Executor executor2 = (Executor) this.a.b();
        jsb jsbVar9 = this.d;
        fuj b12 = ((fuk) this.c).b();
        cfe b13 = ((ghs) jsbVar9).b();
        giwVar2.getClass();
        cfeVar2.getClass();
        map2.getClass();
        fymVar2.getClass();
        set2.getClass();
        executor2.getClass();
        return cfeVar2.i(ggh.d, new dwd(a3, 16), executor2, map2, gis.a, new gdg((Object) giwVar2, 8, (char[][]) null), new gja(fymVar2, b11, i2), new avb(b12, b11, b13, 3), set2);
    }

    public elo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, int i, byte[] bArr) {
        this.k = i;
        this.e = jsbVar;
        this.f = jsbVar2;
        this.b = jsbVar3;
        this.i = jsbVar4;
        this.j = jsbVar5;
        this.a = jsbVar6;
        this.c = jsbVar7;
        this.h = jsbVar8;
        this.g = jsbVar9;
        this.d = jsbVar10;
    }

    public elo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, int i, char[] cArr) {
        this.k = i;
        this.g = jsbVar;
        this.j = jsbVar2;
        this.b = jsbVar3;
        this.f = jsbVar4;
        this.h = jsbVar5;
        this.i = jsbVar6;
        this.e = jsbVar7;
        this.a = jsbVar8;
        this.c = jsbVar9;
        this.d = jsbVar10;
    }

    public elo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, int i, short[] sArr) {
        this.k = i;
        this.e = jsbVar;
        this.f = jsbVar2;
        this.b = jsbVar3;
        this.g = jsbVar4;
        this.h = jsbVar5;
        this.i = jsbVar6;
        this.j = jsbVar7;
        this.d = jsbVar8;
        this.c = jsbVar9;
        this.a = jsbVar10;
    }
}
