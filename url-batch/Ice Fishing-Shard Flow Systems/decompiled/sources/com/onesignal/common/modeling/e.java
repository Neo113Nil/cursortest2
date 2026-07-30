package com.onesignal.common.modeling;

/* loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void replace$default(f fVar, i iVar, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
        }
        if ((i2 & 2) != 0) {
            str = "NORMAL";
        }
        fVar.replace(iVar, str);
    }
}
