package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class m14 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m14(long j7, long j8) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(103);
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j8);
        sb.append(", got ");
        sb.append(j7);
    }
}
