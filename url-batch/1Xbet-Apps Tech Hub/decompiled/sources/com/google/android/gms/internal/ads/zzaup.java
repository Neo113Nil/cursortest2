package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaup extends zzaux {
    private final StackTraceElement[] zzi;

    public zzaup(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzatjVar, "fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", zzapgVar, i, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzata zzataVar = new zzata((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzF(zzataVar.zza.longValue());
                if (zzataVar.zzb.booleanValue()) {
                    this.zze.zzac(true != zzataVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
