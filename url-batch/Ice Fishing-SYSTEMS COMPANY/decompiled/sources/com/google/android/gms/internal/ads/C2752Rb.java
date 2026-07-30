package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.common.e.a;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k2.AbstractC4641l;
import k2.C4633d;
import k2.C4635f;
import k2.C4636g;
import k2.C4637h;
import k2.C4639j;
import l2.C4686a;
import l2.C4687b;
import l2.C4688c;
import m2.AbstractC4778b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v2.AbstractC5123a;
import z2.C5273c;

/* renamed from: com.google.android.gms.internal.ads.Rb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2752Rb implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27381n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f27382u;

    public /* synthetic */ C2752Rb(int i, Object obj) {
        this.f27381n = i;
        this.f27382u = obj;
    }

    public static final Bundle a(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e6) {
                p2.j.f39798C.f39808h.d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e6);
            }
        }
        return bundle;
    }

    public static final ArrayList b(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e6) {
            p2.j.f39798C.f39808h.d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e6);
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06ed A[Catch: all -> 0x06db, TRY_LEAVE, TryCatch #14 {all -> 0x06db, blocks: (B:245:0x0699, B:247:0x069f, B:250:0x06a6, B:255:0x06b0, B:257:0x06b8, B:259:0x06ca, B:261:0x06ce, B:263:0x06d2, B:265:0x06d6, B:268:0x06e2, B:270:0x06ed, B:273:0x06f4, B:275:0x06f8, B:278:0x06ff, B:280:0x0703, B:283:0x070c, B:285:0x0710, B:288:0x0719, B:290:0x0727, B:292:0x072b, B:294:0x072f, B:297:0x06df), top: B:244:0x0699 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06f4 A[Catch: all -> 0x06db, TRY_ENTER, TryCatch #14 {all -> 0x06db, blocks: (B:245:0x0699, B:247:0x069f, B:250:0x06a6, B:255:0x06b0, B:257:0x06b8, B:259:0x06ca, B:261:0x06ce, B:263:0x06d2, B:265:0x06d6, B:268:0x06e2, B:270:0x06ed, B:273:0x06f4, B:275:0x06f8, B:278:0x06ff, B:280:0x0703, B:283:0x070c, B:285:0x0710, B:288:0x0719, B:290:0x0727, B:292:0x072b, B:294:0x072f, B:297:0x06df), top: B:244:0x0699 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x044b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Object obj, Map map) {
        C4637h c4637h;
        C5273c c5273c;
        k2.w wVar;
        boolean z8;
        C4636g c4636g;
        C4637h c4637h2;
        int i = 4;
        Bundle bundle = null;
        bundle = null;
        r2 = null;
        C2938af c2938af = null;
        r2 = null;
        Activity activity = null;
        switch (this.f27381n) {
            case 0:
                InterfaceC2769Sb interfaceC2769Sb = (InterfaceC2769Sb) this.f27382u;
                if (interfaceC2769Sb == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    int i4 = t2.C.f40822b;
                    u2.i.e("Ad metadata with no name parameter.");
                    str = "";
                }
                String str2 = str;
                if (map.containsKey("info")) {
                    try {
                        bundle = p8.g.w(new JSONObject((String) map.get("info")));
                    } catch (JSONException e6) {
                        int i9 = t2.C.f40822b;
                        u2.i.d("Failed to convert ad metadata to JSON.", e6);
                    }
                }
                if (bundle != null) {
                    interfaceC2769Sb.o(str2, bundle);
                    return;
                } else {
                    int i10 = t2.C.f40822b;
                    u2.i.c("Failed to convert ad metadata to Bundle.");
                    return;
                }
            case 1:
                String str3 = (String) map.get("name");
                if (str3 != null) {
                    ((InterfaceC2786Tb) this.f27382u).m0(str3, (String) map.get("info"));
                    return;
                } else {
                    int i11 = t2.C.f40822b;
                    u2.i.f("App event with no name parameter.");
                    return;
                }
            case 2:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                boolean equals = "1".equals(map.get("transparentBackground"));
                boolean equals2 = "1".equals(map.get("blur"));
                float f6 = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f6 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                } catch (NumberFormatException e9) {
                    int i12 = t2.C.f40822b;
                    u2.i.d("Fail to parse float", e9);
                }
                C3153ec c3153ec = (C3153ec) this.f27382u;
                synchronized (c3153ec) {
                    c3153ec.f30441a = equals;
                    c3153ec.f30444d.set(true);
                }
                synchronized (c3153ec) {
                    c3153ec.f30442b = equals2;
                    c3153ec.f30443c = f6;
                }
                interfaceC3858rh.v0((int) f6, equals);
                return;
            case 3:
                if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey(a.C0076a.f13061b) || TextUtils.isEmpty((CharSequence) map.get(a.C0076a.f13061b))) {
                    t2.C.k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
                    return;
                }
                try {
                    long parseLong = Long.parseLong((String) map.get("id"));
                    int parseInt = Integer.parseInt((String) map.get(a.C0076a.f13061b));
                    p2.j.f39798C.f39810k.getClass();
                    ((C3758po) this.f27382u).a(parseInt, parseLong, System.currentTimeMillis());
                    return;
                } catch (NumberFormatException e10) {
                    t2.C.l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e10);
                    return;
                }
            case 4:
                C3151ea c3151ea = AbstractC3368ia.Ia;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    C4637h c4637h3 = C4637h.i;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("request_origin", "inspector_ooct");
                    C4636g c4636g2 = new C4636g((C4635f) new C4635f(1).e(bundle2));
                    String str4 = (String) map.get("adUnitId");
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                    String str5 = (String) map.get("format");
                    String str6 = TextUtils.isEmpty(str5) ? "" : str5;
                    char c4 = 0;
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Ka)).booleanValue()) {
                        boolean z9 = map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1");
                        if (z9) {
                            C4686a c4686a = new C4686a(1);
                            if (map.containsKey("keywords")) {
                                Iterator it = b((String) map.get("keywords"), "keywords").iterator();
                                while (it.hasNext()) {
                                    ((q2.E0) c4686a.f37200u).f39918a.add((String) it.next());
                                }
                            }
                            c4686a.e(a(map));
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> keys = jSONObject.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        c4686a.d(next, jSONObject.getString(next));
                                    }
                                } catch (JSONException e11) {
                                    p2.j.f39798C.f39808h.d("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e11);
                                }
                            }
                            if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                                c4686a.h((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                c4686a.j(b((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((q2.E0) c4686a.f37200u).f39926j = (String) map.get("requestAgent");
                            }
                            if (map.containsKey("publisherProvidedId")) {
                                ((q2.E0) c4686a.f37200u).i = (String) map.get("publisherProvidedId");
                            }
                            if (map.containsKey("categoryExclusions")) {
                                Iterator it2 = b((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                                while (it2.hasNext()) {
                                    ((q2.E0) c4686a.f37200u).f39923f.add((String) it2.next());
                                }
                            }
                            c4636g = new C4687b(c4686a);
                        } else {
                            C4635f c4635f = new C4635f(1);
                            if (map.containsKey("keywords")) {
                                Iterator it3 = b((String) map.get("keywords"), "keywords").iterator();
                                while (it3.hasNext()) {
                                    ((q2.E0) c4635f.f37200u).f39918a.add((String) it3.next());
                                }
                            }
                            c4635f.e(a(map));
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> keys2 = jSONObject2.keys();
                                    while (keys2.hasNext()) {
                                        String next2 = keys2.next();
                                        c4635f.d(next2, jSONObject2.getString(next2));
                                    }
                                } catch (JSONException e12) {
                                    p2.j.f39798C.f39808h.d("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e12);
                                }
                            }
                            if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                                c4635f.h((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                c4635f.j(b((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((q2.E0) c4635f.f37200u).f39926j = (String) map.get("requestAgent");
                            }
                            c4636g = new C4636g(c4635f);
                        }
                        c4636g2 = c4636g;
                        String str7 = (String) map.get("width");
                        String str8 = (String) map.get("height");
                        if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str8)) {
                            c4637h2 = C4637h.i;
                        } else {
                            try {
                                c4637h = new C4637h(Integer.parseInt(str7), Integer.parseInt(str8));
                            } catch (NumberFormatException e13) {
                                p2.j.f39798C.f39808h.d("OutOfContextTestingGmsgHandler.generateAdSize", e13);
                                c4637h2 = C4637h.i;
                            }
                            if (!map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                                G2 g22 = new G2();
                                if (map.containsKey("startMuted")) {
                                    g22.f25091a = ((String) map.get("startMuted")).equals("1");
                                }
                                if (map.containsKey("customControlsRequested")) {
                                    g22.f25092b = ((String) map.get("customControlsRequested")).equals("1");
                                }
                                if (map.containsKey("clickToExpandRequested")) {
                                    g22.f25093c = ((String) map.get("clickToExpandRequested")).equals("1");
                                }
                                wVar = new k2.w(g22);
                            } else {
                                wVar = null;
                            }
                            if (!map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (wVar != null && str6.equals("NATIVE"))) {
                                C5273c c5273c2 = new C5273c();
                                if (map.containsKey("disableImageLoading")) {
                                    c5273c2.f42149a = ((String) map.get("disableImageLoading")).equals("1");
                                }
                                if (map.containsKey("mediaAspectRatio")) {
                                    String str9 = (String) map.get("mediaAspectRatio");
                                    if (!TextUtils.isEmpty(str9)) {
                                        try {
                                            c5273c2.f42150b = Integer.parseInt(str9);
                                        } catch (NumberFormatException e14) {
                                            p2.j.f39798C.f39808h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e14);
                                        }
                                    }
                                }
                                if (map.containsKey("shouldRequestMultipleImages")) {
                                    c5273c2.f42151c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                                }
                                if (map.containsKey("preferredAdChoicesPosition")) {
                                    String str10 = (String) map.get("preferredAdChoicesPosition");
                                    if (!TextUtils.isEmpty(str10)) {
                                        try {
                                            c5273c2.f42152d = Integer.parseInt(str10);
                                        } catch (NumberFormatException e15) {
                                            p2.j.f39798C.f39808h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e15);
                                        }
                                    }
                                }
                                if (map.containsKey("customMuteThisAdRequested")) {
                                    c5273c2.f42154f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                                }
                                if (wVar != null) {
                                    c5273c2.f42153e = wVar;
                                }
                                c5273c = new C5273c(c5273c2);
                                z8 = z9;
                            } else {
                                c5273c = null;
                                z8 = z9;
                            }
                        }
                        c4637h = c4637h2;
                        if (map.containsKey("clickToExpandRequested")) {
                        }
                        G2 g222 = new G2();
                        if (map.containsKey("startMuted")) {
                        }
                        if (map.containsKey("customControlsRequested")) {
                        }
                        if (map.containsKey("clickToExpandRequested")) {
                        }
                        wVar = new k2.w(g222);
                        if (map.containsKey("customMuteThisAdRequested")) {
                        }
                        C5273c c5273c22 = new C5273c();
                        if (map.containsKey("disableImageLoading")) {
                        }
                        if (map.containsKey("mediaAspectRatio")) {
                        }
                        if (map.containsKey("shouldRequestMultipleImages")) {
                        }
                        if (map.containsKey("preferredAdChoicesPosition")) {
                        }
                        if (map.containsKey("customMuteThisAdRequested")) {
                        }
                        if (wVar != null) {
                        }
                        c5273c = new C5273c(c5273c22);
                        z8 = z9;
                    } else {
                        c4637h = c4637h3;
                        c5273c = null;
                        wVar = null;
                        z8 = false;
                    }
                    String str11 = (String) map.get(NativeAdvancedJsUtils.f18064p);
                    if (TextUtils.isEmpty(str11) || TextUtils.isEmpty(str4)) {
                        return;
                    }
                    if (!str11.equals("load") || TextUtils.isEmpty(str6)) {
                        if (str11.equals("show")) {
                            BinderC2948ap binderC2948ap = (BinderC2948ap) this.f27382u;
                            synchronized (binderC2948ap) {
                                try {
                                    C2799To c2799To = binderC2948ap.f29326w;
                                    InterfaceC3858rh interfaceC3858rh2 = c2799To.f27834w;
                                    if (interfaceC3858rh2 != null && !interfaceC3858rh2.r0()) {
                                        activity = c2799To.f27834w.h();
                                        break;
                                    }
                                    HashMap hashMap = binderC2948ap.f29323n;
                                    Object obj2 = hashMap.get(str4);
                                    if (obj2 != null) {
                                        C3151ea c3151ea2 = AbstractC3368ia.Ja;
                                        q2.r rVar2 = q2.r.f40116e;
                                        if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                                            if (!(obj2 instanceof AbstractC4778b)) {
                                                if (!(obj2 instanceof AbstractC5123a)) {
                                                    if (!(obj2 instanceof F2.c)) {
                                                        if (obj2 instanceof G2.a) {
                                                        }
                                                        binderC2948ap.I3(BinderC2948ap.K3(obj2));
                                                        if (!(obj2 instanceof AbstractC4778b)) {
                                                            ((AbstractC4778b) obj2).c(activity);
                                                            return;
                                                        }
                                                        if (obj2 instanceof AbstractC5123a) {
                                                            ((AbstractC5123a) obj2).d(activity);
                                                            return;
                                                        }
                                                        if (obj2 instanceof F2.c) {
                                                            ((F2.c) obj2).d(activity, C3431jl.f32180O);
                                                            return;
                                                        }
                                                        if (obj2 instanceof G2.a) {
                                                            ((G2.a) obj2).b(activity, C3431jl.f32179N);
                                                            return;
                                                        }
                                                        if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue() && ((obj2 instanceof C4639j) || (obj2 instanceof NativeAd))) {
                                                            Intent intent = new Intent();
                                                            Context J32 = binderC2948ap.J3();
                                                            intent.setClassName(J32, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                                            intent.putExtra("adUnit", str4);
                                                            t2.G g9 = p2.j.f39798C.f39803c;
                                                            t2.G.s(J32, intent);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        hashMap.remove(str4);
                                        binderC2948ap.I3(BinderC2948ap.K3(obj2));
                                        if (!(obj2 instanceof AbstractC4778b)) {
                                        }
                                    }
                                    return;
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    BinderC2948ap binderC2948ap2 = (BinderC2948ap) this.f27382u;
                    synchronized (binderC2948ap2) {
                        try {
                            switch (str6.hashCode()) {
                                case -1999289321:
                                    if (str6.equals("NATIVE")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1372958932:
                                    if (str6.equals("INTERSTITIAL")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -428325382:
                                    if (str6.equals("APP_OPEN_AD")) {
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 543046670:
                                    if (str6.equals("REWARDED")) {
                                        c4 = 4;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1854800829:
                                    if (str6.equals("REWARDED_INTERSTITIAL")) {
                                        c4 = 5;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1951953708:
                                    if (str6.equals("BANNER")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            if (c4 == 0) {
                                AbstractC4778b.b(binderC2948ap2.J3(), str4, c4636g2, new C2816Uo(binderC2948ap2, str4));
                                return;
                            }
                            if (c4 == 1) {
                                C3151ea c3151ea3 = AbstractC3368ia.Ka;
                                q2.r rVar3 = q2.r.f40116e;
                                AbstractC4641l c4688c = (((Boolean) rVar3.f40119c.a(c3151ea3)).booleanValue() && z8) ? new C4688c(binderC2948ap2.J3()) : new C4639j(binderC2948ap2.J3());
                                c4688c.setAdSize(c4637h);
                                c4688c.setAdUnitId(str4);
                                c4688c.setAdListener(new C2833Vo(binderC2948ap2, str4, c4688c));
                                if (((Boolean) rVar3.f40119c.a(c3151ea3)).booleanValue() && z8 && wVar != null) {
                                    ((C4688c) c4688c).setVideoOptions(wVar);
                                }
                                c4688c.b(c4636g2);
                                return;
                            }
                            if (c4 == 2) {
                                AbstractC5123a.b(binderC2948ap2.J3(), str4, c4636g2, new C2850Wo(binderC2948ap2, str4));
                            } else {
                                if (c4 == 3) {
                                    C4633d c4633d = new C4633d(binderC2948ap2.J3(), str4);
                                    c4633d.b(new C2593Hm(i, binderC2948ap2, str4));
                                    c4633d.c(new C2901Zo(binderC2948ap2));
                                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ka)).booleanValue() && c5273c != null) {
                                        c4633d.d(c5273c);
                                    }
                                    c4633d.a().a(c4636g2.f38704a);
                                    return;
                                }
                                if (c4 == 4) {
                                    F2.c.b(binderC2948ap2.J3(), str4, c4636g2, new C2867Xo(binderC2948ap2, str4));
                                    return;
                                } else if (c4 == 5) {
                                    G2.a.a(binderC2948ap2.J3(), str4, c4636g2, new C2884Yo(binderC2948ap2, str4));
                                    return;
                                }
                            }
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 5:
                String str12 = (String) map.get(NativeAdvancedJsUtils.f18064p);
                boolean equals3 = "grant".equals(str12);
                C2575Gl c2575Gl = (C2575Gl) this.f27382u;
                if (!equals3) {
                    if ("video_start".equals(str12)) {
                        c2575Gl.a();
                        return;
                    } else {
                        if ("video_complete".equals(str12)) {
                            c2575Gl.x();
                            return;
                        }
                        return;
                    }
                }
                try {
                    int parseInt2 = Integer.parseInt((String) map.get("amount"));
                    String str13 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str13)) {
                        c2938af = new C2938af(str13, parseInt2);
                    }
                } catch (NumberFormatException e16) {
                    int i13 = t2.C.f40822b;
                    u2.i.g("Unable to parse reward amount.", e16);
                }
                c2575Gl.F(c2938af);
                return;
            case 6:
                if (!map.containsKey(com.anythink.basead.exoplayer.k.o.f8603c) || TextUtils.isEmpty((CharSequence) map.get(com.anythink.basead.exoplayer.k.o.f8603c))) {
                    return;
                }
                t2.C.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get(com.anythink.basead.exoplayer.k.o.f8603c))));
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) map.get(com.anythink.basead.exoplayer.k.o.f8603c));
                if (map.containsKey("title")) {
                    intent2.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    t2.G g10 = p2.j.f39798C.f39803c;
                    t2.G.s((Context) this.f27382u, intent2);
                    return;
                } catch (RuntimeException e17) {
                    u2.i.g("Failed to open Share Sheet", e17);
                    p2.j.f39798C.f39808h.d("ShareSheetGmsgHandler.onGmsg", e17);
                    return;
                }
            case 7:
                String str14 = (String) map.get(NativeAdvancedJsUtils.f18064p);
                if (str14 == null) {
                    int i14 = t2.C.f40822b;
                    u2.i.f("Action missing from video GMSG.");
                    return;
                }
                if (str14.equals("src")) {
                    String str15 = (String) map.get("src");
                    if (str15 == null) {
                        int i15 = t2.C.f40822b;
                        u2.i.f("src missing from video GMSG.");
                        return;
                    }
                    Rx rx = (Rx) this.f27382u;
                    rx.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("mediaUrl", str15);
                    ((C3320hg) rx.f27448u).a(bundle3);
                    return;
                }
                return;
            case 8:
                if (map != null) {
                    String str16 = (String) map.get("height");
                    if (TextUtils.isEmpty(str16)) {
                        return;
                    }
                    try {
                        int parseInt3 = Integer.parseInt(str16);
                        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = (ViewTreeObserverOnGlobalLayoutListenerC2520Dh) this.f27382u;
                        synchronized (viewTreeObserverOnGlobalLayoutListenerC2520Dh) {
                            try {
                                if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24494q0 != parseInt3) {
                                    viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24494q0 = parseInt3;
                                    viewTreeObserverOnGlobalLayoutListenerC2520Dh.requestLayout();
                                }
                            } finally {
                            }
                        }
                        return;
                    } catch (Exception e18) {
                        int i16 = t2.C.f40822b;
                        u2.i.g("Exception occurred while getting webview content height", e18);
                        return;
                    }
                }
                return;
            default:
                ((C2661Lm) this.f27382u).f26212b.d(map);
                return;
        }
    }
}
