package com.bytedance.sdk.component.adexpress.dynamic.fs;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.fb.nps;

/* loaded from: classes14.dex */
public class zmn {
    public static int zmn(nps npsVar) {
        if (npsVar == null) {
            return 0;
        }
        String nu = npsVar.nu();
        String uqh = npsVar.uqh();
        if (TextUtils.isEmpty(uqh) || TextUtils.isEmpty(nu) || !uqh.equals("creative")) {
            return 0;
        }
        if (nu.equals("shake")) {
            return 2;
        }
        if (nu.equals("twist")) {
            return 3;
        }
        return nu.equals("slide") ? 1 : 0;
    }
}
