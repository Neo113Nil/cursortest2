package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: RewardVideoCache.java */
/* loaded from: classes2.dex */
public class qh {
    private static volatile qh pvs;
    private final Map<cR, Long> Jd = Collections.synchronizedMap(new HashMap());
    private final Context icD;
    private final Ju vG;

    /* compiled from: RewardVideoCache.java */
    interface pvs<T> {
        void pvs(boolean z, T t);
    }

    public void pvs(String str) {
        this.vG.Jd(str);
    }

    public void pvs() {
        File[] listFiles;
        File[] listFiles2;
        try {
            boolean z = com.bytedance.sdk.openadsdk.core.so.NB("sp_reward_video");
            File file = new File(this.icD.getDataDir(), z ? "files" : "shared_prefs");
            if (file.exists() && file.isDirectory() && (listFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.qh.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_reward_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : listFiles2) {
                    if (z) {
                        try {
                            com.bytedance.sdk.component.utils.sUS.vG(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.icD.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.icD.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.qh.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("reward_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : listFiles) {
                try {
                    com.bytedance.sdk.component.utils.sUS.vG(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void pvs(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar) {
        if (pvsVar == null || pvsVar.Mxy() || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        synchronized (pvsVar) {
            if (!pvsVar.Mxy()) {
                try {
                    this.vG.pvs(adSlot.getCodeId(), pvsVar.kj().toString());
                } catch (Throwable unused) {
                    pvsVar.Wyp();
                }
            }
        }
    }

    public static qh pvs(Context context) {
        if (pvs == null) {
            synchronized (qh.class) {
                if (pvs == null) {
                    pvs = new qh(context);
                }
            }
        }
        return pvs;
    }

    private qh(Context context) {
        this.icD = context == null ? mnm.pvs() : context.getApplicationContext();
        this.vG = new Ju("sp_reward_video");
    }

    public String pvs(String str, String str2, int i) {
        File pvs2;
        if (!TextUtils.isEmpty(str) && (pvs2 = pvs(str2, i)) != null && pvs2.exists() && pvs2.isFile() && pvs2.length() > 0) {
            return pvs2.getAbsolutePath();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.model.pvs icD(String str) {
        com.bytedance.sdk.openadsdk.core.model.pvs pvsVar;
        long icD = this.vG.icD(str);
        boolean vG = this.vG.vG(str);
        if ((System.currentTimeMillis() - icD < 10500000) && !vG) {
            try {
                String pvs2 = this.vG.pvs(str);
                if (!TextUtils.isEmpty(pvs2)) {
                    JSONObject jSONObject = new JSONObject(pvs2);
                    if (jSONObject.has("creatives")) {
                        pvsVar = com.bytedance.sdk.openadsdk.core.model.pvs.icD(jSONObject);
                    } else {
                        cR pvs3 = com.bytedance.sdk.openadsdk.core.icD.pvs(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.pvs pvsVar2 = new com.bytedance.sdk.openadsdk.core.model.pvs();
                        pvsVar2.pvs(pvs3);
                        pvsVar = pvsVar2;
                    }
                    if (pvsVar != null && pvsVar.Jd()) {
                        Iterator<cR> it = pvsVar.vG().iterator();
                        while (it.hasNext()) {
                            if (!pvs(it.next())) {
                                it.remove();
                            }
                        }
                        if (pvsVar.Jd()) {
                            return pvsVar;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private boolean pvs(cR cRVar) {
        if (cRVar != null) {
            return rCZ.qh(cRVar) || cRVar.od() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final boolean z, final cR cRVar, final long j, String str) {
        Long remove = this.Jd.remove(cRVar);
        final long elapsedRealtime = remove == null ? 0L : SystemClock.elapsedRealtime() - remove.longValue();
        final String str2 = z ? "load_video_success" : "load_video_error";
        final String str3 = (z || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs(str2, false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.qh.3
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs(str2).icD(jlb.pvs(z, cRVar, elapsedRealtime, j, str3).toString());
            }
        });
    }

    public void pvs(final cR cRVar, final pvs<Object> pvsVar) {
        this.Jd.put(cRVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (cRVar == null || cRVar.od() == null || TextUtils.isEmpty(cRVar.od().qh())) {
            if (pvsVar != null) {
                pvsVar.pvs(false, null);
            }
            pvs(false, cRVar, -1L, null);
        } else {
            String qh = cRVar.od().qh();
            File pvs2 = pvs(cRVar.od().IP(), cRVar.LHy());
            com.bytedance.sdk.component.yiw.icD.pvs Jd = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().Jd();
            Jd.icD(qh);
            Jd.pvs(pvs2.getParent(), pvs2.getName());
            Jd.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.qh.4
                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                    if (icd.sUS() && icd.NB() != null && icd.NB().exists()) {
                        pvs pvsVar2 = pvsVar;
                        if (pvsVar2 != null) {
                            pvsVar2.pvs(true, null);
                        }
                        qh.this.pvs(true, cRVar, icd.pvs(), icd.icD());
                        return;
                    }
                    pvs pvsVar3 = pvsVar;
                    if (pvsVar3 != null) {
                        pvsVar3.pvs(false, null);
                    }
                    qh.this.pvs(false, cRVar, icd.pvs(), icd.icD());
                }

                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                    pvs pvsVar2 = pvsVar;
                    if (pvsVar2 != null) {
                        pvsVar2.pvs(false, null);
                    }
                    qh.this.pvs(false, cRVar, -2L, iOException.getMessage());
                }
            });
        }
    }

    private File pvs(String str, int i) {
        return new File(CacheDirFactory.getICacheDir(i).pvs(), str);
    }
}
