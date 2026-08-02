package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzdlc implements zzdjj {
    private final zzbpb zza;
    private final zzcxi zzb;
    private final zzcwo zzc;
    private final zzdeo zzd;
    private final Context zze;
    private final zzfel zzf;
    private final VersionInfoParcel zzg;
    private final zzffg zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbox zzl;
    private final zzboy zzm;

    public zzdlc(zzbox zzboxVar, zzboy zzboyVar, zzbpb zzbpbVar, zzcxi zzcxiVar, zzcwo zzcwoVar, zzdeo zzdeoVar, Context context, zzfel zzfelVar, VersionInfoParcel versionInfoParcel, zzffg zzffgVar) {
        this.zzl = zzboxVar;
        this.zzm = zzboyVar;
        this.zza = zzbpbVar;
        this.zzb = zzcxiVar;
        this.zzc = zzcwoVar;
        this.zzd = zzdeoVar;
        this.zze = context;
        this.zzf = zzfelVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzffgVar;
    }

    private final void zzb(View view) {
        try {
            zzbpb zzbpbVar = this.zza;
            if (zzbpbVar != null && !zzbpbVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjR)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbox zzboxVar = this.zzl;
            if (zzboxVar != null && !zzboxVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjR)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzboy zzboyVar = this.zzm;
            if (zzboyVar == null || zzboyVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjR)).booleanValue()) {
                this.zzd.zzdG();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final boolean zzB() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzL) {
            zzb(view2);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzu.zzs().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbpb zzbpbVar = this.zza;
                if (zzbpbVar != null && !zzbpbVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbox zzboxVar = this.zzl;
                if (zzboxVar != null && !zzboxVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzboy zzboyVar = this.zzm;
                if (zzboyVar == null || zzboyVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzx(zzbgx zzbgxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbn)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbo)).booleanValue() && next.equals("3010")) {
                                zzbpb zzbpbVar = this.zza;
                                Object obj2 = null;
                                if (zzbpbVar != null) {
                                    try {
                                        zzn = zzbpbVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbox zzboxVar = this.zzl;
                                    if (zzboxVar != null) {
                                        zzn = zzboxVar.zzk();
                                    } else {
                                        zzboy zzboyVar = this.zzm;
                                        zzn = zzboyVar != null ? zzboyVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbs.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzu.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbpb zzbpbVar2 = this.zza;
            if (zzbpbVar2 != null) {
                zzbpbVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbox zzboxVar2 = this.zzl;
            if (zzboxVar2 != null) {
                zzboxVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzboy zzboyVar2 = this.zzm;
            if (zzboyVar2 != null) {
                zzboyVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbpb zzbpbVar = this.zza;
            if (zzbpbVar != null) {
                zzbpbVar.zzz(wrap);
                return;
            }
            zzbox zzboxVar = this.zzl;
            if (zzboxVar != null) {
                zzboxVar.zzw(wrap);
                return;
            }
            zzboy zzboyVar = this.zzm;
            if (zzboyVar != null) {
                zzboyVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call untrackView", e);
        }
    }
}
