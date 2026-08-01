package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.Wyp;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import org.json.JSONObject;

/* compiled from: ExpressClickCreativeListener.java */
/* loaded from: classes2.dex */
public class sUS extends com.bytedance.sdk.openadsdk.core.icD.pvs {
    public sUS(Context context, cR cRVar, String str, int i) {
        super(context, cRVar, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.icD
    protected com.bytedance.sdk.openadsdk.core.model.Wyp pvs(float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        int i4;
        int i5;
        long j3;
        long j4;
        char c;
        int i6;
        int i7;
        int[] pvs = Pj.pvs(view);
        int i8 = 0;
        if (pvs == null || pvs.length != 2) {
            f7 = f;
            f8 = f2;
            f9 = f3;
            f10 = f4;
            i3 = 0;
            i4 = 0;
        } else {
            i3 = pvs[0];
            i4 = pvs[1];
            if (this.uc == 0) {
                f10 = (Pj.icD(this.Jd, f4) + i4) - 0.5f;
                f9 = (Pj.icD(this.Jd, f3) + i3) - 0.5f;
                f7 = (Pj.icD(this.Jd, f) + i3) - 0.5f;
                f8 = (Pj.icD(this.Jd, f2) + i4) - 0.5f;
            } else {
                f7 = f;
                f8 = f2;
                f9 = f3;
                f10 = f4;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (this.NB != null) {
            j3 = this.NB.NB;
            j4 = this.NB.sUS;
            if (this.uc == 0) {
                iArr[0] = Pj.icD(this.Jd, this.NB.yiw) + i3;
                iArr[1] = Pj.icD(this.Jd, this.NB.so) + i4;
                i6 = Pj.icD(this.Jd, this.NB.Mxy);
                i7 = Pj.icD(this.Jd, this.NB.Wyp);
                c = 0;
                i5 = 1;
            } else {
                c = 0;
                iArr[0] = this.NB.yiw;
                i5 = 1;
                iArr[1] = this.NB.so;
                i6 = this.NB.Mxy;
                i7 = this.NB.Wyp;
            }
            iArr2[c] = i6;
            iArr2[i5] = i7;
            if (i6 == 0 && i7 == 0 && view2 != null) {
                iArr = Pj.pvs(view2);
                iArr2 = Pj.vG(view2);
            }
            i8 = 0;
        } else {
            i5 = 1;
            j3 = j;
            j4 = j2;
        }
        this.uc = i8;
        return new Wyp.pvs().sUS(f7).NB(f8).Jd(f9).vG(f10).icD(j3).pvs(j4).icD(pvs).pvs(iArr).vG(Pj.vG(view)).Jd(iArr2).Jd(this.CvL).NB(this.Gp).sUS(this.ae).icD(com.bytedance.sdk.openadsdk.core.so.icD().pvs() ? i5 : 2).pvs(sparseArray).pvs(str).pvs(f5).vG(i).icD(f6).pvs(i2).pvs(jSONObject).icD(jSONObject2).pvs();
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.model.IP ip) {
        this.NB = ip;
    }
}
