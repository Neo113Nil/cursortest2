package com.crrepa.band.my.health.ecg.diagnosis;

import androidx.annotation.NonNull;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.net.EcgAuxiliaryResultEntity;
import com.crrepa.band.my.model.net.KyAuthLoginEntity;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.u;
import com.yanzhenjie.kalle.i;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public class b {
    private static final float ECG_SCALE_VALUE = 0.03172f;
    private static final String MERCHANT_NAME = "moyoung1130";
    private static final String MERCHANT_PSW = "bW95b3VuZzExMzA=";
    public static final int RESPONSE_OK = 200;

    private Map<String, Object> buildReportFields(int[] iArr, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("lead_name", "I");
        int[] iArr2 = new int[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            iArr2[i9] = (int) (iArr[i9] * ECG_SCALE_VALUE);
        }
        hashMap.put("lead_data", s.bean2Json(iArr2));
        hashMap.put("scale_value", 400);
        hashMap.put("sample_base", 125);
        hashMap.put("heart_beat", Integer.valueOf(i8));
        hashMap.put("cellphone", "13888888888");
        hashMap.put("age", Integer.valueOf(UserAgeProvider.getUserAge()));
        hashMap.put("gender", Integer.valueOf(UserGenderProvider.getUsetGender() != 1 ? 1 : 0));
        hashMap.put("device_sn", BandInfoManager.getAddress());
        hashMap.put("language", u.isZH() ? "CH" : "EN");
        hashMap.put("maxBP", 0);
        hashMap.put("minBP", 0);
        return hashMap;
    }

    private Map<String, String> buildReportHeaders(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", i.VALUE_APPLICATION_JSON);
        hashMap.put("merchantname", MERCHANT_PSW);
        hashMap.put("publickey", str);
        return hashMap;
    }

    @NonNull
    private RequestBody buildRequestBody(Map<String, Object> map) {
        return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), s.bean2Json(map));
    }

    public Observable<KyAuthLoginEntity> loginKy() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("merchant_name", MERCHANT_NAME);
        linkedHashMap.put("merchant_password", MERCHANT_PSW);
        return com.crrepa.band.my.profile.b.getInstance().getApiStores().getKyPublicKey(buildRequestBody(linkedHashMap)).subscribeOn(Schedulers.io()).observeOn(Schedulers.io());
    }

    public Observable<EcgAuxiliaryResultEntity> reportEcg(String str, int[] iArr, int i8) {
        return com.crrepa.band.my.profile.b.getInstance().getApiStores().getEcgAuxiliaryResult(buildReportHeaders(str), buildRequestBody(buildReportFields(iArr, i8))).subscribeOn(Schedulers.io()).observeOn(Schedulers.io());
    }
}
