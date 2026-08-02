package B0;

import Y1.C0106c;
import Y1.C0107d;
import Y1.C0109f;
import Y1.C0112i;
import a.AbstractC0129a;
import android.webkit.WebView;
import androidx.lifecycle.EnumC0165g;
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
import io.appmetrica.analytics.impl.C0451e;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.impl.C0661m2;
import io.appmetrica.analytics.impl.C0815s1;
import io.appmetrica.analytics.impl.C0918w0;
import io.flutter.plugin.platform.r;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.t;
import l.C1096s;
import x1.C1244e;
import y1.C1256d;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f157b;

    public /* synthetic */ n(int i3, Object obj) {
        this.f156a = i3;
        this.f157b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f156a) {
            case 0:
                o oVar = (o) this.f157b;
                oVar.getClass();
                ((C0.k) oVar.f161d).f(new g(3, oVar));
                return;
            case 1:
                G1.h hVar = (G1.h) this.f157b;
                ExecutorService executorService = hVar.f552a;
                ConcurrentLinkedQueue concurrentLinkedQueue = hVar.f553b;
                AtomicBoolean atomicBoolean = hVar.f554c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (isEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new n(1, hVar));
                        }
                    }
                }
                return;
            case 2:
                ((J1.d) ((J1.b) this.f157b).f636c).f.prefetchDefaultFontManager();
                return;
            case 3:
                C0107d c0107d = (C0107d) this.f157b;
                if (c0107d.f1837j) {
                    return;
                }
                while (true) {
                    C0106c c0106c = (C0106c) c0107d.f1833e.poll();
                    if (c0106c == null) {
                        c0107d.f1834g.postDelayed(c0107d.f1835h, c0107d.f1838k);
                        return;
                    }
                    Long l3 = (Long) t.a(c0107d.f).remove(c0106c);
                    if (l3 != null) {
                        c0107d.f1831c.remove(l3);
                        c0107d.f1832d.remove(l3);
                        long longValue = l3.longValue();
                        C0.e eVar = c0107d.f1829a;
                        C0112i c0112i = new C0112i(longValue);
                        C0109f c0109f = (C0109f) eVar.f201b;
                        new p(c0109f.f1849a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (P1.k) C0109f.f1848b.a(), (K0.j) null).h(AbstractC0129a.r(l3), new g(16, c0112i));
                    }
                }
            case 4:
                androidx.lifecycle.t this$0 = (androidx.lifecycle.t) this.f157b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                int i3 = this$0.f2402b;
                androidx.lifecycle.o oVar2 = this$0.f;
                if (i3 == 0) {
                    this$0.f2403c = true;
                    oVar2.e(EnumC0165g.ON_PAUSE);
                }
                if (this$0.f2401a == 0 && this$0.f2403c) {
                    oVar2.e(EnumC0165g.ON_STOP);
                    this$0.f2404d = true;
                    return;
                }
                return;
            case 5:
                c.j this$02 = (c.j) this.f157b;
                kotlin.jvm.internal.j.e(this$02, "this$0");
                Runnable runnable2 = this$02.f2572b;
                if (runnable2 != null) {
                    runnable2.run();
                    this$02.f2572b = null;
                    return;
                }
                return;
            case 6:
                ((BannerBase) this.f157b).scheduleReloadTask();
                return;
            case 7:
                com.startapp.sdk.ads.video.c.a((com.startapp.sdk.ads.video.c) this.f157b);
                return;
            case 8:
                ((com.startapp.sdk.adsbase.c) this.f157b).d();
                return;
            case 9:
                com.startapp.sdk.adsbase.d.a((com.startapp.sdk.adsbase.d) this.f157b);
                return;
            case 10:
                ((a8) this.f157b).c();
                return;
            case 11:
                ah.a((eh) this.f157b);
                return;
            case 12:
                ((di) this.f157b).a();
                return;
            case 13:
                o7.a((o7) this.f157b);
                return;
            case 14:
                ((HttpURLConnection) this.f157b).disconnect();
                return;
            case 15:
                o8.a((AtomicReference) this.f157b, null);
                return;
            case 16:
                ((vk) this.f157b).e();
                return;
            case 17:
                ((x1) this.f157b).a();
                return;
            case 18:
                yk.b((WebView) this.f157b);
                return;
            case C0642l9.f7777C /* 19 */:
                ((C0451e) this.f157b).a();
                return;
            case C0642l9.f7778D /* 20 */:
                C0661m2.a((C0661m2) this.f157b);
                return;
            case C0642l9.f7779E /* 21 */:
                ((C0815s1) this.f157b).e();
                return;
            case 22:
                ((C0918w0) this.f157b).o();
                return;
            case 23:
                ((r) this.f157b).e(false);
                return;
            case 24:
                ((C1096s) this.f157b).getClass();
                return;
        }
        while (true) {
            C1244e c1244e = (C1244e) this.f157b;
            ArrayList arrayList = c1244e.f;
            if (arrayList.isEmpty() || c1244e.f10734l != null) {
                return;
            }
            ((C1256d) arrayList.get(0)).f10830a.run();
            arrayList.remove(0);
        }
    }
}
