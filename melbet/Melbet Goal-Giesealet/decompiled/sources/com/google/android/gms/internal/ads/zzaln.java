package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaln implements zzajv {
    private final zzef zza = new zzef();
    private final zzale zzb = new zzale();

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i2 + i);
        zzefVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        try {
            int zzg = zzefVar.zzg();
            String zzN = zzefVar.zzN(StandardCharsets.UTF_8);
            if (zzN == null || !zzN.startsWith("WEBVTT")) {
                zzefVar.zzh(zzg);
                String zzN2 = zzefVar.zzN(StandardCharsets.UTF_8);
                String.valueOf(zzN2);
                throw zzas.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzN2)), null);
            }
            while (!TextUtils.isEmpty(zzefVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzefVar.zzg();
                    String zzN3 = zzefVar.zzN(StandardCharsets.UTF_8);
                    c = zzN3 == null ? (char) 0 : "STYLE".equals(zzN3) ? (char) 2 : zzN3.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzefVar.zzh(i3);
                if (c == 0) {
                    zzajp.zza(new zzalq(arrayList2), zzajuVar, zzdfVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(zzefVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c != 2) {
                    zzalg zza = zzalm.zza(zzefVar, arrayList);
                    if (zza != null) {
                        arrayList2.add(zza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzefVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzefVar));
                }
            }
        } catch (zzas e) {
            throw new IllegalArgumentException(e);
        }
    }
}
