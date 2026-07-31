package com.bytedance.sdk.openadsdk.core.rt.fs;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.fs.fs;
import com.bytedance.sdk.openadsdk.core.rt.fs.zmn;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class zn {
    private EnumC0181zn btk;
    private final boolean fb;
    private boolean hhw;
    private final String zn;
    private static final Map<String, fs> zmn = new ConcurrentHashMap();
    private static final AtomicBoolean fs = new AtomicBoolean(false);

    /* renamed from: com.bytedance.sdk.openadsdk.core.rt.fs.zn$zn, reason: collision with other inner class name */
    enum EnumC0181zn {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        rp.zmn(new rp.zmn() { // from class: com.bytedance.sdk.openadsdk.core.rt.fs.zn.1
            @Override // com.bytedance.sdk.component.utils.rp.zmn
            public void zmn(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || zn.zmn.size() <= 0) {
                    return;
                }
                zn.nps();
            }
        }, kgc.zmn());
    }

    protected zn(String str, EnumC0181zn enumC0181zn, Boolean bool) {
        this.zn = str;
        this.btk = enumC0181zn;
        this.fb = bool.booleanValue();
    }

    public static List<String> zmn(nqi nqiVar, @NonNull List<zn> list, @Nullable com.bytedance.sdk.openadsdk.core.rt.zmn.zmn zmnVar, @Nullable long j, @Nullable String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (zn znVar : list) {
            if (znVar != null && (!znVar.fb() || znVar.zn())) {
                arrayList.add(znVar.fs());
                znVar.l_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.rt.zn.zn(arrayList, nqiVar).zmn(zmnVar).zmn(j).fs(str).zmn(str2).zmn();
    }

    public static boolean zmn(nqi nqiVar, @NonNull List<zn> list, @Nullable com.bytedance.sdk.openadsdk.core.rt.zmn.zmn zmnVar, @Nullable long j, @Nullable String str, fs fsVar, @Nullable String str2) {
        List<String> zmn2 = zmn(nqiVar, list, zmnVar, j, str, str2);
        zmn(zmn2, fsVar);
        return !zmn2.isEmpty();
    }

    public static void fs(nqi nqiVar, @NonNull List<zn> list, @Nullable com.bytedance.sdk.openadsdk.core.rt.zmn.zmn zmnVar, @Nullable long j, @Nullable String str, String str2) {
        zmn(nqiVar, list, zmnVar, j, str, null, str2);
    }

    public static void zmn(List<String> list, fs fsVar) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                zmn(str, fsVar, false);
            }
        }
    }

    private static void zmn(final String str, final fs fsVar, final boolean z) {
        com.bytedance.sdk.component.nps.fs.fs zn = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
        if (zn == null) {
            return;
        }
        zn.zmn(true);
        zn.zn(str);
        zn.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.rt.fs.zn.2
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar2) {
                String str2;
                boolean z2;
                fs fsVar3 = fs.this;
                if (fsVar3 == null || fsVar3.zmn == null) {
                    return;
                }
                String str3 = null;
                if (fsVar2 == null || !fsVar2.hhw()) {
                    if (fsVar2 != null) {
                        str3 = fsVar2.zmn() + ":" + fsVar2.fs();
                        if (!z && (fsVar2.zmn() <= 300 || fsVar2.zmn() >= 400)) {
                            zn.zmn.put(str, fs.this);
                        }
                    }
                    str2 = str3;
                    z2 = false;
                } else {
                    z2 = true;
                    str2 = null;
                }
                zn.fs(z2, str2, oub.zn(fs.this.zmn.ldx()), fs.this, str, z);
                if (!z2 || zn.zmn.isEmpty()) {
                    return;
                }
                zn.nps();
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                nqi nqiVar;
                fs fsVar2 = fs.this;
                if (fsVar2 != null && (nqiVar = fsVar2.zmn) != null) {
                    zn.fs(false, iOException != null ? iOException.getMessage() : null, oub.zn(nqiVar.ldx()), fs.this, str, z);
                }
                if (z || fs.this == null) {
                    return;
                }
                zn.zmn.put(str, fs.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void nps() {
        if (fs.compareAndSet(false, true)) {
            Map<String, fs> map = zmn;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    zmn((String) entry.getKey(), (fs) entry.getValue(), true);
                }
            }
            fs.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(final boolean z, final String str, final String str2, final fs fsVar, final String str3, final boolean z2) {
        nqi nqiVar;
        if (fsVar == null || (nqiVar = fsVar.zmn) == null) {
            return;
        }
        final boolean ch = nqiVar.ch();
        final String str4 = ch ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn(str4) { // from class: com.bytedance.sdk.openadsdk.core.rt.fs.zn.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", fsVar.fs);
                    jSONObject.put("success", z);
                    jSONObject.put("url", str3);
                    if (ch) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        if (fsVar.zn >= 0.0f) {
                            jSONObject.put("progress", Math.round(r1 * 100.0f) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), fsVar.zmn, str2, str4, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.rt.fs.zn.3.1
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zn() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zmn() {
                        if (!z2) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        });
    }

    public static List<zn> zmn(JSONArray jSONArray) {
        return zmn(jSONArray, false);
    }

    public static List<zn> zmn(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new zmn(optString).zmn(z).zmn());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.rt.fs.fs> fs(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new fs.zmn(optJSONObject.optString("content"), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).zmn());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.rt.fs.zmn> zn(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new zmn.C0180zmn(optJSONObject.optString("content"), optJSONObject.optLong("trackingMilliseconds", 0L)).zmn());
                }
            }
        }
        return arrayList;
    }

    public String fs() {
        return this.zn;
    }

    public boolean zn() {
        return this.fb;
    }

    public void l_() {
        this.hhw = true;
    }

    public boolean fb() {
        return this.hhw;
    }

    public static class zmn {
        private final String zmn;
        private EnumC0181zn fs = EnumC0181zn.TRACKING_URL;
        private boolean zn = false;

        public zmn(String str) {
            this.zmn = str;
        }

        public zmn zmn(boolean z) {
            this.zn = z;
            return this;
        }

        public zn zmn() {
            return new zn(this.zmn, this.fs, Boolean.valueOf(this.zn));
        }
    }

    public static class fs {
        String fs;
        final nqi zmn;
        float zn;

        public fs(String str, nqi nqiVar) {
            this(str, nqiVar, -1.0f);
        }

        public fs(String str, nqi nqiVar, float f) {
            this.fs = str;
            this.zmn = nqiVar;
            this.zn = f;
        }

        public String toString() {
            return super.toString();
        }
    }
}
