package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class dj0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Context, cj0> f4232a = new WeakHashMap<>();

    public final Future<aj0> b(Context context) {
        return wo0.f13894a.E(new bj0(this, context));
    }
}
