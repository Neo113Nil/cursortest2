package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x41 extends IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x41(int i7, int i8) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(i7);
        sb.append(" < ");
        sb.append(i8);
        sb.append(")");
    }
}
