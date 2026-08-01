package com.bytedance.sdk.component.NB.vG;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.NB.Ju;
import com.bytedance.sdk.component.NB.Wyp;
import com.bytedance.sdk.component.NB.bNS;
import com.bytedance.sdk.component.NB.vG.vG;
import com.bytedance.sdk.component.NB.zM;
import com.bytedance.sdk.openadsdk.ats.ATS;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ImageLoader.java */
@ATS(single = true, value = {"img_service"})
/* loaded from: classes.dex */
public class icD implements bNS {
    private volatile sUS pvs;

    private icD() {
    }

    public static bNS pvs(Context context, Ju ju) {
        icD icd = new icD();
        icd.icD(context, ju);
        return icd;
    }

    private void icD(Context context, Ju ju) {
        if (this.pvs != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (ju == null) {
            ju = NB.pvs(context);
        }
        this.pvs = new sUS(context, ju);
    }

    @Override // com.bytedance.sdk.component.NB.bNS
    public Wyp pvs(String str) {
        return new vG.icD(this.pvs).vG(str);
    }

    @Override // com.bytedance.sdk.component.NB.bNS
    public InputStream pvs(String str, String str2) {
        if (this.pvs != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.NB.vG.vG.vG.pvs(str);
            }
            Collection<zM> icD = this.pvs.icD();
            if (icD != null) {
                Iterator<zM> it = icD.iterator();
                while (it.hasNext()) {
                    byte[] pvs = it.next().pvs(str2);
                    if (pvs != null) {
                        return new ByteArrayInputStream(pvs);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.NB.vG> vG = this.pvs.vG();
            if (vG != null) {
                Iterator<com.bytedance.sdk.component.NB.vG> it2 = vG.iterator();
                while (it2.hasNext()) {
                    InputStream pvs2 = it2.next().pvs(str2);
                    if (pvs2 != null) {
                        return pvs2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.NB.bNS
    public boolean pvs(String str, String str2, String str3) {
        if (this.pvs == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.NB.vG.vG.vG.pvs(str);
        }
        com.bytedance.sdk.component.NB.vG pvs = this.pvs.pvs(str3);
        if (pvs != null) {
            return pvs.icD(str2);
        }
        return false;
    }
}
