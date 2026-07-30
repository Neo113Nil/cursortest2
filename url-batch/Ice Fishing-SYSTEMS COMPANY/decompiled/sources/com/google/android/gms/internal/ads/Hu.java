package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class Hu {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f25442a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25443b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f25444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iu f25445d;

    public Hu(Iu iu, Runnable runnable, long j9) {
        Objects.requireNonNull(iu);
        this.f25445d = iu;
        this.f25442a = runnable;
        this.f25443b = j9;
    }
}
