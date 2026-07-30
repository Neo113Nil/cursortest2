package com.baidu.mapapi.utils.route;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import b5.b;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.navi.IllegalNaviArgumentException;
import com.baidu.mapapi.utils.OpenClientUtil;
import com.baidu.mapapi.utils.a;
import com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException;
import com.baidu.mapapi.utils.route.RouteParaOption;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.google.android.gms.fitness.FitnessActivities;

/* loaded from: classes2.dex */
public class BaiduMapRoutePlan {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f7559a = true;

    private static void a(RouteParaOption routeParaOption, Context context, int i8) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("https://api.map.baidu.com/direction?");
        sb.append("origin=");
        LatLng latLng = routeParaOption.f7560a;
        CoordType coordType = SDKInitializer.getCoordType();
        CoordType coordType2 = CoordType.GCJ02;
        if (coordType == coordType2 && latLng != null) {
            latLng = CoordTrans.gcjToBaidu(latLng);
        }
        if (routeParaOption.f7560a != null && (str2 = routeParaOption.f7562c) != null && !str2.equals("") && latLng != null) {
            sb.append("latlng:");
            sb.append(latLng.latitude);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(latLng.longitude);
            sb.append(b.VERTICAL);
            sb.append("name:");
            sb.append(routeParaOption.f7562c);
        } else if (routeParaOption.f7560a == null || latLng == null) {
            sb.append(routeParaOption.f7562c);
        } else {
            sb.append(latLng.latitude);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(latLng.longitude);
        }
        if (!TextUtils.isEmpty(routeParaOption.getStartPoiId())) {
            sb.append("&origin_uid=");
            sb.append(routeParaOption.getStartPoiId());
        }
        LatLng latLng2 = routeParaOption.f7561b;
        if (SDKInitializer.getCoordType() == coordType2 && latLng2 != null) {
            latLng2 = CoordTrans.gcjToBaidu(latLng2);
        }
        sb.append("&destination=");
        if (routeParaOption.f7561b != null && (str = routeParaOption.f7563d) != null && !str.equals("") && latLng2 != null) {
            sb.append("latlng:");
            sb.append(latLng2.latitude);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(latLng2.longitude);
            sb.append(b.VERTICAL);
            sb.append("name:");
            sb.append(routeParaOption.f7563d);
        } else if (routeParaOption.f7561b == null || latLng2 == null) {
            sb.append(routeParaOption.f7563d);
        } else {
            sb.append(latLng2.latitude);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(latLng2.longitude);
        }
        if (!TextUtils.isEmpty(routeParaOption.getEndPoiId())) {
            sb.append("&destination_uid=");
            sb.append(routeParaOption.getEndPoiId());
        }
        String str3 = i8 != 0 ? i8 != 1 ? i8 != 2 ? "" : FitnessActivities.WALKING : "transit" : "driving";
        sb.append("&mode=");
        sb.append(str3);
        sb.append("&region=");
        if (routeParaOption.getCityName() == null || routeParaOption.getCityName().equals("")) {
            sb.append("全国");
        } else {
            sb.append(routeParaOption.getCityName());
        }
        sb.append("&output=html");
        sb.append("&src=");
        sb.append(context.getPackageName());
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

    public static boolean openBaiduMapDrivingRoute(RouteParaOption routeParaOption, Context context) {
        if (routeParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        String str = routeParaOption.f7562c;
        if (str == null && routeParaOption.f7560a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: startPoint and startName not all null.");
        }
        if (routeParaOption.f7563d == null && routeParaOption.f7561b == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: endPoint and endName not all null.");
        }
        if ((TextUtils.isEmpty(str) && routeParaOption.f7560a == null) || (TextUtils.isEmpty(routeParaOption.f7563d) && routeParaOption.f7561b == null)) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f7567h == null) {
            routeParaOption.f7567h = RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f7559a) {
                throw new IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 0);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return a.a(routeParaOption, context, 0);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!f7559a) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(routeParaOption, context, 0);
        return true;
    }

    public static boolean openBaiduMapNewEnergyRoute(RouteParaOption routeParaOption, Context context) {
        if (routeParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        String str = routeParaOption.f7562c;
        if (str == null && routeParaOption.f7560a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: startPoint and startName not all null.");
        }
        if (routeParaOption.f7563d == null && routeParaOption.f7561b == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: endPoint and endName not all null.");
        }
        if ((TextUtils.isEmpty(str) && routeParaOption.f7560a == null) || (TextUtils.isEmpty(routeParaOption.f7563d) && routeParaOption.f7561b == null)) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f7567h == null) {
            routeParaOption.f7567h = RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f7559a) {
                throw new IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 101);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return a.a(routeParaOption, context, 101);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!f7559a) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(routeParaOption, context, 101);
        return true;
    }

    public static boolean openBaiduMapTransitRoute(RouteParaOption routeParaOption, Context context) {
        if (routeParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        String str = routeParaOption.f7562c;
        if (str == null && routeParaOption.f7560a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: startPoint and startName not all null.");
        }
        if (routeParaOption.f7563d == null && routeParaOption.f7561b == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: endPoint and endName not all null.");
        }
        if ((TextUtils.isEmpty(str) && routeParaOption.f7560a == null) || (TextUtils.isEmpty(routeParaOption.f7563d) && routeParaOption.f7561b == null)) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f7567h == null) {
            routeParaOption.f7567h = RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f7559a) {
                throw new IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 1);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return a.a(routeParaOption, context, 1);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!f7559a) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(routeParaOption, context, 1);
        return true;
    }

    public static boolean openBaiduMapTruckRoute(RouteParaOption routeParaOption, Context context) {
        if (routeParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        String str = routeParaOption.f7562c;
        if (str == null && routeParaOption.f7560a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: startPoint and startName not all null.");
        }
        if (routeParaOption.f7563d == null && routeParaOption.f7561b == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: endPoint and endName not all null.");
        }
        if ((TextUtils.isEmpty(str) && routeParaOption.f7560a == null) || (TextUtils.isEmpty(routeParaOption.f7563d) && routeParaOption.f7561b == null)) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f7567h == null) {
            routeParaOption.f7567h = RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f7559a) {
                throw new IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 7);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return a.a(routeParaOption, context, 102);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!f7559a) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(routeParaOption, context, 7);
        return true;
    }

    public static boolean openBaiduMapWalkingRoute(RouteParaOption routeParaOption, Context context) {
        if (routeParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        String str = routeParaOption.f7562c;
        if (str == null && routeParaOption.f7560a == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: startPoint and startName not all null.");
        }
        if (routeParaOption.f7563d == null && routeParaOption.f7561b == null) {
            throw new IllegalNaviArgumentException("BDMapSDKException: endPoint and endName not all null.");
        }
        if ((TextUtils.isEmpty(str) && routeParaOption.f7560a == null) || (TextUtils.isEmpty(routeParaOption.f7563d) && routeParaOption.f7561b == null)) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f7567h == null) {
            routeParaOption.f7567h = RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f7559a) {
                throw new IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 2);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return a.a(routeParaOption, context, 2);
        }
        Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!f7559a) {
            throw new IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(routeParaOption, context, 2);
        return true;
    }

    public static void setSupportWebRoute(boolean z7) {
        f7559a = z7;
    }
}
