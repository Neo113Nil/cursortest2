package com.bytedance.sdk.openadsdk.core.rt.zn;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.nps;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.btk;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.zmn.fs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class fb {
    public static final List<String> zmn = Arrays.asList("video/mp4", "video/3gpp");
    private static final ConcurrentHashMap<String, Boolean> fs = new ConcurrentHashMap<>();

    public static double zmn(int i, double d, int i2, int i3, int i4, @Nullable String str) {
        double zmn2 = zmn(i, d, i2, i3);
        return fs(str) * (1.0d / ((zmn2 + 1.0d) + zmn(i4)));
    }

    private static double zmn(int i, double d, int i2, int i3) {
        return (d > 0.0d ? Math.abs(d - (i3 > 0 ? i2 / i3 : 0.0d)) : 0.0d) + (i > 0 ? Math.abs((i - i2) / i) : 0.0d);
    }

    private static double zmn(int i) {
        int max = Math.max(i, 0);
        if (700 > max || max > 1500) {
            return Math.min(Math.abs(700 - max) / 700.0f, Math.abs(1500 - max) / 1500.0f);
        }
        return 0.0d;
    }

    private static double fs(String str) {
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            return (hashCode == 1331848029 && str.equals("video/mp4")) ? 1.5d : 1.0d;
        }
        str.equals("video/3gpp");
        return 1.0d;
    }

    public static void zmn(nqi nqiVar) {
        btk xr;
        ArrayList<btk.zmn> zmn2;
        if (nqiVar == null || !btk.zmn(nqiVar) || (xr = nqiVar.xr()) == null || (zmn2 = xr.zmn()) == null || zmn2.isEmpty()) {
            return;
        }
        Iterator<btk.zmn> it = zmn2.iterator();
        while (it.hasNext()) {
            btk.zmn next = it.next();
            String fb = next.fb();
            if (!TextUtils.isEmpty(fb)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.btk btkVar = new com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.btk(kgc.zmn(), 0, 0);
                com.bytedance.sdk.openadsdk.core.rt.zmn zmn3 = btkVar.zmn(fb, (File) null, new ArrayList());
                if (zmn3 != null) {
                    next.zmn(zmn3.zmn());
                    next.zmn(zmn3.klz());
                }
                zmn(nqiVar, "vast_content", zmn3, elapsedRealtime, btkVar.hhw);
            }
            zmn(nqiVar, next);
        }
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        List<nqi> btk = zmnVar.btk();
        if (btk != null) {
            Iterator<nqi> it = btk.iterator();
            while (it.hasNext()) {
                zmn(it.next());
            }
        }
    }

    private static void zmn(final nqi nqiVar, final btk.zmn zmnVar) {
        File zmn2;
        String zn = zmnVar.zn();
        if (TextUtils.isEmpty(zn)) {
            return;
        }
        final String str = zn + nqiVar.wbj();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = fs;
        if (concurrentHashMap.containsKey(str) || (zmn2 = zmn(str)) == null) {
            return;
        }
        if (zmn2.exists() && zmn2.length() > 0) {
            fs(nqiVar, zmn2, zmnVar, 0L);
            return;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.nps.fs.zmn fb = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fb();
        fb.zn(zn);
        fb.zmn(zmn2.getParent(), zmn2.getName());
        fb.fb(zn);
        fb.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.rt.zn.fb.1
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                if (!fsVar.hhw() || fsVar.btk() == null || !fsVar.btk().exists()) {
                    fb.fs(nqiVar, btk.zmn.this.zn(), false, SystemClock.elapsedRealtime() - elapsedRealtime);
                } else {
                    fb.fs(nqiVar, fsVar.btk(), btk.zmn.this, SystemClock.elapsedRealtime() - elapsedRealtime);
                }
                fb.fs.remove(str);
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                fb.fs(nqiVar, btk.zmn.this.zn(), false, SystemClock.elapsedRealtime() - elapsedRealtime);
                fb.fs.remove(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(nqi nqiVar, File file, btk.zmn zmnVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.btk btkVar = new com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.btk(kgc.zmn(), 0, 0);
        com.bytedance.sdk.openadsdk.core.rt.zmn zmn2 = btkVar.zmn((String) null, file, new ArrayList());
        if (zmn2 != null) {
            zmnVar.zmn(zmn2.zmn());
            zmnVar.zmn(zmn2.klz());
        }
        fs(nqiVar, zmnVar.zn(), true, j);
        zmn(nqiVar, "vast_url", zmn2, elapsedRealtime, btkVar.hhw);
        fs();
    }

    private static void fs() {
        File[] listFiles;
        File zmn2 = zmn(kgc.zmn());
        if (zmn2 == null || (listFiles = zmn2.listFiles()) == null || listFiles.length <= 5) {
            return;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.rt.zn.fb.2
            @Override // java.util.Comparator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = listFiles.length - 5;
        for (int i = 0; i < listFiles.length && i < length; i++) {
            File file = listFiles[i];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static File zmn(String str) {
        String zmn2 = com.bytedance.sdk.component.utils.btk.zmn(str);
        if (zmn2 == null) {
            return null;
        }
        return new File(zmn(kgc.zmn()), zmn2);
    }

    private static File zmn(Context context) {
        return nps.fs(context, new File(CacheDirFactory.getRootDir()).getName() + "/vast");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(nqi nqiVar, final String str, final boolean z, final long j) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, nqiVar.btk(), "track_url_request_result", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.rt.zn.fb.3
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("success", z);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(final nqi nqiVar, final String str, final com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar, final long j, final fs.zmn zmnVar2) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.rt.zn.fb.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, SystemClock.elapsedRealtime() - j);
                    jSONObject.put("from", str);
                    if (zmnVar != null) {
                        nqi nqiVar2 = nqiVar;
                        com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar2, nqiVar2.btk(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    fs.zmn zmnVar3 = zmnVar2;
                    if (zmnVar3 != null) {
                        jSONObject.put("error_code", zmnVar3.zmn);
                    }
                    nqi nqiVar3 = nqiVar;
                    com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar3, nqiVar3.btk(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void fs(final nqi nqiVar, final String str, final com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar, final long j, final fs.zmn zmnVar2) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.rt.zn.fb.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, SystemClock.elapsedRealtime() - j);
                    com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar3 = zmnVar;
                    String str2 = "load_vast_fail";
                    if (zmnVar3 != null) {
                        if (!TextUtils.isEmpty(zmnVar3.bvs()) && !TextUtils.isEmpty(zmnVar.hhw()) && zmnVar.zg() > 0.0d) {
                            str2 = "load_vast_success";
                        }
                        jSONObject.put("error_code", -3);
                    } else {
                        fs.zmn zmnVar4 = zmnVar2;
                        if (zmnVar4 != null) {
                            jSONObject.put("error_code", zmnVar4.zmn);
                        }
                    }
                    com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.rt.zmn zmnVar5 = zmnVar;
                    if (zmnVar5 == null || zmnVar5.fs() == null || !TextUtils.isEmpty(zmnVar.fs().btk())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, str, "load_vast_icon_fail", jSONObject2);
                    zmnVar.zmn((com.bytedance.sdk.openadsdk.core.rt.fs) null);
                } catch (Exception unused2) {
                }
            }
        });
    }
}
