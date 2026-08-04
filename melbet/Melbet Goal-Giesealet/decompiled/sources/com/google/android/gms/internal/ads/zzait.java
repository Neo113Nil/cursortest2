package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzait {
    public final boolean zza;
    public final String zzb;
    public final zzaea zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r5.equals("cens") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5.equals("cenc") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r5.equals("cbcs") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r5.equals("cbc1") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzait(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 1;
        zzghc.zza((bArr2 == null) ^ (i == 0));
        this.zza = z;
        this.zzb = str;
        this.zzd = i;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    break;
                case 3049879:
                    break;
                case 3049895:
                    break;
                default:
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    zzds.zzc("TrackEncryptionBox", sb.toString());
                    break;
            }
        }
        this.zzc = new zzaea(i4, bArr, i2, i3);
    }
}
