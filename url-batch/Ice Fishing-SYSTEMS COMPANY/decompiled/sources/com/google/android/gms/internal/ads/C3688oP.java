package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3688oP extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f33140n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f33141u;

    /* renamed from: v, reason: collision with root package name */
    public final TP f33142v;

    public C3688oP(int i, TP tp, boolean z8) {
        super(D.y.j(i, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i).length() + 25)));
        this.f33141u = z8;
        this.f33140n = i;
        this.f33142v = tp;
    }
}
