package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.icD.icD;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.cRf;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractionManager.java */
/* loaded from: classes2.dex */
public class bNS {
    private com.bytedance.sdk.openadsdk.core.icD.pvs IP;
    private final PAGNativeAd Jd;
    private com.bytedance.sdk.openadsdk.core.icD.icD Ju;
    private final com.bytedance.sdk.openadsdk.apiImpl.feed.pvs Wyp;
    private com.com.bytedance.overseas.sdk.pvs.vG icD;
    private final com.bytedance.sdk.openadsdk.core.model.cR pvs;
    private com.bykv.vk.openvk.component.video.api.Jd.vG qh;
    private final String sUS;
    private long so;
    private final Context vG;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.sUS yiw;
    private List<View> NB = new ArrayList();
    private final com.bytedance.sdk.openadsdk.icD.yiw Mxy = new com.bytedance.sdk.openadsdk.icD.yiw();
    private final AtomicBoolean kj = new AtomicBoolean(false);

    public com.bytedance.sdk.openadsdk.icD.yiw pvs() {
        return this.Mxy;
    }

    public bNS(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str, com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar) {
        this.Jd = pAGNativeAd;
        this.pvs = cRVar;
        this.vG = context;
        this.sUS = str;
        this.Wyp = pvsVar;
        if (cRVar.jhZ() == 4) {
            this.icD = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(context, cRVar, str);
        }
    }

    public void pvs(View view, int i) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.sUS sus = this.yiw;
        if (sus != null) {
            sus.onAdClicked();
        }
    }

    public void pvs(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, com.bytedance.sdk.openadsdk.apiImpl.feed.sUS sus) {
        pvs(viewGroup, list, list2, list3, sus);
        pvs(viewGroup, view);
        pvs(viewGroup, list2, list3);
    }

    private void pvs(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.apiImpl.feed.sUS sus) {
        this.yiw = sus;
        viewGroup.addOnLayoutChangeListener(new pvs(this.Mxy, viewGroup));
        this.NB = list;
        pvs(list2, (com.bytedance.sdk.openadsdk.core.icD.vG) null);
        if (list != null) {
            for (View view : this.NB) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        pvs(list3, (com.bytedance.sdk.openadsdk.core.icD.vG) null);
    }

    private void pvs(List<View> list, com.bytedance.sdk.openadsdk.core.icD.vG vGVar) {
        if (com.bytedance.sdk.component.utils.qh.icD(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(vGVar);
                    view.setOnTouchListener(vGVar);
                }
            }
        }
    }

    private EmptyView icD(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.apiImpl.feed.sUS sus) {
        this.yiw = sus;
        viewGroup.addOnLayoutChangeListener(new pvs(this.Mxy, viewGroup));
        this.NB = list;
        EmptyView Jd = Jd(viewGroup);
        if (Jd == null) {
            Jd = new EmptyView(this.vG, viewGroup);
            viewGroup.addView(Jd);
        }
        Jd.pvs();
        Jd.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.NB) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        Jd.setRefCreativeViews(list3);
        return Jd;
    }

    public void pvs(com.bykv.vk.openvk.component.video.api.Jd.vG vGVar) {
        this.qh = vGVar;
        com.bytedance.sdk.openadsdk.core.icD.icD icd = this.Ju;
        if (icd != null) {
            icd.pvs(vGVar);
        }
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = this.IP;
        if (pvsVar != null) {
            pvsVar.pvs(vGVar);
        }
    }

    /* compiled from: InteractionManager.java */
    private static class pvs implements View.OnLayoutChangeListener {
        private final ViewGroup icD;
        private final com.bytedance.sdk.openadsdk.icD.yiw pvs;

        public pvs(com.bytedance.sdk.openadsdk.icD.yiw yiwVar, ViewGroup viewGroup) {
            this.pvs = yiwVar;
            this.icD = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.pvs.pvs(System.currentTimeMillis(), Gp.pvs(this.icD));
        }
    }

    private void pvs(ViewGroup viewGroup, View view) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        Context pvs2 = viewGroup != null ? com.bytedance.sdk.component.utils.icD.pvs(viewGroup) : null;
        if (pvs2 == null) {
            pvs2 = this.vG;
        }
        if (this.pvs.OT() == 2) {
            com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.pvs;
            String str = this.sUS;
            this.Ju = new com.bytedance.sdk.openadsdk.core.nativeexpress.yiw(pvs2, cRVar, str, jlb.pvs(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.cR cRVar2 = this.pvs;
            String str2 = this.sUS;
            this.Ju = new com.bytedance.sdk.openadsdk.core.icD.icD(pvs2, cRVar2, str2, jlb.pvs(str2));
        }
        this.Ju.pvs(viewGroup);
        this.Ju.pvs(this.qh);
        this.Ju.icD(view);
        this.Ju.pvs(this.icD);
        this.Ju.pvs(this.Jd);
        this.Ju.pvs(hashMap);
        this.Ju.pvs(new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.core.bNS.1
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD.pvs
            public void pvs(View view2, int i) {
                if (bNS.this.yiw != null) {
                    bNS.this.yiw.onAdClicked();
                }
            }
        });
        if (this.pvs.OT() == 2) {
            Context context = this.vG;
            com.bytedance.sdk.openadsdk.core.model.cR cRVar3 = this.pvs;
            String str3 = this.sUS;
            this.IP = new com.bytedance.sdk.openadsdk.core.nativeexpress.sUS(context, cRVar3, str3, jlb.pvs(str3));
        } else {
            Context context2 = this.vG;
            com.bytedance.sdk.openadsdk.core.model.cR cRVar4 = this.pvs;
            String str4 = this.sUS;
            this.IP = new com.bytedance.sdk.openadsdk.core.icD.pvs(context2, cRVar4, str4, jlb.pvs(str4));
        }
        this.IP.pvs(viewGroup);
        this.IP.pvs(this.qh);
        this.IP.icD(view);
        this.IP.pvs(this.icD);
        this.IP.pvs(this.Jd);
        this.IP.pvs(hashMap);
        this.IP.pvs(new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.core.bNS.2
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD.pvs
            public void pvs(View view2, int i) {
                if (bNS.this.yiw != null) {
                    bNS.this.yiw.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(bNS.this.pvs, 9);
                bNS.this.Wyp.Ju();
            }
        });
    }

    private void pvs(ViewGroup viewGroup, EmptyView emptyView, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.icD.icD icd = this.Ju;
        if (icd == null || this.IP == null) {
            return;
        }
        emptyView.pvs(list, icd);
        emptyView.pvs(list2, this.IP);
        pvs(this.Ju, this.IP);
        pvs(emptyView, viewGroup);
    }

    private void pvs(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.icD.icD icd = this.Ju;
        if (icd == null || this.IP == null) {
            return;
        }
        pvs(list, icd);
        pvs(list2, this.IP);
        pvs(this.Ju, this.IP);
        pvs(viewGroup);
    }

    private void pvs(com.bytedance.sdk.openadsdk.core.icD.icD icd, com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar) {
        if (this.pvs.OT() == 2) {
            icD(icd, pvsVar);
        } else {
            pvs(pvsVar);
        }
    }

    private void icD(com.bytedance.sdk.openadsdk.core.icD.icD icd, com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar2 = this.Wyp;
        if (pvsVar2 != null && pvsVar2.icD() != null) {
            NativeExpressView icD = this.Wyp.icD();
            if ((icd instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.yiw) && (pvsVar instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.sUS)) {
                icD.setClickListener((com.bytedance.sdk.openadsdk.core.nativeexpress.yiw) icd);
                icD.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.sUS) pvsVar);
            }
            icD.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.icD() { // from class: com.bytedance.sdk.openadsdk.core.bNS.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.icD
                public void pvs() {
                    bNS.this.yiw.onAdClicked();
                }
            });
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar3 = this.Wyp;
        if (pvsVar3 != null && pvsVar3.pvs() != null) {
            this.Wyp.pvs().setOnClickListener(pvsVar);
            this.Wyp.pvs().setOnTouchListener(pvsVar);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar4 = this.Wyp;
        if (pvsVar4 != null) {
            pvsVar4.pvs(pvsVar);
            this.Wyp.pvs(icd);
        }
    }

    private void pvs(com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Jd(String.valueOf(this.pvs.yTz()))) {
            com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar2 = this.Wyp;
            if (pvsVar2 != null && pvsVar2.pvs() != null) {
                this.Wyp.pvs().setOnClickListener(pvsVar);
                this.Wyp.pvs().setOnTouchListener(pvsVar);
            }
            com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar3 = this.Wyp;
            if (pvsVar3 != null) {
                pvsVar3.pvs(pvsVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar4 = this.Wyp;
        if (pvsVar4 != null && pvsVar4.pvs() != null) {
            PAGMediaView pvs2 = this.Wyp.pvs();
            com.bytedance.sdk.openadsdk.core.icD.vG vGVar = new com.bytedance.sdk.openadsdk.core.icD.vG() { // from class: com.bytedance.sdk.openadsdk.core.bNS.4
                @Override // com.bytedance.sdk.openadsdk.core.icD.vG
                protected void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pvs2.setOnClickListener(vGVar);
            pvs2.setOnTouchListener(vGVar);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.pvs pvsVar5 = this.Wyp;
        if (pvsVar5 != null) {
            pvsVar5.pvs((com.bytedance.sdk.openadsdk.core.icD.pvs) null);
        }
    }

    private void pvs(EmptyView emptyView, final ViewGroup viewGroup) {
        emptyView.setCallback(new EmptyView.pvs() { // from class: com.bytedance.sdk.openadsdk.core.bNS.5
            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.pvs
            public void pvs(boolean z) {
                bNS.this.pvs(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.pvs
            public void pvs() {
                bNS.this.icD(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.pvs
            public void icD() {
                bNS.this.icD();
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.pvs
            @JProtect
            public void pvs(View view) {
                bNS.this.icD(viewGroup, view);
            }
        });
    }

    private void pvs(final ViewGroup viewGroup) {
        cRf.pvs(viewGroup, true, 5, new cRf.icD() { // from class: com.bytedance.sdk.openadsdk.core.bNS.6
            @Override // com.bytedance.sdk.openadsdk.utils.cRf.icD
            public void pvs(boolean z) {
                bNS.this.pvs(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.cRf.icD
            public void pvs() {
                bNS.this.icD(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.cRf.icD
            public void icD() {
                bNS.this.icD();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.cRf.icD
            public void pvs(View view, boolean z) {
                if (z) {
                    bNS.this.icD(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(boolean z, ViewGroup viewGroup) {
        if (z && this.pvs.fl() && !this.pvs.wS()) {
            this.pvs.yiw(true);
            com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.pvs;
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, this.sUS, cRVar.AMP());
        }
        if (!z && this.so > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.so);
            this.Mxy.pvs(System.currentTimeMillis(), Gp.pvs(viewGroup));
            com.bytedance.sdk.openadsdk.icD.vG.pvs(valueOf, this.pvs, this.sUS, this.Mxy);
            this.so = 0L;
            return;
        }
        this.Mxy.pvs(System.currentTimeMillis(), Gp.pvs(viewGroup));
        this.so = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(ViewGroup viewGroup) {
        this.Mxy.pvs(System.currentTimeMillis(), Gp.pvs(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD() {
        if (this.so > 0) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(String.valueOf(SystemClock.elapsedRealtime() - this.so), this.pvs, this.sUS, this.Mxy);
            this.so = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(ViewGroup viewGroup, View view) {
        if (this.kj.get()) {
            return;
        }
        this.kj.set(true);
        if (this.Jd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD) {
            NativeExpressView icD = this.Wyp.icD();
            if (icD != null) {
                icD.so();
            }
            ((com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD) this.Jd).pvs(true);
        }
        this.Mxy.pvs(System.currentTimeMillis(), Gp.pvs(viewGroup));
        this.so = SystemClock.elapsedRealtime();
        vG(viewGroup);
        com.bytedance.sdk.openadsdk.apiImpl.feed.sUS sus = this.yiw;
        if (sus != null) {
            sus.pvs(this.Jd);
        }
        if (this.pvs.tCd()) {
            jlb.pvs(this.pvs, view);
        }
        if (this.pvs.ig() != null) {
            this.pvs.ig().pvs().pvs(0L);
        }
    }

    private void vG(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.cR cRVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.NB != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.NB) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            if (this.Wyp.so() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", Pj.vG(this.vG, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", Pj.vG(this.vG, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            NativeExpressView icD = this.Wyp.icD();
            if (icD != null && (cRVar = this.pvs) != null) {
                jSONObject.put("dynamic_show_type", cRVar.dyT());
                icD.pvs(jSONObject, this.pvs);
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.pvs, this.sUS, jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("InteractionManager", "onShowFun json error", e);
        }
    }

    private EmptyView Jd(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }
}
