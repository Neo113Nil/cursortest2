package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ua f2851a = new ua();

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        Object obj = sa.j;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
