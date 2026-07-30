package com.baidu.platform.base;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.route.PlanNode;
import com.baidu.mapsdkplatform.comapi.util.AlgorithmUtil;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.platform.comapi.basestruct.Point;
import com.crrepa.band.my.model.storage.BaseParamNames;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: c, reason: collision with root package name */
    protected String f8719c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f8717a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8718b = true;

    /* renamed from: d, reason: collision with root package name */
    protected com.baidu.platform.util.a f8720d = new com.baidu.platform.util.a();

    public String a() {
        return this.f8719c;
    }

    public abstract String a(com.baidu.platform.domain.c cVar);

    public void b(boolean z7) {
        this.f8717a = z7;
    }

    public void a(boolean z7) {
        this.f8718b = z7;
    }

    public String b(SearchType searchType) {
        String a8 = a(com.baidu.platform.domain.d.a());
        SDKInitializer.getDebugMode();
        String authToken = HttpClient.getAuthToken();
        if (authToken == null) {
            Log.e("SearchRequest", "toUrlString get authtoken failed");
            int permissionCheck = PermissionCheck.permissionCheck();
            if (permissionCheck != 0) {
                Log.e("SearchRequest", "try permissionCheck result is: " + permissionCheck);
                return null;
            }
            authToken = HttpClient.getAuthToken();
        }
        if (this.f8717a) {
            this.f8720d.a(BaseParamNames.TOKEN, authToken);
        }
        String a9 = this.f8720d.a();
        if (a(searchType)) {
            a9 = a(searchType, a9);
        }
        String str = a9 + HttpClient.getPhoneInfo();
        if (this.f8718b) {
            str = str + "&sign=" + AppMD5.getSignMD5String(str);
        }
        return a8 + "?" + str;
    }

    private String a(SearchType searchType, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return SearchType.REVERSE_GEO_CODER == searchType ? a(str) : str;
    }

    private String a(String str) {
        String substring = str.substring(str.indexOf("location=") + 9, str.indexOf("&", str.indexOf("location=")));
        if (TextUtils.isEmpty(substring)) {
            return str;
        }
        byte[] bArr = {0};
        try {
            bArr = AlgorithmUtil.setUrlNeedInfo(AppMD5.getUrlNeedInfo(), AppMD5.getUrlNeedInfo(), substring.getBytes());
        } catch (Exception e8) {
            Log.e("BaseSearch", "get location failed", e8);
        }
        return str.replace(substring, Base64.encodeToString(bArr, 0).trim());
    }

    protected final String a(PlanNode planNode) {
        if (planNode == null) {
            return null;
        }
        String str = new String("{");
        LatLng location = planNode.getLocation();
        if (location != null) {
            String str2 = str + "\"type\":1,";
            Point ll2point = CoordUtil.ll2point(location);
            if (!TextUtils.isEmpty(planNode.getPoiId())) {
                str2 = str2 + "\"uid\":\"" + planNode.getPoiId() + "\",";
            }
            if (!TextUtils.isEmpty(planNode.getBid()) && !TextUtils.isEmpty(planNode.getFloor())) {
                str2 = (str2 + "\"building\":\"" + planNode.getBid() + "\",") + "\"floor\":\"" + planNode.getFloor() + "\",";
            }
            if (!TextUtils.isEmpty(planNode.getCityCode())) {
                str2 = str2 + "\"city\":\"" + planNode.getCityCode() + "\",";
            }
            return str2 + "\"xy\":\"" + ll2point.doubleX + SystemInfoUtil.COMMA + ll2point.doubleY + "\"}";
        }
        if (planNode.getName() == null) {
            return str;
        }
        String str3 = str + "\"type\":2,";
        if (!TextUtils.isEmpty(planNode.getPoiId())) {
            str3 = str3 + "\"uid\":\"" + planNode.getPoiId() + "\",";
        }
        return str3 + "\"keyword\":\"" + planNode.getName() + "\"}";
    }

    private boolean a(SearchType searchType) {
        return SearchType.REVERSE_GEO_CODER == searchType;
    }
}
