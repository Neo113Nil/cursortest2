package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzyz implements Comparator {
    static final /* synthetic */ zzyz zza = new zzyz();

    private /* synthetic */ zzyz() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzzi) ((List) obj).get(0)).compareTo((zzzi) ((List) obj2).get(0));
    }
}
