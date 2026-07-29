package com.dancingbogo.skyrolline.ad;

import android.support.v4.view.PointerIconCompat;
import android.text.TextUtils;
import com.cmplay.base.util.webview.util.WebUtils;
import com.dancingbogo.skyrolline.ad.a.c;
import com.dancingbogo.skyrolline.ad.interstitial.admob.AdmobAds;
import com.dancingbogo.skyrolline.b.d;
import com.dancingbogo.skyrolline.util.NativeUtil;
import com.dancingbogo.skyrolline.util.b;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdsFactory.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f4494a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f4495b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static int f4496c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f4497d = 4;
    public static Integer[] e = null;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean j = true;
    public static boolean k = false;
    private static long l = 0;
    private static boolean m = false;
    private static boolean n = false;
    private static long o = 40000;

    public static int a(int i2) {
        return i2 / 1000;
    }

    public static Integer[] a() {
        if (e == null) {
            e = a(d.b("key_ad", ""));
        }
        return e;
    }

    private static Integer[] a(String str) {
        Integer[] numArr;
        String device = NativeUtil.getInstance().getDevice();
        String oSVersion = NativeUtil.getInstance().getOSVersion();
        String b2 = d.b("key_ad_interception", "");
        try {
            b.b("adsFactory", "parseAdData json = " + str);
        } catch (Exception unused) {
            numArr = new Integer[]{Integer.valueOf(PointerIconCompat.TYPE_ALL_SCROLL), 1001, 1002, Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT), 2001};
        }
        if (!TextUtils.isEmpty(str)) {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("ad_platform");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                int intValue = Integer.valueOf(((JSONObject) optJSONArray.get(i2)).optString("id")).intValue();
                if (!a(b2, oSVersion, device, intValue + "")) {
                    arrayList.add(Integer.valueOf(intValue));
                }
            }
            if (!arrayList.contains(Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT))) {
                arrayList.add(Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT));
            }
            numArr = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
            return numArr == null ? new Integer[]{-1} : numArr;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!a(b2, oSVersion, device, "1013")) {
            arrayList2.add(Integer.valueOf(PointerIconCompat.TYPE_ALL_SCROLL));
        }
        if (!a(b2, oSVersion, device, NativeContentAd.ASSET_HEADLINE)) {
            arrayList2.add(1001);
        }
        if (!a(b2, oSVersion, device, "1010")) {
            arrayList2.add(Integer.valueOf(PointerIconCompat.TYPE_ALIAS));
        }
        if (!a(b2, oSVersion, device, "1012")) {
            arrayList2.add(Integer.valueOf(PointerIconCompat.TYPE_NO_DROP));
        }
        if (!a(b2, oSVersion, device, NativeContentAd.ASSET_BODY)) {
            arrayList2.add(1002);
        }
        if (!a(b2, oSVersion, device, "1011")) {
            arrayList2.add(Integer.valueOf(PointerIconCompat.TYPE_COPY));
        }
        if (!a(b2, oSVersion, device, NativeAppInstallAd.ASSET_HEADLINE)) {
            arrayList2.add(2001);
        }
        if (!a(b2, oSVersion, device, NativeContentAd.ASSET_MEDIA_VIDEO)) {
            arrayList2.add(Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT));
        }
        return (Integer[]) arrayList2.toArray(new Integer[arrayList2.size()]);
    }

    private static boolean a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("interceptionId");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                String optString = jSONObject.optString(TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX);
                String optString2 = jSONObject.optString(WebUtils.VER);
                if (TextUtils.equals(jSONObject.optString("id"), str4) && TextUtils.equals(optString2, str2) && TextUtils.equals(optString, str3)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static c a(int i2, com.dancingbogo.skyrolline.ad.a.b bVar) {
        c a2;
        c cVar = null;
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (i2 != 1001) {
            if (i2 != 1006) {
                if (i2 == 2001) {
                    a2 = AdmobAds.getInstance();
                } else if (i2 != 2005) {
                    switch (i2) {
                        case PointerIconCompat.TYPE_HELP /* 1003 */:
                            break;
                        case 1004:
                            a2 = com.dancingbogo.skyrolline.ad.c.a.a.b();
                            break;
                        default:
                            switch (i2) {
                                case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                    a2 = com.dancingbogo.skyrolline.ad.c.e.a.a();
                                    break;
                                case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                                    a2 = com.dancingbogo.skyrolline.ad.c.f.a.a();
                                    break;
                                case PointerIconCompat.TYPE_NO_DROP /* 1012 */:
                                    a2 = com.dancingbogo.skyrolline.ad.c.d.a.b();
                                    break;
                                case PointerIconCompat.TYPE_ALL_SCROLL /* 1013 */:
                                    a2 = com.dancingbogo.skyrolline.ad.c.b.a.a();
                                    break;
                                case PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW /* 1014 */:
                                    a2 = com.dancingbogo.skyrolline.ad.c.c.a.a();
                                    break;
                                case PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW /* 1015 */:
                                    a2 = com.dancingbogo.skyrolline.ad.c.h.a.a();
                                    break;
                            }
                    }
                } else {
                    a2 = AdmobAds.getInstance();
                }
            }
            if (cVar != null && bVar != null) {
                cVar.setListener(bVar);
            }
            return cVar;
        }
        a2 = com.dancingbogo.skyrolline.ad.c.g.a.a();
        cVar = a2;
        if (cVar != null) {
            cVar.setListener(bVar);
        }
        return cVar;
    }

    public static void b(int i2) {
        c a2;
        try {
            Integer[] a3 = a();
            for (int i3 = 0; i3 < a3.length; i3++) {
                if (a(a3[i3].intValue()) == i2 && (a2 = a(a3[i3].intValue(), (com.dancingbogo.skyrolline.ad.a.b) null)) != null) {
                    a2.prepare();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean a(int i2, int i3) {
        c a2;
        try {
            Integer[] a3 = a();
            for (int i4 = 0; i4 < a3.length; i4++) {
                if (a(a3[i4].intValue()) == i3 && a3[i4].intValue() != 1009 && (a2 = a(a3[i4].intValue(), (com.dancingbogo.skyrolline.ad.a.b) null)) != null && a2.canShow(i2)) {
                    b.b("NativeUtil", "isSomeoneReady = " + a3[i4]);
                    return true;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }
}
