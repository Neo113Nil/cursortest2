package S;

import android.content.Intent;
import android.content.IntentSender;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.g7;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1296d;

    public /* synthetic */ a(int i3, int i4, Object obj, Object obj2) {
        this.f1293a = i4;
        this.f1295c = obj;
        this.f1296d = obj2;
        this.f1294b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1293a) {
            case 0:
                ((d) ((F1.d) this.f1295c).f493c).c(this.f1294b, (Serializable) this.f1296d);
                break;
            case 1:
                c.k this$0 = (c.k) this.f1295c;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                IntentSender.SendIntentException e3 = (IntentSender.SendIntentException) this.f1296d;
                kotlin.jvm.internal.j.e(e3, "$e");
                this$0.a(this.f1294b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e3));
                break;
            case 2:
                ((BannerRequest) this.f1295c).lambda$loadExternalAd$4((BannerRequest.Callback) this.f1296d, this.f1294b);
                break;
            case 3:
                ((BannerStandard) this.f1295c).lambda$loadExternalInline$1((g7) this.f1296d, this.f1294b);
                break;
            default:
                ((StartAppAd) this.f1295c).a((AdEventListener) this.f1296d, this.f1294b);
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i3, Serializable serializable, int i4) {
        this.f1293a = i4;
        this.f1295c = obj;
        this.f1294b = i3;
        this.f1296d = serializable;
    }
}
