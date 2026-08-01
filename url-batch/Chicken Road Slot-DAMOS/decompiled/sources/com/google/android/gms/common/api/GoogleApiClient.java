package com.google.android.gms.common.api;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f2116a = Collections.newSetFromMap(new WeakHashMap());

    public abstract void connect();

    public abstract boolean d();

    public abstract void disconnect();
}
