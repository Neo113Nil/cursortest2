package com.onesignal.common.modeling;

import a2.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void replace$default(f fVar, i iVar, String str, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: replace");
            return;
        }
        if ((i3 & 2) != 0) {
            str = "NORMAL";
        }
        fVar.replace(iVar, str);
    }
}
