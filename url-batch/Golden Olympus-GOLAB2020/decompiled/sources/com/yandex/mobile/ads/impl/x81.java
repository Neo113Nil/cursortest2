package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final er0 f34487a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2186qg f34488b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f82 f34489c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final vj0 f34490d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final v20 f34491e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final u00 f34492f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final q91 f34493g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final vx1 f34494h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ku0 f34495i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2180qa f34496j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x81(Context context, mp1 mp1Var) {
        this(context, mp1Var, r3, new C2186qg(context, mp1Var, r3, 8), new f82(), new vj0(), new v20(mp1Var), new u00(), new q91(), new vx1(), new ku0(), new C2180qa(mp1Var));
        er0 er0Var = new er0(mp1Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final n61 a(@NotNull String response, @NotNull InterfaceC1906ej interfaceC1906ej) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject jsonAsset;
        String str7;
        String str8;
        Iterator<String> it;
        String str9;
        String str10;
        String str11;
        List list;
        String str12;
        JSONArray jSONArray;
        int i4;
        String str13;
        C2266u5 c2266u5;
        EnumC2289v5 enumC2289v5;
        jz1 jz1Var;
        lz1 lz1Var;
        String string;
        zq1 zq1Var;
        Iterator<String> it2;
        zq1 zq1Var2;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        HashSet hashSet;
        String str20;
        String jsonAttribute;
        String str21;
        String string2;
        uy1 uy1Var;
        Iterator<String> it3;
        InterfaceC1906ej base64EncodingParameters = interfaceC1906ej;
        String str22 = "ad_pod";
        String str23 = "ImpressionDataParser";
        String str24 = "Json has not required attributes";
        String str25 = "attributeName";
        String str26 = "id";
        String str27 = "";
        Intrinsics.checkNotNullParameter(response, "response");
        String str28 = "base64EncodingParameters";
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        JSONObject jsonResponse = new JSONObject(response);
        Intrinsics.checkNotNullParameter(jsonResponse, "jsonResponse");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        JSONObject jsonAsset2 = jsonResponse.getJSONObject("native");
        Intrinsics.checkNotNull(jsonAsset2);
        String str29 = "ads";
        String str30 = "Native Ad json has not required attributes";
        if (!y81.a(jsonAsset2, "ads")) {
            throw new i61("Native Ad json has not required attributes");
        }
        List emptyList = CollectionsKt.emptyList();
        List emptyList2 = CollectionsKt.emptyList();
        List emptyList3 = CollectionsKt.emptyList();
        List emptyList4 = CollectionsKt.emptyList();
        List emptyList5 = CollectionsKt.emptyList();
        Iterator<String> keys = jsonAsset2.keys();
        String str31 = "keys(...)";
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        List list2 = emptyList2;
        List list3 = emptyList;
        List list4 = emptyList4;
        List list5 = emptyList5;
        List list6 = emptyList3;
        C1795a4 c1795a4 = null;
        String str32 = null;
        nx1 nx1Var = null;
        C2106n5 c2106n5 = null;
        while (keys.hasNext()) {
            String jsonAttribute2 = keys.next();
            if (jsonAttribute2 != null) {
                it = keys;
                String str33 = "assets";
                str = str22;
                String str34 = "showNotices";
                String str35 = "renderTrackingUrls";
                String str36 = str23;
                String str37 = "jsonObject";
                String str38 = str24;
                String str39 = str25;
                String jsonAttribute3 = "impressionData";
                str4 = str26;
                switch (jsonAttribute2.hashCode()) {
                    case -1777460514:
                        str6 = str28;
                        jsonAsset = jsonAsset2;
                        str7 = str29;
                        str8 = str30;
                        str9 = str31;
                        str3 = str39;
                        str2 = str38;
                        str5 = str27;
                        str10 = str36;
                        if (jsonAttribute2.equals(str34)) {
                            ArrayList arrayList = new ArrayList();
                            JSONArray jSONArray2 = jsonAsset.getJSONArray(str34);
                            int length = jSONArray2.length();
                            for (int i5 = 0; i5 < length; i5++) {
                                JSONObject jSONObject = jSONArray2.getJSONObject(i5);
                                Intrinsics.checkNotNull(jSONObject);
                                arrayList.add(a(jSONObject));
                            }
                            keys = it;
                            base64EncodingParameters = interfaceC1906ej;
                            list5 = arrayList;
                            str23 = str10;
                            str30 = str8;
                            str25 = str3;
                            str22 = str;
                            str27 = str5;
                            str24 = str2;
                            str26 = str4;
                            str29 = str7;
                            str31 = str9;
                            jsonAsset2 = jsonAsset;
                            str28 = str6;
                        }
                        break;
                    case -1422646231:
                        str6 = str28;
                        jsonAsset = jsonAsset2;
                        str7 = str29;
                        str8 = str30;
                        str9 = str31;
                        String str40 = str;
                        str11 = str38;
                        str3 = str39;
                        str5 = str27;
                        str10 = str36;
                        if (!jsonAttribute2.equals(str40)) {
                            str = str40;
                            str2 = str11;
                            break;
                        } else {
                            JSONObject adPod = jsonAsset.getJSONObject(str40);
                            Intrinsics.checkNotNull(adPod);
                            Intrinsics.checkNotNullParameter(adPod, "adPod");
                            JSONArray jsonArray = adPod.optJSONArray(FirebaseAnalytics.Param.ITEMS);
                            if (jsonArray != null) {
                                Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
                                int length2 = jsonArray.length();
                                ArrayList arrayList2 = new ArrayList(length2);
                                int i6 = 0;
                                while (i6 < length2) {
                                    JSONObject optJSONObject = jsonArray.optJSONObject(i6);
                                    Intrinsics.checkNotNull(optJSONObject);
                                    String str41 = str40;
                                    long optLong = optJSONObject.optLong(IronSourceConstants.EVENTS_DURATION);
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("skip");
                                    if (optJSONObject2 != null) {
                                        Intrinsics.checkNotNullParameter(optJSONObject2, str37);
                                        str12 = str37;
                                        String optString = optJSONObject2.optString("transition_strategy");
                                        jSONArray = jsonArray;
                                        jz1[] values = jz1.values();
                                        i4 = length2;
                                        int length3 = values.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 < length3) {
                                                jz1 jz1Var2 = values[i7];
                                                int i8 = i7;
                                                if (Intrinsics.areEqual(jz1Var2.a(), optString)) {
                                                    jz1Var = jz1Var2;
                                                } else {
                                                    i7 = i8 + 1;
                                                }
                                            } else {
                                                jz1Var = null;
                                            }
                                        }
                                        String optString2 = optJSONObject2.optString("visibility");
                                        lz1[] values2 = lz1.values();
                                        str13 = str11;
                                        int length4 = values2.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < length4) {
                                                lz1 lz1Var2 = values2[i9];
                                                int i10 = i9;
                                                if (Intrinsics.areEqual(lz1Var2.a(), optString2)) {
                                                    lz1Var = lz1Var2;
                                                } else {
                                                    i9 = i10 + 1;
                                                }
                                            } else {
                                                lz1Var = null;
                                            }
                                        }
                                        c2266u5 = new C2266u5(jz1Var, lz1Var, optJSONObject2.optLong("delay"));
                                    } else {
                                        str12 = str37;
                                        jSONArray = jsonArray;
                                        i4 = length2;
                                        str13 = str11;
                                        c2266u5 = null;
                                    }
                                    String optString3 = optJSONObject.optString("transition_policy");
                                    EnumC2289v5[] values3 = EnumC2289v5.values();
                                    int length5 = values3.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length5) {
                                            enumC2289v5 = values3[i11];
                                            EnumC2289v5[] enumC2289v5Arr = values3;
                                            if (Intrinsics.areEqual(enumC2289v5.a(), optString3)) {
                                                break;
                                            }
                                            i11++;
                                            values3 = enumC2289v5Arr;
                                        } else {
                                            enumC2289v5 = null;
                                        }
                                    }
                                    arrayList2.add(new C2243t5(optLong, c2266u5, enumC2289v5));
                                    i6++;
                                    str40 = str41;
                                    str37 = str12;
                                    jsonArray = jSONArray;
                                    length2 = i4;
                                    str11 = str13;
                                }
                                str = str40;
                                str2 = str11;
                                list = arrayList2;
                            } else {
                                str = str40;
                                str2 = str11;
                                list = CollectionsKt.emptyList();
                            }
                            keys = it;
                            base64EncodingParameters = interfaceC1906ej;
                            c2106n5 = new C2106n5(adPod.optInt("closable_ad_position"), adPod.optInt("reward_ad_position", kotlin.ranges.g.d(CollectionsKt.getLastIndex(list), 0)), list);
                            str23 = str10;
                            str30 = str8;
                            str25 = str3;
                            str22 = str;
                            str27 = str5;
                            str24 = str2;
                            str26 = str4;
                            str29 = str7;
                            str31 = str9;
                            jsonAsset2 = jsonAsset;
                            str28 = str6;
                        }
                        break;
                    case -1408207997:
                        str6 = str28;
                        jsonAsset = jsonAsset2;
                        str7 = str29;
                        str8 = str30;
                        str9 = str31;
                        str11 = str38;
                        str3 = str39;
                        str5 = str27;
                        str10 = str36;
                        if (jsonAttribute2.equals("assets")) {
                            list3 = this.f34488b.a(jsonAsset, base64EncodingParameters);
                            keys = it;
                            str24 = str11;
                            str23 = str10;
                            str30 = str8;
                            str25 = str3;
                            str22 = str;
                            str27 = str5;
                            str26 = str4;
                            str29 = str7;
                            str31 = str9;
                            jsonAsset2 = jsonAsset;
                            str28 = str6;
                        }
                        str2 = str11;
                        break;
                    case -113850029:
                        str6 = str28;
                        JSONObject jSONObject2 = jsonAsset2;
                        str7 = str29;
                        str8 = str30;
                        str9 = str31;
                        str11 = str38;
                        str3 = str39;
                        str5 = str27;
                        str10 = str36;
                        if (!jsonAttribute2.equals(jsonAttribute3)) {
                            str2 = str11;
                            jsonAsset = jSONObject2;
                            break;
                        } else {
                            this.f34490d.getClass();
                            jsonAsset = jSONObject2;
                            Intrinsics.checkNotNullParameter(jsonAsset, "jsonObject");
                            Intrinsics.checkNotNullParameter(jsonAttribute3, str3);
                            try {
                                int i12 = dq0.f24735b;
                                Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
                                Intrinsics.checkNotNullParameter(jsonAttribute3, "jsonAttribute");
                                string = jsonAsset.getString(jsonAttribute3);
                                Intrinsics.checkNotNull(string);
                            } catch (Exception e4) {
                                Log.e(str10, String.valueOf(e4.getMessage()));
                                keys = it;
                                str24 = str11;
                                str23 = str10;
                                str30 = str8;
                                str25 = str3;
                                str22 = str;
                                c1795a4 = null;
                            }
                            if (string.length() == 0 || Intrinsics.areEqual("null", string)) {
                                throw new JSONException(str11);
                                break;
                            } else {
                                keys = it;
                                c1795a4 = new C1795a4(string);
                                str24 = str11;
                                str23 = str10;
                                str30 = str8;
                                str25 = str3;
                                str22 = str;
                                str27 = str5;
                                str26 = str4;
                                str29 = str7;
                                str31 = str9;
                                jsonAsset2 = jsonAsset;
                                str28 = str6;
                            }
                        }
                        break;
                    case 96432:
                        if (jsonAttribute2.equals(str29)) {
                            ArrayList arrayList3 = new ArrayList();
                            String str42 = str30;
                            JSONArray jSONArray3 = jsonAsset2.getJSONArray(str29);
                            String str43 = str29;
                            int length6 = jSONArray3.length();
                            JSONObject jSONObject3 = jsonAsset2;
                            int i13 = 0;
                            while (i13 < length6) {
                                int i14 = length6;
                                JSONObject jsonAsset3 = jSONArray3.getJSONObject(i13);
                                Intrinsics.checkNotNull(jsonAsset3);
                                Intrinsics.checkNotNullParameter(jsonAsset3, "jsonNativeAd");
                                Intrinsics.checkNotNullParameter(base64EncodingParameters, str28);
                                String str44 = str28;
                                int i15 = i13;
                                String str45 = "link";
                                JSONArray jSONArray4 = jSONArray3;
                                if (!y81.a(jsonAsset3, "adType", str33, "link")) {
                                    throw new i61(str42);
                                }
                                this.f34493g.getClass();
                                Intrinsics.checkNotNullParameter(jsonAsset3, "jsonNativeAd");
                                Intrinsics.checkNotNullParameter(jsonAsset3, "jsonAsset");
                                Intrinsics.checkNotNullParameter("adType", "jsonAttribute");
                                String optString4 = jsonAsset3.optString("adType");
                                if (optString4 == null || optString4.length() == 0 || Intrinsics.areEqual(optString4, "null")) {
                                    throw new i61(str42);
                                }
                                Intrinsics.checkNotNull(optString4);
                                zq1[] values4 = zq1.values();
                                int length7 = values4.length;
                                int i16 = 0;
                                while (true) {
                                    if (i16 < length7) {
                                        zq1 zq1Var3 = values4[i16];
                                        int i17 = i16;
                                        if (Intrinsics.areEqual(zq1Var3.a(), optString4)) {
                                            zq1Var = zq1Var3;
                                        } else {
                                            i16 = i17 + 1;
                                        }
                                    } else {
                                        zq1Var = null;
                                    }
                                }
                                if (zq1Var == null) {
                                    throw new i61(str42);
                                }
                                ArrayList a4 = this.f34488b.a(jsonAsset3, base64EncodingParameters);
                                HashSet hashSet2 = new HashSet();
                                String str46 = str33;
                                HashSet hashSet3 = new HashSet();
                                ArrayList arrayList4 = arrayList3;
                                Iterator<String> keys2 = jsonAsset3.keys();
                                Intrinsics.checkNotNullExpressionValue(keys2, str31);
                                String str47 = null;
                                String str48 = null;
                                dr0 dr0Var = null;
                                C1795a4 c1795a42 = null;
                                xa0 xa0Var = null;
                                xa0 xa0Var2 = null;
                                C2157pa c2157pa = null;
                                while (keys2.hasNext()) {
                                    String next = keys2.next();
                                    if (next != null) {
                                        switch (next.hashCode()) {
                                            case -1798519398:
                                                it2 = keys2;
                                                zq1Var2 = zq1Var;
                                                str14 = str31;
                                                str15 = str35;
                                                str16 = str38;
                                                str20 = str39;
                                                jsonAttribute = jsonAttribute3;
                                                str18 = str27;
                                                str17 = str34;
                                                str21 = str36;
                                                str19 = str45;
                                                hashSet = hashSet2;
                                                if (next.equals("hideConditions")) {
                                                    uq uqVar = new uq();
                                                    Intrinsics.checkNotNull(next);
                                                    xa0Var = uqVar.a(next, jsonAsset3);
                                                }
                                                jsonAttribute3 = jsonAttribute;
                                                hashSet2 = hashSet;
                                                str45 = str19;
                                                str34 = str17;
                                                zq1Var = zq1Var2;
                                                str31 = str14;
                                                str36 = str21;
                                                str39 = str20;
                                                str27 = str18;
                                                str35 = str15;
                                                str38 = str16;
                                                keys2 = it2;
                                            case -1777460514:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                str16 = str38;
                                                str20 = str39;
                                                jsonAttribute = jsonAttribute3;
                                                str18 = str27;
                                                str21 = str36;
                                                str19 = str45;
                                                String str49 = str34;
                                                if (next.equals(str49)) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    zq1Var2 = zq1Var;
                                                    JSONArray jSONArray5 = jsonAsset3.getJSONArray(str49);
                                                    hashSet = hashSet2;
                                                    int length8 = jSONArray5.length();
                                                    str17 = str49;
                                                    int i18 = 0;
                                                    while (i18 < length8) {
                                                        int i19 = length8;
                                                        JSONObject jSONObject4 = jSONArray5.getJSONObject(i18);
                                                        Intrinsics.checkNotNull(jSONObject4);
                                                        arrayList5.add(a(jSONObject4));
                                                        i18++;
                                                        length8 = i19;
                                                    }
                                                    hashSet3.addAll(arrayList5);
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                } else {
                                                    zq1Var2 = zq1Var;
                                                    str17 = str49;
                                                    hashSet = hashSet2;
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                }
                                            case -974297739:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                str16 = str38;
                                                str20 = str39;
                                                jsonAttribute = jsonAttribute3;
                                                str18 = str27;
                                                str21 = str36;
                                                str19 = str45;
                                                if (next.equals("additionalInfo")) {
                                                    c2157pa = this.f34496j.a(jsonAsset3, zq1Var);
                                                    jsonAttribute3 = jsonAttribute;
                                                    str39 = str20;
                                                    str45 = str19;
                                                    str31 = str14;
                                                    str35 = str15;
                                                    str36 = str21;
                                                    str27 = str18;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                } else {
                                                    zq1Var2 = zq1Var;
                                                    str17 = str34;
                                                    hashSet = hashSet2;
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                }
                                            case -113850029:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                jsonAttribute = jsonAttribute3;
                                                String str50 = str4;
                                                if (next.equals(jsonAttribute)) {
                                                    this.f34490d.getClass();
                                                    Intrinsics.checkNotNullParameter(jsonAsset3, "jsonObject");
                                                    String str51 = str39;
                                                    Intrinsics.checkNotNullParameter(jsonAttribute, str51);
                                                    try {
                                                        int i20 = dq0.f24735b;
                                                        Intrinsics.checkNotNullParameter(jsonAsset3, "jsonAsset");
                                                        Intrinsics.checkNotNullParameter(jsonAttribute, "jsonAttribute");
                                                        string2 = jsonAsset3.getString(jsonAttribute);
                                                        Intrinsics.checkNotNull(string2);
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        str4 = str50;
                                                    }
                                                    if (string2.length() == 0 || Intrinsics.areEqual("null", string2)) {
                                                        str4 = str50;
                                                        str16 = str38;
                                                        try {
                                                            throw new JSONException(str16);
                                                            break;
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            Log.e(str36, String.valueOf(e.getMessage()));
                                                            jsonAttribute3 = jsonAttribute;
                                                            str39 = str51;
                                                            c1795a42 = null;
                                                            str27 = str27;
                                                            str31 = str14;
                                                            str35 = str15;
                                                            str38 = str16;
                                                            keys2 = it2;
                                                        }
                                                    } else {
                                                        str4 = str50;
                                                        try {
                                                            c1795a42 = new C1795a4(string2);
                                                            jsonAttribute3 = jsonAttribute;
                                                            str39 = str51;
                                                            keys2 = it2;
                                                            str31 = str14;
                                                            str35 = str15;
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            str16 = str38;
                                                            Log.e(str36, String.valueOf(e.getMessage()));
                                                            jsonAttribute3 = jsonAttribute;
                                                            str39 = str51;
                                                            c1795a42 = null;
                                                            str27 = str27;
                                                            str31 = str14;
                                                            str35 = str15;
                                                            str38 = str16;
                                                            keys2 = it2;
                                                        }
                                                    }
                                                } else {
                                                    str4 = str50;
                                                    zq1Var2 = zq1Var;
                                                    str16 = str38;
                                                    str20 = str39;
                                                    str18 = str27;
                                                    str17 = str34;
                                                    str21 = str36;
                                                    str19 = str45;
                                                    hashSet = hashSet2;
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                }
                                                break;
                                            case 3355:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                String str52 = str4;
                                                if (next.equals(str52)) {
                                                    str47 = jsonAsset3.optString(str52, str27);
                                                    Intrinsics.checkNotNull(str47);
                                                    str4 = str52;
                                                    if (str47.length() <= 0) {
                                                        str47 = null;
                                                    }
                                                    keys2 = it2;
                                                    str31 = str14;
                                                    str35 = str15;
                                                } else {
                                                    str4 = str52;
                                                    zq1Var2 = zq1Var;
                                                    str16 = str38;
                                                    str20 = str39;
                                                    jsonAttribute = jsonAttribute3;
                                                    str18 = str27;
                                                    str17 = str34;
                                                    str21 = str36;
                                                    str19 = str45;
                                                    hashSet = hashSet2;
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                }
                                            case 3237038:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                if (next.equals("info")) {
                                                    str48 = jsonAsset3.optString(next, str27);
                                                    Intrinsics.checkNotNull(str48);
                                                    if (str48.length() <= 0) {
                                                        str48 = null;
                                                    }
                                                    keys2 = it2;
                                                    str31 = str14;
                                                    str35 = str15;
                                                } else {
                                                    zq1Var2 = zq1Var;
                                                    str16 = str38;
                                                    str20 = str39;
                                                    jsonAttribute = jsonAttribute3;
                                                    str18 = str27;
                                                    str17 = str34;
                                                    str21 = str36;
                                                    str19 = str45;
                                                    hashSet = hashSet2;
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                }
                                            case 3321850:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                if (next.equals(str45)) {
                                                    JSONObject jSONObject5 = jsonAsset3.getJSONObject(next);
                                                    er0 er0Var = this.f34487a;
                                                    Intrinsics.checkNotNull(jSONObject5);
                                                    dr0Var = er0Var.a(jSONObject5, base64EncodingParameters);
                                                    keys2 = it2;
                                                    str31 = str14;
                                                    str35 = str15;
                                                } else {
                                                    zq1Var2 = zq1Var;
                                                    str16 = str38;
                                                    str20 = str39;
                                                    jsonAttribute = jsonAttribute3;
                                                    str18 = str27;
                                                    str17 = str34;
                                                    str21 = str36;
                                                    str19 = str45;
                                                    hashSet = hashSet2;
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                }
                                            case 458247106:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                if (next.equals("renderTrackingUrl")) {
                                                    f82 f82Var = this.f34489c;
                                                    Intrinsics.checkNotNull(next);
                                                    f82Var.getClass();
                                                    hashSet2.add(f82.a(next, jsonAsset3));
                                                }
                                                zq1Var2 = zq1Var;
                                                str16 = str38;
                                                str20 = str39;
                                                jsonAttribute = jsonAttribute3;
                                                str18 = str27;
                                                str17 = str34;
                                                str21 = str36;
                                                str19 = str45;
                                                hashSet = hashSet2;
                                                jsonAttribute3 = jsonAttribute;
                                                hashSet2 = hashSet;
                                                str45 = str19;
                                                str34 = str17;
                                                zq1Var = zq1Var2;
                                                str31 = str14;
                                                str36 = str21;
                                                str39 = str20;
                                                str27 = str18;
                                                str35 = str15;
                                                str38 = str16;
                                                keys2 = it2;
                                            case 635399221:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                if (next.equals("showNotice")) {
                                                    JSONObject jSONObject6 = jsonAsset3.getJSONObject(next);
                                                    Intrinsics.checkNotNull(jSONObject6);
                                                    hashSet3.add(a(jSONObject6));
                                                }
                                                zq1Var2 = zq1Var;
                                                str16 = str38;
                                                str20 = str39;
                                                jsonAttribute = jsonAttribute3;
                                                str18 = str27;
                                                str17 = str34;
                                                str21 = str36;
                                                str19 = str45;
                                                hashSet = hashSet2;
                                                jsonAttribute3 = jsonAttribute;
                                                hashSet2 = hashSet;
                                                str45 = str19;
                                                str34 = str17;
                                                zq1Var = zq1Var2;
                                                str31 = str14;
                                                str36 = str21;
                                                str39 = str20;
                                                str27 = str18;
                                                str35 = str15;
                                                str38 = str16;
                                                keys2 = it2;
                                            case 663229845:
                                                it2 = keys2;
                                                str14 = str31;
                                                str15 = str35;
                                                if (next.equals("showConditions")) {
                                                    uq uqVar2 = new uq();
                                                    Intrinsics.checkNotNull(next);
                                                    xa0Var2 = uqVar2.a(next, jsonAsset3);
                                                    keys2 = it2;
                                                    str31 = str14;
                                                    str35 = str15;
                                                } else {
                                                    zq1Var2 = zq1Var;
                                                    str16 = str38;
                                                    str20 = str39;
                                                    jsonAttribute = jsonAttribute3;
                                                    str18 = str27;
                                                    str17 = str34;
                                                    str21 = str36;
                                                    str19 = str45;
                                                    hashSet = hashSet2;
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                }
                                            case 1320758513:
                                                if (next.equals(str35)) {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    it2 = keys2;
                                                    JSONArray jSONArray6 = jsonAsset3.getJSONArray(str35);
                                                    str14 = str31;
                                                    int length9 = jSONArray6.length();
                                                    str15 = str35;
                                                    int i21 = 0;
                                                    while (i21 < length9) {
                                                        int i22 = length9;
                                                        String string3 = jSONArray6.getString(i21);
                                                        Intrinsics.checkNotNull(string3);
                                                        arrayList6.add(string3);
                                                        i21++;
                                                        length9 = i22;
                                                    }
                                                    hashSet2.addAll(arrayList6);
                                                    zq1Var2 = zq1Var;
                                                    str16 = str38;
                                                    str20 = str39;
                                                    jsonAttribute = jsonAttribute3;
                                                    str18 = str27;
                                                    str17 = str34;
                                                    str21 = str36;
                                                    str19 = str45;
                                                    hashSet = hashSet2;
                                                    jsonAttribute3 = jsonAttribute;
                                                    hashSet2 = hashSet;
                                                    str45 = str19;
                                                    str34 = str17;
                                                    zq1Var = zq1Var2;
                                                    str31 = str14;
                                                    str36 = str21;
                                                    str39 = str20;
                                                    str27 = str18;
                                                    str35 = str15;
                                                    str38 = str16;
                                                    keys2 = it2;
                                                }
                                                break;
                                        }
                                    }
                                    it2 = keys2;
                                    zq1Var2 = zq1Var;
                                    str14 = str31;
                                    str15 = str35;
                                    str16 = str38;
                                    str20 = str39;
                                    jsonAttribute = jsonAttribute3;
                                    str18 = str27;
                                    str17 = str34;
                                    str21 = str36;
                                    str19 = str45;
                                    hashSet = hashSet2;
                                    jsonAttribute3 = jsonAttribute;
                                    hashSet2 = hashSet;
                                    str45 = str19;
                                    str34 = str17;
                                    zq1Var = zq1Var2;
                                    str31 = str14;
                                    str36 = str21;
                                    str39 = str20;
                                    str27 = str18;
                                    str35 = str15;
                                    str38 = str16;
                                    keys2 = it2;
                                }
                                String str53 = str31;
                                String str54 = str35;
                                String str55 = str38;
                                String str56 = str39;
                                String str57 = jsonAttribute3;
                                String str58 = str27;
                                String str59 = str34;
                                String str60 = str36;
                                u31 u31Var = new u31(zq1Var, a4, str47, str48, dr0Var, c1795a42, xa0Var, xa0Var2, CollectionsKt.toList(hashSet2), CollectionsKt.toList(hashSet3), c2157pa);
                                List<C2276uf<?>> b4 = u31Var.b();
                                dr0 e8 = u31Var.e();
                                if (b4.isEmpty() || e8 == null) {
                                    throw new i61(str42);
                                }
                                arrayList4.add(u31Var);
                                i13 = i15 + 1;
                                str36 = str60;
                                jsonAttribute3 = str57;
                                length6 = i14;
                                str27 = str58;
                                str34 = str59;
                                jSONArray3 = jSONArray4;
                                str33 = str46;
                                str31 = str53;
                                str38 = str55;
                                arrayList3 = arrayList4;
                                str39 = str56;
                                str28 = str44;
                                str35 = str54;
                            }
                            str6 = str28;
                            keys = it;
                            str24 = str38;
                            list2 = arrayList3;
                            str22 = str;
                            str23 = str36;
                            str25 = str39;
                            str26 = str4;
                            str30 = str42;
                            str29 = str43;
                            jsonAsset2 = jSONObject3;
                            str28 = str6;
                        }
                        str6 = str28;
                        jsonAsset = jsonAsset2;
                        str7 = str29;
                        str8 = str30;
                        str9 = str31;
                        str3 = str39;
                        str2 = str38;
                        str5 = str27;
                        str10 = str36;
                        break;
                    case 116643:
                        if (!jsonAttribute2.equals("ver")) {
                            str6 = str28;
                            jsonAsset = jsonAsset2;
                            str7 = str29;
                            str8 = str30;
                            str9 = str31;
                            str3 = str39;
                            str2 = str38;
                            str5 = str27;
                            str10 = str36;
                            break;
                        } else {
                            Intrinsics.checkNotNull(jsonAttribute2);
                            Intrinsics.checkNotNullParameter(jsonAsset2, "jsonAsset");
                            Intrinsics.checkNotNullParameter(jsonAttribute2, "jsonAttribute");
                            String optString5 = jsonAsset2.optString(jsonAttribute2);
                            if (optString5 == null || optString5.length() == 0 || Intrinsics.areEqual(optString5, "null")) {
                                throw new i61(str30);
                            }
                            Intrinsics.checkNotNull(optString5);
                            keys = it;
                            str32 = optString5;
                            str22 = str;
                            str23 = str36;
                            str24 = str38;
                            str25 = str39;
                            str26 = str4;
                        }
                        break;
                    case 1320758513:
                        if (!jsonAttribute2.equals("renderTrackingUrls")) {
                            str6 = str28;
                            jsonAsset = jsonAsset2;
                            str7 = str29;
                            str8 = str30;
                            str9 = str31;
                            str3 = str39;
                            str2 = str38;
                            str5 = str27;
                            str10 = str36;
                            break;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            JSONArray jSONArray7 = jsonAsset2.getJSONArray("renderTrackingUrls");
                            int length10 = jSONArray7.length();
                            for (int i23 = 0; i23 < length10; i23++) {
                                String string4 = jSONArray7.getString(i23);
                                Intrinsics.checkNotNull(string4);
                                arrayList7.add(string4);
                            }
                            keys = it;
                            list6 = arrayList7;
                            str22 = str;
                            str23 = str36;
                            str24 = str38;
                            str25 = str39;
                            str26 = str4;
                        }
                    case 1434631203:
                        if (!jsonAttribute2.equals("settings")) {
                            str6 = str28;
                            jsonAsset = jsonAsset2;
                            str7 = str29;
                            str8 = str30;
                            str9 = str31;
                            str3 = str39;
                            str2 = str38;
                            str5 = str27;
                            str10 = str36;
                            break;
                        } else {
                            JSONObject jsonAsset4 = jsonAsset2.getJSONObject("settings");
                            Iterator<String> keys3 = jsonAsset4.keys();
                            Intrinsics.checkNotNullExpressionValue(keys3, str31);
                            JSONObject jsonObject = null;
                            String str61 = null;
                            Long l4 = null;
                            boolean z4 = false;
                            boolean z5 = false;
                            while (keys3.hasNext()) {
                                String jsonAttribute4 = keys3.next();
                                if (jsonAttribute4 != null) {
                                    switch (jsonAttribute4.hashCode()) {
                                        case -975961388:
                                            it3 = keys3;
                                            if (jsonAttribute4.equals("templateType")) {
                                                Intrinsics.checkNotNull(jsonAsset4);
                                                Intrinsics.checkNotNull(jsonAttribute4);
                                                Intrinsics.checkNotNullParameter(jsonAsset4, "jsonAsset");
                                                Intrinsics.checkNotNullParameter(jsonAttribute4, "jsonAttribute");
                                                String optString6 = jsonAsset4.optString(jsonAttribute4);
                                                if (optString6 != null && optString6.length() != 0 && !Intrinsics.areEqual(optString6, "null")) {
                                                    Intrinsics.checkNotNull(optString6);
                                                    str61 = optString6;
                                                    break;
                                                } else {
                                                    throw new i61(str30);
                                                }
                                            } else {
                                                continue;
                                            }
                                        case 370967731:
                                            it3 = keys3;
                                            if (jsonAttribute4.equals("highlightingEnabled")) {
                                                z4 = jsonAsset4.getBoolean(jsonAttribute4);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1352271078:
                                            it3 = keys3;
                                            if (jsonAttribute4.equals("multiBannerAutoScrollInterval")) {
                                                l4 = Long.valueOf(jsonAsset4.getLong(jsonAttribute4));
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1971060391:
                                            it3 = keys3;
                                            if (jsonAttribute4.equals("isLoopingVideo")) {
                                                z5 = jsonAsset4.optBoolean(jsonAttribute4);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 2028941137:
                                            it3 = keys3;
                                            if (jsonAttribute4.equals("mediaAssetImageFallback")) {
                                                jsonObject = jsonAsset4.getJSONObject(jsonAttribute4);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                    keys3 = it3;
                                }
                                it3 = keys3;
                                keys3 = it3;
                            }
                            if (jsonObject != null) {
                                this.f34495i.getClass();
                                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                                if (jsonObject.has("width") && jsonObject.has("height")) {
                                    uy1Var = new uy1(jsonObject.getInt("width"), jsonObject.getInt("height"));
                                    keys = it;
                                    str22 = str;
                                    str23 = str36;
                                    str24 = str38;
                                    str25 = str39;
                                    str26 = str4;
                                    nx1Var = new nx1(str61, l4, z4, z5, uy1Var);
                                }
                            }
                            uy1Var = null;
                            keys = it;
                            str22 = str;
                            str23 = str36;
                            str24 = str38;
                            str25 = str39;
                            str26 = str4;
                            nx1Var = new nx1(str61, l4, z4, z5, uy1Var);
                        }
                        break;
                    case 1557034613:
                        if (!jsonAttribute2.equals("designs")) {
                            str6 = str28;
                            jsonAsset = jsonAsset2;
                            str7 = str29;
                            str8 = str30;
                            str9 = str31;
                            str3 = str39;
                            str2 = str38;
                            str5 = str27;
                            str10 = str36;
                            break;
                        } else {
                            boolean a5 = base64EncodingParameters.a();
                            ArrayList arrayList8 = new ArrayList();
                            JSONArray jSONArray8 = jsonAsset2.getJSONArray("designs");
                            int length11 = jSONArray8.length();
                            for (int i24 = 0; i24 < length11; i24++) {
                                JSONObject jSONObject7 = jSONArray8.getJSONObject(i24);
                                u00 u00Var = this.f34492f;
                                Intrinsics.checkNotNull(jSONObject7);
                                p00 a6 = u00Var.a(jSONObject7);
                                q20 a7 = a6 != null ? this.f34491e.a(a6, a5) : null;
                                if (a7 != null) {
                                    arrayList8.add(a7);
                                }
                            }
                            keys = it;
                            list4 = arrayList8;
                            str22 = str;
                            str23 = str36;
                            str24 = str38;
                            str25 = str39;
                            str26 = str4;
                        }
                    default:
                        str6 = str28;
                        jsonAsset = jsonAsset2;
                        str7 = str29;
                        str8 = str30;
                        str9 = str31;
                        str3 = str39;
                        str2 = str38;
                        str5 = str27;
                        str10 = str36;
                        break;
                }
            } else {
                str = str22;
                str2 = str24;
                str3 = str25;
                str4 = str26;
                str5 = str27;
                str6 = str28;
                jsonAsset = jsonAsset2;
                str7 = str29;
                str8 = str30;
                it = keys;
                str9 = str31;
                str10 = str23;
            }
            keys = it;
            base64EncodingParameters = interfaceC1906ej;
            str23 = str10;
            str30 = str8;
            str25 = str3;
            str22 = str;
            str27 = str5;
            str24 = str2;
            str26 = str4;
            str29 = str7;
            str31 = str9;
            jsonAsset2 = jsonAsset;
            str28 = str6;
        }
        String str62 = str30;
        if (list2.isEmpty()) {
            throw new i61(str62);
        }
        return new n61(list2, list3, list6, c1795a4, MapsKt.mapOf(TuplesKt.to("status", ip1.c.f27369c)), list4, list5, str32, nx1Var, c2106n5);
    }

    public x81(@NotNull Context context, @NotNull mp1 reporter, @NotNull er0 linkJsonParser, @NotNull C2186qg assetsJsonParser, @NotNull f82 urlJsonParser, @NotNull vj0 impressionDataParser, @NotNull v20 divKitDesignParser, @NotNull u00 designJsonParser, @NotNull q91 nativeResponseTypeParser, @NotNull vx1 showNoticeTypeProvider, @NotNull ku0 mediaAssetImageFallbackSizeParser, @NotNull C2180qa additionalInfoJsonParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(linkJsonParser, "linkJsonParser");
        Intrinsics.checkNotNullParameter(assetsJsonParser, "assetsJsonParser");
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(impressionDataParser, "impressionDataParser");
        Intrinsics.checkNotNullParameter(divKitDesignParser, "divKitDesignParser");
        Intrinsics.checkNotNullParameter(designJsonParser, "designJsonParser");
        Intrinsics.checkNotNullParameter(nativeResponseTypeParser, "nativeResponseTypeParser");
        Intrinsics.checkNotNullParameter(showNoticeTypeProvider, "showNoticeTypeProvider");
        Intrinsics.checkNotNullParameter(mediaAssetImageFallbackSizeParser, "mediaAssetImageFallbackSizeParser");
        Intrinsics.checkNotNullParameter(additionalInfoJsonParser, "additionalInfoJsonParser");
        this.f34487a = linkJsonParser;
        this.f34488b = assetsJsonParser;
        this.f34489c = urlJsonParser;
        this.f34490d = impressionDataParser;
        this.f34491e = divKitDesignParser;
        this.f34492f = designJsonParser;
        this.f34493g = nativeResponseTypeParser;
        this.f34494h = showNoticeTypeProvider;
        this.f34495i = mediaAssetImageFallbackSizeParser;
        this.f34496j = additionalInfoJsonParser;
    }

    @NotNull
    public final tx1 a(@NotNull JSONObject jsonShowNotice) {
        Object m243constructorimpl;
        Object m243constructorimpl2;
        Object m243constructorimpl3;
        Object m243constructorimpl4;
        Object m243constructorimpl5;
        ux1 ux1Var;
        Intrinsics.checkNotNullParameter(jsonShowNotice, "jsonShowNotice");
        if (y81.a(jsonShowNotice, "delay", "url")) {
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(Long.valueOf(jsonShowNotice.getLong("delay")));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            Long l4 = (Long) m243constructorimpl;
            long longValue = l4 != null ? l4.longValue() : 0L;
            try {
                this.f34489c.getClass();
                m243constructorimpl2 = Result.m243constructorimpl(f82.a("url", jsonShowNotice));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                m243constructorimpl2 = Result.m243constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m244isFailureimpl(m243constructorimpl2)) {
                m243constructorimpl2 = null;
            }
            String url = (String) m243constructorimpl2;
            try {
                m243constructorimpl3 = Result.m243constructorimpl(Double.valueOf(jsonShowNotice.optInt("visibilityPercent", 0)));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.Companion;
                m243constructorimpl3 = Result.m243constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m244isFailureimpl(m243constructorimpl3)) {
                m243constructorimpl3 = null;
            }
            Double d4 = (Double) m243constructorimpl3;
            int i4 = (int) kotlin.ranges.g.i(d4 != null ? d4.doubleValue() : 0.0d, 0.0d, 100.0d);
            try {
                m243constructorimpl4 = Result.m243constructorimpl(jsonShowNotice.getString("type"));
            } catch (Throwable th4) {
                Result.Companion companion5 = Result.Companion;
                m243constructorimpl4 = Result.m243constructorimpl(ResultKt.createFailure(th4));
            }
            if (Result.m244isFailureimpl(m243constructorimpl4)) {
                m243constructorimpl4 = null;
            }
            String str = (String) m243constructorimpl4;
            if (str != null) {
                try {
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    m243constructorimpl5 = Result.m243constructorimpl(ux1.valueOf(upperCase));
                } catch (Throwable th5) {
                    Result.Companion companion6 = Result.Companion;
                    m243constructorimpl5 = Result.m243constructorimpl(ResultKt.createFailure(th5));
                }
                if (Result.m244isFailureimpl(m243constructorimpl5)) {
                    m243constructorimpl5 = null;
                }
                ux1Var = (ux1) m243constructorimpl5;
            } else {
                ux1Var = null;
            }
            if (ux1Var == null) {
                if (url != null) {
                    this.f34494h.getClass();
                    Intrinsics.checkNotNullParameter(url, "url");
                    if (StringsKt.P(url, "/rtbcount/", false, 2, null)) {
                        ux1Var = ux1.f33443c;
                    } else if (StringsKt.P(url, "/count/", false, 2, null)) {
                        ux1Var = ux1.f33442b;
                    } else {
                        ux1Var = ux1.f33444d;
                    }
                } else {
                    ux1Var = ux1.f33444d;
                }
            }
            return new tx1(i4, longValue, ux1Var, url);
        }
        throw new i61("Native Ad json has not required attributes");
    }
}
