package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ny {

    /* renamed from: a, reason: collision with root package name */
    private final String f9363a;

    /* renamed from: b, reason: collision with root package name */
    private final my f9364b;

    public ny(my myVar) {
        String str;
        this.f9364b = myVar;
        try {
            str = myVar.b();
        } catch (RemoteException e7) {
            io0.e("", e7);
            str = null;
        }
        this.f9363a = str;
    }

    public final String toString() {
        return this.f9363a;
    }
}
