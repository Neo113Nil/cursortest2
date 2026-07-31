package com.bytedance.sdk.openadsdk.core.zn;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.component.reward.zn.zg;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.bvs;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.klz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.nu;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zmn extends fs {
    private boolean fkt;
    private boolean fs;
    private int hgd;
    private WeakReference<InterfaceC0185zmn> tf;
    private boolean zmn;
    private boolean zn;

    /* renamed from: com.bytedance.sdk.openadsdk.core.zn.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0185zmn {
        long getVideoProgress();
    }

    public boolean fs() {
        return false;
    }

    public boolean zn() {
        return false;
    }

    public zmn(@NonNull Context context, @NonNull nqi nqiVar, @NonNull String str, int i) {
        super(context, nqiVar, str, i);
        this.zmn = true;
        this.fs = false;
        this.zn = false;
        this.fkt = false;
    }

    public void zmn(boolean z) {
        this.zmn = z;
    }

    public void fs(boolean z) {
        this.fs = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
        String str;
        com.bytedance.sdk.openadsdk.core.rt.zmn bm;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        JSONObject jSONObject;
        boolean z2;
        int i;
        JSONObject jSONObject2;
        View view2;
        Object obj;
        Activity zmn2;
        boolean z3;
        fs.zmn zmnVar;
        cyb cybVar;
        if (zmn(view, 2, f, f2, f3, f4, sparseArray, z)) {
            return;
        }
        nqi nqiVar = ((fs) this).hhw;
        nqiVar.cn(true);
        nqiVar.wl();
        if (!nqiVar.iqz()) {
            nqiVar.fb(true);
        }
        if (nqi.btk(nqiVar)) {
            if (zg.zmn(nqiVar) && (cybVar = ((fs) this).btk) != null) {
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, ((fs) this).nps, cybVar.olo);
            } else {
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, ((fs) this).nps, nqiVar.zvo());
            }
        }
        if (this.mw != null) {
            if (this.cyb == null) {
                this.cyb = new HashMap();
            }
            this.cyb.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.mw.hhw()));
        }
        int ndq = nqiVar.ndq();
        nqiVar.kra(0);
        com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar = this.cn;
        if (znVar != null) {
            znVar.zmn(ndq > 0 ? ndq : 0);
        }
        Map<String, Object> map = this.cyb;
        if (map != null) {
            map.remove("dsp_click_type");
            this.cyb.remove("click_probability_jump");
            this.cyb.remove("auto_click");
        }
        boolean ch = nqiVar.ch();
        if (ndq > 0) {
            if (this.cyb == null) {
                this.cyb = new HashMap();
            }
            if (ch && ndq < 11) {
                this.cyb.put("dsp_click_type", Integer.valueOf(ndq));
            }
            if (ndq >= 11 && nqiVar.qj() == 0) {
                this.cyb.put("click_probability_jump", Integer.valueOf(bvs.zmn(ndq)));
            }
        }
        com.bytedance.sdk.openadsdk.core.model.fb exj = nqiVar.exj();
        if (ch || exj != null) {
            WeakReference<InterfaceC0185zmn> weakReference = this.tf;
            long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.tf.get().getVideoProgress();
            if (!ch && exj != null && (zmn = exj.zmn()) != null) {
                zmn.nps(videoProgress);
            }
            if (ch) {
                if (view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        str = (String) tag;
                        bm = nqiVar.bm();
                        if (bm != null) {
                            bm.btk(str);
                            if (!TextUtils.isEmpty(str)) {
                                zmn(str);
                            }
                            if ("VAST_ICON".equals(str)) {
                                com.bytedance.sdk.openadsdk.core.rt.fs fs = bm.fs();
                                if (fs != null) {
                                    fs.zmn(videoProgress);
                                }
                            } else if ("VAST_END_CARD".equals(str)) {
                                com.bytedance.sdk.openadsdk.core.rt.zn zn = bm.zn();
                                if (zn != null) {
                                    zn.zmn(videoProgress);
                                }
                            } else {
                                com.bytedance.sdk.openadsdk.core.rt.fb zmn3 = bm.zmn();
                                if (zmn3 != null) {
                                    zmn3.nps(videoProgress);
                                }
                            }
                        }
                    }
                }
                str = "VAST_ACTION_BUTTON";
                bm = nqiVar.bm();
                if (bm != null) {
                }
            }
        }
        if (bvs() && fb(view) && !this.zn) {
            super.zmn(view, f, f2, f3, f4, sparseArray, z);
            return;
        }
        if (((fs) this).fb == null) {
            ((fs) this).fb = kgc.zmn();
        }
        if (((fs) this).fb == null || !zmn(view, z)) {
            return;
        }
        JSONObject zmn4 = phc.zmn(view);
        cyb cybVar2 = ((fs) this).btk;
        if (cybVar2 != null) {
            int i2 = cybVar2.zg;
            JSONObject jSONObject3 = cybVar2.bvs;
            JSONObject jSONObject4 = cybVar2.mw;
            i = i2;
            z2 = cybVar2.rt;
            jSONObject = jSONObject3;
            jSONObject2 = jSONObject4;
        } else {
            jSONObject = zmn4;
            z2 = false;
            i = -1;
            jSONObject2 = null;
        }
        long j = this.uqh;
        long j2 = this.bjh;
        WeakReference<View> weakReference2 = this.bvs;
        klz zmn5 = zmn(f, f2, f3, f4, sparseArray, j, j2, weakReference2 == null ? fb() : weakReference2.get(), btk(), jy.zg(((fs) this).fb), jy.iv(((fs) this).fb), jy.bvs(((fs) this).fb), i, jSONObject, jSONObject2);
        this.iv = zmn5;
        if (z2) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn("click", nqiVar, zmn5, ((fs) this).nps, true, this.cyb, z ? 1 : 2);
            return;
        }
        int va = nqiVar.va();
        if (va != 2 && va != 3) {
            if (va != 4) {
                if (va == 5) {
                    String fs2 = fs(((fs) this).nps);
                    if (!TextUtils.isEmpty(fs2)) {
                        com.bytedance.sdk.openadsdk.fb.zn.zmn("click_call", nqiVar, this.iv, fs2, true, this.cyb, z ? 1 : 2);
                    }
                    com.bytedance.sdk.openadsdk.fb.zn.zmn("click", nqiVar, this.iv, ((fs) this).nps, oub.fs(view.getContext(), nqiVar.ao()), this.cyb, z ? 1 : 2);
                    view2 = view;
                } else if (va != 8) {
                    view2 = view;
                    va = -1;
                }
            } else if (am.fs(nqiVar) && (this.klz != null || this.olo != null)) {
                view2 = view;
                zmn2 = view2 != null ? com.bytedance.sdk.component.utils.fs.zmn(view) : null;
                boolean zmn6 = nu.zmn(zmn2 == null ? ((fs) this).fb : zmn2, nqiVar, this.zg, this.klz, this.olo, ((fs) this).nps, this.cn, true, ndq);
                if (this.zmn) {
                    com.bytedance.sdk.openadsdk.fb.zn.zmn("click", nqiVar, this.iv, ((fs) this).nps, zmn6, this.cyb, z ? 1 : 2);
                }
            } else {
                view2 = view;
                com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar2 = this.cn;
                if (znVar2 != null) {
                    znVar2.zmn(nqiVar);
                    Map<String, Object> map2 = this.cyb;
                    if (nqiVar.iqz() && !nqiVar.kw()) {
                        map2.put("auto_click", Boolean.TRUE);
                        nqiVar.btk(false);
                    }
                    if (this.zmn) {
                        com.bytedance.sdk.openadsdk.fb.zn.zmn("click", nqiVar, this.iv, ((fs) this).nps, true, map2, z ? 1 : 2);
                    }
                }
            }
            zmnVar = this.rc;
            if (zmnVar != null) {
                zmnVar.zmn(view2, va);
                return;
            }
            return;
        }
        view2 = view;
        if (va == 3) {
            String pl = nqiVar.pl();
            if (!TextUtils.isEmpty(pl) && pl.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.zmn(((fs) this).fb, pl, pl.substring(pl.indexOf("?id=") + 4), ((fs) this).nps, nqiVar)) {
                    if (this.zmn) {
                        com.bytedance.sdk.openadsdk.fb.zn.zmn("click", nqiVar, this.iv, ((fs) this).nps, true, this.cyb, z ? 1 : 2);
                    }
                    zmnVar = this.rc;
                    if (zmnVar != null) {
                    }
                }
            }
        }
        if (this.klz != null || this.fs) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn("click_button", nqiVar, this.iv, ((fs) this).nps, true, this.cyb, z ? 1 : 2);
        }
        if (view2 != null) {
            try {
                obj = view2.getTag(520093762);
            } catch (Exception unused) {
            }
        } else {
            obj = null;
        }
        if ((view2 != null && (view.getId() == 520093726 || (view2 instanceof com.bytedance.sdk.openadsdk.core.cn.fs.hhw))) || Boolean.TRUE.equals(obj)) {
            nu.zmn(true);
        }
        zmn2 = view2 != null ? com.bytedance.sdk.component.utils.fs.zmn(view) : null;
        Context context = zmn2 == null ? ((fs) this).fb : zmn2;
        if (iqz.zn(nqiVar) && this.fkt) {
            z3 = false;
        } else {
            boolean zmn7 = nu.zmn(context, nqiVar, this.zg, this.klz, this.olo, ((fs) this).nps, this.cn, true, ndq);
            nqiVar.hhw(SystemClock.elapsedRealtime());
            nu.zmn(false);
            z3 = zmn7;
        }
        if (this.zmn) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn("click", nqiVar, this.iv, ((fs) this).nps, z3, this.cyb, z ? 1 : 2);
        }
        zmnVar = this.rc;
        if (zmnVar != null) {
        }
    }

    protected boolean zmn() {
        nqi nqiVar = ((fs) this).hhw;
        if (nqiVar == null) {
            return true;
        }
        int fs = kgc.fb().fs(nqiVar.qvo());
        int zn = com.bytedance.sdk.component.utils.kgc.zn(kgc.zmn());
        if (fs == 1) {
            return oub.fb(zn);
        }
        if (fs == 2) {
            return oub.btk(zn) || oub.fb(zn) || oub.hhw(zn);
        }
        if (fs != 3) {
            return fs != 5 || oub.fb(zn) || oub.hhw(zn);
        }
        return false;
    }

    private boolean nps() {
        nqi nqiVar = ((fs) this).hhw;
        return nqi.btk(nqiVar) && nqiVar.mpi() == 1;
    }

    private boolean fb(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.cn.fs.hhw) || view.getId() == olo.vgx || view.getId() == olo.vlj || view.getId() == olo.yof || view.getId() == olo.dgt || view.getId() == olo.cud || view.getId() == 520093726 || view.getId() == olo.gt) {
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
            if (fb(viewGroup.getChildAt(i))) {
                return true;
            }
            i++;
        }
    }

    private boolean zg() {
        return this instanceof com.bytedance.sdk.openadsdk.core.iv.bvs;
    }

    private boolean bvs() {
        nqi nqiVar = ((fs) this).hhw;
        if (nqiVar == null || zg()) {
            return false;
        }
        if (nqiVar.zq() != 5 && nqiVar.zq() != 15) {
            return false;
        }
        if (this.hgd == 0) {
            this.hgd = nqiVar.ldx();
        }
        fs();
        zmn();
        zn();
        if (this.hgd == 5 && nps() && zmn() && !fs() && !zn()) {
            return false;
        }
        int i = this.hgd;
        return i == 1 || i == 2 || i == 5;
    }

    private String fs(String str) {
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

    public void zn(boolean z) {
        this.zn = z;
    }

    public void zmn(InterfaceC0185zmn interfaceC0185zmn) {
        this.tf = new WeakReference<>(interfaceC0185zmn);
    }

    public void fb(boolean z) {
        this.fkt = z;
    }

    public void zmn(View view) {
        zmn(view, this.iqz, this.phc, this.doe, this.nqi, this.ev, this.yj);
    }
}
