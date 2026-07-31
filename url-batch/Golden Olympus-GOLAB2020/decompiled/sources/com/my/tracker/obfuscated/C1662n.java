package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.c9;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1662n {

    /* renamed from: a, reason: collision with root package name */
    final AtomicBoolean f21442a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    final C1712z2 f21443b;

    /* renamed from: c, reason: collision with root package name */
    final Context f21444c;

    C1662n(C1712z2 c1712z2, Context context) {
        this.f21443b = c1712z2;
        this.f21444c = context.getApplicationContext();
    }

    boolean a() {
        if (this.f21442a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(C1676q1.a(this.f21444c).h());
    }

    public void a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else {
            if (!a()) {
                try {
                    String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
                    if (TextUtils.isEmpty(queryParameter)) {
                        AbstractC1708y2.a("AttributionHandler: deeplink is empty");
                        return;
                    } else {
                        a(new JSONObject().put("deeplink", queryParameter));
                        return;
                    }
                } catch (Throwable th) {
                    AbstractC1708y2.b("AttributionHandler error: handling referrer failed with error: ", th);
                    return;
                }
            }
            str2 = "AttributionHandler: attribution has already been received";
        }
        AbstractC1708y2.a(str2);
    }

    public void b(String str) {
        String str2;
        if (a()) {
            AbstractC1708y2.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(c9.f15699c);
            if (optJSONObject == null) {
                str2 = "AttributionHandler: empty attribution object has been returned";
            } else {
                if (!optJSONObject.has("error")) {
                    a(optJSONObject);
                    return;
                }
                str2 = "AttributionHandler: attribution response returned error " + optJSONObject.optInt("error");
            }
            AbstractC1708y2.a(str2);
        } catch (Throwable th) {
            AbstractC1708y2.b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    void a(JSONObject jSONObject) {
        String optString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(optString)) {
            AbstractC1708y2.a("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.f21442a.compareAndSet(false, true)) {
            AbstractC1708y2.a("AttributionHandler: attribution has already been received");
            return;
        }
        C1676q1 a4 = C1676q1.a(this.f21444c);
        if (!TextUtils.isEmpty(a4.h())) {
            AbstractC1708y2.a("AttributionHandler: attribution has already been received");
            return;
        }
        a4.i(jSONObject.toString());
        final MyTracker.AttributionListener d4 = this.f21443b.d();
        if (d4 == null) {
            return;
        }
        Handler c4 = this.f21443b.c();
        if (c4 == null) {
            c4 = AbstractC1658m.f21416a;
        }
        final MyTrackerAttribution newAttribution = MyTrackerAttribution.newAttribution(optString);
        try {
            c4.post(new Runnable() { // from class: com.my.tracker.obfuscated.h3
                @Override // java.lang.Runnable
                public final void run() {
                    C1662n.a(MyTracker.AttributionListener.this, newAttribution);
                }
            });
        } catch (Throwable th) {
            AbstractC1708y2.b("AttributionHandler error: exception occurred while post runnable", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            AbstractC1708y2.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    public static C1662n a(C1712z2 c1712z2, Context context) {
        return new C1662n(c1712z2, context);
    }
}
