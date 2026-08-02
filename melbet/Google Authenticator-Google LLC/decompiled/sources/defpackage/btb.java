package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import j$.util.Optional;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btb implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final /* synthetic */ int g;

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i) {
        this.g = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.g) {
            case 0:
                jsb jsbVar = this.b;
                Context b = ((jrk) this.a).b();
                ftf ftfVar = (ftf) jsbVar.b();
                jsb jsbVar2 = this.e;
                return new bss(b, ftfVar, ((btd) this.c).b(), ((fuk) this.d).b(), (hvl) jsbVar2.b(), (hvl) this.f.b());
            case 1:
                jsb jsbVar3 = this.e;
                ikm b2 = ((fxi) this.d).b();
                bpx bpxVar = (bpx) jsbVar3.b();
                cbe cbeVar = (cbe) this.a.b();
                return new bpr(b2, bpxVar, cbeVar, (hvl) this.f.b(), (hvl) this.b.b());
            case 2:
                Object obj = ((jrx) this.a).a;
                jsb jsbVar4 = this.d;
                jsb jsbVar5 = this.c;
                return new fym(((dwu) this.e).b(), ((dwq) jsbVar5).b(), ((eic) jsbVar4).b(), (Optional) obj, ((jrk) this.b).b(), ((dwm) this.f).b());
            case 3:
                jsb jsbVar6 = this.b;
                jsb jsbVar7 = this.e;
                jsb jsbVar8 = this.a;
                Object obj2 = ((jrx) this.f).a;
                return new fym(jrv.a(this.d), jrv.a(this.c), (gzp) obj2, jrv.a(jsbVar8), jrv.a(jsbVar7), ((jrk) jsbVar6).b());
            case 4:
                Context b3 = ((jrk) this.b).b();
                gzp a = ((bnu) this.c).a();
                gzp a2 = ((bnu) this.d).a();
                gzp a3 = ((bnu) this.a).a();
                gzp gzpVar = (gzp) ((jrx) this.f).a;
                egd egdVar = new egd();
                egdVar.b(b3);
                egdVar.b = (ExecutorService) ((gzs) a2).a;
                egdVar.c = (ScheduledExecutorService) ((gzs) a3).a;
                egdVar.d = (Handler) ((gzs) a).a;
                egdVar.g = (jdd) gzpVar.e();
                return egdVar.a();
            case 5:
                jsb jsbVar9 = this.e;
                jsb jsbVar10 = this.b;
                return new fym((fym) jsbVar9.b(), (hvm) jsbVar10.b(), (Random) this.a.b(), this.d, this.c, this.f);
            case 6:
                ekv ekvVar = (ekv) this.f.b();
                hvm hvmVar = (hvm) this.c.b();
                Executor executor = (Executor) this.b.b();
                jsb jsbVar11 = this.a;
                jpt a4 = jrv.a(this.d);
                jrv.a(jsbVar11);
                return new epp(ekvVar, hvmVar, executor, a4);
            case 7:
                ekv ekvVar2 = (ekv) this.f.b();
                jsb jsbVar12 = this.a;
                jsb jsbVar13 = this.d;
                jsb jsbVar14 = this.c;
                return new eqo(ekvVar2, this.e, this.b, jsbVar14, jsbVar13, jrv.a(jsbVar12));
            case 8:
                jsb jsbVar15 = this.c;
                ldt b4 = ((emj) this.f).b();
                hvm hvmVar2 = (hvm) jsbVar15.b();
                jsb jsbVar16 = this.e;
                jsb jsbVar17 = this.b;
                return new erf(b4, hvmVar2, jrv.a(jsbVar16), this.a, this.d, jsbVar17);
            case 9:
                jsb jsbVar18 = this.a;
                jsb jsbVar19 = this.b;
                jsb jsbVar20 = this.e;
                return new ldt(this.d, this.f, jsbVar20, jsbVar19, jsbVar18);
            case 10:
                Object obj3 = ((jrx) this.f).a;
                jsb jsbVar21 = this.a;
                jsb jsbVar22 = this.e;
                jsb jsbVar23 = this.d;
                final Context b5 = ((jrk) this.c).b();
                final Set b6 = ((jsd) jsbVar23).b();
                final gzp a5 = ((bnu) jsbVar22).a();
                final fwm b7 = ((ewo) jsbVar21).b();
                final gzp gzpVar2 = (gzp) obj3;
                final jsb jsbVar24 = this.b;
                return new eww() { // from class: ews
                    @Override // defpackage.eww
                    public final void a() {
                        Set set = b6;
                        fwm fwmVar = b7;
                        gzp gzpVar3 = gzpVar2;
                        if (!set.isEmpty() || fwmVar.l() || ((Boolean) gzpVar3.d(false)).booleanValue()) {
                            koe koeVar = jsbVar24;
                            gzp gzpVar4 = a5;
                            Application application = (Application) b5;
                            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((gzf) ((gzs) gzpVar4).a).a(new ewt(application, gzpVar4, set, fwmVar, gzpVar3, koeVar)));
                        }
                    }
                };
            case 11:
                jsb jsbVar25 = this.d;
                bd bdVar = (bd) ((jrx) this.b).a;
                frz frzVar = (frz) jsbVar25.b();
                jsb jsbVar26 = this.c;
                return new fyx(bdVar, frzVar, ((bnu) this.f).a(), ((fzw) this.a).b(), (gbi) jsbVar26.b(), (gva) this.e.b());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new gac(((jrk) this.b).b(), (Map) ((jrx) this.c).a, (gzp) ((jrx) this.a).a, (hvl) this.d.b(), (gzp) ((jrx) this.f).a, (gpj) this.e.b());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                jsb jsbVar27 = this.a;
                Optional b8 = ((bnv) this.e).b();
                kee keeVar = (kee) jsbVar27.b();
                jsb jsbVar28 = this.f;
                return new fym(b8, keeVar, this.d, ((jrz) this.c).b(), (Map) jsbVar28.b(), (Optional) ((jrx) this.b).a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jsb jsbVar29 = this.e;
                jsb jsbVar30 = this.c;
                Context b9 = ((jrk) this.b).b();
                jpt a6 = jrv.a(jsbVar30);
                etd etdVar = (etd) jsbVar29.b();
                jsb jsbVar31 = this.f;
                return new giz(b9, a6, etdVar, ((fuk) this.d).b(), ((ghs) this.a).b(), ((jrz) jsbVar31).b());
            default:
                jsb jsbVar32 = this.a;
                Context b10 = ((jrk) this.b).b();
                hvm hvmVar3 = (hvm) jsbVar32.b();
                jsb jsbVar33 = this.d;
                jsb jsbVar34 = this.f;
                return new fym(b10, hvmVar3, ((ggd) this.c).b(), this.e, ((fvp) jsbVar34).b(), ((fuk) jsbVar33).b());
        }
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, byte[] bArr) {
        this.g = i;
        this.d = jsbVar;
        this.e = jsbVar2;
        this.a = jsbVar3;
        this.c = jsbVar4;
        this.f = jsbVar5;
        this.b = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, char[] cArr) {
        this.g = i;
        this.e = jsbVar;
        this.c = jsbVar2;
        this.d = jsbVar3;
        this.a = jsbVar4;
        this.b = jsbVar5;
        this.f = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, float[] fArr) {
        this.g = i;
        this.f = jsbVar;
        this.c = jsbVar2;
        this.b = jsbVar3;
        this.d = jsbVar4;
        this.a = jsbVar5;
        this.e = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, int[] iArr) {
        this.g = i;
        this.b = jsbVar;
        this.c = jsbVar2;
        this.d = jsbVar3;
        this.a = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, short[] sArr) {
        this.g = i;
        this.d = jsbVar;
        this.c = jsbVar2;
        this.f = jsbVar3;
        this.a = jsbVar4;
        this.e = jsbVar5;
        this.b = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, boolean[] zArr) {
        this.g = i;
        this.e = jsbVar;
        this.b = jsbVar2;
        this.a = jsbVar3;
        this.d = jsbVar4;
        this.c = jsbVar5;
        this.f = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, byte[][] bArr) {
        this.g = i;
        this.f = jsbVar;
        this.e = jsbVar2;
        this.b = jsbVar3;
        this.c = jsbVar4;
        this.d = jsbVar5;
        this.a = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, char[][] cArr) {
        this.g = i;
        this.f = jsbVar;
        this.c = jsbVar2;
        this.e = jsbVar3;
        this.a = jsbVar4;
        this.d = jsbVar5;
        this.b = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, float[][] fArr) {
        this.g = i;
        this.b = jsbVar;
        this.c = jsbVar2;
        this.a = jsbVar3;
        this.d = jsbVar4;
        this.f = jsbVar5;
        this.e = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, int[][] iArr) {
        this.g = i;
        this.c = jsbVar;
        this.b = jsbVar2;
        this.d = jsbVar3;
        this.e = jsbVar4;
        this.a = jsbVar5;
        this.f = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, short[][] sArr) {
        this.g = i;
        this.d = jsbVar;
        this.f = jsbVar2;
        this.e = jsbVar3;
        this.c = jsbVar4;
        this.b = jsbVar5;
        this.a = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.b = jsbVar;
        this.d = jsbVar2;
        this.f = jsbVar3;
        this.a = jsbVar4;
        this.c = jsbVar5;
        this.e = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.e = jsbVar;
        this.a = jsbVar2;
        this.d = jsbVar3;
        this.c = jsbVar4;
        this.f = jsbVar5;
        this.b = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, char[][][] cArr) {
        this.g = i;
        this.b = jsbVar;
        this.c = jsbVar2;
        this.e = jsbVar3;
        this.d = jsbVar4;
        this.a = jsbVar5;
        this.f = jsbVar6;
    }

    public btb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, int i, short[][][] sArr) {
        this.g = i;
        this.b = jsbVar;
        this.a = jsbVar2;
        this.c = jsbVar3;
        this.e = jsbVar4;
        this.f = jsbVar5;
        this.d = jsbVar6;
    }
}
