package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dls implements jrw {
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
    private final /* synthetic */ int l;

    public dls(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, int i) {
        this.l = i;
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
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = this.l;
        if (i == 0) {
            dkj dkjVar = (dkj) this.a.b();
            jsb jsbVar = this.c;
            gzp a = ((bnu) this.b).a();
            ((dkn) jsbVar).b();
            gzp gzpVar = (gzp) ((jrx) this.e).a;
            gzp gzpVar2 = (gzp) ((jrx) this.f).a;
            gzp gzpVar3 = (gzp) ((jrx) this.g).a;
            gzp gzpVar4 = (gzp) ((jrx) this.h).a;
            gzp gzpVar5 = (gzp) ((jrx) this.i).a;
            gzp gzpVar6 = (gzp) ((jrx) this.j).a;
            gzp gzpVar7 = (gzp) ((jrx) this.k).a;
            dlk dlkVar = new dlk(dkjVar, (dlg) a.d(new dlq()));
            if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
                dlkVar.f = ((Integer) gzpVar.d(500)).intValue();
            }
            if (gzpVar4.f()) {
                dlkVar.h = ((Integer) gzpVar4.b()).intValue();
            }
            if (gzpVar2.f()) {
                dlkVar.c.f = ((Boolean) gzpVar2.b()).booleanValue();
            }
            if (gzpVar3.f()) {
                dlkVar.c.g = (Set) gzpVar3.b();
            }
            if (gzpVar5.f()) {
                dlkVar.c.h = ((Boolean) gzpVar5.b()).booleanValue();
            }
            if (gzpVar6.f()) {
                dlkVar.d = ((Boolean) gzpVar6.b()).booleanValue();
            }
            if (gzpVar7.f()) {
                dlkVar.e = ((Boolean) gzpVar7.b()).booleanValue();
            }
            return dlkVar;
        }
        if (i == 1) {
            jsb jsbVar2 = this.a;
            Context b = ((jrk) this.j).b();
            bpx bpxVar = (bpx) this.g.b();
            jsb jsbVar3 = this.d;
            jsb jsbVar4 = this.h;
            jsb jsbVar5 = this.i;
            jsb jsbVar6 = this.k;
            return new cbe(b, bpxVar, ((fdb) this.e).b(), ((cao) this.f).b(), ((fuk) jsbVar6).b(), ((gdu) jsbVar5).b(), ((cbb) jsbVar4).b(), (bov) jsbVar3.b(), (hvl) this.c.b());
        }
        if (i == 2) {
            jsb jsbVar7 = this.j;
            jsb jsbVar8 = this.a;
            ldt b2 = ((emj) this.f).b();
            Context b3 = ((jrk) jsbVar8).b();
            Executor executor = (Executor) jsbVar7.b();
            jsb jsbVar9 = this.h;
            jsb jsbVar10 = this.d;
            env b4 = ((enw) this.c).b();
            jpt a2 = jrv.a(jsbVar10);
            ejl ejlVar = (ejl) jsbVar9.b();
            fym fymVar = (fym) this.g.b();
            jsb jsbVar11 = this.i;
            jsb jsbVar12 = this.e;
            return new eny(b2, b3, executor, b4, this.b, a2, ejlVar, fymVar, this.k, jsbVar12, jsbVar11);
        }
        if (i != 3) {
            jsb jsbVar13 = this.c;
            jsb jsbVar14 = this.f;
            Context b5 = ((jrk) this.d).b();
            PowerManager b6 = ((gdb) jsbVar14).b();
            hvl hvlVar = (hvl) this.b.b();
            ((gaq) this.a).b();
            hvm hvmVar = (hvm) this.k.b();
            hvm hvmVar2 = (hvm) this.e.b();
            fwm b7 = ((ewo) this.h).b();
            return new gaj(b5, b6, hvlVar, ((jrt) this.g).a, ((jrt) this.i).a, hvmVar, hvmVar2, b7);
        }
        jsb jsbVar15 = this.e;
        ldt b8 = ((emj) this.f).b();
        ((jrk) this.c).b();
        jsb jsbVar16 = this.i;
        Object b9 = this.h.b();
        hvm hvmVar3 = (hvm) jsbVar16.b();
        jsb jsbVar17 = this.b;
        jsb jsbVar18 = this.k;
        jpt a3 = jrv.a(this.d);
        Object b10 = jsbVar18.b();
        return new ept(b8, (epp) b9, hvmVar3, a3, (epx) b10, (eiw) jsbVar17.b(), this.g, (Executor) this.a.b(), (gzp) ((jrx) this.j).a);
    }

    public dls(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, int i, byte[] bArr) {
        this.l = i;
        this.j = jsbVar;
        this.a = jsbVar2;
        this.g = jsbVar3;
        this.b = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.k = jsbVar7;
        this.i = jsbVar8;
        this.h = jsbVar9;
        this.d = jsbVar10;
        this.c = jsbVar11;
    }

    public dls(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, int i, char[] cArr) {
        this.l = i;
        this.f = jsbVar;
        this.a = jsbVar2;
        this.j = jsbVar3;
        this.c = jsbVar4;
        this.b = jsbVar5;
        this.d = jsbVar6;
        this.h = jsbVar7;
        this.g = jsbVar8;
        this.k = jsbVar9;
        this.e = jsbVar10;
        this.i = jsbVar11;
    }

    public dls(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, int i, int[] iArr) {
        this.l = i;
        this.d = jsbVar;
        this.f = jsbVar2;
        this.c = jsbVar3;
        this.b = jsbVar4;
        this.g = jsbVar5;
        this.i = jsbVar6;
        this.j = jsbVar7;
        this.a = jsbVar8;
        this.k = jsbVar9;
        this.e = jsbVar10;
        this.h = jsbVar11;
    }

    public dls(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, int i, short[] sArr) {
        this.l = i;
        this.f = jsbVar;
        this.e = jsbVar2;
        this.c = jsbVar3;
        this.h = jsbVar4;
        this.i = jsbVar5;
        this.d = jsbVar6;
        this.k = jsbVar7;
        this.b = jsbVar8;
        this.g = jsbVar9;
        this.a = jsbVar10;
        this.j = jsbVar11;
    }
}
