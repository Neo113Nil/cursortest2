package com.applovin.mediation;

/* loaded from: classes.dex */
public class MaxReward {
    public static final int DEFAULT_AMOUNT = 0;
    public static final String DEFAULT_LABEL = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f3388a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3389b;

    private MaxReward(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f3388a = str;
        this.f3389b = i;
    }

    public static MaxReward create(int i, String str) {
        return new MaxReward(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public final int getAmount() {
        return this.f3389b;
    }

    public final String getLabel() {
        return this.f3388a;
    }

    public String toString() {
        return "MaxReward{amount='" + this.f3389b + "', label=" + this.f3388a + '}';
    }
}
