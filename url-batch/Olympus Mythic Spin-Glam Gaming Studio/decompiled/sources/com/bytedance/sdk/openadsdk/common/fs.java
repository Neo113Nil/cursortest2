package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class fs {
    private final String btk;
    private final zmn fb;
    private final Map<nqi, Long> hhw = Collections.synchronizedMap(new HashMap());

    @SuppressLint({"StaticFieldLeak"})
    private final Context zn;
    private static final HashMap<String, fs> zmn = new HashMap<>();
    private static final HashMap<String, zmn> fs = new HashMap<>();

    private fs(Context context, String str) {
        this.zn = context;
        zmn zmnVar = fs.get(str);
        this.fb = zmnVar == null ? new zmn(str) : zmnVar;
        this.btk = str;
    }

    public static fs zmn(String str) {
        fs fsVar;
        HashMap<String, fs> hashMap = zmn;
        fs fsVar2 = hashMap.get(str);
        if (fsVar2 != null) {
            return fsVar2;
        }
        synchronized (fs.class) {
            try {
                fsVar = hashMap.get(str);
                if (fsVar == null) {
                    fsVar = new fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), str);
                    hashMap.put(str, fsVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fsVar;
    }

    public static void zmn(String str, zmn zmnVar) {
        fs.put(str, zmnVar);
    }

    public void zmn(String str, nqi nqiVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String zn = this.fb.zn(str);
        String wbj = nqiVar != null ? nqiVar.wbj() : "";
        if (TextUtils.isEmpty(zn) || TextUtils.isEmpty(wbj) || zn.equals(wbj)) {
            this.fb.zg(str);
        }
    }

    public void zmn() {
        String str;
        File[] listFiles;
        try {
            boolean nps = com.bytedance.sdk.openadsdk.core.iv.nps(this.btk);
            if (nps) {
                str = FileUploadManager.i;
            } else {
                str = "shared_prefs";
            }
            File file = new File(this.zn.getDataDir(), str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.fs.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(fs.this.btk);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : listFiles) {
                    if (nps) {
                        try {
                            com.bytedance.sdk.component.utils.nps.zn(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.zn.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(fs());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.nps.zn(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void zmn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        nqi nps;
        if ((zmnVar != null && zmnVar.nps() != null && zmnVar.nps().dbc()) || zmnVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (nps = zmnVar.nps()) == null || nps.eec() == 2) {
            return;
        }
        try {
            this.fb.zmn(adSlot, zmnVar.klz(), zmnVar.zn());
        } catch (Throwable unused) {
        }
    }

    public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, boolean z) {
        if (zmnVar == null || !zmnVar.hhw()) {
            return false;
        }
        if (z) {
            Iterator<nqi> it = zmnVar.btk().iterator();
            while (it.hasNext()) {
                if (!zmn(it.next())) {
                    it.remove();
                }
            }
        }
        return zmnVar.hhw();
    }

    public String fs(String str) {
        try {
            String fs2 = this.fb.fs(str);
            if (TextUtils.isEmpty(fs2)) {
                return null;
            }
            return fs2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String zmn(String str, long j) {
        long fb = this.fb.fb(str);
        boolean btk = this.fb.btk(str);
        if (System.currentTimeMillis() - fb >= j || btk) {
            return null;
        }
        return fs(str);
    }

    private boolean zmn(nqi nqiVar) {
        if (nqiVar != null) {
            return am.zn(nqiVar) || nqiVar.mrt() != null;
        }
        return false;
    }

    private String fs() {
        return CacheDirFactory.getICacheDir(0).zmn();
    }

    public void zn(String str) {
        this.fb.hhw(str);
    }

    public boolean fb(String str) {
        return this.fb.nps(str);
    }

    public static class zmn {
        protected final String zmn;
        private final HashSet<String> nps = new HashSet<>();
        String fs = "material_data";
        String zn = "has_played";
        String fb = "create_time";
        String btk = "in_use_process";
        String hhw = "req_id";

        public zmn(String str) {
            this.zmn = TextUtils.isEmpty(str) ? "" : str;
        }

        protected String zmn(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return this.zmn + "_cache_" + str;
        }

        public String fs(String str) {
            try {
                return com.bytedance.sdk.openadsdk.kw.fb.zmn.fs(zmn(str), this.fs, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public String zn(String str) {
            try {
                return com.bytedance.sdk.openadsdk.kw.fb.zmn.fs(zmn(str), this.hhw, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public long fb(String str) {
            try {
                return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn(str), this.fb, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public boolean btk(String str) {
            try {
                return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn(str), this.zn, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public void hhw(String str) {
            try {
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn(str), this.btk, com.bytedance.sdk.component.utils.phc.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn()));
                this.nps.add(str);
            } catch (Throwable unused) {
            }
        }

        public boolean nps(String str) {
            String zmn;
            String fs;
            try {
                zmn = zmn(str);
                fs = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs(zmn, this.btk, "");
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(fs)) {
                return false;
            }
            if (fs.equals(com.bytedance.sdk.component.utils.phc.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn())) && !this.nps.contains(str)) {
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn, this.btk, "");
                return false;
            }
            return true;
        }

        public void zmn(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String zmn = zmn(codeId);
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn, this.zn, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn, this.fb, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn, this.fs, str);
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn, this.btk, "");
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn, this.hhw, str2);
                this.nps.remove(codeId);
            } catch (Throwable unused) {
            }
        }

        public void zg(String str) {
            try {
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(zmn(str));
                this.nps.remove(str);
            } catch (Throwable unused) {
            }
        }
    }
}
