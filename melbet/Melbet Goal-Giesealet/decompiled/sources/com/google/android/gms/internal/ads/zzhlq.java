package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhlq implements Map.Entry, KMappedMarker {
    private final /* synthetic */ Map.Entry zza;

    public zzhlq(Map.Entry delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
