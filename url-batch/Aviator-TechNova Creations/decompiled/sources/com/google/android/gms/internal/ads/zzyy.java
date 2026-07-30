package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzyy implements Comparator {
    static final /* synthetic */ zzyy zza = new zzyy();

    private /* synthetic */ zzyy() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzyx) Collections.max((List) obj)).compareTo((zzyx) Collections.max((List) obj2));
    }
}
