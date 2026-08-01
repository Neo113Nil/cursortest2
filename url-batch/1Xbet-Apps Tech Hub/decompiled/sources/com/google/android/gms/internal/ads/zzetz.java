package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzetz implements zzeuy {
    final String zza;
    private final zzgbl zzb;
    private final ScheduledExecutorService zzc;
    private final zzemi zzd;
    private final Context zze;
    private final zzfeq zzf;
    private final zzeme zzg;
    private final zzdrk zzh;
    private final zzdvu zzi;

    zzetz(zzgbl zzgblVar, ScheduledExecutorService scheduledExecutorService, String str, zzemi zzemiVar, Context context, zzfeq zzfeqVar, zzeme zzemeVar, zzdrk zzdrkVar, zzdvu zzdvuVar) {
        this.zzb = zzgblVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzemiVar;
        this.zze = context;
        this.zzf = zzfeqVar;
        this.zzg = zzemeVar;
        this.zzh = zzdrkVar;
        this.zzi = zzdvuVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzetz zzetzVar) {
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzke)).booleanValue() ? zzetzVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzetzVar.zzf.zzf;
        final Bundle zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbB)).booleanValue() ? zzetzVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbK)).booleanValue()) {
            zzetzVar.zzi(arrayList, zzetzVar.zzd.zza(zzetzVar.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzfwx) zzetzVar.zzd.zzb(zzetzVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzetzVar.zzg(str, (List) entry.getValue(), zzetzVar.zzf(str), true, true));
            }
            zzetzVar.zzi(arrayList, zzetzVar.zzd.zzc());
        }
        return zzgbb.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeua(jSONArray.toString(), zzg);
            }
        }, zzetzVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgas zzg(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzgas zzu = zzgas.zzu(zzgbb.zzk(new zzgah() { // from class: com.google.android.gms.internal.ads.zzetw
            @Override // com.google.android.gms.internal.ads.zzgah
            public final ListenableFuture zza() {
                return zzetz.this.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbx)).booleanValue()) {
            zzu = (zzgas) zzgbb.zzo(zzu, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbq)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgas) zzgbb.zze(zzu, Throwable.class, new zzftn() { // from class: com.google.android.gms.internal.ads.zzetx
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                zzcbn.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbrp zzbrpVar, Bundle bundle, List list, zzeml zzemlVar) throws RemoteException {
        zzbrpVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzemlVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzemm zzemmVar = (zzemm) ((Map.Entry) it.next()).getValue();
            String str = zzemmVar.zza;
            list.add(zzg(str, Collections.singletonList(zzemmVar.zze), zzf(str), zzemmVar.zzb, zzemmVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        zzfeq zzfeqVar = this.zzf;
        if (zzfeqVar.zzq) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbD)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfeqVar.zzd)))) {
                return zzgbb.zzh(new zzeua(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgbb.zzk(new zzgah() { // from class: com.google.android.gms.internal.ads.zzett
            @Override // com.google.android.gms.internal.ads.zzgah
            public final ListenableFuture zza() {
                return zzetz.zzc(zzetz.this);
            }
        }, this.zzb);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        com.google.android.gms.internal.ads.zzcbn.zzh("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ ListenableFuture zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbrp zzbrpVar;
        final zzccf zzccfVar = new zzccf();
        if (z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbC)).booleanValue()) {
                this.zzg.zzb(str);
                zzbrpVar = this.zzg.zza(str);
                if (zzbrpVar != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbs)).booleanValue()) {
                        throw null;
                    }
                    zzeml.zzb(str, zzccfVar);
                } else {
                    final zzeml zzemlVar = new zzeml(str, zzbrpVar, zzccfVar, com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbx)).booleanValue()) {
                        this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzety
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeml.this.zzc();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbq)).longValue(), TimeUnit.MILLISECONDS);
                    }
                    if (z) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbE)).booleanValue()) {
                            final zzbrp zzbrpVar2 = zzbrpVar;
                            this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzetz.this.zze(zzbrpVar2, bundle, list, zzemlVar, zzccfVar);
                                }
                            });
                        } else {
                            zzh(zzbrpVar, bundle, list, zzemlVar);
                        }
                    } else {
                        zzemlVar.zzd();
                    }
                }
                return zzccfVar;
            }
        }
        zzbrpVar = this.zzh.zzb(str);
        if (zzbrpVar != null) {
        }
        return zzccfVar;
    }

    final /* synthetic */ void zze(zzbrp zzbrpVar, Bundle bundle, List list, zzeml zzemlVar, zzccf zzccfVar) {
        try {
            zzh(zzbrpVar, bundle, list, zzemlVar);
        } catch (RemoteException e) {
            zzccfVar.zzd(e);
        }
    }
}
