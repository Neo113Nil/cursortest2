package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class d61 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4091f;

    public /* synthetic */ d61(AtomicReference atomicReference) {
        this.f4091f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e61.o(this.f4091f);
    }
}
