package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzza implements Comparator {
    static final /* synthetic */ zzza zza = new zzza();

    private /* synthetic */ zzza() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzzq) ((List) obj).get(0)).compareTo((zzzq) ((List) obj2).get(0));
    }
}
