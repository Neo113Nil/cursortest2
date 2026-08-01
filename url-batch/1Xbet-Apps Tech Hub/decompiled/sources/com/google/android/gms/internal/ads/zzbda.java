package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbda implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzd(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbdh.zza(new zzfuo() { // from class: com.google.android.gms.internal.ads.zzbcx
                @Override // com.google.android.gms.internal.ads.zzfuo
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzd(sharedPreferences);
        }
    }

    public final Object zza(final zzbcu zzbcuVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbcuVar.zzm();
            }
        }
        if (zzbcuVar.zze() != 2) {
            return (zzbcuVar.zze() == 1 && this.zzh.has(zzbcuVar.zzn())) ? zzbcuVar.zza(this.zzh) : zzbdh.zza(new zzfuo() { // from class: com.google.android.gms.internal.ads.zzbcy
                @Override // com.google.android.gms.internal.ads.zzfuo
                public final Object zza() {
                    return zzbda.this.zzb(zzbcuVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbcuVar.zzm() : zzbcuVar.zzb(bundle);
    }

    final /* synthetic */ Object zzb(zzbcu zzbcuVar) {
        return zzbcuVar.zzc(this.zze);
    }

    public final void zzc(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context context2 = this.zzg;
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                    context2 = remoteContext;
                }
                if (context2 == null) {
                    return;
                }
                com.google.android.gms.ads.internal.client.zzba.zzb();
                SharedPreferences zza = zzbcw.zza(context2);
                this.zze = zza;
                if (zza != null) {
                    zza.registerOnSharedPreferenceChangeListener(this);
                }
                zzbfn.zzc(new zzbcz(this, this.zze));
                zzd(this.zze);
                this.zzd = true;
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }
}
