package com.baidu.platform.a.i;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.share.RouteShareURLOption;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.platform.comapi.basestruct.Point;

/* loaded from: classes2.dex */
public class e extends com.baidu.platform.base.g {
    public e(RouteShareURLOption routeShareURLOption) {
        a(routeShareURLOption);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(RouteShareURLOption routeShareURLOption) {
        String str;
        String str2;
        String str3;
        String str4;
        com.baidu.platform.util.a aVar = new com.baidu.platform.util.a();
        Point ll2point = CoordUtil.ll2point(routeShareURLOption.mFrom.getLocation());
        Point ll2point2 = CoordUtil.ll2point(routeShareURLOption.mTo.getLocation());
        String str5 = "2$$$$$$";
        if (ll2point != null) {
            str = "1$$$$" + ll2point.f8789x + SystemInfoUtil.COMMA + ll2point.f8790y + "$$";
        } else {
            str = "2$$$$$$";
        }
        String name = routeShareURLOption.mFrom.getName();
        String str6 = "";
        if (name == null || name.equals("")) {
            name = "起点";
        }
        String str7 = str + name + "$$0$$$$";
        if (ll2point2 != null) {
            str5 = "1$$$$" + ll2point2.f8789x + SystemInfoUtil.COMMA + ll2point2.f8790y + "$$";
        }
        String name2 = routeShareURLOption.mTo.getName();
        if (name2 == null || name2.equals("")) {
            name2 = "终点";
        }
        String str8 = str5 + name2 + "$$0$$$$";
        int ordinal = routeShareURLOption.mMode.ordinal();
        if (ordinal == 0) {
            aVar.a("sc", b(routeShareURLOption.mFrom.getCity()) + "");
            aVar.a("ec", b(routeShareURLOption.mTo.getCity()) + "");
            str2 = "&sharecallbackflag=carRoute";
            str3 = "nav";
        } else if (ordinal == 1) {
            aVar.a("sc", b(routeShareURLOption.mFrom.getCity()) + "");
            aVar.a("ec", b(routeShareURLOption.mTo.getCity()) + "");
            str2 = "&sharecallbackflag=footRoute";
            str3 = "walk";
        } else {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    str4 = "";
                } else {
                    str4 = "&i=" + routeShareURLOption.mPn + ",1,1&sharecallbackflag=busRoute";
                    aVar.a("c", routeShareURLOption.mCityCode + "");
                    str6 = "bt";
                }
                aVar.a("sn", str7);
                aVar.a("en", str8);
                if (!TextUtils.isEmpty(routeShareURLOption.mFrom.getPoiId())) {
                    aVar.a("origin_uid", routeShareURLOption.mFrom.getPoiId());
                }
                if (!TextUtils.isEmpty(routeShareURLOption.mTo.getPoiId())) {
                    aVar.a("destination_uid", routeShareURLOption.mTo.getPoiId());
                }
                this.f8720d.a("url", "https://map.baidu.com/?newmap=1&s=" + str6 + (AppMD5.encodeUrlParamsValue("&" + aVar.a() + ("&start=" + name + "&end=" + name2)) + str4));
                this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
            }
            aVar.a("sc", b(routeShareURLOption.mFrom.getCity()) + "");
            aVar.a("ec", b(routeShareURLOption.mTo.getCity()) + "");
            str2 = "&sharecallbackflag=cycleRoute";
            str3 = "cycle";
        }
        String str9 = str2;
        str6 = str3;
        str4 = str9;
        aVar.a("sn", str7);
        aVar.a("en", str8);
        if (!TextUtils.isEmpty(routeShareURLOption.mFrom.getPoiId())) {
        }
        if (!TextUtils.isEmpty(routeShareURLOption.mTo.getPoiId())) {
        }
        this.f8720d.a("url", "https://map.baidu.com/?newmap=1&s=" + str6 + (AppMD5.encodeUrlParamsValue("&" + aVar.a() + ("&start=" + name + "&end=" + name2)) + str4));
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
    }

    private int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.m();
    }
}
