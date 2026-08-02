package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ String a(int i3) {
        if (i3 == 1) {
            return "none";
        }
        if (i3 == 2) {
            return "success";
        }
        if (i3 == 3) {
            return "incompatible_precondition";
        }
        if (i3 == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "FAILURE" : "INCOMPATIBLE_PRECONDITION" : "SUCCESS" : "NONE";
    }
}
