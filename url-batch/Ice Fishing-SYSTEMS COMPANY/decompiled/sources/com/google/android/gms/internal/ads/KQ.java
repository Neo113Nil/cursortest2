package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class KQ {

    /* renamed from: n, reason: collision with root package name */
    public static final KQ f25974n;

    /* renamed from: u, reason: collision with root package name */
    public static final KQ f25975u;

    /* renamed from: v, reason: collision with root package name */
    public static final KQ f25976v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ KQ[] f25977w;

    static {
        KQ kq = new KQ("PASS_THROUGH", 0);
        f25974n = kq;
        KQ kq2 = new KQ("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f25975u = kq2;
        KQ kq3 = new KQ("DISCARDING", 2);
        f25976v = kq3;
        f25977w = new KQ[]{kq, kq2, kq3};
    }

    public static KQ[] values() {
        return (KQ[]) f25977w.clone();
    }
}
