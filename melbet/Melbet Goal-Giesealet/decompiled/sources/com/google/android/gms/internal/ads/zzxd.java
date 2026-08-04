package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzxd implements Comparator {
    static final /* synthetic */ zzxd zza = new zzxd();

    private /* synthetic */ zzxd() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzxt) ((List) obj).get(0)).compareTo((zzxt) ((List) obj2).get(0));
    }
}
