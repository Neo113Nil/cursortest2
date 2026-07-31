package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class fb {

    @NonNull
    private com.bytedance.sdk.openadsdk.core.rt.fb zmn = new com.bytedance.sdk.openadsdk.core.rt.fb();
    private Set<com.bytedance.sdk.openadsdk.core.rt.iv> fs = new HashSet();

    @NonNull
    public com.bytedance.sdk.openadsdk.core.rt.fb zmn() {
        return this.zmn;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.rt.fb fbVar) {
        if (fbVar == null) {
            fbVar = new com.bytedance.sdk.openadsdk.core.rt.fb();
        }
        this.zmn = fbVar;
    }

    public Set<com.bytedance.sdk.openadsdk.core.rt.iv> fs() {
        return this.fs;
    }

    public void zmn(Set<com.bytedance.sdk.openadsdk.core.rt.iv> set) {
        this.fs = set;
    }

    public void zmn(nqi nqiVar) {
        com.bytedance.sdk.openadsdk.core.rt.fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.zmn(nqiVar);
        }
    }

    public void fs(Set<com.bytedance.sdk.openadsdk.core.rt.iv> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.fs.addAll(set);
    }
}
