package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzph extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzph(int i, int i2, int i3, int i4, zzaf zzafVar, boolean z, Exception exc) {
        super(r0.toString(), exc);
        String valueOf = String.valueOf(zzafVar);
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(valueOf);
        sb.append(true != z ? "" : " (recoverable)");
        this.zza = i;
        this.zzb = z;
    }
}
