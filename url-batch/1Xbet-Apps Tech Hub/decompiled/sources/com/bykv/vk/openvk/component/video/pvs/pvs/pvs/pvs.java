package com.bykv.vk.openvk.component.video.pvs.pvs.pvs;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MediaCacheDirImpl.java */
/* loaded from: classes.dex */
public class pvs implements com.bykv.vk.openvk.component.video.api.pvs.icD {
    private String pvs = "video_reward_full";
    private String icD = "video_brand";
    private String vG = "video_splash";
    private String Jd = "video_default";
    private String NB = null;
    private String sUS = null;
    private String yiw = null;
    private String so = null;
    private String Mxy = null;

    @Override // com.bykv.vk.openvk.component.video.api.pvs.icD
    public void pvs(String str) {
        this.NB = str;
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs.icD
    public String vG() {
        if (this.Mxy == null) {
            this.Mxy = this.NB + File.separator + this.Jd;
            File file = new File(this.Mxy);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.Mxy;
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs.icD
    public String pvs() {
        if (this.sUS == null) {
            this.sUS = this.NB + File.separator + this.pvs;
            File file = new File(this.sUS);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.sUS;
    }

    public String NB() {
        if (this.yiw == null) {
            this.yiw = this.NB + File.separator + this.icD;
            File file = new File(this.yiw);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.yiw;
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs.icD
    public String icD() {
        if (this.so == null) {
            this.so = this.NB + File.separator + this.vG;
            File file = new File(this.so);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.so;
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs.icD
    public synchronized void Jd() {
        Set<String> set = null;
        for (com.bykv.vk.openvk.component.video.api.pvs.pvs pvsVar : sUS()) {
            File[] pvs = pvsVar.pvs();
            if (pvs != null && pvs.length >= pvsVar.icD()) {
                if (set == null) {
                    set = yiw();
                }
                int icD = pvsVar.icD() - 2;
                if (icD < 0) {
                    icD = 0;
                }
                pvs(pvsVar.pvs(), icD, set);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs.icD
    public boolean pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        if (TextUtils.isEmpty(vGVar.icD()) || TextUtils.isEmpty(vGVar.IP())) {
            return false;
        }
        return new File(vGVar.icD(), vGVar.IP()).exists();
    }

    @Override // com.bykv.vk.openvk.component.video.api.pvs.icD
    public long icD(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        if (TextUtils.isEmpty(vGVar.icD()) || TextUtils.isEmpty(vGVar.IP())) {
            return 0L;
        }
        return com.bykv.vk.openvk.component.video.pvs.NB.icD.pvs(vGVar.icD(), vGVar.IP());
    }

    private static void pvs(File[] fileArr, int i, Set<String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List asList = Arrays.asList(fileArr);
                    Collections.sort(asList, new Comparator<File>() { // from class: com.bykv.vk.openvk.component.video.pvs.pvs.pvs.pvs.1
                        @Override // java.util.Comparator
                        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
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

    private List<com.bykv.vk.openvk.component.video.api.pvs.pvs> sUS() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.component.video.api.pvs.pvs(new File(pvs()).listFiles(), com.bykv.vk.openvk.component.video.pvs.pvs.vG()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.pvs.pvs(new File(icD()).listFiles(), com.bykv.vk.openvk.component.video.pvs.pvs.icD()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.pvs.pvs(new File(NB()).listFiles(), com.bykv.vk.openvk.component.video.pvs.pvs.Jd()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.pvs.pvs(new File(vG()).listFiles(), com.bykv.vk.openvk.component.video.pvs.pvs.NB()));
        return arrayList;
    }

    private Set<String> yiw() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.component.video.pvs.pvs.pvs pvsVar : com.bykv.vk.openvk.component.video.pvs.pvs.pvs.pvs.values()) {
            if (pvsVar != null && pvsVar.pvs() != null) {
                com.bykv.vk.openvk.component.video.api.vG.vG pvs = pvsVar.pvs();
                hashSet.add(com.bykv.vk.openvk.component.video.pvs.NB.icD.icD(pvs.icD(), pvs.IP()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.component.video.pvs.NB.icD.vG(pvs.icD(), pvs.IP()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.component.video.pvs.pvs.icD.icD icd : com.bykv.vk.openvk.component.video.pvs.pvs.icD.vG.pvs.values()) {
            if (icd != null && icd.pvs() != null) {
                com.bykv.vk.openvk.component.video.api.vG.vG pvs2 = icd.pvs();
                hashSet.add(com.bykv.vk.openvk.component.video.pvs.NB.icD.icD(pvs2.icD(), pvs2.IP()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.component.video.pvs.NB.icD.vG(pvs2.icD(), pvs2.IP()).getAbsolutePath());
            }
        }
        return hashSet;
    }
}
