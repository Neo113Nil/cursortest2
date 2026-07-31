package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.zg;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.vlj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class olo {
    private final PAGNativeAd fb;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn fs;
    private final String hhw;
    private final com.bytedance.sdk.openadsdk.zmn.fs.zmn iv;
    private com.bytedance.sdk.openadsdk.core.zn.fs mw;
    private com.bytedance.sdk.openadsdk.zmn.fs.hhw nps;
    private com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn rc;
    private com.bytedance.sdk.openadsdk.core.zn.zmn rt;
    private long zg;
    private final com.bytedance.sdk.openadsdk.core.model.nqi zmn;
    private final Context zn;
    private List<View> btk = new ArrayList();
    private final com.bytedance.sdk.openadsdk.fb.nps bvs = new com.bytedance.sdk.openadsdk.fb.nps();
    private final AtomicBoolean klz = new AtomicBoolean(false);

    public com.bytedance.sdk.openadsdk.fb.nps zmn() {
        return this.bvs;
    }

    public olo(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar) {
        this.fb = pAGNativeAd;
        this.zmn = nqiVar;
        this.zn = context;
        this.hhw = str;
        this.iv = zmnVar;
        if (nqiVar.va() == 4) {
            this.fs = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(context, str);
        }
    }

    public void zmn(View view, int i) {
        com.bytedance.sdk.openadsdk.zmn.fs.hhw hhwVar = this.nps;
        if (hhwVar != null) {
            hhwVar.onAdClicked();
        }
    }

    public void zmn(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.zmn.fs.hhw hhwVar) {
        fs(viewGroup, list, list2, list3, hhwVar);
        zmn(viewGroup);
        zmn(viewGroup, list2, list3);
    }

    private void fs(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.zmn.fs.hhw hhwVar) {
        this.nps = hhwVar;
        viewGroup.addOnLayoutChangeListener(new zmn(this.bvs, viewGroup));
        this.btk = list;
        zmn(list2, (com.bytedance.sdk.openadsdk.core.zn.zn) null);
        if (list != null) {
            for (View view : this.btk) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        zmn(list3, (com.bytedance.sdk.openadsdk.core.zn.zn) null);
    }

    private void zmn(List<View> list, com.bytedance.sdk.openadsdk.core.zn.zn znVar) {
        if (com.bytedance.sdk.component.utils.mw.fs(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(znVar);
                    view.setOnTouchListener(znVar);
                }
            }
        }
    }

    private zg zn(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.zmn.fs.hhw hhwVar) {
        this.nps = hhwVar;
        viewGroup.addOnLayoutChangeListener(new zmn(this.bvs, viewGroup));
        this.btk = list;
        zg btk = btk(viewGroup);
        if (btk == null) {
            btk = new zg(this.zn, viewGroup, false);
            viewGroup.addView(btk);
        }
        btk.zmn();
        btk.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.btk) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        btk.setRefCreativeViews(list3);
        return btk;
    }

    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar) {
        this.rc = znVar;
        com.bytedance.sdk.openadsdk.core.zn.fs fsVar = this.mw;
        if (fsVar != null) {
            fsVar.zmn(znVar);
        }
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = this.rt;
        if (zmnVar != null) {
            zmnVar.zmn(znVar);
        }
    }

    private static class zmn implements View.OnLayoutChangeListener {
        private final ViewGroup fs;
        private final com.bytedance.sdk.openadsdk.fb.nps zmn;

        public zmn(com.bytedance.sdk.openadsdk.fb.nps npsVar, ViewGroup viewGroup) {
            this.zmn = npsVar;
            this.fs = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.zmn.zmn(System.currentTimeMillis(), hgd.zmn(this.fs));
        }
    }

    private void zmn(@NonNull ViewGroup viewGroup) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        Context zmn2 = viewGroup != null ? com.bytedance.sdk.component.utils.fs.zmn(viewGroup) : null;
        if (zmn2 == null) {
            zmn2 = this.zn;
        }
        if (this.zmn.nkt() == 2) {
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.zmn;
            String str = this.hhw;
            this.mw = new com.bytedance.sdk.openadsdk.core.iv.iv(zmn2, nqiVar, str, com.bytedance.sdk.openadsdk.utils.oub.zmn(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = this.zmn;
            String str2 = this.hhw;
            this.mw = new com.bytedance.sdk.openadsdk.core.zn.fs(zmn2, nqiVar2, str2, com.bytedance.sdk.openadsdk.utils.oub.zmn(str2));
        }
        this.mw.fs(viewGroup);
        this.mw.zmn(this.rc);
        this.mw.zmn(this.fs);
        this.mw.zmn(this.fb);
        this.mw.zmn(hashMap);
        this.mw.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.olo.1
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                if (olo.this.nps != null) {
                    olo.this.nps.onAdClicked();
                }
            }
        });
        if (this.zmn.nkt() == 2) {
            Context context = this.zn;
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar3 = this.zmn;
            String str3 = this.hhw;
            this.rt = new com.bytedance.sdk.openadsdk.core.iv.bvs(context, nqiVar3, str3, com.bytedance.sdk.openadsdk.utils.oub.zmn(str3));
        } else {
            Context context2 = this.zn;
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar4 = this.zmn;
            String str4 = this.hhw;
            this.rt = new com.bytedance.sdk.openadsdk.core.zn.zmn(context2, nqiVar4, str4, com.bytedance.sdk.openadsdk.utils.oub.zmn(str4));
        }
        this.rt.fs(viewGroup);
        this.rt.zmn(this.rc);
        this.rt.zmn(this.fs);
        this.rt.zmn(this.fb);
        this.rt.zmn(hashMap);
        this.rt.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.olo.2
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                if (olo.this.nps != null) {
                    olo.this.nps.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(olo.this.zmn, 9);
                olo.this.iv.mw();
            }
        });
    }

    private void zmn(@NonNull ViewGroup viewGroup, zg zgVar, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.zn.fs fsVar = this.mw;
        if (fsVar == null || this.rt == null) {
            return;
        }
        zgVar.zmn(list, fsVar);
        zgVar.zmn(list2, this.rt);
        zmn(this.mw, this.rt);
        zmn(zgVar, viewGroup);
    }

    private void zmn(@NonNull ViewGroup viewGroup, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.zn.fs fsVar = this.mw;
        if (fsVar == null || this.rt == null) {
            return;
        }
        zmn(list, fsVar);
        zmn(list2, this.rt);
        zmn(this.mw, this.rt);
        fs(viewGroup);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zmn(com.bytedance.sdk.openadsdk.core.zn.fs fsVar, com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar) {
        if (this.zmn.nkt() == 2) {
            fs(fsVar, zmnVar);
        } else {
            zmn(zmnVar);
        }
    }

    private void fs(com.bytedance.sdk.openadsdk.core.zn.fs fsVar, com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar) {
        com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar2 = this.iv;
        if (zmnVar2 != null && zmnVar2.fs() != null) {
            com.bytedance.sdk.openadsdk.core.iv.phc fs = this.iv.fs();
            if ((fsVar instanceof com.bytedance.sdk.openadsdk.core.iv.iv) && (zmnVar instanceof com.bytedance.sdk.openadsdk.core.iv.bvs)) {
                fs.setClickListener((com.bytedance.sdk.openadsdk.core.iv.iv) fsVar);
                fs.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.iv.bvs) zmnVar);
            }
            fs.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.btk() { // from class: com.bytedance.sdk.openadsdk.core.olo.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.btk
                public void zmn() {
                    if (olo.this.nps != null) {
                        olo.this.nps.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar3 = this.iv;
        if (zmnVar3 != null && zmnVar3.zmn() != null) {
            this.iv.zmn().setOnClickListener(zmnVar);
            this.iv.zmn().setOnTouchListener(zmnVar);
        }
        com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar4 = this.iv;
        if (zmnVar4 != null) {
            zmnVar4.zmn(zmnVar);
            this.iv.zmn(fsVar);
        }
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.rc.fs().fb(String.valueOf(this.zmn.qvo()))) {
            com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar2 = this.iv;
            if (zmnVar2 != null && zmnVar2.zmn() != null) {
                this.iv.zmn().setOnClickListener(zmnVar);
                this.iv.zmn().setOnTouchListener(zmnVar);
            }
            com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar3 = this.iv;
            if (zmnVar3 != null) {
                zmnVar3.zmn(zmnVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar4 = this.iv;
        if (zmnVar4 != null && zmnVar4.zmn() != null) {
            PAGMediaView zmn2 = this.iv.zmn();
            com.bytedance.sdk.openadsdk.core.zn.zn znVar = new com.bytedance.sdk.openadsdk.core.zn.zn() { // from class: com.bytedance.sdk.openadsdk.core.olo.4
                @Override // com.bytedance.sdk.openadsdk.core.zn.zn
                protected void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            zmn2.setOnClickListener(znVar);
            zmn2.setOnTouchListener(znVar);
        }
        com.bytedance.sdk.openadsdk.zmn.fs.zmn zmnVar5 = this.iv;
        if (zmnVar5 != null) {
            zmnVar5.zmn((com.bytedance.sdk.openadsdk.core.zn.zmn) null);
        }
    }

    private void zmn(zg zgVar, final ViewGroup viewGroup) {
        zgVar.setCallback(new zg.zmn() { // from class: com.bytedance.sdk.openadsdk.core.olo.5
            @Override // com.bytedance.sdk.openadsdk.core.zg.zmn
            public void zmn(boolean z) {
                olo.this.zmn(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zg.zmn
            public void zmn() {
                olo.this.zn(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zg.zmn
            public void fs() {
                olo.this.fs();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zg.zmn
            public void zmn(View view) {
                olo.this.zmn(viewGroup, view);
            }
        });
    }

    private void fs(final ViewGroup viewGroup) {
        vlj.zmn(viewGroup, true, 5, false, new vlj.fs() { // from class: com.bytedance.sdk.openadsdk.core.olo.6
            @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
            public void zmn(boolean z) {
                olo.this.zmn(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
            public void zmn() {
                olo.this.zn(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
            public void fs() {
                olo.this.fs();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
            public void zmn(View view, boolean z) {
                if (!z) {
                    com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(olo.this.zmn, 8);
                } else {
                    com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(olo.this.zmn, 4);
                    olo.this.zmn(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(boolean z, ViewGroup viewGroup) {
        if (z && this.zmn.dv() && !this.zmn.kjb()) {
            this.zmn.nps(true);
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.zmn;
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, this.hhw, nqiVar.rfd());
        }
        if (!z && this.zg > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.zg);
            this.bvs.zmn(System.currentTimeMillis(), hgd.zmn(viewGroup));
            com.bytedance.sdk.openadsdk.fb.zn.zmn(valueOf, this.zmn, this.hhw, this.bvs);
            this.zg = 0L;
            return;
        }
        this.bvs.zmn(System.currentTimeMillis(), hgd.zmn(viewGroup));
        this.zg = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(ViewGroup viewGroup) {
        this.bvs.zmn(System.currentTimeMillis(), hgd.zmn(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        if (this.zg > 0) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(String.valueOf(SystemClock.elapsedRealtime() - this.zg), this.zmn, this.hhw, this.bvs);
            this.zg = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(ViewGroup viewGroup, View view) {
        com.bytedance.sdk.openadsdk.core.rt.fb zmn2;
        if (this.klz.get()) {
            return;
        }
        this.klz.set(true);
        if (this.fb instanceof com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn) {
            com.bytedance.sdk.openadsdk.core.iv.phc fs = this.iv.fs();
            if (fs != null) {
                fs.kw();
            }
            ((com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn) this.fb).zmn(true);
        }
        this.bvs.zmn(System.currentTimeMillis(), hgd.zmn(viewGroup));
        this.zg = SystemClock.elapsedRealtime();
        fb(viewGroup);
        com.bytedance.sdk.openadsdk.zmn.fs.hhw hhwVar = this.nps;
        if (hhwVar != null) {
            hhwVar.zmn(this.fb);
        }
        if (this.zmn.fw()) {
            com.bytedance.sdk.openadsdk.utils.oub.zmn(this.zmn, view);
        }
        com.bytedance.sdk.openadsdk.core.model.fb exj = this.zmn.exj();
        if (exj == null || (zmn2 = exj.zmn()) == null) {
            return;
        }
        zmn2.zmn(0L);
    }

    private void fb(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.btk != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.btk) {
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
            if (this.iv.zg() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", jy.zn(this.zn, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", jy.zn(this.zn, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.iv.phc fs = this.iv.fs();
            if (fs != null && (nqiVar = this.zmn) != null) {
                jSONObject.put("dynamic_show_type", nqiVar.skn());
                fs.zmn(jSONObject, this.zmn);
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(this.zmn, this.hhw, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(this.zmn);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zmn("InteractionManager", "onShowFun json error", e);
        }
    }

    private zg btk(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof zg) {
                return (zg) childAt;
            }
        }
        return null;
    }
}
