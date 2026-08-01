package com.bytedance.sdk.openadsdk.core.yiw.vG;

import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: VastMacroHelper.java */
/* loaded from: classes2.dex */
public class vG {
    private final Map<icD, String> icD;
    private final List<String> pvs;

    public vG(List<String> list) {
        this.pvs = list;
        HashMap hashMap = new HashMap();
        this.icD = hashMap;
        hashMap.put(icD.CACHEBUSTING, icD());
    }

    public List<String> pvs() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.pvs) {
            if (!TextUtils.isEmpty(str)) {
                for (icD icd : icD.values()) {
                    String str2 = this.icD.get(icd);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str.replaceAll("\\[" + icd.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public vG pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs pvsVar) {
        if (pvsVar != null) {
            this.icD.put(icD.ERRORCODE, pvsVar.pvs());
        }
        return this;
    }

    public vG pvs(long j) {
        if (j >= 0) {
            String icD = icD(j);
            if (!TextUtils.isEmpty(icD)) {
                this.icD.put(icD.CONTENTPLAYHEAD, icD);
            }
        }
        return this;
    }

    public vG pvs(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, Key.STRING_CHARSET_NAME);
            } catch (Throwable unused) {
            }
            this.icD.put(icD.ASSETURI, str);
        }
        return this;
    }

    private String icD() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String icD(long j) {
        return String.format(Locale.getDefault(), "%02d:%02d:%02d.%03d", Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }
}
