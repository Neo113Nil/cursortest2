package com.bytedance.sdk.openadsdk.core.iv;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.klz;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class bvs extends com.bytedance.sdk.openadsdk.core.zn.zmn {
    public bvs(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, @NonNull String str, int i) {
        super(context, nqiVar, str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // com.bytedance.sdk.openadsdk.core.zn.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected com.bytedance.sdk.openadsdk.core.model.klz zmn(float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, long j, long j2, View view, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        float f7;
        float f8;
        float f9;
        float f10;
        com.bytedance.sdk.openadsdk.core.model.cyb cybVar;
        long j3;
        long j4;
        int[] zmn = jy.zmn(view);
        if (zmn != null && zmn.length == 2) {
            int i3 = zmn[0];
            int i4 = zmn[1];
            if (this.kw == 0) {
                f7 = (jy.fs(((com.bytedance.sdk.openadsdk.core.zn.fs) this).fb, f) + i3) - 0.5f;
                f8 = (jy.fs(((com.bytedance.sdk.openadsdk.core.zn.fs) this).fb, f2) + i4) - 0.5f;
                f9 = (jy.fs(((com.bytedance.sdk.openadsdk.core.zn.fs) this).fb, f3) + i3) - 0.5f;
                f10 = (jy.fs(((com.bytedance.sdk.openadsdk.core.zn.fs) this).fb, f4) + i4) - 0.5f;
                cybVar = ((com.bytedance.sdk.openadsdk.core.zn.fs) this).btk;
                if (cybVar == null) {
                    j3 = cybVar.btk;
                    j4 = cybVar.hhw;
                } else {
                    j3 = j;
                    j4 = j2;
                }
                this.kw = 0;
                return new klz.zmn().hhw(f7).btk(f8).fb(f9).zn(f10).fs(j3).zmn(j4).zmn(zmn).fs(jy.zn(view)).fb(this.rp).btk(this.kjb).hhw(this.zak).fs(com.bytedance.sdk.openadsdk.core.iv.fs().zmn() ? 1 : 2).zmn(sparseArray).zmn(str).zmn(f5).zn(i).fs(f6).zmn(i2).zmn(jSONObject).fs(jSONObject2).zmn();
            }
        }
        f7 = f;
        f8 = f2;
        f9 = f3;
        f10 = f4;
        cybVar = ((com.bytedance.sdk.openadsdk.core.zn.fs) this).btk;
        if (cybVar == null) {
        }
        this.kw = 0;
        return new klz.zmn().hhw(f7).btk(f8).fb(f9).zn(f10).fs(j3).zmn(j4).zmn(zmn).fs(jy.zn(view)).fb(this.rp).btk(this.kjb).hhw(this.zak).fs(com.bytedance.sdk.openadsdk.core.iv.fs().zmn() ? 1 : 2).zmn(sparseArray).zmn(str).zmn(f5).zn(i).fs(f6).zmn(i2).zmn(jSONObject).fs(jSONObject2).zmn();
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.cyb cybVar) {
        ((com.bytedance.sdk.openadsdk.core.zn.fs) this).btk = cybVar;
    }
}
