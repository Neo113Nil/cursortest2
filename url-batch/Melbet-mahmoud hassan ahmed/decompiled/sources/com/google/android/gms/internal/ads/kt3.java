package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class kt3 extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    kt3(int i7, int i8) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i7);
        sb.append(" of ");
        sb.append(i8);
    }
}
