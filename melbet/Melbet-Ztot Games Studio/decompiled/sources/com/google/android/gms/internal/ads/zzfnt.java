package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzfnt implements zzfmu {
    private static final zzfnt zza = new zzfnt();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfnp();
    private static final Runnable zze = new zzfnq();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfnm zzk = new zzfnm();
    private final zzfmw zzj = new zzfmw();
    private final zzfnn zzl = new zzfnn(new zzfnw());

    zzfnt() {
    }

    public static zzfnt zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfnt zzfntVar) {
        zzfntVar.zzg = 0;
        zzfntVar.zzi.clear();
        zzfntVar.zzh = false;
        for (zzflu zzfluVar : zzfml.zza().zzb()) {
        }
        zzfntVar.zzm = System.nanoTime();
        zzfntVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfmv zza2 = zzfntVar.zzj.zza();
        if (zzfntVar.zzk.zze().size() > 0) {
            Iterator it = zzfntVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzfntVar.zzk.zza(str);
                zzfmv zzb2 = zzfntVar.zzj.zzb();
                String zzc2 = zzfntVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfnf.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfng.zza("Error with setting not visible reason", e);
                    }
                    zzfnf.zzc(zza3, zza5);
                }
                zzfnf.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfntVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfntVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzfntVar.zzk(null, zza2, zza6, 1, false);
            zzfnf.zzf(zza6);
            zzfntVar.zzl.zzd(zza6, zzfntVar.zzk.zzf(), nanoTime);
            boolean z = zzfntVar.zzh;
        } else {
            zzfntVar.zzl.zzb();
        }
        zzfntVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfntVar.zzm;
        if (zzfntVar.zzf.size() > 0) {
            for (zzfns zzfnsVar : zzfntVar.zzf) {
                int i = zzfntVar.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfnsVar.zzb();
                if (zzfnsVar instanceof zzfnr) {
                    int i2 = zzfntVar.zzg;
                    ((zzfnr) zzfnsVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfmv zzfmvVar, JSONObject jSONObject, int i, boolean z) {
        zzfmvVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public final void zza(View view, zzfmv zzfmvVar, JSONObject jSONObject, boolean z) {
        int zzk;
        boolean z2;
        if (zzfnk.zza(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfmvVar.zza(view);
        zzfnf.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzfnf.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e) {
                zzfng.zza("Error with setting has window focus", e);
            }
            this.zzk.zzh();
        } else {
            zzfnl zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfmo zza3 = zzb2.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzb3 = zzb2.zzb();
                int size = zzb3.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) zzb3.get(i));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zza3.zzd());
                    zza2.put("friendlyObstructionPurpose", zza3.zza());
                    zza2.put("friendlyObstructionReason", zza3.zzc());
                } catch (JSONException e2) {
                    zzfng.zza("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfmvVar, zza2, zzk, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfno(this));
    }
}
