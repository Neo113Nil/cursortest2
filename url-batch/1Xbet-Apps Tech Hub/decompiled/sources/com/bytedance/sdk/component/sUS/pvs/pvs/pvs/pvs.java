package com.bytedance.sdk.component.sUS.pvs.pvs.pvs;

import android.content.Context;
import com.bytedance.sdk.component.sUS.pvs.pvs.pvs.icD;

/* compiled from: DBAdapter.java */
/* loaded from: classes.dex */
public class pvs extends icD {
    private static volatile pvs pvs;

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.pvs.icD
    public /* bridge */ /* synthetic */ icD.C0053icD pvs() {
        return super.pvs();
    }

    public static pvs pvs(Context context) {
        if (pvs == null) {
            synchronized (pvs.class) {
                if (pvs == null) {
                    pvs = new pvs(context);
                }
            }
        }
        return pvs;
    }

    private pvs(Context context) {
        super(context);
    }
}
