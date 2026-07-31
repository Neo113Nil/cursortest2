package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.za;
import com.ironsource.C4834q2;
import com.ironsource.X3;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class le {
    public final i2 a;

    public le(i2 base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.a = base64Wrapper;
    }

    public final String a(c0 c0Var) {
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            return "true";
        }
        if (Intrinsics.areEqual(c0Var, c0.c.g) || Intrinsics.areEqual(c0Var, c0.a.g)) {
            return "false";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d c(List list) {
        d dVar = (d) CollectionsKt.firstOrNull(list);
        if (dVar != null) {
            return dVar;
        }
        return new d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final za.a c(JSONObject jSONObject) {
        return new za.a(jSONObject.optDouble("w"), jSONObject.optDouble("h"));
    }

    public final c d(JSONObject jSONObject) {
        List<JSONObject> asList;
        b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("seatbid");
        b bVar2 = new b(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (optJSONArray != null && (asList = q8.asList(optJSONArray)) != null) {
            for (JSONObject jSONObject2 : asList) {
                String optString = jSONObject2.optString("seat");
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("bid");
                if (optJSONArray2 != null) {
                    Intrinsics.checkNotNull(optJSONArray2);
                    List<JSONObject> asList2 = q8.asList(optJSONArray2);
                    if (asList2 != null) {
                        for (JSONObject jSONObject3 : asList2) {
                            JSONObject optJSONObject = jSONObject3.optJSONObject("ext");
                            if (optJSONObject != null) {
                                Intrinsics.checkNotNull(optJSONObject);
                                bVar = a(optJSONObject);
                                u1 a2 = a(bVar.l());
                                if (a2 != null) {
                                    arrayList.add(a2);
                                }
                            } else {
                                bVar = bVar2;
                            }
                            arrayList2.add(a(jSONObject3, bVar));
                            bVar2 = bVar;
                        }
                    }
                }
                Intrinsics.checkNotNull(optString);
                arrayList3.add(new d(optString, arrayList2));
            }
        }
        return a(jSONObject, arrayList3, arrayList);
    }

    public final void a(Map map, a aVar, c0 c0Var) {
        map.put("{% encoding %}", "base64");
        map.put("{% adm %}", aVar.a());
        map.put("{{ ad_type }}", b(c0Var));
        map.put("{{ show_close_button }}", a(c0Var));
        map.put("{{ preroll_popup }}", "false");
        map.put("{{ post_video_reward_toaster_enabled }}", "false");
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            map.put("{% is_banner %}", "true");
        }
    }

    public final za b(JSONObject jSONObject) {
        za.a c2;
        za.a c3;
        za.a c4;
        String optString = jSONObject.optString("imageurl");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = jSONObject.optString("clickthroughurl");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        za.b a2 = za.b.c.a(jSONObject.optInt(X3.i.L));
        JSONObject optJSONObject = jSONObject.optJSONObject(VastAttributes.MARGIN);
        za.a aVar = (optJSONObject == null || (c4 = c(optJSONObject)) == null) ? new za.a(0.0d, 0.0d, 3, null) : c4;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(VastAttributes.PADDING);
        za.a aVar2 = (optJSONObject2 == null || (c3 = c(optJSONObject2)) == null) ? new za.a(0.0d, 0.0d, 3, null) : c3;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("size");
        return new za(optString, optString2, a2, aVar, aVar2, (optJSONObject3 == null || (c2 = c(optJSONObject3)) == null) ? new za.a(0.0d, 0.0d, 3, null) : c2);
    }

    public static final class c {
        public String a;
        public String b;
        public String c;
        public String d;
        public List e;
        public List f;

        public c(String id, String nbr, String currency, String bidId, List seatbidList, List assets) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(nbr, "nbr");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(bidId, "bidId");
            Intrinsics.checkNotNullParameter(seatbidList, "seatbidList");
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.a = id;
            this.b = nbr;
            this.c = currency;
            this.d = bidId;
            this.e = seatbidList;
            this.f = assets;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d) && Intrinsics.areEqual(this.e, cVar.e) && Intrinsics.areEqual(this.f, cVar.f);
        }

        public int hashCode() {
            return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "OpenRTBModel(id=" + this.a + ", nbr=" + this.b + ", currency=" + this.c + ", bidId=" + this.d + ", seatbidList=" + this.e + ", assets=" + this.f + ")";
        }

        public final List c() {
            return this.e;
        }

        public final List a() {
            return this.f;
        }

        public final Map b() {
            List list = this.f;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((u1) obj).b, obj);
            }
            return MapsKt.toMutableMap(linkedHashMap);
        }
    }

    public static final class a {
        public final String a;
        public final String b;
        public final double c;
        public final String d;
        public final String e;
        public final String f;
        public final int g;
        public final b h;

        public a(String id, String impid, double d, String burl, String crid, String adm, int i, b ext) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(impid, "impid");
            Intrinsics.checkNotNullParameter(burl, "burl");
            Intrinsics.checkNotNullParameter(crid, "crid");
            Intrinsics.checkNotNullParameter(adm, "adm");
            Intrinsics.checkNotNullParameter(ext, "ext");
            this.a = id;
            this.b = impid;
            this.c = d;
            this.d = burl;
            this.e = crid;
            this.f = adm;
            this.g = i;
            this.h = ext;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Double.compare(this.c, aVar.c) == 0 && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && this.g == aVar.g && Intrinsics.areEqual(this.h, aVar.h);
        }

        public int hashCode() {
            return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Double.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.g)) * 31) + this.h.hashCode();
        }

        public String toString() {
            return "BidModel(id=" + this.a + ", impid=" + this.b + ", price=" + this.c + ", burl=" + this.d + ", crid=" + this.e + ", adm=" + this.f + ", mtype=" + this.g + ", ext=" + this.h + ")";
        }

        public final String a() {
            return this.f;
        }

        public final int c() {
            return this.g;
        }

        public final b b() {
            return this.h;
        }

        public /* synthetic */ a(String str, String str2, double d, String str3, String str4, String str5, int i, b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? new b(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null) : bVar);
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final List g;
        public final String h;
        public final int i;
        public final String j;
        public final za k;
        public final eg l;
        public final List m;

        public b(String impressionid, String crtype, String adId, String cgn, String template, String videoUrl, List imptrackers, String params, int i, String baseUrl, za infoIcon, eg renderEngine, List scripts) {
            Intrinsics.checkNotNullParameter(impressionid, "impressionid");
            Intrinsics.checkNotNullParameter(crtype, "crtype");
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(cgn, "cgn");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            Intrinsics.checkNotNullParameter(imptrackers, "imptrackers");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
            Intrinsics.checkNotNullParameter(renderEngine, "renderEngine");
            Intrinsics.checkNotNullParameter(scripts, "scripts");
            this.a = impressionid;
            this.b = crtype;
            this.c = adId;
            this.d = cgn;
            this.e = template;
            this.f = videoUrl;
            this.g = imptrackers;
            this.h = params;
            this.i = i;
            this.j = baseUrl;
            this.k = infoIcon;
            this.l = renderEngine;
            this.m = scripts;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual(this.d, bVar.d) && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f) && Intrinsics.areEqual(this.g, bVar.g) && Intrinsics.areEqual(this.h, bVar.h) && this.i == bVar.i && Intrinsics.areEqual(this.j, bVar.j) && Intrinsics.areEqual(this.k, bVar.k) && this.l == bVar.l && Intrinsics.areEqual(this.m, bVar.m);
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + Integer.hashCode(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
        }

        public String toString() {
            return "ExtensionModel(impressionid=" + this.a + ", crtype=" + this.b + ", adId=" + this.c + ", cgn=" + this.d + ", template=" + this.e + ", videoUrl=" + this.f + ", imptrackers=" + this.g + ", params=" + this.h + ", clkp=" + this.i + ", baseUrl=" + this.j + ", infoIcon=" + this.k + ", renderEngine=" + this.l + ", scripts=" + this.m + ")";
        }

        public final String f() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public final String a() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final String l() {
            return this.e;
        }

        public final String m() {
            return this.f;
        }

        public final List g() {
            return this.g;
        }

        public final String i() {
            return this.h;
        }

        public final int d() {
            return this.i;
        }

        public final String b() {
            return this.j;
        }

        public final za h() {
            return this.k;
        }

        public final eg j() {
            return this.l;
        }

        public final List k() {
            return this.m;
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, int i, String str8, za zaVar, eg egVar, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list, (i2 & 128) == 0 ? str7 : "", (i2 & 256) != 0 ? m4.d.b() : i, (i2 & 512) != 0 ? "https://live.chartboost.com" : str8, (i2 & 1024) != 0 ? new za(null, null, null, null, null, null, 63, null) : zaVar, (i2 & 2048) != 0 ? eg.g : egVar, (i2 & 4096) != 0 ? CollectionsKt.emptyList() : list2);
        }
    }

    public static final class d {
        public final String a;
        public final List b;

        public d(String seat, List bidList) {
            Intrinsics.checkNotNullParameter(seat, "seat");
            Intrinsics.checkNotNullParameter(bidList, "bidList");
            this.a = seat;
            this.b = bidList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "SeatbidModel(seat=" + this.a + ", bidList=" + this.b + ")";
        }

        public final List a() {
            return this.b;
        }

        public /* synthetic */ d(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    public final String b(c0 c0Var) {
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            return "10";
        }
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            return "8";
        }
        if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            return "9";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final b a(JSONObject jSONObject) {
        List emptyList;
        za zaVar;
        List emptyList2;
        String optString = jSONObject.optString("impressionid");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = jSONObject.optString("crtype");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        String optString3 = jSONObject.optString("adId");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        String optString4 = jSONObject.optString("cgn");
        Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
        String string = jSONObject.getString("template");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String optString5 = jSONObject.optString(UnifiedMediationParams.KEY_VIDEO_URL);
        Intrinsics.checkNotNullExpressionValue(optString5, "optString(...)");
        JSONArray optJSONArray = jSONObject.optJSONArray("imptrackers");
        if (optJSONArray == null || (emptyList = q8.asList(optJSONArray)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        String optString6 = jSONObject.optString("params");
        Intrinsics.checkNotNullExpressionValue(optString6, "optString(...)");
        int optInt = jSONObject.optInt("clkp");
        String optString7 = jSONObject.optString("baseurl");
        Intrinsics.checkNotNullExpressionValue(optString7, "optString(...)");
        JSONObject optJSONObject = jSONObject.optJSONObject("infoicon");
        if (optJSONObject == null || (zaVar = b(optJSONObject)) == null) {
            zaVar = new za(null, null, null, null, null, null, 63, null);
        }
        za zaVar2 = zaVar;
        eg a2 = eg.c.a(jSONObject.optString("renderingengine"));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("scripts");
        if (optJSONArray2 == null || (emptyList2 = q8.asList(optJSONArray2)) == null) {
            emptyList2 = CollectionsKt.emptyList();
        }
        return new b(optString, optString2, optString3, optString4, string, optString5, list, optString6, optInt, optString7, zaVar2, a2, emptyList2);
    }

    public final a b(List list) {
        a aVar = (a) CollectionsKt.firstOrNull(list);
        if (aVar != null) {
            return aVar;
        }
        return new a(null, null, 0.0d, null, null, null, 0, null, 255, null);
    }

    public final u1 a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String substring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return new u1("html", substring, str);
    }

    public final u1 a(List list) {
        u1 u1Var = (u1) CollectionsKt.firstOrNull(list);
        return u1Var == null ? new u1("", "", "") : u1Var;
    }

    public final d0 a(c0 adType, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        if (jSONObject != null) {
            c d2 = d(jSONObject);
            a b2 = b(c(d2.c()).a());
            b b3 = b2.b();
            u1 a2 = a(d2.a());
            Map b4 = d2.b();
            b4.put("body", a2);
            String m = b3.m();
            String a3 = n0.a(m);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("imptrackers", b3.g());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            a(linkedHashMap2, b2, adType);
            return new d0("", b3.a(), b3.b(), b3.f(), b3.h(), b3.c(), "", b3.e(), b4, m, a3, "", "", "", 0, "", "dummy_template", a2, linkedHashMap2, b3.j(), b3.k(), linkedHashMap, b2.a(), b3.i(), n0.a(b2.c()), m4.c.a(b3.d()), this.a.b(b2.a()));
        }
        throw new JSONException("Missing response");
    }

    public final a a(JSONObject jSONObject, b bVar) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString(POBConstants.KEY_IMPRESSION_ID);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        double d2 = jSONObject.getDouble("price");
        String optString = jSONObject.optString(C4834q2.y);
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = jSONObject.optString("crid");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        String optString3 = jSONObject.optString("adm");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        return new a(string, string2, d2, optString, optString2, optString3, jSONObject.optInt("mtype"), bVar);
    }

    public final c a(JSONObject jSONObject, List list, List list2) {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String optString = jSONObject.optString("nbr");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = jSONObject.optString(BidResponsed.KEY_CUR, "USD");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        String optString3 = jSONObject.optString("bidid");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        return new c(string, optString, optString2, optString3, list, list2);
    }
}
