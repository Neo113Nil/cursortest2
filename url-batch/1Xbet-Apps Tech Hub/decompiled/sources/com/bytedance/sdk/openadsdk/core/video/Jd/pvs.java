package com.bytedance.sdk.openadsdk.core.video.Jd;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.NB.pvs;
import com.bykv.vk.openvk.component.video.api.vG.vG;
import com.bytedance.sdk.component.icD.pvs.yiw;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.Mxy;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.Wyp;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.kj;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.qh;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import org.json.JSONObject;

/* compiled from: VideoPreloadFactory.java */
/* loaded from: classes2.dex */
public class pvs {
    public static final com.bykv.vk.openvk.component.video.api.NB.pvs pvs = new com.bykv.vk.openvk.component.video.pvs.pvs.icD.pvs();

    private static boolean pvs(vG vGVar) {
        return true;
    }

    public static void pvs(final vG vGVar, final pvs.InterfaceC0017pvs interfaceC0017pvs) {
        cR cRVar;
        AdSlot adSlot;
        if ((vGVar.vG() > 0 || vGVar.Wyp()) && vGVar.bNS() != -2) {
            if (vGVar.bNS() != 1) {
                vGVar.Jd(6000);
                vGVar.NB(6000);
                vGVar.sUS(6000);
                boolean z = vGVar.NB("material_meta") != null && (vGVar.NB("material_meta") instanceof cR);
                boolean z2 = vGVar.NB("ad_slot") != null && (vGVar.NB("ad_slot") instanceof AdSlot);
                if (z && z2) {
                    cRVar = (cR) vGVar.NB("material_meta");
                    AdSlot adSlot2 = (AdSlot) vGVar.NB("ad_slot");
                    icD(vGVar, cRVar, adSlot2);
                    adSlot = adSlot2;
                } else {
                    cRVar = null;
                    adSlot = null;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final cR cRVar2 = cRVar;
                final AdSlot adSlot3 = adSlot;
                final pvs.InterfaceC0017pvs interfaceC0017pvs2 = new pvs.InterfaceC0017pvs() { // from class: com.bytedance.sdk.openadsdk.core.video.Jd.pvs.1
                    @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                    public void pvs(vG vGVar2, int i) {
                        pvs.InterfaceC0017pvs interfaceC0017pvs3 = pvs.InterfaceC0017pvs.this;
                        if (interfaceC0017pvs3 != null) {
                            interfaceC0017pvs3.pvs(vGVar2, i);
                        }
                        if (cRVar2 == null || adSlot3 == null) {
                            return;
                        }
                        pvs.icD(vGVar, cRVar2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                    public void pvs(vG vGVar2, int i, String str) {
                        pvs.InterfaceC0017pvs interfaceC0017pvs3 = pvs.InterfaceC0017pvs.this;
                        if (interfaceC0017pvs3 != null) {
                            interfaceC0017pvs3.pvs(vGVar2, i, str);
                        }
                        if (cRVar2 == null || adSlot3 == null) {
                            return;
                        }
                        pvs.icD(vGVar, cRVar2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime, i, str);
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                    public void icD(vG vGVar2, int i) {
                        AdSlot adSlot4;
                        pvs.InterfaceC0017pvs interfaceC0017pvs3 = pvs.InterfaceC0017pvs.this;
                        if (interfaceC0017pvs3 != null) {
                            interfaceC0017pvs3.pvs(vGVar2, i);
                        }
                        cR cRVar3 = cRVar2;
                        if (cRVar3 != null && (adSlot4 = adSlot3) != null) {
                            pvs.vG(vGVar, cRVar3, adSlot4);
                        }
                        Object[] objArr = new Object[2];
                        vGVar.IP();
                    }
                };
                if (!pvs(vGVar.Ju())) {
                    if (interfaceC0017pvs != null) {
                        interfaceC0017pvs.pvs(vGVar, TTAdConstant.DEEPLINK_FALLBACK_CODE, "unexpected url: " + vGVar.Ju());
                    }
                    icD(vGVar, cRVar, adSlot, SystemClock.elapsedRealtime() - elapsedRealtime, -1, "video url is invalid");
                    return;
                } else {
                    so soVar = new so("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.video.Jd.pvs.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                pvs.pvs.pvs(mnm.pvs(), vGVar, interfaceC0017pvs2);
                            } catch (Throwable th) {
                                th.getMessage();
                            }
                        }
                    };
                    if (ae.NB()) {
                        ae.icD(soVar);
                        return;
                    } else {
                        soVar.run();
                        return;
                    }
                }
            }
        }
        if (interfaceC0017pvs != null) {
            interfaceC0017pvs.pvs(vGVar, 100);
        }
    }

    private static void icD(vG vGVar, cR cRVar, AdSlot adSlot) {
        if (pvs(vGVar)) {
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs("load_video_start", new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(cRVar, jlb.vG(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(cRVar, (String) null, -1, vGVar), new qh(vGVar.Ju(), vGVar.Wyp() ? vGVar.Mxy() : vGVar.vG())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(vG vGVar, cR cRVar, AdSlot adSlot, long j, int i, String str) {
        if (pvs(vGVar)) {
            String vG = jlb.vG(adSlot.getDurationSlotType());
            JSONObject pvs2 = com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(cRVar, (String) null, -1, vGVar);
            Wyp wyp = new Wyp();
            wyp.pvs(vGVar.Ju());
            wyp.pvs(vGVar.vG());
            wyp.icD(j);
            wyp.pvs(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            wyp.icD(str);
            wyp.vG("");
            com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs((com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs<Wyp>) new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(cRVar, vG, pvs2, wyp));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(vG vGVar, cR cRVar, AdSlot adSlot, long j) {
        if (pvs(vGVar)) {
            String vG = jlb.vG(adSlot.getDurationSlotType());
            JSONObject pvs2 = com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(cRVar, (String) null, -1, vGVar);
            kj kjVar = new kj();
            kjVar.pvs(vGVar.Ju());
            kjVar.pvs(vGVar.vG());
            kjVar.icD(j);
            if (vGVar.zM() == 1) {
                kjVar.vG(1L);
            } else {
                kjVar.vG(0L);
            }
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs("load_video_success", new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(cRVar, vG, pvs2, kjVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vG(vG vGVar, cR cRVar, AdSlot adSlot) {
        if (pvs(vGVar)) {
            com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.icD((com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs<Mxy>) new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(cRVar, jlb.vG(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(cRVar, (String) null, -1, vGVar), new Mxy(vGVar.Ju(), vGVar.vG())));
        }
    }

    public static boolean pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return yiw.vG(str) != null;
    }
}
