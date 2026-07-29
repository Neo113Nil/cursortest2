package com.google.android.gms.iid;

import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
abstract class zzai {

    @GuardedBy("SdkFlagFactory.class")
    private static zzai zzcy;

    zzai() {
    }

    static synchronized zzai zzw() {
        zzai zzaiVar;
        synchronized (zzai.class) {
            if (zzcy == null) {
                zzcy = new zzac();
            }
            zzaiVar = zzcy;
        }
        return zzaiVar;
    }

    abstract zzaj<Boolean> zzd(String str, boolean z);
}
