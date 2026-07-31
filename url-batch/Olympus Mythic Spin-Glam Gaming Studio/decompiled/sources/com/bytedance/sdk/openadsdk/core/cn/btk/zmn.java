package com.bytedance.sdk.openadsdk.core.cn.btk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn;
import com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn;
import com.bytedance.sdk.component.fs.zmn.nps;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.fb.btk.fs.bvs;
import com.bytedance.sdk.openadsdk.fb.btk.fs.iv;
import com.bytedance.sdk.openadsdk.fb.btk.fs.klz;
import com.bytedance.sdk.openadsdk.fb.btk.fs.rc;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes13.dex */
public class zmn {
    public static final com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn zmn = new com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs.zmn();

    private static boolean zmn(zn znVar) {
        return true;
    }

    public static void zmn(final zn znVar, final zmn.InterfaceC0101zmn interfaceC0101zmn) {
        nqi nqiVar;
        AdSlot adSlot;
        if ((znVar.hhw() > 0 || znVar.mw()) && znVar.kgc() != -2) {
            if (znVar.kgc() != 1) {
                znVar.btk(6000);
                znVar.hhw(6000);
                znVar.nps(6000);
                boolean z = znVar.btk("material_meta") != null && (znVar.btk("material_meta") instanceof nqi);
                boolean z2 = znVar.btk("ad_slot") != null && (znVar.btk("ad_slot") instanceof AdSlot);
                if (z && z2) {
                    nqiVar = (nqi) znVar.btk("material_meta");
                    AdSlot adSlot2 = (AdSlot) znVar.btk("ad_slot");
                    fs(znVar, nqiVar, adSlot2);
                    adSlot = adSlot2;
                } else {
                    nqiVar = null;
                    adSlot = null;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final nqi nqiVar2 = nqiVar;
                final AdSlot adSlot3 = adSlot;
                final zmn.InterfaceC0101zmn interfaceC0101zmn2 = new zmn.InterfaceC0101zmn() { // from class: com.bytedance.sdk.openadsdk.core.cn.btk.zmn.1
                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                    public void zmn(zn znVar2, int i) {
                        zmn.InterfaceC0101zmn interfaceC0101zmn3 = zmn.InterfaceC0101zmn.this;
                        if (interfaceC0101zmn3 != null) {
                            interfaceC0101zmn3.zmn(znVar2, i);
                        }
                        if (nqiVar2 == null || adSlot3 == null) {
                            return;
                        }
                        zmn.fs(znVar, nqiVar2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                    public void zmn(zn znVar2, int i, String str) {
                        zmn.InterfaceC0101zmn interfaceC0101zmn3 = zmn.InterfaceC0101zmn.this;
                        if (interfaceC0101zmn3 != null) {
                            interfaceC0101zmn3.zmn(znVar2, i, str);
                        }
                        if (nqiVar2 == null || adSlot3 == null) {
                            return;
                        }
                        zmn.fs(znVar, nqiVar2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime, i, str);
                    }

                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                    public void fs(zn znVar2, int i) {
                        AdSlot adSlot4;
                        zmn.InterfaceC0101zmn interfaceC0101zmn3 = zmn.InterfaceC0101zmn.this;
                        if (interfaceC0101zmn3 != null) {
                            interfaceC0101zmn3.zmn(znVar2, i);
                        }
                        nqi nqiVar3 = nqiVar2;
                        if (nqiVar3 != null && (adSlot4 = adSlot3) != null) {
                            zmn.zn(znVar, nqiVar3, adSlot4);
                        }
                        znVar.olo();
                    }
                };
                if (!zmn(znVar.cyb())) {
                    if (interfaceC0101zmn != null) {
                        interfaceC0101zmn.zmn(znVar, 404, "unexpected url: " + znVar.cyb());
                    }
                    fs(znVar, nqiVar, adSlot, SystemClock.elapsedRealtime() - elapsedRealtime, -1, "video url is invalid");
                    return;
                }
                com.bytedance.sdk.component.zg.fs.zn znVar2 = new com.bytedance.sdk.component.zg.fs.zn("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.cn.btk.zmn.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            zmn.zmn.zmn(kgc.zmn(), znVar, interfaceC0101zmn2);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                };
                if (nu.hhw()) {
                    nu.zn((Runnable) znVar2);
                    return;
                } else {
                    znVar2.run();
                    return;
                }
            }
        }
        if (interfaceC0101zmn != null) {
            interfaceC0101zmn.zmn(znVar, 100);
        }
    }

    private static void fs(zn znVar, nqi nqiVar, AdSlot adSlot) {
        if (zmn(znVar)) {
            long klz = znVar.mw() ? znVar.klz() : znVar.hhw();
            com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(nqiVar, (String) null, -1, znVar);
            zmn2.zmn(new rc(znVar.cyb(), klz));
            fb.zmn("load_video_start", zmn2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(zn znVar, nqi nqiVar, AdSlot adSlot, long j, int i, String str) {
        if (zmn(znVar)) {
            com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(nqiVar, (String) null, -1, znVar);
            iv ivVar = new iv();
            ivVar.zmn(znVar.cyb());
            ivVar.zmn(znVar.hhw());
            ivVar.fs(j);
            ivVar.zmn(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            ivVar.fs(str);
            ivVar.zn("");
            zmn2.zmn(ivVar);
            com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(zmn2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(zn znVar, nqi nqiVar, AdSlot adSlot, long j) {
        if (zmn(znVar)) {
            com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(nqiVar, (String) null, -1, znVar);
            klz klzVar = new klz();
            klzVar.zmn(znVar.cyb());
            klzVar.zmn(znVar.hhw());
            klzVar.fs(j);
            if (znVar.doe() == 1) {
                klzVar.zn(1L);
            } else {
                klzVar.zn(0L);
            }
            zmn2.zmn(klzVar);
            fb.zmn("load_video_success", zmn2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zn(zn znVar, nqi nqiVar, AdSlot adSlot) {
        if (zmn(znVar)) {
            com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(nqiVar, (String) null, -1, znVar);
            zmn2.zmn(new bvs(znVar.cyb(), znVar.hhw()));
            com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.fs(zmn2);
        }
    }

    public static boolean zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return nps.zn(str) != null;
    }
}
