package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emm implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;
    private final jsb h;
    private final jsb i;
    private final /* synthetic */ int j;

    public emm(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, int i) {
        this.j = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
        this.h = jsbVar8;
        this.i = jsbVar9;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = this.j;
        if (i == 0) {
            jsb jsbVar = this.b;
            Context b = ((jrk) this.a).b();
            gzp gzpVar = (gzp) jsbVar.b();
            Object obj = ((jrx) this.h).a;
            jsb jsbVar2 = this.g;
            jsb jsbVar3 = this.f;
            jsb jsbVar4 = this.e;
            jsb jsbVar5 = this.i;
            return new eml(b, gzpVar, ((emq) this.c).b(), this.d, ((emb) jsbVar4).b(), ((bnu) jsbVar3).a(), ((bnu) jsbVar2).a(), (gzp) obj, jsbVar5);
        }
        if (i != 1) {
            jsb jsbVar6 = this.h;
            jsb jsbVar7 = this.a;
            ldt b2 = ((emj) this.f).b();
            Context b3 = ((jrk) jsbVar7).b();
            ekv ekvVar = (ekv) jsbVar6.b();
            hvm hvmVar = (hvm) this.e.b();
            jsb jsbVar8 = this.b;
            jsb jsbVar9 = this.d;
            return new eqd(b2, b3, ekvVar, hvmVar, jrv.a(this.g), jrv.a(jsbVar9), this.c, (Executor) jsbVar8.b(), (fwm) this.i.b());
        }
        jsb jsbVar10 = this.i;
        fwm b4 = ((dyy) this.c).b();
        cbp b5 = ((dyv) jsbVar10).b();
        ((eal) this.b).b();
        jsb jsbVar11 = this.h;
        jsb jsbVar12 = this.e;
        jsb jsbVar13 = this.d;
        return new dya(b4, b5, ((dxq) this.g).b(), ((dwt) jsbVar13).b(), ((dys) this.f).b(), ((dws) jsbVar12).b(), this.a, ((dwm) jsbVar11).b());
    }

    public emm(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, int i, byte[] bArr) {
        this.j = i;
        this.c = jsbVar;
        this.i = jsbVar2;
        this.b = jsbVar3;
        this.g = jsbVar4;
        this.d = jsbVar5;
        this.f = jsbVar6;
        this.e = jsbVar7;
        this.a = jsbVar8;
        this.h = jsbVar9;
    }

    public emm(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, int i, char[] cArr) {
        this.j = i;
        this.f = jsbVar;
        this.a = jsbVar2;
        this.h = jsbVar3;
        this.e = jsbVar4;
        this.g = jsbVar5;
        this.d = jsbVar6;
        this.c = jsbVar7;
        this.b = jsbVar8;
        this.i = jsbVar9;
    }
}
