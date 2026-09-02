package W;

import android.content.Intent;
import android.content.IntentSender;
import b.C0251l;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.g7;
import j1.C1172a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: W.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0117j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3316d;

    public /* synthetic */ RunnableC0117j(Object obj, int i4, Object obj2, int i5) {
        this.f3313a = i5;
        this.f3315c = obj;
        this.f3314b = i4;
        this.f3316d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3313a) {
            case 0:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f3315c;
                InterfaceC0118k interfaceC0118k = (InterfaceC0118k) this.f3316d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    C0120m c0120m = (C0120m) it.next();
                    if (!c0120m.f3320d) {
                        int i4 = this.f3314b;
                        if (i4 != -1) {
                            c0120m.f3318b.a(i4);
                        }
                        c0120m.f3319c = true;
                        interfaceC0118k.invoke(c0120m.f3317a);
                    }
                }
                break;
            case 1:
                C0251l c0251l = (C0251l) this.f3315c;
                Object obj = ((N1.c) this.f3316d).f1805a;
                String str = (String) c0251l.f8073a.get(Integer.valueOf(this.f3314b));
                if (str != null) {
                    d.e eVar = (d.e) c0251l.f8077e.get(str);
                    if ((eVar != null ? eVar.f8065a : null) != null) {
                        d.b bVar = eVar.f8065a;
                        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (c0251l.f8076d.remove(str)) {
                            bVar.a(obj);
                            break;
                        }
                    } else {
                        c0251l.f8079g.remove(str);
                        c0251l.f8078f.put(str, obj);
                        break;
                    }
                }
                break;
            case 2:
                C0251l this$0 = (C0251l) this.f3315c;
                IntentSender.SendIntentException e4 = (IntentSender.SendIntentException) this.f3316d;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(e4, "$e");
                this$0.a(this.f3314b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e4));
                break;
            case 3:
                ((BannerRequest) this.f3315c).lambda$loadExternalAd$4((BannerRequest.Callback) this.f3316d, this.f3314b);
                break;
            case 4:
                ((BannerStandard) this.f3315c).lambda$loadExternalInline$1((g7) this.f3316d, this.f3314b);
                break;
            case 5:
                ((StartAppAd) this.f3315c).a((AdEventListener) this.f3316d, this.f3314b);
                break;
            default:
                ((C1172a) this.f3315c).f13858b.l(this.f3314b, this.f3316d);
                break;
        }
    }

    public /* synthetic */ RunnableC0117j(Object obj, Object obj2, int i4, int i5) {
        this.f3313a = i5;
        this.f3315c = obj;
        this.f3316d = obj2;
        this.f3314b = i4;
    }
}
