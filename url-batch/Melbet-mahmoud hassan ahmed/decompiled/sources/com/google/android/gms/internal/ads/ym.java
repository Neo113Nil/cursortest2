package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class ym implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14740a = "Loader:ExtractorMediaPeriod";

    ym(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f14740a);
    }
}
