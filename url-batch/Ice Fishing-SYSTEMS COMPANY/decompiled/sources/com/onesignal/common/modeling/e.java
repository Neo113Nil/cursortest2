package com.onesignal.common.modeling;

/* loaded from: classes2.dex */
public abstract class e {
    public static /* synthetic */ void replace$default(f fVar, i iVar, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
        }
        if ((i & 2) != 0) {
            str = "NORMAL";
        }
        fVar.replace(iVar, str);
    }
}
