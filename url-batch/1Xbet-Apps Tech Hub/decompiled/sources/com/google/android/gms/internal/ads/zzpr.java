package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzpr extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpr(int i, int i2, int i3, int i4, zzam zzamVar, boolean z, Exception exc) {
        super(r1.toString(), exc);
        String valueOf = String.valueOf(zzamVar);
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
        this.zzc = zzamVar;
    }
}
