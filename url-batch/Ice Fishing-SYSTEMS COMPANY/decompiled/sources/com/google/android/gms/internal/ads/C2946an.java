package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import k2.C4637h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4856a;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2946an {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29300a;

    /* renamed from: b, reason: collision with root package name */
    public final C2797Tm f29301b;

    /* renamed from: c, reason: collision with root package name */
    public final C3348i7 f29302c;

    /* renamed from: d, reason: collision with root package name */
    public final C5107a f29303d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.s f29304e;

    /* renamed from: f, reason: collision with root package name */
    public final C2914a9 f29305f;

    /* renamed from: g, reason: collision with root package name */
    public final SD f29306g;

    /* renamed from: h, reason: collision with root package name */
    public final C3261gb f29307h;
    public final C3327hn i;

    /* renamed from: j, reason: collision with root package name */
    public final C2628Jn f29308j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f29309k;

    /* renamed from: l, reason: collision with root package name */
    public final C4242yn f29310l;

    /* renamed from: m, reason: collision with root package name */
    public final C3165eo f29311m;

    /* renamed from: n, reason: collision with root package name */
    public final Av f29312n;

    /* renamed from: o, reason: collision with root package name */
    public final C2834Vp f29313o;

    /* renamed from: p, reason: collision with root package name */
    public final BinderC2949aq f29314p;

    /* renamed from: q, reason: collision with root package name */
    public final C3280gu f29315q;

    /* renamed from: r, reason: collision with root package name */
    public final C3002bo f29316r;

    /* renamed from: s, reason: collision with root package name */
    public final C3758po f29317s;

    public C2946an(Context context, C2797Tm c2797Tm, C3348i7 c3348i7, C5107a c5107a, S0.s sVar, C2914a9 c2914a9, SD sd, C3226fu c3226fu, C3327hn c3327hn, C2628Jn c2628Jn, ScheduledExecutorService scheduledExecutorService, C3165eo c3165eo, Av av, C2834Vp c2834Vp, C4242yn c4242yn, BinderC2949aq binderC2949aq, C3280gu c3280gu, C3002bo c3002bo, C3758po c3758po) {
        this.f29300a = context;
        this.f29301b = c2797Tm;
        this.f29302c = c3348i7;
        this.f29303d = c5107a;
        this.f29304e = sVar;
        this.f29305f = c2914a9;
        this.f29306g = sd;
        this.f29307h = c3226fu.f30906j;
        this.i = c3327hn;
        this.f29308j = c2628Jn;
        this.f29309k = scheduledExecutorService;
        this.f29311m = c3165eo;
        this.f29312n = av;
        this.f29313o = c2834Vp;
        this.f29310l = c4242yn;
        this.f29314p = binderC2949aq;
        this.f29315q = c3280gu;
        this.f29316r = c3002bo;
        this.f29317s = c3758po;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(com.anythink.expressad.foundation.d.d.bv), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final q2.L0 f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new q2.L0(optString, optString2);
    }

    public final J3.a a(JSONArray jSONArray, boolean z8, boolean z9, int i) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return C3686oN.c(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z9 ? jSONArray.length() : 1;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
            String a9 = com.anythink.basead.b.c.i.a(i);
            p2.j.f39798C.f39810k.getClass();
            this.f29316r.c(a9, System.currentTimeMillis());
        }
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(b(jSONArray.optJSONObject(i4), z8, 0));
        }
        return C3686oN.A(new DD(UB.n(arrayList), true), J2.i, this.f29306g);
    }

    public final J3.a b(JSONObject jSONObject, boolean z8, int i) {
        double d2;
        J3.a A8;
        if (jSONObject == null) {
            return OD.f26665u;
        }
        C3151ea c3151ea = AbstractC3368ia.f31514O4;
        q2.r rVar = q2.r.f40116e;
        HashMap hashMap = null;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            C3151ea c3151ea2 = AbstractC3368ia.f31522P4;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (jSONObject.has((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2))) {
                hashMap = new HashMap();
                for (String str : ((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31530Q4)).split(",")) {
                    try {
                        hashMap.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        HashMap hashMap2 = hashMap;
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString) && hashMap2 == null) {
            return OD.f26665u;
        }
        C3151ea c3151ea3 = AbstractC3368ia.f31529Q2;
        q2.r rVar2 = q2.r.f40116e;
        if (((Boolean) rVar2.f40119c.a(c3151ea3)).booleanValue() && i != 0) {
            p2.j.f39798C.f39810k.getClass();
            this.f29316r.c(com.anythink.basead.b.c.i.a(i), System.currentTimeMillis());
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z8) {
            d2 = optDouble;
        } else {
            if (hashMap2 == null) {
                final C2797Tm c2797Tm = this.f29301b;
                c2797Tm.getClass();
                boolean booleanValue = ((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31640c7)).booleanValue();
                SD sd = c2797Tm.f27826c;
                if (booleanValue && optString != null && optString.startsWith("data:")) {
                    A8 = C3686oN.p(new Callable() { // from class: com.google.android.gms.internal.ads.Rm
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            C2797Tm c2797Tm2 = C2797Tm.this;
                            c2797Tm2.getClass();
                            String str2 = optString;
                            int indexOf = str2.indexOf(",");
                            if (indexOf == -1) {
                                throw new IllegalArgumentException("Bad data URL: no ',' found for base64 data");
                            }
                            if (!str2.substring(0, indexOf).endsWith(";base64")) {
                                throw new IllegalArgumentException("Bad data URL: only base64 is supported");
                            }
                            int indexOf2 = str2.indexOf(":");
                            int indexOf3 = str2.indexOf(";");
                            if (indexOf2 == -1 || !str2.substring(indexOf2 + 1, indexOf3).startsWith("image/")) {
                                throw new IllegalArgumentException("Bad data URL: only image media is supported");
                            }
                            return c2797Tm2.a(Base64.decode(str2.substring(indexOf + 1), 0), optDouble, optBoolean);
                        }
                    }, sd);
                } else {
                    c2797Tm.f27824a.getClass();
                    C3320hg c3320hg = new C3320hg();
                    t2.s.f40933a.o(new t2.r(optString, c3320hg));
                    A8 = C3686oN.A(c3320hg, new XA() { // from class: com.google.android.gms.internal.ads.Sm
                        @Override // com.google.android.gms.internal.ads.XA
                        public final /* synthetic */ Object apply(Object obj) {
                            C2797Tm c2797Tm2 = C2797Tm.this;
                            c2797Tm2.getClass();
                            return c2797Tm2.a(((C2965b5) obj).f29402b, optDouble, optBoolean);
                        }
                    }, sd);
                }
                return e("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), C3686oN.A(A8, new XA() { // from class: com.google.android.gms.internal.ads.Wm
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        return new BinderC3098db(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                    }
                }, this.f29306g));
            }
            d2 = optDouble;
        }
        return C3686oN.c(new BinderC3098db(null, Uri.parse(optString), d2, optInt, optInt2, hashMap2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3945tD d(JSONObject jSONObject, Ut ut, Wt wt, C4856a c4856a, C4072vf c4072vf) {
        q2.g1 g1Var;
        String optString = jSONObject.optString("base_url");
        String optString2 = jSONObject.optString(com.onesignal.inAppMessages.internal.d.HTML);
        int i = 0;
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (optInt != 0) {
            i = optInt;
        } else if (optInt2 == 0) {
            g1Var = q2.g1.a();
            C3327hn c3327hn = this.i;
            c3327hn.getClass();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
                p2.j.f39798C.f39810k.getClass();
                c3327hn.i.c("native-assets-loading-video-composition-start", System.currentTimeMillis());
            }
            C3945tD y6 = C3686oN.y(OD.f26665u, new C2882Ym(c3327hn, g1Var, ut, wt, c4856a, c4072vf, optString, optString2, 1), c3327hn.f31257b);
            return C3686oN.y(y6, new C2899Zm(y6, 1), AbstractC3212fg.f30745h);
        }
        g1Var = new q2.g1(this.f29300a, new C4637h(i, optInt2));
        C3327hn c3327hn2 = this.i;
        c3327hn2.getClass();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
        }
        C3945tD y62 = C3686oN.y(OD.f26665u, new C2882Ym(c3327hn2, g1Var, ut, wt, c4856a, c4072vf, optString, optString2, 1), c3327hn2.f31257b);
        return C3686oN.y(y62, new C2899Zm(y62, 1), AbstractC3212fg.f30745h);
    }

    public final ID e(String str, boolean z8, J3.a aVar) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31537R2)).booleanValue()) {
            AbstractC2720Pd.g(aVar, str, this.f29306g);
        }
        return z8 ? C3686oN.y(aVar, new C3154ed(1, aVar), AbstractC3212fg.f30745h) : C3686oN.v(aVar, Exception.class, new C2538Ei(1), AbstractC3212fg.f30745h);
    }
}
