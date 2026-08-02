package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ String a(int i4) {
        if (i4 == 1) {
            return "none";
        }
        if (i4 == 2) {
            return "success";
        }
        if (i4 == 3) {
            return "incompatible_precondition";
        }
        if (i4 == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "FAILURE" : "INCOMPATIBLE_PRECONDITION" : "SUCCESS" : "NONE";
    }
}
