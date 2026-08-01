package com.bytedance.sdk.openadsdk.core.icD;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.ae;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ClickCreativeListener.java */
/* loaded from: classes2.dex */
public class pvs extends icD {
    private WeakReference<InterfaceC0074pvs> cRf;
    private boolean icD;
    private boolean pvs;
    private int sP;
    private boolean vG;

    /* compiled from: ClickCreativeListener.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.icD.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0074pvs {
        long getVideoProgress();
    }

    public boolean icD() {
        return false;
    }

    public boolean vG() {
        return false;
    }

    public pvs(Context context, cR cRVar, String str, int i) {
        super(context, cRVar, str, i);
        this.pvs = true;
        this.icD = false;
        this.vG = false;
    }

    public void pvs(boolean z) {
        this.pvs = z;
    }

    public void icD(boolean z) {
        this.icD = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x03a0, code lost:
    
        if (r2.booleanValue() != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x038e, code lost:
    
        if ((r4 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView) == false) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Type inference failed for: r2v34, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
        JSONObject jSONObject;
        int i;
        JSONObject jSONObject2;
        View view2;
        Activity pvs;
        String str;
        if (pvs(view, 2, f, f2, f3, f4, sparseArray, z)) {
            return;
        }
        this.sUS.NB(true);
        this.sUS.udE();
        if (!this.sUS.NB()) {
            this.sUS.pvs(true);
        }
        if (cR.NB(this.sUS)) {
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.sUS, this.yiw, this.sUS.QnQ());
        }
        if (this.IP != null) {
            if (this.vA == null) {
                this.vA = new HashMap();
            }
            this.vA.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(this.IP.NB()));
        }
        int LEC = this.sUS.LEC();
        this.sUS.cRf(0);
        if (this.mnm != null) {
            this.mnm.pvs(LEC > 0 ? LEC : 0);
        }
        if (this.vA != null) {
            this.vA.remove("dsp_click_type");
            this.vA.remove("click_probability_jump");
            this.vA.remove("auto_click");
        }
        if (LEC > 0) {
            if (this.vA == null) {
                this.vA = new HashMap();
            }
            if (this.sUS.SJ() && LEC < 11) {
                this.vA.put("dsp_click_type", Integer.valueOf(LEC));
            }
            if (LEC >= 11 && this.sUS.xyK() == 0) {
                this.vA.put("click_probability_jump", Integer.valueOf(com.bytedance.sdk.openadsdk.core.model.sUS.pvs(LEC)));
            }
        }
        if (this.sUS.SJ()) {
            if (view != null) {
                Object tag = view.getTag(570425345);
                if (tag instanceof String) {
                    str = (String) tag;
                    this.sUS.ig().NB(str);
                    if (!TextUtils.isEmpty(str)) {
                        pvs(str);
                    }
                    WeakReference<InterfaceC0074pvs> weakReference = this.cRf;
                    long videoProgress = (weakReference != null || weakReference.get() == null) ? 0L : this.cRf.get().getVideoProgress();
                    if (!"VAST_ICON".equals(str)) {
                        if (this.sUS.ig().icD() != null) {
                            this.sUS.ig().icD().pvs(videoProgress);
                        }
                    } else if ("VAST_END_CARD".equals(str)) {
                        if (this.sUS.ig().vG() != null) {
                            this.sUS.ig().vG().pvs(videoProgress);
                        }
                    } else {
                        this.sUS.ig().pvs().yiw(videoProgress);
                    }
                }
            }
            str = "VAST_ACTION_BUTTON";
            this.sUS.ig().NB(str);
            if (!TextUtils.isEmpty(str)) {
            }
            WeakReference<InterfaceC0074pvs> weakReference2 = this.cRf;
            if (weakReference2 != null) {
            }
            if (!"VAST_ICON".equals(str)) {
            }
        }
        if (Wyp() && Jd(view) && !this.vG) {
            super.pvs(view, f, f2, f3, f4, sparseArray, z);
            return;
        }
        if (this.Jd == null) {
            this.Jd = mnm.pvs();
        }
        if (this.Jd == null || !pvs(view, z)) {
            return;
        }
        JSONObject pvs2 = NativeExpressView.pvs(view);
        if (this.NB != null) {
            i = this.NB.kj;
            jSONObject = this.NB.Ju;
            jSONObject2 = this.NB.vA;
        } else {
            jSONObject = pvs2;
            i = -1;
            jSONObject2 = null;
        }
        this.qh = pvs(f, f2, f3, f4, sparseArray, this.dyT, this.dX, this.Mxy == null ? Jd() : this.Mxy.get(), this.Wyp == null ? NB() : this.Wyp.get(), sUS(), Pj.NB(this.Jd), Pj.yiw(this.Jd), Pj.sUS(this.Jd), i, jSONObject, jSONObject2);
        int jhZ = this.sUS.jhZ();
        if (jhZ != 2 && jhZ != 3) {
            if (jhZ != 4) {
                if (jhZ == 5) {
                    String icD = icD(this.yiw);
                    if (!TextUtils.isEmpty(icD)) {
                        com.bytedance.sdk.openadsdk.icD.vG.pvs("click_call", this.sUS, this.qh, icD, true, this.vA, z ? 1 : 2);
                    }
                    com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.sUS, this.qh, this.yiw, jlb.vG(view.getContext(), this.sUS.cnN()), this.vA, z ? 1 : 2);
                    view2 = view;
                } else if (jhZ != 8) {
                    view2 = view;
                    jhZ = -1;
                }
            } else if (rCZ.icD(this.sUS) && (this.Ju != null || this.cR != null)) {
                view2 = view;
                pvs = view2 != null ? com.bytedance.sdk.component.utils.icD.pvs(view) : null;
                boolean pvs3 = ae.pvs((Context) (pvs == null ? this.Jd : pvs), this.sUS, this.so, this.Ju, this.cR, this.yiw, this.mnm, true, LEC);
                if (this.pvs) {
                    com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.sUS, this.qh, this.yiw, pvs3, this.vA, z ? 1 : 2);
                }
            } else {
                view2 = view;
                if (this.mnm != null) {
                    this.mnm.Jd();
                    Map<String, Object> map = this.vA;
                    if (this.sUS.NB() && !this.sUS.Jd()) {
                        map.put("auto_click", Boolean.TRUE);
                        this.sUS.icD(false);
                    }
                    if (this.pvs) {
                        com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.sUS, this.qh, this.yiw, true, map, z ? 1 : 2);
                    }
                }
            }
            if (this.kj != null) {
                this.kj.pvs(view2, jhZ);
                return;
            }
            return;
        }
        view2 = view;
        if (jhZ == 3) {
            String CjQ = this.sUS.CjQ();
            if (!TextUtils.isEmpty(CjQ) && CjQ.contains("play.google.com/store")) {
                if (com.com.bytedance.overseas.sdk.pvs.icD.pvs(this.Jd, CjQ, CjQ.substring(CjQ.indexOf("?id=") + 4), this.yiw, this.sUS)) {
                    if (this.pvs) {
                        com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.sUS, this.qh, this.yiw, true, this.vA, z ? 1 : 2);
                    }
                    if (this.kj != null) {
                    }
                }
            }
        }
        if (this.Ju != null || this.icD) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs("click_button", this.sUS, this.qh, this.yiw, true, this.vA, z ? 1 : 2);
        }
        if (view2 != null) {
            try {
                if (view.getId() != 520093726) {
                }
                ae.pvs(true);
            } catch (Exception unused) {
            }
            pvs = view2 != null ? com.bytedance.sdk.component.utils.icD.pvs(view) : null;
            boolean pvs4 = ae.pvs((Context) (pvs == null ? this.Jd : pvs), this.sUS, this.so, this.Ju, this.cR, this.yiw, this.mnm, true, LEC);
            ae.pvs(false);
            if (this.pvs) {
                com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.sUS, this.qh, this.yiw, pvs4, this.vA, z ? 1 : 2);
            }
            if (this.kj != null) {
            }
        }
        Boolean bool = (Boolean) view2.getTag(520093762);
        Boolean bool2 = bool;
    }

    protected boolean pvs() {
        if (this.sUS == null) {
            return true;
        }
        int icD = mnm.Jd().icD(this.sUS.yTz());
        int vG = com.bytedance.sdk.component.utils.mnm.vG(mnm.pvs());
        if (icD == 1) {
            return jlb.Jd(vG);
        }
        if (icD == 2) {
            return jlb.NB(vG) || jlb.Jd(vG) || jlb.sUS(vG);
        }
        if (icD != 3) {
            return icD != 5 || jlb.Jd(vG) || jlb.sUS(vG);
        }
        return false;
    }

    private boolean so() {
        return cR.NB(this.sUS) && this.sUS.ZhG() == 1;
    }

    private boolean Jd(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof NativeVideoTsView) || view.getId() == kj.RGX || view.getId() == kj.OhP || view.getId() == kj.jhZ || view.getId() == kj.SE || view.getId() == kj.yWX || view.getId() == 520093726 || view.getId() == kj.BiC) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return false;
            }
            if (Jd(viewGroup.getChildAt(i))) {
                return true;
            }
            i++;
        }
    }

    private boolean Mxy() {
        return this instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.sUS;
    }

    private boolean Wyp() {
        if (this.sUS == null || Mxy()) {
            return false;
        }
        if (this.sUS.Ye() != 5 && this.sUS.Ye() != 15) {
            return false;
        }
        if (this.sP == 0) {
            this.sP = this.sUS.VLm();
        }
        icD();
        pvs();
        vG();
        if (this.sP == 5 && so() && pvs() && !icD() && !vG()) {
            return false;
        }
        int i = this.sP;
        return i == 1 || i == 2 || i == 5;
    }

    private String icD(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void vG(boolean z) {
        this.vG = z;
    }

    public void pvs(InterfaceC0074pvs interfaceC0074pvs) {
        this.cRf = new WeakReference<>(interfaceC0074pvs);
    }
}
