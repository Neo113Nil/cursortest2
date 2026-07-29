package com.google.android.gms.internal.ads;

import android.util.Log;

@zzadh
/* loaded from: classes2.dex */
public final class zzakb extends zzane {
    public static void v(String str) {
        if (zzqp()) {
            Log.v("Ads", str);
        }
    }

    public static boolean zzqp() {
        if (isLoggable(2)) {
            return ((Boolean) zzkb.zzik().zzd(zznk.zzazr)).booleanValue();
        }
        return false;
    }
}
