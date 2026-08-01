package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaca {
    public final String zza;

    private zzaca(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzaca zza(zzfj zzfjVar) {
        String str;
        zzfjVar.zzH(2);
        int zzl = zzfjVar.zzl();
        int i = zzl >> 1;
        int i2 = zzl & 1;
        int zzl2 = zzfjVar.zzl() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i3 = zzl2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new zzaca(i, i3, sb.toString());
    }
}
