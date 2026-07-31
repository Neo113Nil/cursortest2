package com.bytedance.sdk.openadsdk.core.zn;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.bytedance.sdk.openadsdk.core.model.klz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.nu;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class fs extends zn {
    private static int tf = Integer.MIN_VALUE;
    public cyb btk;
    protected WeakReference<View> bvs;
    protected com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn cn;
    protected Map<String, Object> cyb;
    protected Context fb;
    private WeakReference<Activity> fs;
    protected final nqi hhw;
    protected klz iv;
    protected com.bytedance.sdk.openadsdk.core.iv.fs kgc;
    protected PAGNativeAd klz;
    protected int kw;
    protected com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn mw;
    protected final String nps;
    protected com.bytedance.sdk.openadsdk.core.fb.zmn olo;
    protected zmn rc;
    protected boolean rt;
    protected final int zg;
    private String zmn;
    private boolean zn;

    public interface zmn {
        void zmn(View view, int i);
    }

    public boolean zmn(klz klzVar, Map<String, Object> map) {
        return false;
    }

    public void zmn(com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar) {
        this.cn = znVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.iv.fs fsVar) {
        this.kgc = fsVar;
    }

    public void zmn(PAGNativeAd pAGNativeAd) {
        this.klz = pAGNativeAd;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.fb.zmn zmnVar) {
        this.olo = zmnVar;
    }

    public void btk(boolean z) {
        this.rt = z;
    }

    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar) {
        this.mw = znVar;
    }

    public fs(@NonNull Context context, @NonNull nqi nqiVar, @NonNull String str, int i) {
        this.rt = false;
        this.kw = 0;
        this.zn = false;
        this.fb = context;
        this.hhw = nqiVar;
        this.nps = str;
        this.zg = i;
    }

    public fs(@NonNull Context context, @NonNull nqi nqiVar, @NonNull String str, int i, boolean z) {
        this(context, nqiVar, str, i);
        this.zn = z;
    }

    public void zmn(zmn zmnVar) {
        this.rc = zmnVar;
    }

    public void zmn(Activity activity) {
        if (activity == null) {
            return;
        }
        this.fs = new WeakReference<>(activity);
    }

    public void fs(View view) {
        if (view == null) {
            return;
        }
        this.bvs = new WeakReference<>(view);
    }

    public View fb() {
        WeakReference<Activity> weakReference = this.fs;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.fs.get().findViewById(R.id.content);
    }

    public void zmn(Map<String, Object> map) {
        Map<String, Object> map2 = this.cyb;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.cyb);
        }
        this.cyb = map;
    }

    public void zmn(int i) {
        this.zak = i;
    }

    public void fs(int i) {
        this.kjb = i;
    }

    public void zn(int i) {
        this.rp = i;
    }

    public void fb(int i) {
        this.kw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zn
    public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
        int i;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn2;
        if (this.fb == null) {
            this.fb = kgc.zmn();
        }
        if ((this.zn || !zmn(view, 1, f, f2, f3, f4, sparseArray, z)) && this.fb != null) {
            cyb cybVar = this.btk;
            if (cybVar != null) {
                int i2 = cybVar.zg;
                JSONObject jSONObject3 = cybVar.bvs;
                JSONObject jSONObject4 = cybVar.mw;
                z2 = cybVar.rt;
                i = i2;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i = -1;
                z2 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j = this.uqh;
            long j2 = this.bjh;
            WeakReference<View> weakReference = this.bvs;
            klz zmn3 = zmn(f, f2, f3, f4, sparseArray, j, j2, weakReference == null ? null : weakReference.get(), btk(), jy.zg(this.fb), jy.iv(this.fb), jy.bvs(this.fb), i, jSONObject, jSONObject2);
            this.iv = zmn3;
            if (zmn(zmn3, this.cyb)) {
                return;
            }
            if (this.mw != null) {
                if (this.cyb == null) {
                    this.cyb = new HashMap();
                }
                this.cyb.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.mw.hhw()));
            }
            nqi nqiVar = this.hhw;
            if (this.zn || z2) {
                com.bytedance.sdk.openadsdk.fb.zn.zmn("click", nqiVar, this.iv, this.nps, true, this.cyb, z ? 1 : 2);
                com.bytedance.sdk.openadsdk.core.model.fb exj = nqiVar.exj();
                if (exj == null || nqiVar.ch() || (zmn2 = exj.zmn()) == null) {
                    return;
                }
                com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.mw;
                zmn2.nps(znVar != null ? znVar.hhw() : 0L);
                return;
            }
            zmn zmnVar = this.rc;
            if (zmnVar != null) {
                zmnVar.zmn(view, -1);
            }
            if (zmn(view, z)) {
                boolean fs = am.fs(nqiVar);
                String zmn4 = fs ? this.nps : oub.zmn(this.zg);
                if (view != null) {
                    try {
                        if (Boolean.TRUE.equals(view.getTag(520093762))) {
                            nu.zmn(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                Activity zmn5 = view != null ? com.bytedance.sdk.component.utils.fs.zmn(view) : null;
                boolean zmn6 = nu.zmn(zmn5 == null ? this.fb : zmn5, nqiVar, this.zg, this.klz, this.olo, zmn4, this.cn, fs, 0);
                nu.zmn(false);
                if (zmn6 || nqiVar == null || nqiVar.my() == null || nqiVar.my().zn() != 2) {
                    if (nqiVar != null && !zmn6 && TextUtils.isEmpty(nqiVar.pl()) && com.bytedance.sdk.openadsdk.fb.fs.zmn(this.nps)) {
                        com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.fb, this.nps).zmn(nqiVar);
                    }
                    com.bytedance.sdk.openadsdk.fb.zn.zmn("click", nqiVar, this.iv, this.nps, zmn6, this.cyb, z ? 1 : 2);
                }
            }
        }
    }

    public boolean zmn(View view, boolean z) {
        return zmn(view, this.hhw, z);
    }

    public static boolean zmn(View view, nqi nqiVar, boolean z) {
        if (view != null && nqiVar != null) {
            try {
                int i = com.bytedance.sdk.component.adexpress.dynamic.zmn.iqz;
                String valueOf = String.valueOf(view.getTag(i));
                if (view.getTag(i) != null && !TextUtils.isEmpty(valueOf)) {
                    if ("click".equals(valueOf)) {
                        return z;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (zn(view)) {
                return nqiVar.hwg() != 1 || z;
            }
            if (nqiVar.lbc() == 1 && !z) {
                return false;
            }
        }
        return true;
    }

    protected klz zmn(float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, long j, long j2, View view, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        return new klz.zmn().hhw(f).btk(f2).fb(f3).zn(f4).fs(j).zmn(j2).zmn(jy.zmn(view)).fs(jy.zn(view)).fb(this.rp).btk(this.kjb).hhw(this.zak).zmn(sparseArray).fs(iv.fs().zmn() ? 1 : 2).zmn(str).zmn(f5).zn(i).fs(f6).zmn(i2).zmn(jSONObject).fs(jSONObject2).zmn();
    }

    protected boolean zmn(View view, int i, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
        if (this.kgc == null) {
            return false;
        }
        this.kgc.zmn(view, i, new cyb.zmn().fb(f).zn(f2).fs(f3).zmn(f4).fs(this.uqh).zmn(this.bjh).zmn(sparseArray).zmn(z).zmn());
        return true;
    }

    public static boolean zn(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || zmn(view.getContext()) == view.getId() || olo.dey == view.getId() || olo.tuj == view.getId();
    }

    private static int zmn(Context context) {
        if (tf == Integer.MIN_VALUE) {
            tf = doe.btk(context, "btn_native_creative");
        }
        return tf;
    }

    public String btk() {
        return this.zmn;
    }

    public void zmn(String str) {
        this.zmn = str;
    }
}
