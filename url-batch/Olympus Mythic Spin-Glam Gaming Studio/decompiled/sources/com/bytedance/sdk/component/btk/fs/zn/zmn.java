package com.bytedance.sdk.component.btk.fs.zn;

import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.btk.kw;
import com.bytedance.sdk.component.btk.rc;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class zmn<T> {
    private kw fs;
    private zn zmn;

    public zmn(zn znVar, kw kwVar) {
        this.zmn = znVar;
        this.fs = kwVar;
    }

    public void zmn(rc<T> rcVar) {
        try {
            kw kwVar = this.fs;
            if (kwVar != null) {
                kwVar.zmn("success", this.zmn);
            }
            String kw = this.zmn.kw();
            Map<String, List<zn>> bvs = this.zmn.cyb().bvs();
            List<zn> list = bvs.get(kw);
            if (list == null) {
                cyb hhw = this.zmn.hhw();
                if (hhw != null) {
                    hhw.toString();
                    this.zmn.zg();
                    hhw.zmn(rcVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (zn znVar : list) {
                            cyb hhw2 = znVar.hhw();
                            if (hhw2 != null) {
                                hhw2.toString();
                                znVar.zg();
                                hhw2.zmn(rcVar);
                            }
                        }
                        list.clear();
                        bvs.remove(kw);
                    } finally {
                    }
                }
            }
            kw kwVar2 = this.fs;
            if (kwVar2 != null) {
                kwVar2.fs("success", this.zmn);
            }
        } catch (Throwable unused) {
        }
    }

    public void zmn(int i, String str, Throwable th) {
        try {
            kw kwVar = this.fs;
            if (kwVar != null) {
                kwVar.zmn(X3.i.t, this.zmn);
            }
            String kw = this.zmn.kw();
            Map<String, List<zn>> bvs = this.zmn.cyb().bvs();
            List<zn> list = bvs.get(kw);
            if (list == null) {
                cyb hhw = this.zmn.hhw();
                if (hhw != null) {
                    hhw.zmn(i, str, th);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<zn> it = list.iterator();
                        while (it.hasNext()) {
                            cyb hhw2 = it.next().hhw();
                            if (hhw2 != null) {
                                hhw2.toString();
                                hhw2.zmn(i, str, th);
                            }
                        }
                        list.clear();
                        bvs.remove(kw);
                    } finally {
                    }
                }
            }
            kw kwVar2 = this.fs;
            if (kwVar2 != null) {
                kwVar2.fs(X3.i.t, this.zmn);
            }
        } catch (Throwable unused) {
        }
    }
}
