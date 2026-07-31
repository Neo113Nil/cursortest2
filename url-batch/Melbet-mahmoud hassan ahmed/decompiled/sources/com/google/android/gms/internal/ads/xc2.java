package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class xc2 {

    /* renamed from: a, reason: collision with root package name */
    private final cd2<v61> f14145a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14146b;

    /* renamed from: c, reason: collision with root package name */
    private zy f14147c;

    public xc2(cd2<v61> cd2Var, String str) {
        this.f14145a = cd2Var;
        this.f14146b = str;
    }

    public final synchronized String a() {
        zy zyVar;
        try {
            zyVar = this.f14147c;
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            return null;
        }
        return zyVar != null ? zyVar.b() : null;
    }

    public final synchronized String b() {
        zy zyVar;
        try {
            zyVar = this.f14147c;
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            return null;
        }
        return zyVar != null ? zyVar.b() : null;
    }

    public final synchronized void d(kv kvVar, int i7) {
        this.f14147c = null;
        this.f14145a.a(kvVar, this.f14146b, new dd2(i7), new wc2(this));
    }

    public final synchronized boolean e() {
        return this.f14145a.zza();
    }
}
