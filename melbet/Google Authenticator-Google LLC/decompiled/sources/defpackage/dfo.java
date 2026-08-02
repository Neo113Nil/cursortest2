package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfo implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final /* synthetic */ int d;

    public dfo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i) {
        this.d = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.d) {
            case 0:
                return new dgi(((dgm) this.c).b().d(((dfp) this.a).a()), this.b);
            case 1:
                return new ceu(((cfl) this.c).b(), ((cfy) this.a).b(), ((cga) this.b).b());
            case 2:
                return new dgi(((dgm) this.c).b().d(((dfp) this.a).a()), this.b);
            case 3:
                return new dgi(((dgm) this.c).b().d(((dfp) this.a).a()), this.b);
            case 4:
                return new dmf(this.a, this.c, this.b);
            case 5:
                return new fwm(((dug) this.c).b(), (gzp) ((jrx) this.a).a, (gzp) ((jrx) this.b).a);
            case 6:
                egc egcVar = (egc) this.a.b();
                ((jrk) this.c).b();
                return new dwb(egcVar, (ExecutorService) this.b.b());
            case 7:
                jsb jsbVar = this.c;
                Context b = ((jrk) this.a).b();
                ExecutorService executorService = (ExecutorService) jsbVar.b();
                dvy b2 = ((dvz) this.b).b();
                executorService.getClass();
                return new dpl(b, executorService, new dwo(), b2);
            case 8:
                return new dxd(((dxl) this.b).b(), ((dxm) this.c).b(), (ExecutorService) this.a.b());
            case 9:
                return new dyk(((dyi) this.c).b(), ((dyj) this.a).b(), new dyt(), (ExecutorService) this.b.b());
            case 10:
                return new eij((hvm) this.c.b(), (bry) this.a.b(), this.b);
            case 11:
                Object obj = ((jrx) this.b).a;
                final ekx b3 = ((eky) this.c).b();
                final gzp gzpVar = (gzp) obj;
                final jsb jsbVar2 = this.a;
                return new eww() { // from class: emn
                    @Override // defpackage.eww
                    public final void a() {
                        if (((Boolean) gzp.this.d(false)).booleanValue() && eos.H()) {
                            Iterator it = ((jsd) jsbVar2).b().iterator();
                            while (it.hasNext()) {
                                ((emk) it.next()).k();
                            }
                            b3.a();
                        }
                    }
                };
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new eor(jrv.a(this.c), (gzp) ((jrx) this.a).a, (Executor) this.b.b());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new eos();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new gka(((jrk) this.b).b(), ((bnu) this.c).a(), ((esl) this.a).b(), new ClearcutMetricSnapshotTransmitter());
            case 15:
                Object obj2 = ((jrx) this.c).a;
                final fwm b4 = ((ewo) this.b).b();
                final Map map = (Map) obj2;
                final Map map2 = ((jrt) this.a).a;
                return new ewq() { // from class: ewx
                    @Override // defpackage.ewq
                    public final void a() {
                        gty aC = hoq.aC(60, "Startup Listeners");
                        try {
                            boolean l = fwm.this.l();
                            Map map3 = map2;
                            if (l) {
                                double random = Math.random();
                                Map map4 = map;
                                if (random < 0.5d) {
                                    eos.G(map3);
                                    eos.G(map4);
                                } else {
                                    eos.G(map4);
                                    eos.G(map3);
                                }
                            } else {
                                eos.G(map3);
                            }
                            aC.close();
                        } catch (Throwable th) {
                            try {
                                aC.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                };
            case 16:
                return new ftf(((fsu) this.b).b(), ((bnu) this.c).a(), (hvl) this.a.b());
            case 17:
                Executor executor = ((Boolean) ((gzp) ((jrx) this.a).a).d(false)).booleanValue() ? (Executor) this.c.b() : (Executor) this.b.b();
                executor.getClass();
                return executor;
            case 18:
                jsb jsbVar3 = this.a;
                return ((gpn) this.c).b().b(((fwx) this.b).b(), (iyi) jsbVar3.b());
            case 19:
                jsb jsbVar4 = this.a;
                return ((gpn) this.c).b().b(((fxc) this.b).b(), (iyi) jsbVar4.b());
            default:
                return new fxt(((jrk) this.c).b(), (hvl) this.b.b(), (hvl) this.a.b());
        }
    }

    public dfo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = jsbVar;
        this.a = jsbVar2;
        this.b = jsbVar3;
    }

    public dfo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, char[] cArr, byte[] bArr) {
        this.d = i;
        this.c = jsbVar;
        this.b = jsbVar2;
        this.a = jsbVar3;
    }

    public dfo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, float[] fArr) {
        this.d = i;
        this.a = jsbVar;
        this.c = jsbVar2;
        this.b = jsbVar3;
    }

    public dfo(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, char[][] cArr) {
        this.d = i;
        this.b = jsbVar;
        this.c = jsbVar2;
        this.a = jsbVar3;
    }
}
