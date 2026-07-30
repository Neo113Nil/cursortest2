package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzanx implements zzamf {
    private final zzer zza = new zzer();
    private final zzano zzb = new zzano();

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i2 + i);
        zzerVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        try {
            int zzg = zzerVar.zzg();
            String zzN = zzerVar.zzN(StandardCharsets.UTF_8);
            if (zzN == null || !zzN.startsWith("WEBVTT")) {
                zzerVar.zzh(zzg);
                String zzN2 = zzerVar.zzN(StandardCharsets.UTF_8);
                String.valueOf(zzN2);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzN2)), null);
            }
            while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzerVar.zzg();
                    String zzN3 = zzerVar.zzN(StandardCharsets.UTF_8);
                    c = zzN3 == null ? (char) 0 : "STYLE".equals(zzN3) ? (char) 2 : zzN3.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzerVar.zzh(i3);
                if (c == 0) {
                    zzalz.zza(new zzaoa(arrayList2), zzameVar, zzdrVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c != 2) {
                    zzanq zza = zzanw.zza(zzerVar, arrayList);
                    if (zza != null) {
                        arrayList2.add(zza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzerVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzerVar));
                }
            }
        } catch (zzat e) {
            throw new IllegalArgumentException(e);
        }
    }
}
