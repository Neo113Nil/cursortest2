package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfmi implements zzfmg {
    private final zzfmg zza;

    public zzfmi(zzfmg zzfmgVar) {
        this.zza = zzfmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmg
    public final JSONObject zza(View view) {
        JSONObject zza = zzfmq.zza(0, 0, 0, 0);
        int zzb = zzfmt.zzb();
        int i = zzb - 1;
        if (zzb == 0) {
            throw null;
        }
        try {
            zza.put("noOutputDevice", i == 0);
        } catch (JSONException e) {
            zzfmr.zza("Error with setting output device status", e);
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmg
    public final void zzb(View view, JSONObject jSONObject, zzfmf zzfmfVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzflx zza = zzflx.zza();
        if (zza != null) {
            Collection zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzb.iterator();
            while (it.hasNext()) {
                View zzf = ((zzflj) it.next()).zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza2 = zzfmw.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (zzfmw.zza((View) arrayList.get(i)) <= zza2) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfmfVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
