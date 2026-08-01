package com.bytedance.sdk.openadsdk.qh;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.Map;

/* compiled from: TTAdNetDepend.java */
/* loaded from: classes2.dex */
public class icD implements com.bytedance.sdk.component.yiw.vG.icD {
    public static String pvs = "sp_multi_ttadnet_config";
    private final Context icD;

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public int Jd() {
        return BuildConfig.VERSION_CODE;
    }

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public String icD() {
        return "pangle_sdk";
    }

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public Address pvs(Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public String vG() {
        return "android";
    }

    public icD(Context context) {
        this.icD = context;
    }

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public int pvs() {
        return Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public String NB() {
        return qh.pvs(this.icD);
    }

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public String pvs(Context context, String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD(pvs, str, str2);
    }

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public void pvs(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs(pvs, entry.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs(pvs, entry.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs(pvs, entry.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs(pvs, entry.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs(pvs, entry.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.yiw.vG.icD
    public String[] sUS() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String OhP = mnm.Jd().OhP();
        if (!TextUtils.isEmpty(OhP)) {
            return ("SG".equals(OhP) || "CN".equals(OhP)) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int mnm = jlb.mnm();
        return (mnm == 2 || mnm == 1) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }
}
