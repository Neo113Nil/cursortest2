package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lf extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lf(int i7, int i8, int i9) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(78);
        sb.append("Unhandled format: ");
        sb.append(i7);
        sb.append(" Hz, ");
        sb.append(i8);
        sb.append(" channels in encoding ");
        sb.append(i9);
    }
}
