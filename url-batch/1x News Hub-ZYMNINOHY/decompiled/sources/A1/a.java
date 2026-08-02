package A1;

import A0.d;
import E1.AbstractC0033i;
import O1.c;
import S.f;
import S.i;
import Y1.C0107d;
import Y1.C0117n;
import Y1.C0120q;
import Y1.C0125w;
import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b0.s;
import c.g;
import c.m;
import c.t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.internal.a8;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.vk;
import com.startapp.sdk.internal.yk;
import com.startapp.sdk.internal.z7;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.impl.p;
import io.appmetrica.analytics.idsync.impl.y;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0594jd;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.impl.C0675mg;
import io.appmetrica.analytics.impl.C0701ng;
import io.appmetrica.analytics.impl.InterfaceC0960xg;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.impl.Kb;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.j;
import l.C1096s;
import x1.C1244e;
import x1.C1245f;
import x1.C1246g;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28c;

    public /* synthetic */ a(y yVar, p pVar) {
        this.f26a = 1;
        this.f28c = yVar;
        this.f27b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar;
        int i3 = 0;
        switch (this.f26a) {
            case 0:
                p.a((p) this.f27b, (RequestConfig) this.f28c);
                return;
            case 1:
                p.a((y) this.f28c, (p) this.f27b);
                return;
            case 2:
                int i4 = JobInfoSchedulerService.f2655a;
                ((JobInfoSchedulerService) this.f27b).jobFinished((JobParameters) this.f28c, false);
                return;
            case 3:
                ((ProfileInstallerInitializer) this.f27b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f((Context) this.f28c, i3), new Random().nextInt(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                return;
            case 4:
                C0120q c0120q = new C0120q(i3);
                C0125w c0125w = (C0125w) this.f27b;
                C0117n c0117n = c0125w.f1895b;
                String messageArg = (String) this.f28c;
                j.e(messageArg, "messageArg");
                d dVar = c0117n.f1873a;
                dVar.getClass();
                if (((C0107d) dVar.f17b).d(c0125w)) {
                    new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", dVar.a(), (K0.j) null).h(c2.f.L(c0125w, messageArg), new C0.f(9, c0120q));
                    return;
                } else {
                    AbstractC0033i.q("missing-instance-error", "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager.", "");
                    return;
                }
            case 5:
                m this$0 = (m) this.f27b;
                j.e(this$0, "this$0");
                t tVar = (t) this.f28c;
                int i5 = m.f2583s;
                this$0.f10332a.a(new g(tVar, this$0));
                return;
            case 6:
                ((StartAppAd) this.f27b).a((Activity) this.f28c);
                return;
            case 7:
                com.startapp.sdk.adsbase.periodic.a.a((com.startapp.sdk.adsbase.periodic.a) this.f27b, (z7) this.f28c);
                return;
            case 8:
                ((a8) this.f27b).b((Boolean) this.f28c);
                return;
            case 9:
                e7.a((Context) this.f27b, null, "StartIoCachedAds", (Serializable) this.f28c);
                return;
            case 10:
                gh.a((Context) this.f27b, (Runnable) this.f28c);
                return;
            case 11:
                ((vk) this.f27b).a((String) this.f28c);
                return;
            case 12:
                ((WebView) this.f27b).loadUrl((String) this.f28c);
                return;
            case 13:
                yk.a((WebView) this.f27b, (yk) this.f28c);
                return;
            case 14:
                J0.a((J0) this.f27b, (PluginErrorDetails) this.f28c);
                return;
            case 15:
                Kb.a((Kb) this.f27b, (V) this.f28c);
                return;
            case 16:
                C0594jd.a((C0594jd) this.f27b, (ArrayList) this.f28c);
                return;
            case 17:
                C0675mg.a((C0701ng) this.f27b, (InterfaceC0960xg) this.f28c);
                return;
            case 18:
                C0701ng.b((InterfaceC0960xg) this.f27b, (Throwable) this.f28c);
                return;
            case C0642l9.f7777C /* 19 */:
                ((C1096s) this.f27b).b((Typeface) this.f28c);
                return;
            case C0642l9.f7778D /* 20 */:
                C1246g c1246g = (C1246g) this.f27b;
                c1246g.getClass();
                C1245f c1245f = (C1245f) this.f28c;
                c1245f.f10737b.run();
                c1246g.f = c1245f;
                c1246g.f10742e.run();
                return;
            case C0642l9.f7779E /* 21 */:
                c cVar = (c) this.f27b;
                C1246g c1246g2 = (C1246g) this.f28c;
                synchronized (cVar) {
                    HashSet hashSet = new HashSet((HashSet) cVar.f1145e);
                    ((HashSet) cVar.f).remove(c1246g2);
                    ((HashSet) cVar.f1145e).add(c1246g2);
                    C1245f c1245f2 = c1246g2.f;
                    if (c1245f2 == null || (sVar = c1245f2.f10736a) == null || !((C1244e) sVar.f2544a).j()) {
                        C1245f c1245f3 = c1246g2.f;
                        if ((c1245f3 != null ? c1245f3.a() : null) != null) {
                            HashMap hashMap = (HashMap) cVar.f1146g;
                            C1245f c1245f4 = c1246g2.f;
                            hashMap.remove(c1245f4 != null ? c1245f4.a() : null);
                        }
                    }
                    cVar.f(c1246g2);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        cVar.f((C1246g) it.next());
                    }
                }
                return;
            default:
                io.appmetrica.analytics.billing.impl.j.a((io.appmetrica.analytics.billing.impl.j) this.f27b, (ProductInfo) this.f28c);
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i3, Object obj2) {
        this.f26a = i3;
        this.f27b = obj;
        this.f28c = obj2;
    }
}
