package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfnh extends AsyncTask {
    private zzfni zza;
    protected final zzfmz zzd;

    public zzfnh(zzfmz zzfmzVar) {
        this.zzd = zzfmzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfni zzfniVar = this.zza;
        if (zzfniVar != null) {
            zzfniVar.zza(this);
        }
    }

    public final void zzb(zzfni zzfniVar) {
        this.zza = zzfniVar;
    }
}
