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

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfur implements zzfts {
    private static final zzfur zza = new zzfur();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfun();
    private static final Runnable zzl = new zzfuo();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfuk zzh = new zzfuk();
    private final zzftu zzg = new zzftu();
    private final zzful zzi = new zzful(new zzfuu());

    zzfur() {
    }

    public static zzfur zzb() {
        return zza;
    }

    private final void zzk(View view, zzftt zzfttVar, JSONObject jSONObject, int i, boolean z) {
        zzfttVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final void zza(View view, zzftt zzfttVar, JSONObject jSONObject, boolean z) {
        zzfuk zzfukVar;
        int zzl2;
        boolean z2;
        zzfur zzfurVar;
        View view2;
        zzftt zzfttVar2;
        boolean z3;
        if (zzfui.zza(view) != null || (zzl2 = (zzfukVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfttVar.zza(view);
        zzfud.zze(jSONObject, zza2);
        String zzg = zzfukVar.zzg(view);
        if (zzg != null) {
            zzfud.zzd(zza2, zzg);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e) {
                zzfue.zza("Error with setting has window focus", e);
            }
            Boolean valueOf = Boolean.valueOf(this.zzh.zzk(zzg));
            if (valueOf.booleanValue()) {
                try {
                    zza2.put("isPipActive", valueOf);
                } catch (JSONException e2) {
                    zzfue.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzh.zzf();
            zzfurVar = this;
        } else {
            zzfuj zzi = zzfukVar.zzi(view);
            if (zzi != null) {
                zzftk zzb2 = zzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzc2 = zzi.zzc();
                int size = zzc2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) zzc2.get(i));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zzb2.zzb());
                    zza2.put("friendlyObstructionPurpose", zzb2.zzc());
                    zza2.put("friendlyObstructionReason", zzb2.zzd());
                } catch (JSONException e3) {
                    zzfue.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                zzfurVar = this;
                view2 = view;
                zzfttVar2 = zzfttVar;
                z3 = true;
            } else {
                view2 = view;
                zzfttVar2 = zzfttVar;
                z3 = false;
                zzfurVar = this;
            }
            zzfurVar.zzk(view2, zzfttVar2, zza2, zzl2, z3);
        }
        zzfurVar.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfum(this));
    }

    public final void zze() {
        zzl();
    }

    final /* synthetic */ void zzf() {
        zzfur zzfurVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfsn zzfsnVar : zzfth.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfuk zzfukVar = this.zzh;
        zzfukVar.zzd();
        zzftu zzftuVar = this.zzg;
        long nanoTime = System.nanoTime();
        zzftt zza2 = zzftuVar.zza();
        if (zzfukVar.zzb().size() > 0) {
            Iterator it = zzfukVar.zzb().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zzh = zzfukVar.zzh(str);
                zzftt zzb2 = zzftuVar.zzb();
                String zzc2 = zzfukVar.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza4 = zzb2.zza(zzh);
                    zzfud.zzd(zza4, str);
                    try {
                        zza4.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfue.zza("Error with setting not visible reason", e);
                    }
                    zzfud.zze(zza3, zza4);
                }
                zzfud.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(zza3, hashSet, nanoTime);
            }
        }
        zzfuk zzfukVar2 = this.zzh;
        if (zzfukVar2.zza().size() > 0) {
            JSONObject zza5 = zza2.zza(null);
            zzfurVar = this;
            zzfurVar.zzk(null, zza2, zza5, 1, false);
            zzfud.zzf(zza5);
            zzfurVar.zzi.zza(zza5, zzfukVar2.zza(), nanoTime);
        } else {
            zzfurVar = this;
            zzfurVar.zzi.zzc();
        }
        zzfukVar2.zze();
        long nanoTime2 = System.nanoTime() - zzfurVar.zzj;
        List<zzfuq> list = zzfurVar.zzd;
        if (list.size() > 0) {
            for (zzfuq zzfuqVar : list) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfuqVar.zzb();
                if (zzfuqVar instanceof zzfup) {
                    ((zzfup) zzfuqVar).zza();
                }
            }
        }
        zzftr.zza().zzc();
    }

    final /* synthetic */ zzful zzh() {
        return this.zzi;
    }
}
