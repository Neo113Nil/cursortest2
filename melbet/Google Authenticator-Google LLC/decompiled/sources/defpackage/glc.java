package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.AbstractMap;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glc implements jrw {
    private final jsb a;
    private final jsb b;
    private final /* synthetic */ int c;

    public glc(jsb jsbVar, jsb jsbVar2, int i) {
        this.c = i;
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = 2;
        switch (this.c) {
            case 0:
                return new iwq((glu) this.a.b(), (cka) ((jrx) this.b).a);
            case 1:
                ((jrk) this.b).b();
                iyi b = ((fdb) this.a).b();
                iwq iwqVar = gjw.m;
                String I = eos.I();
                I.getClass();
                return b.B("StartupAfterPackageReplacedImplDatabase_".concat(new kud("[^A-Za-z0-9\\-_:]").a(I, "_")), gjw.m);
            case 2:
                gzp gzpVar = (gzp) this.b.b();
                glu gluVar = (glu) ((jrx) this.a).a;
                if (gzpVar.f()) {
                    return new glu((bg) gzpVar.b());
                }
                gluVar.getClass();
                return gluVar;
            case 3:
                return new esy(((jrh) this.b).a(), (Set) ((jrx) this.a).a);
            case 4:
                ((ctx) this.b).b();
                return new hnu(null);
            case 5:
                jsb jsbVar = this.a;
                gzp gzpVar2 = (gzp) ((jrx) this.b).a;
                hvm hvmVar = (hvm) jsbVar.b();
                epj a = eiv.a();
                a.c(((Boolean) gzpVar2.d(true)).booleanValue());
                a.e = new dgh(new dgt(new hvv(hvmVar), hvmVar), hvmVar);
                return a.b();
            case 6:
                jsb jsbVar2 = this.a;
                Context b2 = ((jrk) this.b).b();
                final long longValue = ((gnn) jsbVar2).a().longValue();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                final Application application = (Application) b2;
                final goe goeVar = new goe(atomicBoolean, application);
                return new eww() { // from class: god
                    @Override // defpackage.eww
                    public final void a() {
                        Application application2 = application;
                        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = goeVar;
                        application2.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                        fao.e(new gof(atomicBoolean, application2, activityLifecycleCallbacks, longValue, 0));
                    }
                };
            case 7:
                jsb jsbVar3 = this.a;
                Application b3 = ((jrj) this.b).b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) jsbVar3.b();
                cji cjiVar = new cji(b3, "STREAMZ_TIKTOK", null);
                cjiVar.e();
                return new ldt(scheduledExecutorService, new iyi(cjiVar, "STREAMZ_TIKTOK"), b3);
            case 8:
                jsb jsbVar4 = this.a;
                Application b4 = ((jrj) this.b).b();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) jsbVar4.b();
                cji cjiVar2 = new cji(b4, "STREAMZ_TIKTOK", null);
                cjiVar2.e();
                return new iee(scheduledExecutorService2, new iyi(cjiVar2, "STREAMZ_TIKTOK"), b4);
            case 9:
                jsb jsbVar5 = this.a;
                Application b5 = ((jrj) this.b).b();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) jsbVar5.b();
                cji cjiVar3 = new cji(b5, "STREAMZ_TIKTOK", null);
                cjiVar3.e();
                return new goh(scheduledExecutorService3, new iyi(cjiVar3, "STREAMZ_TIKTOK"), b5);
            case 10:
                jsb jsbVar6 = this.a;
                Application b6 = ((jrj) this.b).b();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) jsbVar6.b();
                cji cjiVar4 = new cji(b6, "STREAMZ_TIKTOK", null);
                cjiVar4.e();
                return new iwq(scheduledExecutorService4, new iyi(cjiVar4, "STREAMZ_TIKTOK"), b6);
            case 11:
                return new AbstractMap.SimpleImmutableEntry(ifp.a, new gnk((cka) this.a.b(), ((gmu) this.b).b(), i));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Boolean.valueOf(((ewo) this.a).b().l() || ((Boolean) ((gzp) ((jrx) this.b).a).d(false)).booleanValue());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new gpy(((jrk) this.a).b(), ((gcz) this.b).b(), 0);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new gpy(((jrk) this.a).b(), ((gcz) this.b).b(), 2, null);
            case 15:
                Object hjnVar = !((Boolean) this.b.b()).booleanValue() ? hjb.a : new hjn(new fvd(this.a, 3));
                hjnVar.getClass();
                return hjnVar;
            case 16:
                Object hjnVar2 = !((Boolean) this.b.b()).booleanValue() ? hjb.a : new hjn(new ggr(this.a, i));
                hjnVar2.getClass();
                return hjnVar2;
            case 17:
                return new gqy(this.a, ((Boolean) this.b.b()).booleanValue());
            case 18:
                iyi b7 = ((gcu) this.b).b();
                jsb jsbVar7 = this.a;
                jsbVar7.getClass();
                return new gcl(new eqn(jsbVar7, 9), b7);
            case 19:
                iyi b8 = ((gcu) this.b).b();
                jsb jsbVar8 = this.a;
                jsbVar8.getClass();
                return new gcl(new eqn(jsbVar8, 10), b8);
            default:
                Object hjnVar3 = ((Boolean) ((bnu) this.b).a().d(false)).booleanValue() ? new hjn(((gry) this.a).b()) : hjb.a;
                hjnVar3.getClass();
                return hjnVar3;
        }
    }

    public glc(jsb jsbVar, jsb jsbVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = jsbVar;
        this.a = jsbVar2;
    }
}
