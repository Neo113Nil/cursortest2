package com.google.android.gms.common.api;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {

    /* renamed from: f, reason: collision with root package name */
    public static final Set f3856f = Collections.newSetFromMap(new WeakHashMap());

    public abstract boolean c();

    public abstract void connect();

    public abstract void disconnect();
}
