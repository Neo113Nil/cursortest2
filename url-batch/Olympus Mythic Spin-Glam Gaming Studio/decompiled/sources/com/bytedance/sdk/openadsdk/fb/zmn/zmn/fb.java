package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.cyb.fs.fb;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.zmn.zn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class fb {
    private static final com.bytedance.sdk.openadsdk.fb.zmn.zmn fs = com.bytedance.sdk.openadsdk.fb.zmn.zmn.zmn();
    public static nqi<com.bytedance.sdk.openadsdk.fb.zmn> zmn;

    public static void zmn(final ArrayList<bvs> arrayList, final zn.fs<bvs> fsVar) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            if (fsVar != null) {
                fsVar.zmn(arrayList, false);
            }
        } else {
            if (arrayList.get(0) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.1
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("applog_2");
                    return zmnVar;
                }
            });
            nu.btk(new com.bytedance.sdk.component.zg.fs.zn("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = fb.fb(arrayList).entrySet().iterator();
                    } catch (Throwable th) {
                        iqz.zn("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        zn.fs fsVar2 = fsVar;
                        if (fsVar2 != null) {
                            fsVar2.zmn(arrayList, false);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            ArrayList arrayList2 = (ArrayList) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                bvs bvsVar = (bvs) it2.next();
                                arrayList3.add(new com.bytedance.sdk.openadsdk.fb.zmn(bvsVar.hhw(), bvsVar.zn()));
                            }
                            com.bytedance.sdk.openadsdk.fb.btk hhw = fb.hhw(arrayList3);
                            if (hhw == null) {
                                hhw = new com.bytedance.sdk.openadsdk.fb.btk(false, -2000, "result is null", false);
                            }
                            if (fsVar != null) {
                                boolean z = hhw.fb;
                                if (fb.fs(arrayList3, hhw)) {
                                    z = true;
                                }
                                fsVar.zmn(arrayList2, new com.bytedance.sdk.component.hhw.zmn.fs.fs.fs(hhw.zmn, hhw.fs, hhw.zn, z, "").zmn);
                                if (hhw.fs == 200) {
                                    com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.2.1
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar.fs("applog_2");
                                            return zmnVar;
                                        }
                                    });
                                } else if (z) {
                                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.2.2
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar.fs("applog_2");
                                            return zmnVar;
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.2.3
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar.fs("applog_2");
                                            return zmnVar;
                                        }
                                    });
                                }
                            }
                        } catch (Throwable th2) {
                            iqz.zn("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, ArrayList<bvs>> fb(List<bvs> list) {
        HashMap<String, ArrayList<bvs>> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            bvs bvsVar = list.get(i);
            String optString = bvsVar.zn().optString("app_log_url");
            ArrayList<bvs> arrayList = hashMap.get(optString);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(optString, arrayList);
            }
            arrayList.add(bvsVar);
        }
        return hashMap;
    }

    private static boolean btk(List<com.bytedance.sdk.openadsdk.fb.zmn> list) {
        JSONObject fb;
        if (list == null || list.isEmpty() || (fb = list.get(0).fb()) == null) {
            return true;
        }
        return TextUtils.isEmpty(fb.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fs(List<com.bytedance.sdk.openadsdk.fb.zmn> list, com.bytedance.sdk.openadsdk.fb.btk btkVar) {
        int i;
        return !btk(list) && (i = btkVar.fs) >= 400 && i < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.fb.btk hhw(List<com.bytedance.sdk.openadsdk.fb.zmn> list) {
        if (zmn == null) {
            zmn = kgc.zn();
        }
        if (zmn == null) {
            return null;
        }
        int i = hhw.zmn() != 3 ? -1 : 3;
        com.bytedance.sdk.openadsdk.fb.zmn.zmn zmnVar = fs;
        return zmn.zmn(zmnVar.zmn(zmnVar.zmn(list, i), System.currentTimeMillis(), zmnVar.fs()), zmnVar.zmn(list), zmnVar.fs(list));
    }

    public static void fs(final ArrayList<rc> arrayList, @Nullable final zn.fs<rc> fsVar) {
        if (arrayList == null || arrayList.isEmpty() || com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || arrayList.get(0) == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.cyb.zn.fs()) {
            if (fsVar != null) {
                fsVar.zmn(arrayList, true);
                return;
            }
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        Iterator<rc> it = arrayList.iterator();
        while (it.hasNext()) {
            rc next = it.next();
            arrayList2.add(new fb.zmn(next.hhw(), next.zn()));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.3
            @Override // com.bytedance.sdk.openadsdk.kgc.fb
            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                zmnVar.fs("stats_2");
                return zmnVar;
            }
        });
        nu.btk(new com.bytedance.sdk.component.zg.fs.zn("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.fb.btk zmn2 = fb.zmn(arrayList2);
                if (zmn2 == null) {
                    zmn2 = new com.bytedance.sdk.openadsdk.fb.btk(false, -2000, "result is null", false);
                }
                if (fsVar != null) {
                    fsVar.zmn(arrayList, new com.bytedance.sdk.component.hhw.zmn.fs.fs.fs(zmn2.zmn, zmn2.fs, zmn2.zn, zmn2.fb, "").zmn);
                    if (zmn2.fs == 200) {
                        com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.4.1
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("stats_2");
                                return zmnVar;
                            }
                        });
                    } else if (zmn2.fb) {
                        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.4.2
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("stats_2");
                                return zmnVar;
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.fb.4.3
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("stats_2");
                                return zmnVar;
                            }
                        });
                    }
                }
            }
        });
    }

    public static com.bytedance.sdk.openadsdk.fb.btk zmn(List<fb.zmn> list) {
        if (zmn == null) {
            zmn = kgc.zn();
        }
        if (zmn != null && list != null && !list.isEmpty() && com.bytedance.sdk.openadsdk.core.settings.nps.zmn()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<fb.zmn> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().fs);
                }
                jSONObject.putOpt("stats_list", jSONArray);
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis / 1000;
                jSONObject.putOpt("ts", Long.valueOf(j));
                jSONObject.putOpt("ts_ms", Long.valueOf(currentTimeMillis));
                String fb = com.bytedance.sdk.openadsdk.core.iv.fs().fb();
                if (fb == null) {
                    fb = "";
                }
                StringBuilder sb = new StringBuilder(kjb.zmn());
                sb.append("-");
                sb.append(currentTimeMillis);
                jSONObject.putOpt("req_sign", com.bytedance.sdk.component.utils.btk.zmn(fb + j + BuildConfig.VERSION_NAME));
                jSONObject.putOpt("req_uniq", com.bytedance.sdk.component.utils.btk.zmn(sb.toString()));
                return zmn.fs(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
