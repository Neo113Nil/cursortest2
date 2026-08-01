package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaua extends zzaux {
    private final long zzi;

    public zzaua(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, long j, int i, int i2) {
        super(zzatjVar, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", zzapgVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(longValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzT(longValue - j);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
