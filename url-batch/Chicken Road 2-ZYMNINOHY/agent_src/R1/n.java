package R1;

import W.AbstractC0108a;
import W.F;
import W.J;
import W.RunnableC0109b;
import W.q;
import a0.C0130F;
import a0.C0146l;
import a0.M;
import a0.j0;
import android.content.Context;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.w;
import b.DialogC0254o;
import b.ViewTreeObserverOnDrawListenerC0250k;
import c0.I;
import c0.K;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.internal.a8;
import com.startapp.sdk.internal.ah;
import com.startapp.sdk.internal.di;
import com.startapp.sdk.internal.eh;
import com.startapp.sdk.internal.o7;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.vk;
import com.startapp.sdk.internal.x1;
import com.startapp.sdk.internal.yk;
import e0.t;
import io.appmetrica.analytics.impl.C0551d2;
import io.appmetrica.analytics.impl.C0573e;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.impl.C0963t1;
import io.flutter.Build;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import u0.s;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2372b;

    public /* synthetic */ n(int i4, Object obj) {
        this.f2371a = i4;
        this.f2372b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String E4;
        TelephonyManager telephonyManager;
        int i4 = 5;
        int i5 = 0;
        switch (this.f2371a) {
            case 0:
                o oVar = (o) this.f2372b;
                ((S1.j) oVar.f2376d).n(new D0.a(i4, oVar));
                return;
            case 1:
                U.b bVar = (U.b) this.f2372b;
                ((Context) bVar.f3018b).unregisterReceiver((U.a) bVar.f3019c);
                return;
            case 2:
                U.a aVar = (U.a) this.f2372b;
                if (aVar.f3016c.f3017a) {
                    aVar.f3014a.f3838a.I(3, false);
                    return;
                }
                return;
            case 3:
                q qVar = (q) this.f2372b;
                u0.f fVar = (u0.f) qVar.f3331a.get();
                if (fVar != null) {
                    int b4 = qVar.f3333c.b();
                    u0.g gVar = fVar.f15447a;
                    synchronized (gVar) {
                        int i6 = gVar.n;
                        if (i6 == 0 || gVar.f15458e) {
                            if (i6 != b4 || gVar.o == null) {
                                gVar.n = b4;
                                if (b4 != 1 && b4 != 0 && b4 != 8) {
                                    if (gVar.o == null) {
                                        Context context = gVar.f15454a;
                                        String str = J.f3263a;
                                        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                                E4 = U.i.E(networkCountryIso);
                                                gVar.o = E4;
                                            }
                                        }
                                        E4 = U.i.E(Locale.getDefault().getCountry());
                                        gVar.o = E4;
                                    }
                                    gVar.f15465l = gVar.a(b4);
                                    gVar.f15457d.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    gVar.b(gVar.f15460g > 0 ? (int) (elapsedRealtime - gVar.f15461h) : 0, gVar.f15462i, gVar.f15465l);
                                    gVar.f15461h = elapsedRealtime;
                                    gVar.f15462i = 0L;
                                    gVar.f15464k = 0L;
                                    gVar.f15463j = 0L;
                                    s sVar = gVar.f15459f;
                                    sVar.f15498a.clear();
                                    sVar.f15500c = -1;
                                    sVar.f15501d = 0;
                                    sVar.f15502e = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 4:
                C0130F c0130f = (C0130F) this.f2372b;
                K3.n nVar = c0130f.f3849D;
                Context context2 = c0130f.f3879f;
                String str2 = J.f3263a;
                int generateAudioSessionId = U.i.j(context2).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                Integer valueOf = Integer.valueOf(generateAudioSessionId);
                nVar.f1600f = valueOf;
                RunnableC0109b runnableC0109b = new RunnableC0109b(nVar, valueOf, i5);
                F f4 = (F) nVar.f1598d;
                if (f4.f3257a.getLooper().getThread().isAlive()) {
                    f4.c(runnableC0109b);
                    return;
                }
                return;
            case 5:
                b0.d dVar = ((M) this.f2372b).f3974w;
                dVar.l(dVar.g(), 1034, new b0.b(i4));
                return;
            case 6:
                j0 j0Var = (j0) this.f2372b;
                try {
                    synchronized (j0Var) {
                    }
                    try {
                        j0Var.f4168a.c(j0Var.f4170c, j0Var.f4171d);
                        return;
                    } finally {
                        j0Var.a(true);
                    }
                } catch (C0146l e4) {
                    AbstractC0108a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
                    throw new RuntimeException(e4);
                }
            case 7:
                w wVar = (w) this.f2372b;
                C0237p c0237p = wVar.f5080f;
                if (wVar.f5076b == 0) {
                    wVar.f5077c = true;
                    c0237p.e(EnumC0229h.ON_PAUSE);
                }
                if (wVar.f5075a == 0 && wVar.f5077c) {
                    c0237p.e(EnumC0229h.ON_STOP);
                    wVar.f5078d = true;
                    return;
                }
                return;
            case 8:
                ViewTreeObserverOnDrawListenerC0250k this$0 = (ViewTreeObserverOnDrawListenerC0250k) this.f2372b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Runnable runnable = this$0.f5226b;
                if (runnable != null) {
                    runnable.run();
                    this$0.f5226b = null;
                    return;
                }
                return;
            case 9:
                DialogC0254o.a((DialogC0254o) this.f2372b);
                return;
            case 10:
                b0.d dVar2 = (b0.d) this.f2372b;
                dVar2.l(dVar2.g(), 1028, new b0.b(14));
                dVar2.f5274f.d();
                return;
            case 11:
                ((W.n) this.f2372b).e(-1, new b0.c(10));
                return;
            case 12:
                I i7 = (I) this.f2372b;
                if (i7.f5477a0 >= 300000) {
                    ((K) i7.n.f15398b).f5511Z0 = true;
                    i7.f5477a0 = 0L;
                    return;
                }
                return;
            case 13:
                ((BannerBase) this.f2372b).scheduleReloadTask();
                return;
            case 14:
                com.startapp.sdk.ads.video.c.a((com.startapp.sdk.ads.video.c) this.f2372b);
                return;
            case 15:
                ((com.startapp.sdk.adsbase.c) this.f2372b).d();
                return;
            case 16:
                com.startapp.sdk.adsbase.d.a((com.startapp.sdk.adsbase.d) this.f2372b);
                return;
            case 17:
                ((a8) this.f2372b).c();
                return;
            case 18:
                ah.a((eh) this.f2372b);
                return;
            case C0583e9.f11743C /* 19 */:
                ((di) this.f2372b).a();
                return;
            case C0583e9.f11744D /* 20 */:
                o7.a((o7) this.f2372b);
                return;
            case 21:
                ((HttpURLConnection) this.f2372b).disconnect();
                return;
            case Build.API_LEVELS.API_22 /* 22 */:
                o8.a((AtomicReference) this.f2372b, null);
                return;
            case Build.API_LEVELS.API_23 /* 23 */:
                ((vk) this.f2372b).e();
                return;
            case 24:
                ((x1) this.f2372b).a();
                return;
            case 25:
                yk.b((WebView) this.f2372b);
                return;
            case 26:
                ((t) this.f2372b).G();
                return;
            case 27:
                C0551d2.a((C0551d2) this.f2372b);
                return;
            case Build.API_LEVELS.API_28 /* 28 */:
                ((C0573e) this.f2372b).a();
                return;
            default:
                ((C0963t1) this.f2372b).e();
                return;
        }
    }

    public /* synthetic */ n(M m4, int i4) {
        this.f2371a = 5;
        this.f2372b = m4;
    }

    public /* synthetic */ n(M m4, j0 j0Var) {
        this.f2371a = 6;
        this.f2372b = j0Var;
    }
}
