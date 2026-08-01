package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.sUS;

/* compiled from: DBAdapter.java */
/* loaded from: classes2.dex */
public class NB extends sUS {
    private static volatile NB pvs;

    @Override // com.bytedance.sdk.openadsdk.core.sUS
    public /* bridge */ /* synthetic */ sUS.vG pvs() {
        return super.pvs();
    }

    public static NB pvs(Context context) {
        if (pvs == null) {
            synchronized (NB.class) {
                if (pvs == null) {
                    pvs = new NB(context);
                }
            }
        }
        return pvs;
    }

    private NB(Context context) {
        super(context);
    }
}
