package com.bytedance.sdk.openadsdk.core.btk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.btk;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.nps;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.cn.zn.zn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.iqz.fs;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class zmn {
    private final List<String> zmn = new CopyOnWriteArrayList();
    private final zn fs = new zn(5, 5, true);
    private final ConcurrentHashMap<String, Long> zn = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.sdk.openadsdk.core.btk.zmn$zmn, reason: collision with other inner class name */
    private static class C0151zmn {
        private static final zmn zmn = new zmn();
    }

    public static zmn zmn() {
        return C0151zmn.zmn;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        List<nqi> btk = zmnVar.btk();
        if (btk == null || btk.size() == 0) {
            return;
        }
        for (int i = 0; i < btk.size(); i++) {
            nqi nqiVar = btk.get(i);
            if (nqiVar != null) {
                zmn(nqiVar);
            }
        }
    }

    public InputStream zmn(String str) {
        File fs = fs(str);
        if (fs != null && zmn(fs)) {
            try {
                return new FileInputStream(fs);
            } catch (Exception e) {
                iqz.zn("MusicCacheManager", e.getMessage());
            }
        }
        return null;
    }

    private void zmn(nqi nqiVar) {
        nqi.zmn ouf;
        String bvs;
        if (nqiVar == null || (ouf = nqiVar.ouf()) == null || (bvs = ouf.bvs()) == null || !bvs.contains("music_url")) {
            return;
        }
        zn();
        String fs = ouf.fs();
        if (TextUtils.isEmpty(fs)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e) {
                iqz.zn("MusicCacheManager", e.getMessage());
            }
            zmn(0, -1L, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "music url string is null");
            return;
        }
        File fs2 = fs(fs);
        if (fs2 == null) {
            return;
        }
        fs2.getPath();
        if (zmn(fs2)) {
            zmn(2, -1L, -1, null);
        } else {
            zmn(nqiVar, fs, fs2);
        }
    }

    public File fs(String str) {
        String zmn = btk.zmn(str);
        if (zmn == null) {
            return null;
        }
        File zmn2 = zmn(kgc.zmn());
        zmn2.getAbsoluteFile();
        return new File(zmn2, zmn);
    }

    private File zmn(Context context) {
        return nps.fs(context, new File(CacheDirFactory.getRootDir()).getName() + "/music");
    }

    private boolean zmn(File file) {
        return file.exists() && file.length() != 0;
    }

    private void zmn(nqi nqiVar, String str, File file) {
        if (zn(str)) {
            this.zn.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.nps.fs.zmn fb = fs.fs().zn().fb();
            fb.zn(str);
            fb.zmn(file.getParent(), file.getName());
            fb.fb(str);
            this.zmn.add(str);
            fb.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.btk.zmn.1
                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                    fsVar.zn();
                    fsVar.zmn();
                    String fb2 = znVar.fb();
                    Long l = (Long) zmn.this.zn.get(fb2);
                    if (fsVar.hhw() && fsVar.btk() != null && fsVar.btk().exists()) {
                        fsVar.btk();
                        if (l != null) {
                            zmn.this.zn.remove(fb2);
                            zmn.this.zmn(1, SystemClock.elapsedRealtime() - l.longValue(), -1, null);
                        }
                        try {
                            nps.fs(fsVar.btk());
                        } catch (IOException e) {
                            iqz.zn("MusicCacheManager", e.getMessage());
                        }
                    }
                    if (fsVar.hhw() || l == null) {
                        return;
                    }
                    zmn.this.zmn(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                    Long l = (Long) zmn.this.zn.get(znVar.fb());
                    if (l != null) {
                        zmn.this.zmn(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    private boolean zn(String str) {
        return !this.zmn.contains(str);
    }

    public void fs() {
        File zmn = zmn(kgc.zmn());
        zmn.getAbsolutePath();
        try {
            this.fs.zmn(zmn);
        } catch (IOException e) {
            iqz.zmn("MusicCacheManager", "trimFileCache fail", e);
        }
    }

    public void zn() {
        fb.zmn("music_preload_start", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.btk.zmn.2
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                com.bytedance.sdk.openadsdk.cyb.zmn.fb zmn = com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("music_preload_start");
                zmn.zmn();
                return zmn;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final int i, final long j, final int i2, final String str) {
        fb.zmn("music_preload_finish", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.btk.zmn.3
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i);
                long j2 = j;
                if (j2 != -1) {
                    jSONObject.put("load_duration", j2);
                }
                com.bytedance.sdk.openadsdk.cyb.zmn.fb fs = com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("music_preload_finish").fs(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    fs.fs(i2);
                    fs.hhw(str);
                }
                fs.zmn();
                return fs;
            }
        });
    }

    public void zmn(final boolean z) {
        fb.zmn("music_cache", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.btk.zmn.4
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z);
                com.bytedance.sdk.openadsdk.cyb.zmn.fb fs = com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("music_cache").fs(jSONObject.toString());
                fs.zmn();
                return fs;
            }
        });
    }
}
