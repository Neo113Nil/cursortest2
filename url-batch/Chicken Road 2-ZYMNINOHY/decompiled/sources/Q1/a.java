package Q1;

import L1.h;
import L1.i;
import L1.j;
import M1.f;
import T.N;
import T.Q;
import a0.C0130F;
import a0.V;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.B0;
import androidx.fragment.app.C0201e;
import androidx.fragment.app.C0209m;
import androidx.fragment.app.p0;
import androidx.fragment.app.u0;
import c0.z;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.j1;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.zc;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.idsync.impl.D;
import io.appmetrica.analytics.idsync.impl.n;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0497b0;
import io.appmetrica.analytics.impl.C0963t1;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import m0.C1285G;
import m0.C1292e;
import m0.InterfaceC1291d;
import m0.p;
import m0.r;
import q0.C1353B;
import v2.F;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2259d;

    public /* synthetic */ a(c cVar, j jVar, D0.d dVar, i iVar) {
        this.f2256a = 0;
        this.f2257b = cVar;
        this.f2258c = jVar;
        this.f2259d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = 0;
        switch (this.f2256a) {
            case 0:
                c cVar = (c) this.f2257b;
                j jVar = (j) this.f2258c;
                String str = jVar.f1645a;
                i iVar = (i) this.f2259d;
                cVar.getClass();
                Logger logger = c.f2264f;
                try {
                    f a3 = cVar.f2267c.a(str);
                    if (a3 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((S1.j) cVar.f2269e).n(new b(cVar, jVar, ((J1.c) a3).a(iVar), i4));
                    }
                    return;
                } catch (Exception e4) {
                    logger.warning("Error scheduling event " + e4.getMessage());
                    return;
                }
            case 1:
                n.a((D) this.f2257b, (n) this.f2258c, (RequestConfig) this.f2259d);
                return;
            case 2:
                V v = (V) this.f2257b;
                F f4 = (F) this.f2258c;
                C1353B c1353b = (C1353B) this.f2259d;
                b0.d dVar = v.f4014c;
                a0 f5 = f4.f();
                h hVar = dVar.f5272d;
                N n = dVar.f5275g;
                n.getClass();
                hVar.getClass();
                hVar.f1634b = I.k(f5);
                if (!f5.isEmpty()) {
                    hVar.f1637e = (C1353B) f5.get(0);
                    c1353b.getClass();
                    hVar.f1638f = c1353b;
                }
                if (((C1353B) hVar.f1636d) == null) {
                    hVar.f1636d = h.f(n, (I) hVar.f1634b, (C1353B) hVar.f1637e, (Q) hVar.f1633a);
                }
                hVar.j(((C0130F) n).q());
                return;
            case 3:
                ViewGroup container = (ViewGroup) this.f2257b;
                View view = (View) this.f2258c;
                C0201e this$0 = (C0201e) this.f2259d;
                kotlin.jvm.internal.i.e(container, "$container");
                kotlin.jvm.internal.i.e(this$0, "this$0");
                container.endViewTransition(view);
                this$0.f4828c.f4893a.c(this$0);
                return;
            case 4:
                B0 b02 = (B0) this.f2257b;
                B0 b03 = (B0) this.f2258c;
                C0209m c0209m = (C0209m) this.f2259d;
                androidx.fragment.app.F inFragment = b02.f4725c;
                androidx.fragment.app.F outFragment = b03.f4725c;
                boolean z = c0209m.o;
                u0 u0Var = p0.f4951a;
                kotlin.jvm.internal.i.e(inFragment, "inFragment");
                kotlin.jvm.internal.i.e(outFragment, "outFragment");
                if (z) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 5:
                AudioTrack audioTrack = (AudioTrack) this.f2257b;
                Handler handler = (Handler) this.f2258c;
                W.n nVar = (W.n) this.f2259d;
                int i5 = 11;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new R1.n(i5, nVar));
                    }
                    synchronized (z.f5625r) {
                        try {
                            int i6 = z.f5627t - 1;
                            z.f5627t = i6;
                            if (i6 == 0) {
                                ScheduledExecutorService scheduledExecutorService = z.f5626s;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                z.f5626s = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new R1.n(i5, nVar));
                    }
                    synchronized (z.f5625r) {
                        try {
                            int i7 = z.f5627t - 1;
                            z.f5627t = i7;
                            if (i7 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = z.f5626s;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                z.f5626s = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 6:
                com.startapp.sdk.internal.a0.a((Context) this.f2257b, (AdEventListener) this.f2258c, (Ad) this.f2259d);
                return;
            case 7:
                e7.c((Context) this.f2257b, (String) this.f2258c, (Serializable) this.f2259d);
                return;
            case 8:
                j1.a((Context) this.f2257b, (BannerListener) this.f2258c, (View) this.f2259d);
                return;
            case 9:
                y6.b((y6) this.f2257b, (List) this.f2258c, (Map) this.f2259d);
                return;
            case 10:
                ((zc) this.f2257b).a((String) this.f2258c, (String) this.f2259d, null);
                return;
            case 11:
                L0.a((L0) this.f2257b, (PluginErrorDetails) this.f2258c, (String) this.f2259d);
                return;
            case 12:
                C0497b0.a((C0497b0) this.f2257b, (Context) this.f2258c, (AppMetricaLibraryAdapterConfig) this.f2259d);
                return;
            case 13:
                ((C0963t1) this.f2257b).b((Context) this.f2258c, (AppMetricaConfig) this.f2259d);
                return;
            default:
                C1292e c1292e = (C1292e) this.f2257b;
                String str3 = (String) this.f2258c;
                InterfaceC1291d interfaceC1291d = (InterfaceC1291d) this.f2259d;
                p pVar = (p) c1292e.f14353c.f9832b;
                r rVar = pVar.f14427d;
                pVar.f14426c = str3;
                C1285G n4 = interfaceC1291d.n();
                if (n4 != null) {
                    rVar.f14437d.f14412i.f14473c.put(Integer.valueOf(interfaceC1291d.e()), n4);
                    rVar.v = true;
                }
                rVar.m();
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i4) {
        this.f2256a = i4;
        this.f2257b = obj;
        this.f2258c = obj2;
        this.f2259d = obj3;
    }
}
