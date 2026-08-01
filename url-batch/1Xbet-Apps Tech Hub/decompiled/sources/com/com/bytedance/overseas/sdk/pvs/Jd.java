package com.com.bytedance.overseas.sdk.pvs;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.jlb;

/* compiled from: TTDownloadFactory.java */
/* loaded from: classes2.dex */
public class Jd {
    public static vG pvs(Context context, cR cRVar, String str) {
        if (jlb.so(context)) {
            return new icD(context, cRVar, str);
        }
        return new pvs(context, cRVar, str);
    }
}
