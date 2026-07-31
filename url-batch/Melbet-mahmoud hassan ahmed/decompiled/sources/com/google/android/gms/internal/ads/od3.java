package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class od3 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<nd3> f9617a = new CopyOnWriteArrayList<>();

    public static nd3 a(String str) {
        Iterator<nd3> it = f9617a.iterator();
        while (it.hasNext()) {
            nd3 next = it.next();
            if (next.zza()) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
