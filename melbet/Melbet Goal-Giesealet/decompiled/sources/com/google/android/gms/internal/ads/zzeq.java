package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeq {
    public final String zza;

    private zzeq(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzeq zza(zzef zzefVar) {
        String str;
        zzefVar.zzk(2);
        int zzs = zzefVar.zzs();
        int i = zzs >> 1;
        int i2 = zzs & 1;
        int zzs2 = zzefVar.zzs() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i3 = zzs2 | (i2 << 5);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i3).length();
        String str2 = i < 10 ? ".0" : ".";
        int length3 = str.length() + str2.length() + length;
        String str3 = i3 >= 10 ? "." : ".0";
        StringBuilder sb = new StringBuilder(length3 + str3.length() + length2);
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
        sb.append(i3);
        return new zzeq(i, i3, sb.toString());
    }
}
