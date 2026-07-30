package com.baidu.mapapi.navi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.VersionInfo;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.OpenClientUtil;
import com.baidu.mapapi.utils.a;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BaiduMapNavigation {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6581a = true;

    private static void a(NaviParaOption naviParaOption, Context context) {
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        LatLng latLng = naviParaOption.f6582a;
        if (latLng == null || naviParaOption.f6585d == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: you must set start and end point.");
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(naviParaOption.f6585d);
        StringBuilder sb = new StringBuilder();
        sb.append("https://app.navi.baidu.com/mobile/#navi/naving/");
        sb.append("&sy=0");
        sb.append("&endp=");
        sb.append("&start=");
        sb.append("&startwd=");
        sb.append("&endwd=");
        sb.append("&fromprod=map_sdk");
        sb.append("&app_version=");
        sb.append(VersionInfo.VERSION_INFO);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("type", "1");
            String str = naviParaOption.f6583b;
            if (str == null || str.equals("")) {
                jSONObject.put("keyword", "");
            } else {
                jSONObject.put("keyword", naviParaOption.f6583b);
            }
            jSONObject.put("xy", String.valueOf(ll2mc.getLongitudeE6()) + SystemInfoUtil.COMMA + String.valueOf(ll2mc.getLatitudeE6()));
            jSONArray.put(jSONObject);
            jSONObject2.put("type", "1");
            String str2 = naviParaOption.f6586e;
            if (str2 == null || str2.equals("")) {
                jSONObject.put("keyword", "");
            } else {
                jSONObject.put("keyword", naviParaOption.f6586e);
            }
            jSONObject2.put("xy", String.valueOf(ll2mc2.getLongitudeE6()) + SystemInfoUtil.COMMA + String.valueOf(ll2mc2.getLatitudeE6()));
            jSONArray.put(jSONObject2);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        if (jSONArray.length() > 0) {
            sb.append("&positions=");
            sb.append(jSONArray.toString());
        }
        sb.append("&ctrl_type=");
        sb.append("&mrsl=");
        sb.append("/vt=map&state=entry");
        Uri parse = Uri.parse(sb.toString());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(parse);
        context.startActivity(intent);
    }

    public static void finish(Context context) {
        if (context != null) {
            a.j(context);
        }
    }

    public static boolean openBaiduMapBikeNavi(NaviParaOption naviParaOption, Context context) {
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.f6585d == null || naviParaOption.f6582a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: start point or end point can not be null.");
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            return false;
        }
        if (baiduMapVersion >= 869) {
            return a.a(naviParaOption, context, 8);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.6.6");
        return false;
    }

    public static boolean openBaiduMapNavi(NaviParaOption naviParaOption, Context context) {
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.f6585d == null || naviParaOption.f6582a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: start point or end point can not be null.");
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f6581a) {
                throw new BaiduMapAppNotSupportNaviException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(naviParaOption, context);
            return true;
        }
        if (baiduMapVersion >= 830) {
            return a.a(naviParaOption, context, 5);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.2");
        if (!f6581a) {
            throw new BaiduMapAppNotSupportNaviException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.2");
        }
        a(naviParaOption, context);
        return true;
    }

    public static boolean openBaiduMapWalkNavi(NaviParaOption naviParaOption, Context context) {
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.f6585d == null || naviParaOption.f6582a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: start point or end point can not be null.");
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            return false;
        }
        if (baiduMapVersion >= 869) {
            return a.a(naviParaOption, context, 7);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.6.6");
        return false;
    }

    public static boolean openBaiduMapWalkNaviAR(NaviParaOption naviParaOption, Context context) {
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.f6585d == null || naviParaOption.f6582a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: start point or end point can not be null.");
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            return false;
        }
        if (baiduMapVersion >= 869) {
            return a.a(naviParaOption, context, 9);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.6.6");
        return false;
    }

    @Deprecated
    public static void openWebBaiduMapNavi(NaviParaOption naviParaOption, Context context) {
        String str;
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        LatLng latLng = naviParaOption.f6582a;
        if (latLng == null || naviParaOption.f6585d == null) {
            String str2 = naviParaOption.f6583b;
            if (str2 == null || str2.equals("") || (str = naviParaOption.f6586e) == null || str.equals("")) {
                throw new IllegalNaviArgumentException("BDMapSDKException: you must set start and end point or set the start and end name.");
            }
            Uri parse = Uri.parse("https://daohang.map.baidu.com/mobile/#search/search/qt=nav&sn=2$$$$$$" + naviParaOption.f6583b + "$$$$$$&en=2$$$$$$" + naviParaOption.f6586e + "$$$$$$&fromprod=" + a(context));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(parse);
            context.startActivity(intent);
            return;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(naviParaOption.f6585d);
        Uri parse2 = Uri.parse("https://daohang.map.baidu.com/mobile/#navi/naving/start=" + ll2mc.getLongitudeE6() + SystemInfoUtil.COMMA + ll2mc.getLatitudeE6() + "&endp=" + ll2mc2.getLongitudeE6() + SystemInfoUtil.COMMA + ll2mc2.getLatitudeE6() + "&fromprod=" + a(context) + "/vt=map&state=entry");
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.VIEW");
        intent2.setFlags(268435456);
        intent2.setData(parse2);
        context.startActivity(intent2);
    }

    public static void setSupportWebNavi(boolean z7) {
        f6581a = z7;
    }

    private static String a(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo = null;
        try {
            packageManager = context.getApplicationContext().getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }
}
