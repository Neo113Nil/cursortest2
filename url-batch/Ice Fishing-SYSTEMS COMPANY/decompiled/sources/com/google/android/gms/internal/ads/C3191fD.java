package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3191fD {

    /* renamed from: d, reason: collision with root package name */
    public static final C3191fD f30633d = new C3191fD();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f30634a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f30635b;

    /* renamed from: c, reason: collision with root package name */
    public C3191fD f30636c;

    public C3191fD() {
        this.f30634a = null;
        this.f30635b = null;
    }

    public C3191fD(Runnable runnable, Executor executor) {
        this.f30634a = runnable;
        this.f30635b = executor;
    }
}
