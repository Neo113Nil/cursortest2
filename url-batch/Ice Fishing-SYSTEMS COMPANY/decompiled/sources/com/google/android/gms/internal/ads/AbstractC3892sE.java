package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.sE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3892sE {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f34215a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = f34215a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        throw D.y.h(it);
    }
}
