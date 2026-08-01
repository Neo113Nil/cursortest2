package com.bytedance.sdk.openadsdk.core.icD;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.ae;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.IP;
import com.bytedance.sdk.openadsdk.core.model.Wyp;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ClickListener.java */
/* loaded from: classes2.dex */
public class icD extends vG {
    private static int cRf = Integer.MIN_VALUE;
    protected com.bykv.vk.openvk.component.video.api.Jd.vG IP;
    protected Context Jd;
    protected PAGNativeAd Ju;
    protected WeakReference<View> Mxy;
    public IP NB;
    protected WeakReference<View> Wyp;
    protected boolean bNS;
    protected PangleAd cR;
    private WeakReference<Activity> icD;
    protected pvs kj;
    protected com.com.bytedance.overseas.sdk.pvs.vG mnm;
    private String pvs;
    protected Wyp qh;
    protected final cR sUS;
    protected final int so;
    protected int uc;
    protected Map<String, Object> vA;
    private boolean vG;
    protected final String yiw;
    protected com.bytedance.sdk.openadsdk.core.nativeexpress.pvs zM;

    /* compiled from: ClickListener.java */
    public interface pvs {
        void pvs(View view, int i);
    }

    public boolean pvs(Wyp wyp, Map<String, Object> map) {
        return false;
    }

    public void pvs(com.com.bytedance.overseas.sdk.pvs.vG vGVar) {
        this.mnm = vGVar;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.nativeexpress.pvs pvsVar) {
        this.zM = pvsVar;
    }

    public void pvs(PAGNativeAd pAGNativeAd) {
        this.Ju = pAGNativeAd;
    }

    public void pvs(PangleAd pangleAd) {
        this.cR = pangleAd;
    }

    public void Jd(boolean z) {
        this.bNS = z;
    }

    public void pvs(com.bykv.vk.openvk.component.video.api.Jd.vG vGVar) {
        this.IP = vGVar;
    }

    public icD(Context context, cR cRVar, String str, int i) {
        this.bNS = false;
        this.uc = 0;
        this.vG = false;
        this.Jd = context;
        this.sUS = cRVar;
        this.yiw = str;
        this.so = i;
    }

    public icD(Context context, cR cRVar, String str, int i, boolean z) {
        this(context, cRVar, str, i);
        this.vG = z;
    }

    public void pvs(pvs pvsVar) {
        this.kj = pvsVar;
    }

    public void pvs(Activity activity) {
        if (activity == null) {
            return;
        }
        this.icD = new WeakReference<>(activity);
    }

    public void pvs(View view) {
        if (view == null) {
            return;
        }
        this.Mxy = new WeakReference<>(view);
    }

    public void icD(View view) {
        if (view == null) {
            return;
        }
        this.Wyp = new WeakReference<>(view);
    }

    public View Jd() {
        WeakReference<Activity> weakReference = this.icD;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.icD.get().findViewById(R.id.content);
    }

    public View NB() {
        WeakReference<Activity> weakReference = this.icD;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        View findViewById = this.icD.get().findViewById(520093713);
        return findViewById == null ? this.icD.get().findViewById(520093713) : findViewById;
    }

    public void pvs(Map<String, Object> map) {
        Map<String, Object> map2 = this.vA;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.vA);
        }
        this.vA = map;
    }

    public void pvs(int i) {
        this.ae = i;
    }

    public void icD(int i) {
        this.Gp = i;
    }

    public void vG(int i) {
        this.CvL = i;
    }

    public void Jd(int i) {
        this.uc = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.icD.vG
    public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
        int i;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        cR cRVar;
        if (this.Jd == null) {
            this.Jd = mnm.pvs();
        }
        if ((this.vG || !pvs(view, 1, f, f2, f3, f4, sparseArray, z)) && this.Jd != null) {
            IP ip = this.NB;
            if (ip != null) {
                i = ip.kj;
                jSONObject = this.NB.Ju;
                jSONObject2 = this.NB.vA;
            } else {
                i = -1;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j = this.dyT;
            long j2 = this.dX;
            WeakReference<View> weakReference = this.Mxy;
            View view2 = weakReference == null ? null : weakReference.get();
            WeakReference<View> weakReference2 = this.Wyp;
            Wyp pvs2 = pvs(f, f2, f3, f4, sparseArray, j, j2, view2, weakReference2 == null ? null : weakReference2.get(), sUS(), Pj.NB(this.Jd), Pj.yiw(this.Jd), Pj.sUS(this.Jd), i, jSONObject, jSONObject2);
            this.qh = pvs2;
            if (pvs(pvs2, this.vA)) {
                return;
            }
            if (this.IP != null) {
                if (this.vA == null) {
                    this.vA = new HashMap();
                }
                this.vA.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(this.IP.NB()));
            }
            if (this.vG) {
                com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.sUS, this.qh, this.yiw, true, this.vA, z ? 1 : 2);
                return;
            }
            pvs pvsVar = this.kj;
            if (pvsVar != null) {
                pvsVar.pvs(view, -1);
            }
            if (pvs(view, z)) {
                boolean icD = rCZ.icD(this.sUS);
                String pvs3 = icD ? this.yiw : jlb.pvs(this.so);
                if (view != null) {
                    try {
                        Boolean bool = (Boolean) view.getTag(520093762);
                        Boolean bool2 = bool;
                        if (bool.booleanValue()) {
                            ae.pvs(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                Activity pvs4 = view != null ? com.bytedance.sdk.component.utils.icD.pvs(view) : null;
                boolean pvs5 = ae.pvs(pvs4 == null ? this.Jd : pvs4, this.sUS, this.so, this.Ju, this.cR, pvs3, this.mnm, icD, 0);
                ae.pvs(false);
                if (pvs5 || (cRVar = this.sUS) == null || cRVar.Zm() == null || this.sUS.Zm().vG() != 2) {
                    cR cRVar2 = this.sUS;
                    if (cRVar2 != null && !pvs5 && TextUtils.isEmpty(cRVar2.CjQ()) && com.bytedance.sdk.openadsdk.icD.icD.pvs(this.yiw)) {
                        com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.Jd, this.sUS, this.yiw).Jd();
                    }
                    com.bytedance.sdk.openadsdk.icD.vG.pvs("click", this.sUS, this.qh, this.yiw, pvs5, this.vA, z ? 1 : 2);
                }
            }
        }
    }

    public boolean pvs(View view, boolean z) {
        return pvs(view, this.sUS, z);
    }

    public static boolean pvs(View view, cR cRVar, boolean z) {
        if (view != null && cRVar != null) {
            try {
                String valueOf = String.valueOf(view.getTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.uc));
                if (view.getTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.uc) != null && !TextUtils.isEmpty(valueOf)) {
                    if ("click".equals(valueOf)) {
                        return z;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (vG(view)) {
                return cRVar.zM() != 1 || z;
            }
            if (cRVar.cR() == 1 && !z) {
                return false;
            }
        }
        return true;
    }

    protected Wyp pvs(float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        return new Wyp.pvs().sUS(f).NB(f2).Jd(f3).vG(f4).icD(j).pvs(j2).icD(Pj.pvs(view)).pvs(Pj.pvs(view2)).vG(Pj.vG(view)).Jd(Pj.vG(view2)).Jd(this.CvL).NB(this.Gp).sUS(this.ae).pvs(sparseArray).icD(so.icD().pvs() ? 1 : 2).pvs(str).pvs(f5).vG(i).icD(f6).pvs(i2).pvs(jSONObject).icD(jSONObject2).pvs();
    }

    protected boolean pvs(View view, int i, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
        if (this.zM == null) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.Wyp;
        if (weakReference != null) {
            iArr = Pj.pvs(weakReference.get());
            iArr2 = Pj.vG(this.Wyp.get());
        }
        this.zM.pvs(view, i, new IP.pvs().Jd(f).vG(f2).icD(f3).pvs(f4).icD(this.dyT).pvs(this.dX).vG(iArr[0]).Jd(iArr[1]).NB(iArr2[0]).sUS(iArr2[1]).pvs(sparseArray).pvs(z).pvs());
        return true;
    }

    public static boolean vG(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || pvs(view.getContext()) == view.getId() || kj.sR == view.getId() || kj.sDK == view.getId();
    }

    private static int pvs(Context context) {
        if (cRf == Integer.MIN_VALUE) {
            cRf = uc.NB(context, "btn_native_creative");
        }
        return cRf;
    }

    public String sUS() {
        return this.pvs;
    }

    public void pvs(String str) {
        this.pvs = str;
    }
}
