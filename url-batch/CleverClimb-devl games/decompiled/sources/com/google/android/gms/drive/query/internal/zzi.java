package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

/* loaded from: classes.dex */
final class zzi {
    static MetadataField<?> zza(MetadataBundle metadataBundle) {
        Set<MetadataField<?>> zzay = metadataBundle.zzay();
        if (zzay.size() == 1) {
            return zzay.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
