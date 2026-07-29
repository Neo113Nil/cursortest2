package com.applovin.mediation;

/* loaded from: classes.dex */
public class MaxAdFormat {

    /* renamed from: a, reason: collision with root package name */
    private final String f3387a;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE");

    private MaxAdFormat(String str) {
        this.f3387a = str;
    }

    public String toString() {
        return this.f3387a;
    }
}
