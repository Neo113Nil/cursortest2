package com.bytedance.sdk.openadsdk.core.rt;

import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.fs.zn;
import com.bytedance.sdk.openadsdk.core.rt.zn.zmn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class zn {
    protected String btk;
    protected zmn.fs fb;
    protected int fs;
    protected List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> hhw;
    private String iv;
    private nqi klz;
    protected List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> nps;
    protected String zg;
    protected int zmn;
    protected zmn.EnumC0182zmn zn;
    private final AtomicBoolean rc = new AtomicBoolean(false);
    protected String bvs = "endcard_click";

    public zn(int i, int i2, zmn.EnumC0182zmn enumC0182zmn, zmn.fs fsVar, String str, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list2, String str2) {
        this.hhw = new ArrayList();
        this.nps = new ArrayList();
        this.zmn = i;
        this.fs = i2;
        this.zn = enumC0182zmn;
        this.fb = fsVar;
        this.btk = str;
        this.hhw = list;
        this.nps = list2;
        this.zg = str2;
    }

    public int zmn() {
        return this.zmn;
    }

    public int fs() {
        return this.fs;
    }

    public void zmn(long j) {
        com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(null, this.hhw, null, j, this.iv, new zn.fs(this.bvs, this.klz), null);
    }

    public void fs(long j) {
        if (this.rc.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.rt.fs.zn.fs((nqi) null, this.nps, (com.bytedance.sdk.openadsdk.core.rt.zmn.zmn) null, j, this.iv, (String) null);
        }
    }

    public static float zmn(int i, int i2, int i3, int i4, zmn.fs fsVar, zmn.EnumC0182zmn enumC0182zmn) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return zmn(fsVar, enumC0182zmn) / ((Math.abs((f / i2) - (f2 / i4)) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.rt.zn$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[zmn.fs.values().length];
            zmn = iArr;
            try {
                iArr[zmn.fs.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[zmn.fs.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[zmn.fs.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static float zmn(zmn.fs fsVar, zmn.EnumC0182zmn enumC0182zmn) {
        int i = AnonymousClass1.zmn[fsVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (zmn.EnumC0182zmn.JAVASCRIPT.equals(enumC0182zmn)) {
            return 1.0f;
        }
        return zmn.EnumC0182zmn.IMAGE.equals(enumC0182zmn) ? 0.8f : 0.0f;
    }

    public String zn() {
        int i = AnonymousClass1.zmn[this.fb.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.btk;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.zmn + "\" height=\"" + this.fs + "\" src=\"" + this.btk + "\"></iframe>";
        }
        zmn.EnumC0182zmn enumC0182zmn = this.zn;
        if (enumC0182zmn == zmn.EnumC0182zmn.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.btk + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0182zmn != zmn.EnumC0182zmn.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.btk + "\"></script>";
    }

    public String fb() {
        if (this.fb == zmn.fs.STATIC_RESOURCE && this.zn == zmn.EnumC0182zmn.IMAGE) {
            return this.btk;
        }
        return null;
    }

    public String btk() {
        return this.btk;
    }

    public void zmn(String str) {
        this.iv = str;
    }

    public static zn fs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", zmn.EnumC0182zmn.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", zmn.fs.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new zn.zmn(optJSONArray.optString(i)).zmn());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new zn.zmn(optJSONArray2.optString(i2)).zmn());
        }
        return new zn(optInt, optInt2, zmn.EnumC0182zmn.valueOf(optString), zmn.fs.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    public void zmn(nqi nqiVar) {
        this.klz = nqiVar;
    }
}
