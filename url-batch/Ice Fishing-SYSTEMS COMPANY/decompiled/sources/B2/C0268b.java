package B2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2734Qa;
import com.google.android.gms.internal.ads.AbstractC2917aC;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2972bC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: B2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f212a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f213b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f214c;

    /* renamed from: d, reason: collision with root package name */
    public final C5107a f215d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f216e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f217f = new AtomicBoolean(false);

    public C0268b(Context context, ArrayList arrayList, C5107a c5107a) {
        this.f212a = context;
        this.f213b = context.getApplicationInfo();
        this.f214c = arrayList;
        this.f215d = c5107a;
    }

    public final void a(WebView webView) {
        if (this.f217f.getAndSet(true)) {
            return;
        }
        ApplicationInfo applicationInfo = this.f213b;
        PackageInfo packageInfo = null;
        if (applicationInfo != null) {
            try {
                packageInfo = U2.c.a(this.f212a).e(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f216e;
        if (packageInfo != null) {
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.f19223M, packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e6) {
                p2.j.f39798C.f39808h.d("PawAppSignalGenerator.initialize", e6);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f214c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.jb)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f215d.f41217n);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) AbstractC2734Qa.f27164b.r()).booleanValue() && com.bumptech.glide.h.s("DOCUMENT_START_SCRIPT") && webView != null) {
            String format = String.format(Locale.getDefault(), (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.ib), b());
            int i = AbstractC2917aC.f29181v;
            C2972bC c2972bC = new C2972bC("*");
            int i4 = H0.e.f1207a;
            if (!I0.m.f1239e.b()) {
                throw I0.m.a();
            }
        }
    }

    public final JSONObject b() {
        if (!this.f217f.get()) {
            a(null);
        }
        return this.f216e;
    }
}
