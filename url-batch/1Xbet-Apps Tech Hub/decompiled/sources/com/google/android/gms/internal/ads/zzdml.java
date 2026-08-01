package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
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

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzdml implements zzdks {
    private final zzbqg zza;
    private final zzcyz zzb;
    private final zzcyf zzc;
    private final zzdgc zzd;
    private final Context zze;
    private final zzfdu zzf;
    private final zzcbt zzg;
    private final zzfeq zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbqc zzl;
    private final zzbqd zzm;

    public zzdml(zzbqc zzbqcVar, zzbqd zzbqdVar, zzbqg zzbqgVar, zzcyz zzcyzVar, zzcyf zzcyfVar, zzdgc zzdgcVar, Context context, zzfdu zzfduVar, zzcbt zzcbtVar, zzfeq zzfeqVar) {
        this.zzl = zzbqcVar;
        this.zzm = zzbqdVar;
        this.zza = zzbqgVar;
        this.zzb = zzcyzVar;
        this.zzc = zzcyfVar;
        this.zzd = zzdgcVar;
        this.zze = context;
        this.zzf = zzfduVar;
        this.zzg = zzcbtVar;
        this.zzh = zzfeqVar;
    }

    private final void zzb(View view) {
        try {
            zzbqg zzbqgVar = this.zza;
            if (zzbqgVar != null && !zzbqgVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkb)).booleanValue()) {
                    this.zzd.zzbL();
                    return;
                }
                return;
            }
            zzbqc zzbqcVar = this.zzl;
            if (zzbqcVar != null && !zzbqcVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkb)).booleanValue()) {
                    this.zzd.zzbL();
                    return;
                }
                return;
            }
            zzbqd zzbqdVar = this.zzm;
            if (zzbqdVar == null || zzbqdVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkb)).booleanValue()) {
                this.zzd.zzbL();
            }
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to call handleClick", e);
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

    @Override // com.google.android.gms.internal.ads.zzdks
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        zzcbn.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            zzcbn.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzM) {
            zzb(view2);
        } else {
            zzcbn.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbqg zzbqgVar = this.zza;
                if (zzbqgVar != null && !zzbqgVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbqc zzbqcVar = this.zzl;
                if (zzbqcVar != null && !zzbqcVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbqd zzbqdVar = this.zzm;
                if (zzbqdVar == null || zzbqdVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzcbn.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzx(zzbic zzbicVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbv)).booleanValue() && jSONObject.length() != 0) {
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
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbw)).booleanValue() && next.equals("3010")) {
                                zzbqg zzbqgVar = this.zza;
                                Object obj2 = null;
                                if (zzbqgVar != null) {
                                    try {
                                        zzn = zzbqgVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbqc zzbqcVar = this.zzl;
                                    if (zzbqcVar != null) {
                                        zzn = zzbqcVar.zzk();
                                    } else {
                                        zzbqd zzbqdVar = this.zzm;
                                        zzn = zzbqdVar != null ? zzbqdVar.zzj() : null;
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
                                com.google.android.gms.ads.internal.util.zzbw.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzp();
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
            zzbqg zzbqgVar2 = this.zza;
            if (zzbqgVar2 != null) {
                zzbqgVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbqc zzbqcVar2 = this.zzl;
            if (zzbqcVar2 != null) {
                zzbqcVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbqd zzbqdVar2 = this.zzm;
            if (zzbqdVar2 != null) {
                zzbqdVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbqg zzbqgVar = this.zza;
            if (zzbqgVar != null) {
                zzbqgVar.zzz(wrap);
                return;
            }
            zzbqc zzbqcVar = this.zzl;
            if (zzbqcVar != null) {
                zzbqcVar.zzw(wrap);
                return;
            }
            zzbqd zzbqdVar = this.zzm;
            if (zzbqdVar != null) {
                zzbqdVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            zzcbn.zzk("Failed to call untrackView", e);
        }
    }
}
