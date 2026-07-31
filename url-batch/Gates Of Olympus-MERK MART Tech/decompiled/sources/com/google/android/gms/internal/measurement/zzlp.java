package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes3.dex */
final class zzlp<FieldDescriptorType> extends zzlm<FieldDescriptorType, Object> {
    zzlp() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd() {
        if (!zze()) {
            for (int i = 0; i < zza(); i++) {
                Map.Entry<FieldDescriptorType, Object> zza = zza(i);
                if (((zzjf) zza.getKey()).zze()) {
                    zza.setValue(Collections.unmodifiableList((List) zza.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzb()) {
                if (((zzjf) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
