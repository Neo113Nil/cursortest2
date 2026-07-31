package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public class kgc {
    private static volatile kgc btk;
    private final Map<String, List<com.bytedance.sdk.openadsdk.component.btk.fs>> zmn = new ConcurrentHashMap();
    private final Map<String, List<String>> fs = new ConcurrentHashMap();
    private final Map<String, AdSlot> zn = new ConcurrentHashMap();
    private final Object fb = new Object();
    private final Runnable hhw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.kgc.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(2);
            com.bytedance.sdk.component.hhw.zmn.nps.zmn.zmn().postDelayed(kgc.this.hhw, com.bytedance.sdk.openadsdk.component.nps.zmn.iv());
        }
    };

    public static kgc zmn() {
        if (btk == null) {
            synchronized (kgc.class) {
                try {
                    if (btk == null) {
                        btk = new kgc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return btk;
    }

    private kgc() {
    }

    private List<com.bytedance.sdk.openadsdk.component.btk.fs> zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String fs = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), (String) null);
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(fs)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(fs);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(com.bytedance.sdk.openadsdk.component.btk.fs.zmn(jSONArray.getJSONObject(i)));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private void zmn(String str, List<com.bytedance.sdk.openadsdk.component.btk.fs> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.component.btk.fs fsVar : list) {
            if (fsVar != null) {
                try {
                    jSONArray.put(fsVar.zmn());
                } catch (Exception unused) {
                }
            }
        }
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), jSONArray.toString());
    }

    public void zmn(nqi nqiVar, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        AdSlot utx;
        if (nqiVar == null || zmnVar == null || (utx = nqiVar.utx()) == null || nqiVar.dbc() || !TextUtils.isEmpty(utx.getBidAdm()) || nqiVar.eec() == 2) {
            return;
        }
        String codeId = utx.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        synchronized (this.fb) {
            try {
                int klz = com.bytedance.sdk.openadsdk.component.nps.zmn.klz();
                if (!this.zmn.containsKey(codeId) && this.zmn.size() >= klz) {
                    this.zmn.size();
                    return;
                }
                com.bytedance.sdk.openadsdk.component.btk.fs fs = fs(nqiVar, zmnVar);
                List<com.bytedance.sdk.openadsdk.component.btk.fs> list = this.zmn.get(codeId);
                if (list == null) {
                    list = new ArrayList<>();
                }
                zmn(list);
                int zg = com.bytedance.sdk.openadsdk.component.nps.zmn.zg();
                if (list.size() < zg) {
                    list.size();
                    com.bytedance.sdk.openadsdk.component.fb.fs.zmn(nqiVar, list.size(), utx.getCacheScene(), false);
                    list.add(fs);
                    this.zmn.put(codeId, list);
                    zmn(utx, nqiVar.wbj());
                    zmn(codeId, list);
                    return;
                }
                if (zmn(list, utx) && list.size() < zg) {
                    list.add(fs);
                    zmn(codeId, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean zmn(String str, int i, int i2) {
        boolean z = true;
        if (!com.bytedance.sdk.openadsdk.component.nps.zmn.btk()) {
            return i2 <= 0;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int zg = com.bytedance.sdk.openadsdk.component.nps.zmn.zg();
        synchronized (this.fb) {
            try {
                List<com.bytedance.sdk.openadsdk.component.btk.fs> list = this.zmn.get(str);
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    long currentTimeMillis = System.currentTimeMillis();
                    long bvs = com.bytedance.sdk.openadsdk.component.nps.zmn.bvs();
                    for (com.bytedance.sdk.openadsdk.component.btk.fs fsVar : list) {
                        if (fsVar != null) {
                            if (currentTimeMillis / 1000 <= fsVar.zn() && currentTimeMillis - fsVar.fb() <= bvs) {
                            }
                            size--;
                        }
                    }
                    if (i + size >= zg) {
                        z = false;
                    }
                    list.size();
                    return z;
                }
                z = false;
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.bytedance.sdk.openadsdk.component.btk.fs zmn(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return null;
        }
        synchronized (this.fb) {
            try {
                zmn(codeId, adSlot);
                List<com.bytedance.sdk.openadsdk.component.btk.fs> list = this.zmn.get(codeId);
                List<String> list2 = this.fs.get(codeId);
                if (list != null && !list.isEmpty()) {
                    boolean zmn = zmn(list);
                    if (list.isEmpty()) {
                        list.size();
                        zmn(codeId, (String) null);
                        return null;
                    }
                    if (zmn) {
                        zmn(codeId, list);
                    }
                    List<com.bytedance.sdk.openadsdk.component.btk.fs> zmn2 = zmn(list, adSlot, list2);
                    if (zmn2 != null && !zmn2.isEmpty()) {
                        Collections.sort(zmn2, com.bytedance.sdk.openadsdk.component.btk.fs.zmn);
                        com.bytedance.sdk.openadsdk.component.btk.fs fsVar = zmn2.get(0);
                        if (com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(adSlot) && list2 != null) {
                            if (list2.size() >= list.size()) {
                                return null;
                            }
                            list2.add(fsVar.hhw());
                        }
                        return fsVar;
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    private void zmn(AdSlot adSlot, String str) {
        if (adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = adSlot.getCacheScene() != 0;
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId) || z || !com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(adSlot)) {
            return;
        }
        List<String> list = this.fs.get(codeId);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (list.contains(str)) {
            return;
        }
        list.add(str);
        this.fs.put(codeId, list);
    }

    private void zmn(String str, AdSlot adSlot) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int klz = com.bytedance.sdk.openadsdk.component.nps.zmn.klz();
        if (!this.zmn.containsKey(str) && this.zmn.size() >= klz) {
            this.zmn.size();
            return;
        }
        List<com.bytedance.sdk.openadsdk.component.btk.fs> list = this.zmn.get(str);
        if (list == null || list.isEmpty()) {
            List<com.bytedance.sdk.openadsdk.component.btk.fs> zmn = zmn(str);
            if (zmn == null) {
                zmn = new ArrayList<>();
            }
            this.zmn.put(str, zmn);
        }
        if (!this.fs.containsKey(str)) {
            this.fs.put(str, new ArrayList());
        }
        fs(adSlot);
    }

    private com.bytedance.sdk.openadsdk.component.btk.fs fs(nqi nqiVar, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        if (nqiVar == null || nqiVar.utx() == null || zmnVar == null) {
            return null;
        }
        String codeId = nqiVar.utx().getCodeId();
        String wbj = nqiVar.wbj();
        return new com.bytedance.sdk.openadsdk.component.btk.fs(codeId, zmnVar.klz(), nqiVar.mf(), System.currentTimeMillis(), nqiVar.pi(), wbj);
    }

    private boolean zmn(List<com.bytedance.sdk.openadsdk.component.btk.fs> list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<com.bytedance.sdk.openadsdk.component.btk.fs> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.btk.fs next = it.next();
                if (next != null && currentTimeMillis > next.zn()) {
                    com.bytedance.sdk.openadsdk.component.hhw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn(next.fs());
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    private boolean zmn(List<com.bytedance.sdk.openadsdk.component.btk.fs> list, AdSlot adSlot) {
        if (list != null && !list.isEmpty() && adSlot != null) {
            long bvs = com.bytedance.sdk.openadsdk.component.nps.zmn.bvs();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<com.bytedance.sdk.openadsdk.component.btk.fs> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.btk.fs next = it.next();
                if (next != null && currentTimeMillis - next.fb() > bvs) {
                    it.remove();
                    com.bytedance.sdk.openadsdk.component.fb.fs.zmn(next.fs(), list.size(), adSlot.getCacheScene(), true);
                    return true;
                }
            }
        }
        return false;
    }

    private List<com.bytedance.sdk.openadsdk.component.btk.fs> zmn(List<com.bytedance.sdk.openadsdk.component.btk.fs> list, AdSlot adSlot, List<String> list2) {
        if (adSlot == null || list == null || list.isEmpty() || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.component.btk.fs fsVar : list) {
            if (fsVar != null) {
                if (com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(adSlot) && list2.contains(fsVar.hhw())) {
                    adSlot.getCodeId();
                    fsVar.hhw();
                } else {
                    arrayList.add(fsVar);
                }
            }
        }
        return arrayList;
    }

    public void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.fb) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.zmn.remove(str);
                    fs(str);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.component.btk.fs> list = this.zmn.get(str);
                if (list != null && !list.isEmpty()) {
                    Iterator<com.bytedance.sdk.openadsdk.component.btk.fs> it = list.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.openadsdk.component.btk.fs next = it.next();
                        if (next != null && str2.equals(next.hhw())) {
                            list.size();
                            it.remove();
                        }
                    }
                    if (list.isEmpty()) {
                        list.size();
                        this.zmn.remove(str);
                        fs(str);
                    } else if (list.size() < com.bytedance.sdk.openadsdk.component.nps.zmn.zg()) {
                        list.size();
                        zmn(str, list);
                    }
                    List<String> list2 = this.fs.get(str);
                    if (list2 != null && !list2.isEmpty()) {
                        if (TextUtils.isEmpty(str2)) {
                            this.fs.remove(str);
                        } else {
                            list2.remove(str2);
                            if (list2.isEmpty()) {
                                this.fs.remove(str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void fs() {
        try {
            synchronized (this.fb) {
                this.zmn.clear();
                this.fs.clear();
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_material_cache_origin");
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_material_cache_encrypt");
            }
        } catch (Exception unused) {
        }
    }

    private void fs(String str) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)));
    }

    private void fs(AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        if (this.zn.size() < com.bytedance.sdk.openadsdk.component.nps.zmn.klz() && !this.zn.containsKey(codeId)) {
            this.zn.put(codeId, adSlot);
            Objects.toString(this.zn.keySet());
        }
    }

    public Map<String, AdSlot> zn() {
        return this.zn;
    }

    public void fb() {
        com.bytedance.sdk.component.hhw.zmn.nps.zmn.zmn().postDelayed(this.hhw, com.bytedance.sdk.openadsdk.component.nps.zmn.iv());
    }
}
