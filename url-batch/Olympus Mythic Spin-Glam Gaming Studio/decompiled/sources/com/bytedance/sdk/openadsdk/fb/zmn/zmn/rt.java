package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.zmn.zn;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class rt extends com.bytedance.zmn.fs<mw> {
    @Override // com.bytedance.zmn.fs
    public void zmn(ArrayList<mw> arrayList, final zn.fs<mw> fsVar) {
        if (!kgc.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn())) {
            fsVar.zmn(arrayList, false);
            return;
        }
        Iterator<mw> it = arrayList.iterator();
        while (it.hasNext()) {
            final mw next = it.next();
            if (!com.bytedance.sdk.component.nps.zn.hhw.zmn(next.iv())) {
                ArrayList<mw> arrayList2 = new ArrayList<>();
                arrayList2.add(next);
                fsVar.zmn(arrayList2, true);
            } else if (next.btk() >= zmn(next.rc())) {
                ArrayList<mw> arrayList3 = new ArrayList<>();
                arrayList3.add(next);
                fsVar.zmn(arrayList3, true);
            } else {
                nu.zmn().submit(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.rt.1
                    @Override // java.lang.Runnable
                    public void run() {
                        rt.this.zmn(next, (zn.fs<mw>) fsVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(mw mwVar, zn.fs<mw> fsVar) {
        String zmn = com.bytedance.sdk.openadsdk.bjh.zmn.zmn(mwVar.iv(), mwVar.bvs());
        com.bytedance.sdk.openadsdk.fb.zmn.zn znVar = new com.bytedance.sdk.openadsdk.fb.zmn.zn();
        znVar.zmn("User-Agent", oub.fb());
        znVar.zmn("csj_client_source_from", "1");
        znVar.zmn(zmn);
        com.bytedance.sdk.component.hhw.zmn.btk.fb zmn2 = znVar.zmn();
        com.bytedance.sdk.component.hhw.zmn.hhw.fb fbVar = new com.bytedance.sdk.component.hhw.zmn.hhw.fb(mwVar.hhw(), zmn, mwVar.bvs(), mwVar.zg(), mwVar.rc());
        fbVar.fs(true);
        ArrayList<mw> arrayList = new ArrayList<>();
        arrayList.add(mwVar);
        if (zmn2 != null && zmn2.zmn()) {
            fsVar.zmn(arrayList, true);
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("track_link_result", false, new com.bytedance.sdk.openadsdk.fb.zmn.bvs(true, fbVar));
            return;
        }
        if (zmn2 != null) {
            fbVar.fs(zmn2.fs());
            fbVar.zn(zmn2.zn());
        }
        if (mwVar.btk() >= zmn(mwVar.rc())) {
            fsVar.zmn(arrayList, true);
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("track_link_result", false, new com.bytedance.sdk.openadsdk.fb.zmn.bvs(false, fbVar));
        } else {
            fsVar.zmn(arrayList, false);
        }
    }

    @Override // com.bytedance.zmn.fs
    public long zmn() {
        return zn.zmn().zn().zmn;
    }

    @Override // com.bytedance.zmn.fs
    public int fs() {
        return zn.zmn().zn().fs;
    }

    @Override // com.bytedance.zmn.fs
    public String fb() {
        return "track_urls";
    }

    @Override // com.bytedance.zmn.fs
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public mw zmn(String str, byte[] bArr, int i, int i2) {
        try {
            mw mwVar = new mw(str, PangleNetworkBridge.jsonObjectInit(new String(bArr, StandardCharsets.UTF_8)));
            mwVar.zmn(i);
            mwVar.fs(i2);
            return mwVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.zmn.fs
    public long btk() {
        return zn.zmn().zn().zn;
    }

    public int zmn(String str) {
        com.bytedance.sdk.openadsdk.fb.zmn.iv wq = com.bytedance.sdk.openadsdk.core.settings.rc.fs().wq();
        if (wq == null) {
            return 3;
        }
        return wq.zmn(str);
    }

    @Override // com.bytedance.zmn.fs
    public zn.InterfaceC0213zn nps() {
        return fs.zmn();
    }

    @Override // com.bytedance.zmn.fs
    public int zg() {
        return zn.zmn().zn().hhw;
    }

    @Override // com.bytedance.zmn.fs
    public int bvs() {
        return zn.zmn().zn().nps;
    }

    @Override // com.bytedance.zmn.fs
    public long iv() {
        return zn.zmn().zn().zg;
    }

    @Override // com.bytedance.zmn.fs
    public boolean hhw() {
        return fs.fs();
    }
}
