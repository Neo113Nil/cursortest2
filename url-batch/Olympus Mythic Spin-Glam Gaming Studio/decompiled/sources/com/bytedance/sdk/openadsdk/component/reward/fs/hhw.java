package com.bytedance.sdk.openadsdk.component.reward.fs;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes9.dex */
public class hhw {
    @NonNull
    public static fs zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        nqi nqiVar = fsVar.fs;
        if (nps.zmn(nqiVar) && !zn.zmn(nqiVar)) {
            return new nps(fsVar);
        }
        if (fb.zmn(nqiVar)) {
            return new fb(fsVar);
        }
        if (zn.zmn(nqiVar)) {
            return new zn(fsVar);
        }
        return new btk(fsVar);
    }
}
