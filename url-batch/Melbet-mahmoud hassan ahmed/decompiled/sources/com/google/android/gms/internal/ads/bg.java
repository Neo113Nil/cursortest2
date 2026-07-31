package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bg extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bg(int i7, int i8, int i9, int i10) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(82);
        sb.append("AudioTrack init failed: ");
        sb.append(i7);
        sb.append(", Config(");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(i10);
        sb.append(")");
    }
}
