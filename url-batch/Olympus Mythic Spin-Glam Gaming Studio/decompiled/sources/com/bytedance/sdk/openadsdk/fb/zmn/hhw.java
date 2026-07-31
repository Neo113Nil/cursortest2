package com.bytedance.sdk.openadsdk.fb.zmn;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.cyb.fs.fb;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class hhw implements com.bytedance.sdk.component.hhw.zmn.fs.zn {
    private final zmn fs = zmn.zmn();
    public nqi<com.bytedance.sdk.openadsdk.fb.zmn> zmn;

    @Override // com.bytedance.sdk.component.hhw.zmn.fs.zn
    public void zmn(final List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, @Nullable final com.bytedance.sdk.component.hhw.zmn.fs.fs fsVar) {
        com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar;
        if (list == null || list.isEmpty() || com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || (zmnVar = list.get(0)) == null) {
            return;
        }
        byte fb = zmnVar.fb();
        final ArrayList arrayList = new ArrayList();
        if (fb == 0) {
            nu.btk(new com.bytedance.sdk.component.zg.fs.zn("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = hhw.this.fb(list).entrySet().iterator();
                    } catch (Throwable th) {
                        iqz.zn("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.hhw.zmn.fs.fs fsVar2 = fsVar;
                        if (fsVar2 != null) {
                            fsVar2.zmn(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.1.1
                                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                    zmnVar2.fs("applog");
                                    return zmnVar2;
                                }
                            });
                            List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list2 = (List) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.fb.zmn(zmnVar2.zn(), zmnVar2.hhw()));
                            }
                            com.bytedance.sdk.openadsdk.fb.btk zmn = hhw.this.zmn(arrayList2);
                            if (fsVar != null && zmn != null) {
                                boolean z = zmn.fb;
                                if (hhw.this.zmn(arrayList2, zmn)) {
                                    z = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.hhw.zmn.fs.fs.zmn(new com.bytedance.sdk.component.hhw.zmn.fs.fs.fs(zmn.zmn, zmn.fs, zmn.zn, z, ""), list2));
                                if (zmn.fs == 200) {
                                    com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.1.2
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar3.fs("applog");
                                            return zmnVar3;
                                        }
                                    });
                                } else if (z) {
                                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.1.3
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar3.fs("applog");
                                            return zmnVar3;
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.1.4
                                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                            zmnVar3.fs("applog");
                                            return zmnVar3;
                                        }
                                    });
                                }
                            }
                            if (fsVar != null && zmn == null) {
                                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.1.5
                                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                        zmnVar3.fs("applog");
                                        return zmnVar3;
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            iqz.zn("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.hhw.zmn.fs.fs fsVar3 = fsVar;
                    if (fsVar3 != null) {
                        fsVar3.zmn(arrayList);
                    }
                }
            });
            return;
        }
        if (fb == 1) {
            if (com.bytedance.sdk.openadsdk.cyb.zn.fs()) {
                if (fsVar != null) {
                    arrayList.add(new com.bytedance.sdk.component.hhw.zmn.fs.fs.zmn(new com.bytedance.sdk.component.hhw.zmn.fs.fs.fs(true, 200, "", false, ""), list));
                    fsVar.zmn(arrayList);
                    return;
                }
                return;
            }
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar2 : list) {
                arrayList2.add(new fb.zmn(zmnVar2.zn(), zmnVar2.hhw()));
            }
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.2
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar3.fs("stats");
                        return zmnVar3;
                    }
                });
                nu.btk(new com.bytedance.sdk.component.zg.fs.zn("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.fb.btk fs = hhw.this.fs(arrayList2);
                        if (fsVar != null && fs != null) {
                            arrayList.add(new com.bytedance.sdk.component.hhw.zmn.fs.fs.zmn(new com.bytedance.sdk.component.hhw.zmn.fs.fs.fs(fs.zmn, fs.fs, fs.zn, fs.fb, ""), list));
                            fsVar.zmn(arrayList);
                            if (fs.fs == 200) {
                                com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.3.1
                                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                        zmnVar3.fs("stats");
                                        return zmnVar3;
                                    }
                                });
                            } else if (fs.fb) {
                                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.3.2
                                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                        zmnVar3.fs("stats");
                                        return zmnVar3;
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.3.3
                                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                        zmnVar3.fs("stats");
                                        return zmnVar3;
                                    }
                                });
                            }
                        }
                        if (fsVar == null || fs != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.hhw.3.4
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar3.fs("stats");
                                return zmnVar3;
                            }
                        });
                    }
                });
            }
        }
    }

    private boolean zn(List<com.bytedance.sdk.openadsdk.fb.zmn> list) {
        JSONObject fb;
        if (list == null || list.size() == 0 || (fb = list.get(0).fb()) == null) {
            return true;
        }
        return TextUtils.isEmpty(fb.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(List<com.bytedance.sdk.openadsdk.fb.zmn> list, com.bytedance.sdk.openadsdk.fb.btk btkVar) {
        int i;
        return !zn(list) && (i = btkVar.fs) >= 400 && i < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn>> fb(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        HashMap<String, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn>> hashMap = new HashMap<>();
        new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar = list.get(i);
            JSONObject hhw = zmnVar.hhw();
            if (hhw != null) {
                String optString = hhw.optString("app_log_url");
                List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list2 = hashMap.get(optString);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    hashMap.put(optString, list2);
                }
                list2.add(zmnVar);
            }
        }
        return hashMap;
    }

    public com.bytedance.sdk.openadsdk.fb.btk zmn(List<com.bytedance.sdk.openadsdk.fb.zmn> list) {
        if (this.zmn == null) {
            this.zmn = kgc.zn();
        }
        if (this.zmn == null) {
            return null;
        }
        return this.zmn.zmn(this.fs.zmn(this.fs.zmn(list, com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn() == 3 ? 1 : -1), System.currentTimeMillis(), this.fs.fs()), this.fs.zmn(list), this.fs.fs(list));
    }

    public com.bytedance.sdk.openadsdk.fb.btk fs(List<fb.zmn> list) {
        if (this.zmn == null) {
            this.zmn = kgc.zn();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.nps.zmn()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<fb.zmn> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().fs);
                }
                jSONObject.put("stats_list", jSONArray);
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis / 1000;
                jSONObject.put("ts", j);
                jSONObject.put("ts_ms", currentTimeMillis);
                String fb = com.bytedance.sdk.openadsdk.core.iv.fs().fb();
                if (fb == null) {
                    fb = "";
                }
                StringBuilder sb = new StringBuilder(kjb.zmn());
                sb.append("-");
                sb.append(currentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.btk.zmn(fb + j + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.btk.zmn(sb.toString()));
                return this.zmn.fs(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
