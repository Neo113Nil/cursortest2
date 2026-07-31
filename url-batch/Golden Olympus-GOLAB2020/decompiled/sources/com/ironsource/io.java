package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class io {

    /* renamed from: d, reason: collision with root package name */
    public static final String f16726d = "Ironsrc";

    /* renamed from: e, reason: collision with root package name */
    public static final String f16727e = "7";

    /* renamed from: f, reason: collision with root package name */
    public static final String f16728f = Omid.getVersion();

    /* renamed from: g, reason: collision with root package name */
    public static final String f16729g = "omidVersion";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16730h = "omidPartnerName";

    /* renamed from: i, reason: collision with root package name */
    public static final String f16731i = "omidPartnerVersion";

    /* renamed from: j, reason: collision with root package name */
    public static final String f16732j = "omidActiveAdSessions";

    /* renamed from: k, reason: collision with root package name */
    private static final String f16733k = "Invalid OMID impressionOwner";

    /* renamed from: l, reason: collision with root package name */
    private static final String f16734l = "Invalid OMID videoEventsOwner";

    /* renamed from: m, reason: collision with root package name */
    private static final String f16735m = "Missing OMID impressionOwner";

    /* renamed from: n, reason: collision with root package name */
    private static final String f16736n = "Missing OMID videoEventsOwner";

    /* renamed from: o, reason: collision with root package name */
    private static final String f16737o = "OMID has not been activated";

    /* renamed from: p, reason: collision with root package name */
    private static final String f16738p = "Missing OMID creativeType";

    /* renamed from: q, reason: collision with root package name */
    private static final String f16739q = "Missing adview id in OMID params";

    /* renamed from: r, reason: collision with root package name */
    private static final String f16740r = "No adview found with the provided adViewId";

    /* renamed from: s, reason: collision with root package name */
    private static final String f16741s = "OMID Session has already started";

    /* renamed from: t, reason: collision with root package name */
    private static final String f16742t = "OMID Session has not started";

    /* renamed from: a, reason: collision with root package name */
    private final Partner f16743a = Partner.createPartner(f16726d, f16727e);

    /* renamed from: c, reason: collision with root package name */
    private boolean f16745c = false;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, AdSession> f16744b = new HashMap<>();

    static class a {

        /* renamed from: i, reason: collision with root package name */
        private static final String f16746i = "isolateVerificationScripts";

        /* renamed from: j, reason: collision with root package name */
        private static final String f16747j = "impressionOwner";

        /* renamed from: k, reason: collision with root package name */
        private static final String f16748k = "videoEventsOwner";

        /* renamed from: l, reason: collision with root package name */
        private static final String f16749l = "customReferenceData";

        /* renamed from: m, reason: collision with root package name */
        private static final String f16750m = "creativeType";

        /* renamed from: n, reason: collision with root package name */
        private static final String f16751n = "impressionType";

        /* renamed from: o, reason: collision with root package name */
        public static final String f16752o = "adViewId";

        /* renamed from: a, reason: collision with root package name */
        public boolean f16753a;

        /* renamed from: b, reason: collision with root package name */
        public Owner f16754b;

        /* renamed from: c, reason: collision with root package name */
        public Owner f16755c;

        /* renamed from: d, reason: collision with root package name */
        public String f16756d;

        /* renamed from: e, reason: collision with root package name */
        public ImpressionType f16757e;

        /* renamed from: f, reason: collision with root package name */
        public CreativeType f16758f;

        /* renamed from: g, reason: collision with root package name */
        public String f16759g;

        /* renamed from: h, reason: collision with root package name */
        public Owner f16760h;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f16753a = jSONObject.optBoolean(f16746i, false);
            String optString = jSONObject.optString(f16747j, "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(io.f16735m);
            }
            try {
                aVar.f16754b = Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
                String optString2 = jSONObject.optString(f16748k, "");
                if (TextUtils.isEmpty(optString)) {
                    throw new IllegalArgumentException(io.f16736n);
                }
                try {
                    aVar.f16755c = Owner.valueOf(optString2.toUpperCase(Locale.getDefault()));
                    aVar.f16756d = jSONObject.optString(f16749l, "");
                    aVar.f16758f = b(jSONObject);
                    aVar.f16757e = c(jSONObject);
                    aVar.f16759g = e(jSONObject);
                    aVar.f16760h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e4) {
                    o9.d().a(e4);
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                }
            } catch (IllegalArgumentException e5) {
                o9.d().a(e5);
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
            }
        }

        private static CreativeType b(JSONObject jSONObject) {
            String optString = jSONObject.optString(f16750m, "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(io.f16738p + optString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (optString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(io.f16738p + optString);
        }

        private static ImpressionType c(JSONObject jSONObject) {
            String optString = jSONObject.optString(f16751n, "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(io.f16738p + optString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (optString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(io.f16738p + optString);
        }

        private static Owner d(JSONObject jSONObject) {
            String optString = jSONObject.optString(f16748k, "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e4) {
                o9.d().a(e4);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                return optString;
            }
            throw new IllegalArgumentException(io.f16739q + optString);
        }
    }

    private AdSession a(a aVar, wh whVar) {
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f16758f, aVar.f16757e, aVar.f16754b, aVar.f16755c, aVar.f16753a), AdSessionContext.createHtmlAdSessionContext(this.f16743a, whVar.getPresentingView(), null, aVar.f16756d));
        createAdSession.registerAdView(whVar.getPresentingView());
        return createAdSession;
    }

    public void b(JSONObject jSONObject) {
        a(jSONObject);
        String optString = jSONObject.optString("adViewId");
        AdSession adSession = this.f16744b.get(optString);
        if (adSession == null) {
            throw new IllegalStateException(f16742t);
        }
        adSession.finish();
        this.f16744b.remove(optString);
    }

    public void c(JSONObject jSONObject) {
        a(jSONObject);
        AdSession adSession = this.f16744b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(f16742t);
        }
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            createAdEvents.loaded();
        }
        createAdEvents.impressionOccurred();
    }

    public void d(JSONObject jSONObject) {
        a(a.a(jSONObject));
    }

    public gr a() {
        gr grVar = new gr();
        grVar.b(f16729g, SDKUtils.encodeString(f16728f));
        grVar.b(f16730h, SDKUtils.encodeString(f16726d));
        grVar.b(f16731i, SDKUtils.encodeString(f16727e));
        grVar.b(f16732j, SDKUtils.encodeString(Arrays.toString(this.f16744b.keySet().toArray())));
        return grVar;
    }

    public void a(Context context) {
        if (this.f16745c) {
            return;
        }
        Omid.activate(context);
        this.f16745c = true;
    }

    public void a(a aVar) {
        if (!this.f16745c) {
            throw new IllegalStateException(f16737o);
        }
        if (TextUtils.isEmpty(aVar.f16759g)) {
            throw new IllegalStateException(f16739q);
        }
        String str = aVar.f16759g;
        if (this.f16744b.containsKey(str)) {
            throw new IllegalStateException(f16741s);
        }
        wh a4 = ch.a().a(str);
        if (a4 == null) {
            throw new IllegalStateException(f16740r);
        }
        AdSession a5 = a(aVar, a4);
        a5.start();
        this.f16744b.put(str, a5);
    }

    private void a(JSONObject jSONObject) {
        if (!this.f16745c) {
            throw new IllegalStateException(f16737o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f16742t);
        }
    }
}
