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

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzdqj implements zzdop, zzdgh {
    private final zzbui zza;
    private final zzdbx zzb;
    private final zzddy zzc;
    private final zzdbd zzd;
    private final zzdjk zze;
    private final Context zzf;
    private final zzfir zzg;
    private final VersionInfoParcel zzh;
    private final zzfjk zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbue zzm;
    private final zzbuf zzn;

    public zzdqj(zzbue zzbueVar, zzbuf zzbufVar, zzbui zzbuiVar, zzdbx zzdbxVar, zzddy zzddyVar, zzdbd zzdbdVar, zzdjk zzdjkVar, Context context, zzfir zzfirVar, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar) {
        this.zzm = zzbueVar;
        this.zzn = zzbufVar;
        this.zza = zzbuiVar;
        this.zzb = zzdbxVar;
        this.zzc = zzddyVar;
        this.zzd = zzdbdVar;
        this.zze = zzdjkVar;
        this.zzf = context;
        this.zzg = zzfirVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfjkVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    private final void zzi(View view) {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null && !zzbuiVar.zzu()) {
                zzbuiVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbue zzbueVar = this.zzm;
            if (zzbueVar != null && !zzbueVar.zzq()) {
                zzbueVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbuf zzbufVar = this.zzn;
            if (zzbufVar == null || zzbufVar.zzo()) {
                return;
            }
            zzbufVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzA() {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null) {
                zzbuiVar.zzC();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzq;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzg.zzaj;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcd)).booleanValue() && jSONObject.length() != 0) {
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
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzce)).booleanValue() && next.equals("3010")) {
                                zzbui zzbuiVar = this.zza;
                                Object obj2 = null;
                                if (zzbuiVar != null) {
                                    try {
                                        zzq = zzbuiVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbue zzbueVar = this.zzm;
                                    if (zzbueVar != null) {
                                        zzq = zzbueVar.zzw();
                                    } else {
                                        zzbuf zzbufVar = this.zzn;
                                        zzq = zzbufVar != null ? zzbufVar.zzu() : null;
                                    }
                                }
                                if (zzq != null) {
                                    obj2 = ObjectWrapper.unwrap(zzq);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbp.zza(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                ClassLoader classLoader = this.zzf.getClassLoader();
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
            this.zzl = z;
            HashMap zzB = zzB(map);
            HashMap zzB2 = zzB(map2);
            zzbui zzbuiVar2 = this.zza;
            if (zzbuiVar2 != null) {
                zzbuiVar2.zzx(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                return;
            }
            zzbue zzbueVar2 = this.zzm;
            if (zzbueVar2 != null) {
                zzbueVar2.zzy(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                zzbueVar2.zzo(wrap);
                return;
            }
            zzbuf zzbufVar2 = this.zzn;
            if (zzbufVar2 != null) {
                zzbufVar2.zzw(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                zzbufVar2.zzm(wrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzb(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null) {
                zzbuiVar.zzy(wrap);
                return;
            }
            zzbue zzbueVar = this.zzm;
            if (zzbueVar != null) {
                zzbueVar.zzs(wrap);
                return;
            }
            zzbuf zzbufVar = this.zzn;
            if (zzbufVar != null) {
                zzbufVar.zzq(wrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzc(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdG() {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar == null || !zzbuiVar.zzt()) {
                return;
            }
            zzfir zzfirVar = this.zzg;
            if (zzfirVar.zze == 4 || zzfirVar.zzaD) {
                zzbuiVar.zzv();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzf(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzp(zzbmj zzbmjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzr(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzt() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbui zzbuiVar = this.zza;
                if (zzbuiVar == null) {
                    zzbue zzbueVar = this.zzm;
                    if (zzbueVar != null && !zzbueVar.zzp()) {
                        zzbueVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbuf zzbufVar = this.zzn;
                    if (zzbufVar == null || zzbufVar.zzn()) {
                        return;
                    }
                    zzbufVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfir zzfirVar = this.zzg;
                if (zzfirVar.zzaD) {
                    if (zzbuiVar.zzt()) {
                        return;
                    }
                    zzbuiVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbuiVar.zzt() && zzfirVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbuiVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
