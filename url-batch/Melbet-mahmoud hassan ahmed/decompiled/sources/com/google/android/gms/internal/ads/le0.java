package com.google.android.gms.internal.ads;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class le0 {
    public static int a(p0.a aVar) {
        p0.a aVar2 = p0.a.INVALID_REQUEST;
        p0.b bVar = p0.b.UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            return ordinal != 2 ? 0 : 2;
        }
        return 3;
    }

    public static com.google.ads.mediation.a b(kv kvVar, boolean z6) {
        List<String> list = kvVar.f7647j;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(kvVar.f7644g);
        int i7 = kvVar.f7646i;
        return new com.google.ads.mediation.a(date, i7 != 1 ? i7 != 2 ? p0.b.UNKNOWN : p0.b.FEMALE : p0.b.MALE, hashSet, z6, kvVar.f7653p);
    }
}
