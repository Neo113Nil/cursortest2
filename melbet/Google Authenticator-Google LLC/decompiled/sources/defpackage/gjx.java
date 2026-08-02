package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gjx implements jrw {
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
    private final jsb k;
    private final jsb l;
    private final jsb m;
    private final /* synthetic */ int n;

    public gjx(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, jsb jsbVar12, jsb jsbVar13, int i) {
        this.n = i;
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
        this.k = jsbVar11;
        this.l = jsbVar12;
        this.m = jsbVar13;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        if (this.n == 0) {
            Object obj = ((jrx) this.c).a;
            jsb jsbVar = this.b;
            Context b = ((jrk) this.a).b();
            fwm b2 = ((ewo) jsbVar).b();
            gzp gzpVar = (gzp) obj;
            ExecutorService executorService = (ExecutorService) this.d.b();
            hvm hvmVar = (hvm) this.e.b();
            jsb jsbVar2 = this.g;
            cka b3 = ((gro) this.f).b();
            int intValue = ((emp) jsbVar2).a().intValue();
            jpt a = jrv.a(this.l);
            jsb jsbVar3 = this.m;
            jsb jsbVar4 = this.k;
            jsb jsbVar5 = this.j;
            return new gjw(b, b2, gzpVar, executorService, hvmVar, b3, intValue, ((jrt) this.h).a, ((jrt) this.i).a, jsbVar5, jsbVar4, a, jsbVar3);
        }
        jsb jsbVar6 = this.e;
        jsb jsbVar7 = this.c;
        ldt b4 = ((emj) this.j).b();
        Context b5 = ((jrk) jsbVar7).b();
        bry bryVar = (bry) jsbVar6.b();
        jsb jsbVar8 = this.f;
        jsb jsbVar9 = this.i;
        jpt a2 = jrv.a(this.l);
        Object b6 = jsbVar9.b();
        Executor executor = (Executor) jsbVar8.b();
        Object obj2 = ((jrx) this.k).a;
        jsb jsbVar10 = this.b;
        eor eorVar = (eor) b6;
        jsb jsbVar11 = this.a;
        jsb jsbVar12 = this.m;
        return new eou(b4, b5, bryVar, a2, eorVar, this.d, jsbVar12, executor, ((epi) this.g).b(), jsbVar11, ((epb) jsbVar10).b(), (gzp) obj2);
    }

    public gjx(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, jsb jsbVar12, jsb jsbVar13, int i, byte[] bArr) {
        this.n = i;
        this.j = jsbVar;
        this.c = jsbVar2;
        this.e = jsbVar3;
        this.l = jsbVar4;
        this.i = jsbVar5;
        this.d = jsbVar6;
        this.m = jsbVar7;
        this.f = jsbVar8;
        this.g = jsbVar9;
        this.a = jsbVar10;
        this.h = jsbVar11;
        this.b = jsbVar12;
        this.k = jsbVar13;
    }
}
