package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface cc3<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}
