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

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfnf implements zzfmf {
    private static final zzfnf zza = new zzfnf();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfnb();
    private static final Runnable zze = new zzfnc();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfmy zzk = new zzfmy();
    private final zzfmh zzj = new zzfmh();
    private final zzfmz zzl = new zzfmz(new zzfni());

    zzfnf() {
    }

    public static zzfnf zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfnf zzfnfVar) {
        zzfnfVar.zzg = 0;
        zzfnfVar.zzi.clear();
        zzfnfVar.zzh = false;
        for (zzflj zzfljVar : zzflx.zza().zzb()) {
        }
        zzfnfVar.zzm = System.nanoTime();
        zzfnfVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfmg zza2 = zzfnfVar.zzj.zza();
        if (zzfnfVar.zzk.zze().size() > 0) {
            Iterator it = zzfnfVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzfnfVar.zzk.zza(str);
                zzfmg zzb2 = zzfnfVar.zzj.zzb();
                String zzc2 = zzfnfVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfmq.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfmr.zza("Error with setting not visible reason", e);
                    }
                    zzfmq.zzc(zza3, zza5);
                }
                zzfmq.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfnfVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfnfVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzfnfVar.zzk(null, zza2, zza6, 1, false);
            zzfmq.zzf(zza6);
            zzfnfVar.zzl.zzd(zza6, zzfnfVar.zzk.zzf(), nanoTime);
            boolean z = zzfnfVar.zzh;
        } else {
            zzfnfVar.zzl.zzb();
        }
        zzfnfVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfnfVar.zzm;
        if (zzfnfVar.zzf.size() > 0) {
            for (zzfne zzfneVar : zzfnfVar.zzf) {
                int i = zzfnfVar.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfneVar.zzb();
                if (zzfneVar instanceof zzfnd) {
                    int i2 = zzfnfVar.zzg;
                    ((zzfnd) zzfneVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfmg zzfmgVar, JSONObject jSONObject, int i, boolean z) {
        zzfmgVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final void zza(View view, zzfmg zzfmgVar, JSONObject jSONObject, boolean z) {
        int zzk;
        boolean z2;
        if (zzfmw.zzb(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfmgVar.zza(view);
        zzfmq.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzfmq.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e) {
                zzfmr.zza("Error with setting has window focus", e);
            }
            this.zzk.zzh();
        } else {
            zzfmx zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfma zza3 = zzb2.zza();
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
                    zzfmr.zza("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfmgVar, zza2, zzk, z || z2);
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
        zzb.post(new zzfna(this));
    }
}
