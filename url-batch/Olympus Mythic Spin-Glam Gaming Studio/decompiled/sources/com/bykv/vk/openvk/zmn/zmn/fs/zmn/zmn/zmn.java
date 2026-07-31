package com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public class zmn implements com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs {
    private String zmn = "video_reward_full";
    private String fs = "video_brand";
    private String zn = "video_splash";
    private String fb = "video_default";
    private String btk = null;
    private String hhw = null;
    private String nps = null;
    private String zg = null;
    private String bvs = null;

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs
    public void zmn(String str) {
        this.btk = str;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs
    public String zn() {
        if (this.bvs == null) {
            this.bvs = this.btk + File.separator + this.fb;
            File file = new File(this.bvs);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.bvs;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs
    public String zmn() {
        if (this.hhw == null) {
            this.hhw = this.btk + File.separator + this.zmn;
            File file = new File(this.hhw);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.hhw;
    }

    public String btk() {
        if (this.nps == null) {
            this.nps = this.btk + File.separator + this.fs;
            File file = new File(this.nps);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.nps;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs
    public String fs() {
        if (this.zg == null) {
            this.zg = this.btk + File.separator + this.zn;
            File file = new File(this.zg);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.zg;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs
    public synchronized void fb() {
        try {
            Set<String> set = null;
            for (com.bykv.vk.openvk.zmn.zmn.zmn.zmn.zmn zmnVar : hhw()) {
                File[] zmn = zmnVar.zmn();
                if (zmn != null && zmn.length >= zmnVar.fs()) {
                    if (set == null) {
                        set = nps();
                    }
                    int fs = zmnVar.fs() - 2;
                    if (fs < 0) {
                        fs = 0;
                    }
                    zmn(zmnVar.zmn(), fs, set);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs
    public boolean zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        if (TextUtils.isEmpty(znVar.btk()) || TextUtils.isEmpty(znVar.olo())) {
            return false;
        }
        return new File(znVar.btk(), znVar.olo()).exists();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs
    public long fs(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        if (TextUtils.isEmpty(znVar.btk()) || TextUtils.isEmpty(znVar.olo())) {
            return 0L;
        }
        return com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.zmn(znVar.btk(), znVar.olo());
    }

    private static void zmn(File[] fileArr, int i, Set<String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List asList = Arrays.asList(fileArr);
                    Collections.sort(asList, new Comparator<File>() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zmn.1
                        @Override // java.util.Comparator
                        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long lastModified = file2.lastModified() - file.lastModified();
                            if (lastModified == 0) {
                                return 0;
                            }
                            return lastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i < asList.size()) {
                        File file = (File) asList.get(i);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) asList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private List<com.bykv.vk.openvk.zmn.zmn.zmn.zmn.zmn> hhw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.zmn.zmn.zmn.zmn.zmn(new File(zmn()).listFiles(), com.bykv.vk.openvk.zmn.zmn.fs.zmn.zn()));
        arrayList.add(new com.bykv.vk.openvk.zmn.zmn.zmn.zmn.zmn(new File(fs()).listFiles(), com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs()));
        arrayList.add(new com.bykv.vk.openvk.zmn.zmn.zmn.zmn.zmn(new File(btk()).listFiles(), com.bykv.vk.openvk.zmn.zmn.fs.zmn.fb()));
        arrayList.add(new com.bykv.vk.openvk.zmn.zmn.zmn.zmn.zmn(new File(zn()).listFiles(), com.bykv.vk.openvk.zmn.zmn.fs.zmn.btk()));
        return arrayList;
    }

    private Set<String> nps() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn zmnVar : com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zmn.values()) {
            if (zmnVar != null && zmnVar.zmn() != null) {
                com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn zmn = zmnVar.zmn();
                hashSet.add(com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.fs(zmn.btk(), zmn.olo()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.zn(zmn.btk(), zmn.olo()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs.fs fsVar : com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs.zn.zmn.values()) {
            if (fsVar != null && fsVar.zmn() != null) {
                com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn zmn2 = fsVar.zmn();
                hashSet.add(com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.fs(zmn2.btk(), zmn2.olo()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.zn(zmn2.btk(), zmn2.olo()).getAbsolutePath());
            }
        }
        return hashSet;
    }
}
