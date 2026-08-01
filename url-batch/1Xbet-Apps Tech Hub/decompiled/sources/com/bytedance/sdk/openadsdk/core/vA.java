package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.cR;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NetApi.java */
/* loaded from: classes2.dex */
public interface vA<T> {

    /* compiled from: NetApi.java */
    public interface icD {
        void pvs(int i, String str);

        void pvs(cR.icD icd);
    }

    /* compiled from: NetApi.java */
    public interface pvs {
        void pvs(int i, String str);

        void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, com.bytedance.sdk.openadsdk.core.model.icD icd);
    }

    com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvs();

    com.bytedance.sdk.openadsdk.icD.NB pvs(JSONObject jSONObject);

    com.bytedance.sdk.openadsdk.icD.NB pvs(JSONObject jSONObject, String str, boolean z);

    void pvs(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uc ucVar, int i, pvs pvsVar);

    void pvs(String str);

    void pvs(String str, List<FilterWord> list, String str2, String str3, String str4);

    void pvs(JSONObject jSONObject, icD icd);

    void pvs(JSONObject jSONObject, String str);
}
