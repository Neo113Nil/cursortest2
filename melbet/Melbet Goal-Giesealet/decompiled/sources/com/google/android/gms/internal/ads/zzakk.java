package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzakk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzakk(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static zzakk zza(String str) {
        zzghc.zza(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new zzakk(i2, i3, i4, i5, i6, length);
            }
            String zza = zzggj.zza(split[i].trim());
            switch (zza.hashCode()) {
                case 100571:
                    if (!zza.equals(ViewProps.END)) {
                        break;
                    } else {
                        i4 = i;
                        break;
                    }
                case 3556653:
                    if (!zza.equals("text")) {
                        break;
                    } else {
                        i6 = i;
                        break;
                    }
                case 102749521:
                    if (!zza.equals("layer")) {
                        break;
                    } else {
                        i2 = i;
                        break;
                    }
                case 109757538:
                    if (!zza.equals(ViewProps.START)) {
                        break;
                    } else {
                        i3 = i;
                        break;
                    }
                case 109780401:
                    if (!zza.equals("style")) {
                        break;
                    } else {
                        i5 = i;
                        break;
                    }
            }
            i++;
        }
    }
}
