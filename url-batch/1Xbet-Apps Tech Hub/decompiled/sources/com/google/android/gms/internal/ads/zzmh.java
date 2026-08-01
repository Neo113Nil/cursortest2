package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzmh {
    private final PowerManager zza;

    public zzmh(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
