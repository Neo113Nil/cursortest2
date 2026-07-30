package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzrf extends Exception {
    public final boolean zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzrf(int i, int i2, int i3, int i4, int i5, zzv zzvVar, boolean z, Exception exc) {
        super(r3.toString(), exc);
        String valueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i3).length();
        int length3 = String.valueOf(i4).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i5).length() + 2 + String.valueOf(valueOf).length() + "".length());
        sb.append("AudioTrack init failed 0 Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(") ");
        sb.append(valueOf);
        sb.append("");
        this.zza = false;
    }
}
