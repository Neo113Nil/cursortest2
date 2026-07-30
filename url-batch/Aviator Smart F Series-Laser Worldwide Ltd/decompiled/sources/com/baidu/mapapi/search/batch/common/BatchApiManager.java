package com.baidu.mapapi.search.batch.common;

import android.text.TextUtils;
import android.util.Base64;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.AsyncResponse;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mapapi.http.wrapper.ParamsUtils;
import com.baidu.mapapi.search.batch.geocode.ReverseGeoCodeBatchResult;
import com.baidu.mapapi.search.batch.geocode.ReverseGeoCodeResponse;
import com.baidu.mapapi.search.batch.geocode.ReverseGeoParams;
import com.baidu.mapsdkplatform.comapi.util.AlgorithmUtil;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.platform.a.b.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BatchApiManager {

    /* renamed from: a, reason: collision with root package name */
    private static volatile BatchApiManager f6638a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpManager f6639b;

    /* renamed from: c, reason: collision with root package name */
    private final b f6640c;

    class a implements AsyncResponse.Callback<ReverseGeoCodeBatchResult> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BatchResultCallback f6641a;

        a(BatchResultCallback batchResultCallback) {
            this.f6641a = batchResultCallback;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ReverseGeoCodeBatchResult reverseGeoCodeBatchResult) {
            if (reverseGeoCodeBatchResult.getStatus() != 0) {
                this.f6641a.onFailed(reverseGeoCodeBatchResult.getStatus(), reverseGeoCodeBatchResult.getMessage());
                return;
            }
            List<String> batchResult = reverseGeoCodeBatchResult.getBatchResult();
            ArrayList arrayList = new ArrayList();
            try {
                Iterator<String> it = batchResult.iterator();
                while (it.hasNext()) {
                    arrayList.add((ReverseGeoCodeResponse) ParamsUtils.toObject(BatchApiManager.this.b(it.next()), ReverseGeoCodeResponse.class));
                }
                this.f6641a.onSuccess(arrayList);
            } catch (Exception e8) {
                this.f6641a.onFailed(-1, e8.getMessage());
            }
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f6641a.onFailed(-1, th.getMessage());
        }
    }

    private BatchApiManager() {
        HttpManager httpManager = new HttpManager("https://api.map.baidu.com", "/sdkproxy/v2/lbs_androidsdk");
        this.f6639b = httpManager;
        this.f6640c = (b) httpManager.getApiInstance(b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        byte[] bArr = new byte[0];
        try {
            bArr = AlgorithmUtil.getUrlNeedInfo(AppMD5.getUrlNeedInfo(), AppMD5.getUrlNeedInfo(), Base64.decode(str.getBytes(), 0));
        } catch (Exception unused) {
        }
        return new String(bArr).trim();
    }

    public static BatchApiManager getInstance() {
        if (f6638a == null) {
            synchronized (BatchApiManager.class) {
                try {
                    if (f6638a == null) {
                        f6638a = new BatchApiManager();
                    }
                } finally {
                }
            }
        }
        return f6638a;
    }

    public void reverseGeoCode(List<ReverseGeoParams> list, BatchResultCallback<ReverseGeoCodeResponse> batchResultCallback) {
        if (batchResultCallback == null || list == null || list.isEmpty()) {
            throw new IllegalStateException("BDMapSDKException: batchResultCallback or paramsList is null, please check params first.");
        }
        Iterator<ReverseGeoParams> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getLocation() == null) {
                throw new IllegalArgumentException("BDMapSDKException: Location can not be null");
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("coordtype", "bd09ll");
        hashMap.put("pois", "1");
        hashMap.put("extensions_poi", "1");
        hashMap.put("extensions_town", "true");
        hashMap.put("output", "jsonaes");
        hashMap.put(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        String authToken = HttpClient.getAuthToken();
        if (TextUtils.isEmpty(authToken)) {
            int permissionCheck = PermissionCheck.permissionCheck();
            if (permissionCheck != 0) {
                batchResultCallback.onFailed(permissionCheck, ErrorMessage.PERMISSION_CHECK_ERROR);
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        if (TextUtils.isEmpty(authToken)) {
            batchResultCallback.onFailed(-2, "EMPTY_TOKEN");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ReverseGeoParams reverseGeoParams : list) {
            ParamsItem paramsItem = new ParamsItem();
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(a(ParamsUtils.makeQueryString(new Object[]{hashMap, reverseGeoParams}, false)));
                sb.append(HttpClient.getPhoneInfo());
                AppMD5.getSignMD5String(sb.toString());
                paramsItem.setUrl("/reverse_geocoding/v3?" + ((Object) sb));
                paramsItem.setMethod("get");
                arrayList.add(paramsItem);
            } catch (Exception unused) {
                batchResultCallback.onFailed(-3, ErrorMessage.PARAMS_CONVERT_ERROR);
                return;
            }
        }
        BatchParams batchParams = new BatchParams();
        batchParams.setItems(arrayList);
        com.baidu.platform.a.b.a.a aVar = new com.baidu.platform.a.b.a.a();
        aVar.setToken(AppMD5.encodeUrlParamsValue(authToken));
        try {
            aVar.setSign(AppMD5.getSignMD5String("token=" + AppMD5.encodeUrlParamsValue(authToken) + "&body_str=" + AppMD5.encodeUrlParamsValue(ParamsUtils.toJsonString(batchParams, false))));
            this.f6640c.a(batchParams, aVar).setCallback(new a(batchResultCallback));
        } catch (IllegalAccessException unused2) {
            batchResultCallback.onFailed(-4, ErrorMessage.SIGN_CALC_ERROR);
        }
    }

    private String a(String str) {
        String substring = str.substring(str.indexOf("location=") + 9, str.indexOf("&", str.indexOf("location=")));
        return TextUtils.isEmpty(substring) ? str : str.replace(substring, Base64.encodeToString(AlgorithmUtil.setUrlNeedInfo(AppMD5.getUrlNeedInfo(), AppMD5.getUrlNeedInfo(), substring.getBytes()), 0).trim());
    }
}
