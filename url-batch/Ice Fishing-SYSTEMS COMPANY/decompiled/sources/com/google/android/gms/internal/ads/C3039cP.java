package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3039cP extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f29704n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f29705u;

    public C3039cP(int i, boolean z8) {
        super(D.y.j(i, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i).length() + 26)));
        this.f29705u = z8;
        this.f29704n = i;
    }
}
