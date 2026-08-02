package D0;

import I.C0079n;
import h0.C0197e;
import j.C0243t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import q0.CallableC0285b;

/* renamed from: D0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0043c implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f321f;

    public /* synthetic */ RunnableC0043c(int i2, Object obj) {
        this.f320e = i2;
        this.f321f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f320e) {
            case 0:
                C0044d c0044d = (C0044d) this.f321f;
                Q0.h.e(c0044d, "this$0");
                if (c0044d.f335j) {
                    return;
                }
                while (true) {
                    WeakReference weakReference = (WeakReference) c0044d.f330e.poll();
                    if (weakReference == null) {
                        c0044d.f332g.postDelayed(c0044d.f333h, c0044d.f336k);
                        return;
                    }
                    HashMap hashMap = c0044d.f331f;
                    Object obj = null;
                    if (hashMap instanceof R0.a) {
                        Q0.r.c(hashMap, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    Long l2 = (Long) hashMap.remove(weakReference);
                    if (l2 != null) {
                        c0044d.f328c.remove(l2);
                        c0044d.f329d.remove(l2);
                        long longValue = l2.longValue();
                        B.m mVar = c0044d.f326a;
                        C0049i c0049i = new C0049i(longValue);
                        C0047g c0047g = (C0047g) mVar.f78f;
                        new C0079n(c0047g.f354a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (w0.k) C0047g.f353b.a(), obj).h(i1.a.u(l2), new C0.f(1, c0049i));
                    }
                }
            case 1:
                androidx.lifecycle.r rVar = (androidx.lifecycle.r) this.f321f;
                Q0.h.e(rVar, "this$0");
                int i2 = rVar.f1788f;
                androidx.lifecycle.n nVar = rVar.f1792j;
                if (i2 == 0) {
                    rVar.f1789g = true;
                    nVar.c(androidx.lifecycle.f.ON_PAUSE);
                }
                if (rVar.f1787e == 0 && rVar.f1789g) {
                    nVar.c(androidx.lifecycle.f.ON_STOP);
                    rVar.f1790h = true;
                    return;
                }
                return;
            case 2:
                break;
            case 3:
                ((io.flutter.plugin.platform.o) this.f321f).e(false);
                return;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                ((CallableC0285b) this.f321f).f3376b.f3383e.prefetchDefaultFontManager();
                return;
            default:
                ((C0243t) this.f321f).getClass();
                return;
        }
        while (true) {
            C0197e c0197e = (C0197e) this.f321f;
            ArrayList arrayList = c0197e.f2295f;
            if (arrayList.isEmpty() || c0197e.f2301l != null) {
                return;
            }
            ((i0.d) arrayList.get(0)).f2492a.run();
            arrayList.remove(0);
        }
    }
}
