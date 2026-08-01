package com.bytedance.sdk.openadsdk.core.yiw;

import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import com.bytedance.sdk.openadsdk.core.yiw.vG.pvs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastResource.java */
/* loaded from: classes2.dex */
public class vG {
    protected pvs.icD Jd;
    protected String NB;
    private String Wyp;
    protected int icD;
    private cR kj;
    protected int pvs;
    protected List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> sUS;
    protected String so;
    protected pvs.EnumC0089pvs vG;
    protected List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> yiw;
    private final AtomicBoolean qh = new AtomicBoolean(false);
    protected String Mxy = "endcard_click";

    public vG(int i, int i2, pvs.EnumC0089pvs enumC0089pvs, pvs.icD icd, String str, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list, List<com.bytedance.sdk.openadsdk.core.yiw.icD.vG> list2, String str2) {
        this.sUS = new ArrayList();
        this.yiw = new ArrayList();
        this.pvs = i;
        this.icD = i2;
        this.vG = enumC0089pvs;
        this.Jd = icd;
        this.NB = str;
        this.sUS = list;
        this.yiw = list2;
        this.so = str2;
    }

    public int icD() {
        return this.pvs;
    }

    public int vG() {
        return this.icD;
    }

    public void pvs(long j) {
        com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.sUS, null, j, this.Wyp, new vG.icD(this.Mxy, this.kj));
    }

    public void icD(long j) {
        if (this.qh.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.yiw.icD.vG.icD(this.yiw, null, j, this.Wyp);
        }
    }

    public static float pvs(int i, int i2, int i3, int i4, pvs.icD icd, pvs.EnumC0089pvs enumC0089pvs) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return pvs(icd, enumC0089pvs) / ((Math.abs((f / i2) - (f2 / i4)) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* compiled from: VastResource.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.yiw.vG$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[pvs.icD.values().length];
            pvs = iArr;
            try {
                iArr[pvs.icD.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[pvs.icD.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pvs[pvs.icD.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static float pvs(pvs.icD icd, pvs.EnumC0089pvs enumC0089pvs) {
        int i = AnonymousClass1.pvs[icd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (pvs.EnumC0089pvs.JAVASCRIPT.equals(enumC0089pvs)) {
            return 1.0f;
        }
        return pvs.EnumC0089pvs.IMAGE.equals(enumC0089pvs) ? 0.8f : 0.0f;
    }

    public String Jd() {
        int i = AnonymousClass1.pvs[this.Jd.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.NB;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.pvs + "\" height=\"" + this.icD + "\" src=\"" + this.NB + "\"></iframe>";
        }
        if (this.vG == pvs.EnumC0089pvs.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.NB + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (this.vG == pvs.EnumC0089pvs.JAVASCRIPT) {
            return "<script src=\"" + this.NB + "\"></script>";
        }
        return null;
    }

    public String NB() {
        if (this.Jd == pvs.icD.STATIC_RESOURCE && this.vG == pvs.EnumC0089pvs.IMAGE) {
            return this.NB;
        }
        return null;
    }

    public String sUS() {
        return this.NB;
    }

    public void pvs(String str) {
        this.Wyp = str;
    }

    public static vG icD(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", pvs.EnumC0089pvs.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", pvs.icD.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new vG.pvs(optJSONArray.optString(i)).pvs());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new vG.pvs(optJSONArray2.optString(i2)).pvs());
        }
        return new vG(optInt, optInt2, pvs.EnumC0089pvs.valueOf(optString), pvs.icD.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    public JSONObject pvs() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.pvs);
        jSONObject.put("height", this.icD);
        jSONObject.put("creativeType", this.vG.toString());
        jSONObject.put("resourceType", this.Jd.toString());
        jSONObject.put("contentUrl", this.NB);
        jSONObject.put("clickThroughUri", this.so);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.sUS));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(this.yiw));
        return jSONObject;
    }

    public void pvs(cR cRVar) {
        this.kj = cRVar;
    }
}
