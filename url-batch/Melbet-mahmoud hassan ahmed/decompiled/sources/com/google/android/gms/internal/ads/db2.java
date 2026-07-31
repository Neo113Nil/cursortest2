package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class db2 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, cf0> f4153a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final rt1 f4154b;

    public db2(rt1 rt1Var) {
        this.f4154b = rt1Var;
    }

    public final cf0 a(String str) {
        if (this.f4153a.containsKey(str)) {
            return this.f4153a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.f4153a.put(str, this.f4154b.a(str));
        } catch (RemoteException e7) {
            io0.e("Couldn't create RTB adapter : ", e7);
        }
    }
}
