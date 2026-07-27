package com.google.android.gms.common.api;

import B1.n;
import android.content.Context;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import m1.InterfaceC1276c;

@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f4971a = Collections.newSetFromMap(new WeakHashMap());

    public n a(n nVar) {
        throw new UnsupportedOperationException();
    }

    public InterfaceC1276c c() {
        throw new UnsupportedOperationException();
    }

    public abstract void connect();

    public Context d() {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public Looper e() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean f();
}
