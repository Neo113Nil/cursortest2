package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes2.dex */
final class zzaae<FieldDescriptorType> extends zzaad<FieldDescriptorType, Object> {
    zzaae(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final void zzqy() {
        if (!isImmutable()) {
            for (int i = 0; i < zzvb(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzaj = zzaj(i);
                if (((zzyt) zzaj.getKey()).zzuc()) {
                    zzaj.setValue(Collections.unmodifiableList((List) zzaj.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzvc()) {
                if (((zzyt) entry.getKey()).zzuc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzqy();
    }
}
