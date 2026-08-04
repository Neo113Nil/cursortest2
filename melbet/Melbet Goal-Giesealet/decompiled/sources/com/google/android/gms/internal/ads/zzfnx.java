package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfnx extends zzfns {
    public zzfnx(zzfnl zzfnlVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnlVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfnl zzfnlVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfnd.zzg(jSONObject, zzfnlVar.zzd())) {
            return null;
        }
        zzfnlVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnt, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfnt
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfmh zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfmh.zza()) != null) {
            for (zzfln zzflnVar : zza.zze()) {
                if (this.zza.contains(zzflnVar.zzh())) {
                    zzflnVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
