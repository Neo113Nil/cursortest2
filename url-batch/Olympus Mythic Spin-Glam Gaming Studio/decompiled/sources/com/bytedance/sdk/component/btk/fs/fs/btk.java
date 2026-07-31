package com.bytedance.sdk.component.btk.fs.fs;

import com.bytedance.sdk.component.btk.kw;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class btk implements hhw {
    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public boolean zmn(com.bytedance.sdk.component.btk.fs.zn.zn znVar, kw kwVar, com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        List<com.bytedance.sdk.component.btk.fs.zn.zn> list;
        String kw = znVar.kw();
        Map<String, List<com.bytedance.sdk.component.btk.fs.zn.zn>> bvs = znVar.cyb().bvs();
        znVar.rc();
        znVar.zmn();
        synchronized (bvs) {
            try {
                list = bvs.get(kw);
                if (list == null) {
                    list = new CopyOnWriteArrayList<>();
                    bvs.put(kw, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (list) {
            list.add(znVar);
            if (list.size() <= 1) {
                return true;
            }
            znVar.rc();
            znVar.zmn();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public String zmn() {
        return "check_duplicate";
    }
}
