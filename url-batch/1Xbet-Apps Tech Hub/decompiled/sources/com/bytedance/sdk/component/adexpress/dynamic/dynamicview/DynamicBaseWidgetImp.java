package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.NB.Wyp;
import com.bytedance.sdk.component.NB.mnm;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.Mxy;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.component.adexpress.widget.GifView;
import com.bytedance.sdk.component.utils.OT;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DynamicBaseWidgetImp extends DynamicBaseWidget {
    private static String uc = "";
    private ImageView OT;
    private Runnable icD;
    private Runnable pvs;
    private volatile boolean rCZ;
    protected InteractViewContainer zM;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.rCZ = true;
        setTag(Integer.valueOf(getClickArea()));
        String icD = soVar.Wyp().icD();
        if ("logo-union".equals(icD)) {
            dynamicRootView.setLogoUnionHeight(this.so - ((int) yiw.pvs(context, this.kj.icD() + this.kj.pvs())));
        } else if ("scoreCountWithIcon".equals(icD)) {
            dynamicRootView.setScoreCountWithIcon(this.so - ((int) yiw.pvs(context, this.kj.icD() + this.kj.pvs())));
        }
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.yiw, this.so);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        Drawable backgroundDrawable;
        JSONObject optJSONObject;
        final View view = this.bNS == null ? this : this.bNS;
        setContentDescription(this.Ju.pvs(this.kj.CvL()));
        String MY = this.kj.MY();
        String str = null;
        String pvs = (TextUtils.isEmpty(MY) || this.IP == null || this.IP.getRenderRequest() == null || this.IP.getRenderRequest().vG() == null || (optJSONObject = this.IP.getRenderRequest().vG().optJSONObject("creative")) == null) ? null : pvs(optJSONObject.opt(MY));
        if (TextUtils.isEmpty(pvs)) {
            pvs = this.kj.rCZ();
        }
        if (this.kj.uc()) {
            final int zM = this.kj.zM();
            com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().NB().pvs(this.kj.icD).vG(2).pvs(new com.bytedance.sdk.component.NB.so() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.3
                @Override // com.bytedance.sdk.component.NB.so
                public Bitmap pvs(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.Jd.pvs.pvs(DynamicBaseWidgetImp.this.qh, bitmap, zM);
                }
            }).pvs(new mnm<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.1
                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(int i, String str2, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(qh<Bitmap> qhVar) {
                    Bitmap icD = qhVar.icD();
                    if (icD == null || qhVar.vG() == null) {
                        return;
                    }
                    view.setBackground(DynamicBaseWidgetImp.this.pvs(icD));
                }
            });
        } else if (!TextUtils.isEmpty(pvs)) {
            if (!pvs.startsWith("http:") && !pvs.startsWith("https:")) {
                if (this.IP != null && this.IP.getRenderRequest() != null) {
                    str = this.IP.getRenderRequest().ZhG();
                }
                pvs = Mxy.icD(pvs, str);
            }
            Wyp vG = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().NB().pvs(pvs).vG(2);
            pvs(vG);
            if (!com.bytedance.sdk.component.adexpress.Jd.icD()) {
                if ((view instanceof FrameLayout) && TextUtils.equals(this.Ju.Wyp().icD(), "vessel")) {
                    if (com.bytedance.sdk.component.adexpress.Jd.so.icD(pvs)) {
                        this.OT = new GifView(this.qh);
                    } else {
                        this.OT = new ImageView(this.qh);
                    }
                    ((FrameLayout) view).addView(this.OT, new FrameLayout.LayoutParams(-1, -1));
                    vG.vG(3).pvs(new mnm() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.4
                        @Override // com.bytedance.sdk.component.NB.mnm
                        public void pvs(int i, String str2, Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.NB.mnm
                        public void pvs(qh qhVar) {
                            Object icD = qhVar.icD();
                            if (icD instanceof byte[]) {
                                com.bytedance.sdk.component.adexpress.Jd.NB.pvs(DynamicBaseWidgetImp.this.OT, (byte[]) icD, DynamicBaseWidgetImp.this.yiw, DynamicBaseWidgetImp.this.so);
                            }
                        }
                    });
                } else {
                    pvs(vG, view);
                }
            } else {
                vG.pvs(new mnm<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.5
                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(int i, String str2, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(qh<Bitmap> qhVar) {
                        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                            view.setBackground(new BitmapDrawable(qhVar.icD()));
                            if (DynamicBaseWidgetImp.this.Ju == null || DynamicBaseWidgetImp.this.Ju.Wyp() == null || 6 != DynamicBaseWidgetImp.this.Ju.Wyp().pvs() || view.getBackground() == null) {
                                return;
                            }
                            view.getBackground().setAutoMirrored(true);
                            return;
                        }
                        if (DynamicBaseWidgetImp.this.IP == null) {
                            return;
                        }
                        if (!"open_ad".equals(DynamicBaseWidgetImp.this.IP.getRenderRequest().Jd()) && !"splash_ad".equals(DynamicBaseWidgetImp.this.IP.getRenderRequest().Jd())) {
                            view.setBackground(new BitmapDrawable(qhVar.icD()));
                        } else {
                            view.setBackground(new BitmapDrawable(qhVar.icD()));
                        }
                    }
                });
            }
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.kj.ae() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DynamicBaseWidgetImp.this.kj.cRf() > 0) {
                            DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                            Drawable icD = dynamicBaseWidgetImp.icD(dynamicBaseWidgetImp.IP.getBgMaterialCenterCalcColor().get(Integer.valueOf(DynamicBaseWidgetImp.this.kj.cRf())));
                            if (icD == null) {
                                DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                                icD = dynamicBaseWidgetImp2.pvs(true, dynamicBaseWidgetImp2.IP.getBgMaterialCenterCalcColor().get(Integer.valueOf(DynamicBaseWidgetImp.this.kj.cRf())));
                            }
                            if (icD != null) {
                                view.setBackground(icD);
                                return;
                            }
                            View view2 = view;
                            DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                            view2.setBackground(dynamicBaseWidgetImp3.pvs(true, dynamicBaseWidgetImp3.IP.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.kj.ae() * 1000.0d));
        }
        if (this.bNS != null) {
            this.bNS.setPadding((int) yiw.pvs(this.qh, this.kj.vG()), (int) yiw.pvs(this.qh, this.kj.icD()), (int) yiw.pvs(this.qh, this.kj.Jd()), (int) yiw.pvs(this.qh, this.kj.pvs()));
        }
        if (this.mnm || this.kj.IP() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    private String pvs(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return pvs(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return pvs((Object) ((JSONObject) obj).optString(ImagesContract.URL));
        }
        return null;
    }

    private void pvs(Wyp wyp, final View view) {
        wyp.pvs(new mnm<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.7
            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(qh<Bitmap> qhVar) {
                if (DynamicBaseWidgetImp.this.IP == null) {
                    return;
                }
                if (!"open_ad".equals(DynamicBaseWidgetImp.this.IP.getRenderRequest().Jd()) && !"splash_ad".equals(DynamicBaseWidgetImp.this.IP.getRenderRequest().Jd())) {
                    view.setBackground(new BitmapDrawable(qhVar.icD()));
                } else {
                    if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                        view.setBackground(new pvs(qhVar.icD(), ((DynamicRoot) DynamicBaseWidgetImp.this.IP.getChildAt(0)).pvs));
                        return;
                    }
                    view.setBackground(new BitmapDrawable(qhVar.icD()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable icD(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String str2 = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i));
                } else if (jSONArray.getString(i).endsWith("deg")) {
                    str2 = jSONArray.getString(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.vG.yiw.pvs(((String) arrayList.get(i2)).substring(0, 7));
            }
            GradientDrawable pvs = pvs(pvs(str2), iArr);
            pvs.setShape(0);
            pvs.setCornerRadius(yiw.pvs(this.qh, this.kj.bNS()));
            return pvs;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void pvs(Wyp wyp) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            wyp.pvs(Bitmap.Config.ARGB_8888);
        }
    }

    private static String getBuildModel() {
        try {
            uc = OT.pvs();
        } catch (Throwable unused) {
            uc = Build.MODEL;
        }
        if (TextUtils.isEmpty(uc)) {
            uc = Build.MODEL;
        }
        return uc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View view = this.bNS == null ? this : this.bNS;
        double uc2 = this.Ju.Wyp().NB().uc();
        if (uc2 < 90.0d && uc2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            com.bytedance.sdk.component.utils.so.icD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.8
                @Override // java.lang.Runnable
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (uc2 * 1000.0d));
        }
        pvs(this.Ju.Wyp().NB().zM(), view);
        if (!TextUtils.isEmpty(this.kj.jhZ())) {
            pvs();
        }
        super.onAttachedToWindow();
    }

    private void pvs(double d, final View view) {
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            com.bytedance.sdk.component.utils.so.icD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.9
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.Ju.Wyp().NB().ABo() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    DynamicBaseWidgetImp.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.pvs);
            removeCallbacks(this.icD);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof InteractViewContainer) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    private void pvs() {
        if (this.rCZ) {
            int ZsW = this.kj.ZsW();
            int CjQ = this.kj.CjQ();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.10
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.IP != null && DynamicBaseWidgetImp.this.IP.getRenderRequest() != null) {
                        Ju renderRequest = DynamicBaseWidgetImp.this.IP.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.vG.Wyp wyp = new com.bytedance.sdk.component.adexpress.dynamic.vG.Wyp();
                        wyp.pvs(renderRequest.bNS());
                        wyp.icD(renderRequest.mnm());
                        wyp.vG(renderRequest.vA());
                        wyp.pvs(renderRequest.cR());
                        wyp.icD(renderRequest.zM());
                        wyp.vG(renderRequest.uc());
                        wyp.Jd(renderRequest.rCZ());
                        wyp.NB(renderRequest.OT());
                        DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                        Context context = DynamicBaseWidgetImp.this.qh;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp.zM = new InteractViewContainer(context, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.kj, wyp, renderRequest);
                    } else {
                        DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                        Context context2 = DynamicBaseWidgetImp.this.qh;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp3.zM = new InteractViewContainer(context2, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.kj);
                    }
                    DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp5.icD(dynamicBaseWidgetImp5.zM);
                    if (DynamicBaseWidgetImp.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) DynamicBaseWidgetImp.this.getParent()).setClipChildren(false);
                    }
                    DynamicBaseWidgetImp.this.setClipChildren(false);
                    DynamicBaseWidgetImp.this.zM.setTag(2);
                    DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp6.pvs((ViewGroup) dynamicBaseWidgetImp6);
                    DynamicBaseWidgetImp dynamicBaseWidgetImp7 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp7.addView(dynamicBaseWidgetImp7.zM, new FrameLayout.LayoutParams(-1, -1));
                    DynamicBaseWidgetImp.this.zM.vG();
                }
            };
            this.pvs = runnable;
            postDelayed(runnable, ZsW * 1000);
            if (this.kj.BSi() || CjQ >= Integer.MAX_VALUE || ZsW >= CjQ) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.2
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.zM != null) {
                        DynamicBaseWidgetImp.this.rCZ = false;
                        DynamicBaseWidgetImp.this.zM.Jd();
                        DynamicBaseWidgetImp.this.zM.setVisibility(4);
                        DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp.removeView(dynamicBaseWidgetImp.zM);
                    }
                }
            };
            this.icD = runnable2;
            postDelayed(runnable2, CjQ * 1000);
        }
    }
}
