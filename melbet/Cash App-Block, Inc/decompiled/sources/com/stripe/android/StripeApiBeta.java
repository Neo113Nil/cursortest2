package com.stripe.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class StripeApiBeta {
    public static final /* synthetic */ StripeApiBeta[] $VALUES = {new StripeApiBeta("WeChatPayV1", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    StripeApiBeta EF5;

    public static StripeApiBeta valueOf(String str) {
        return (StripeApiBeta) Enum.valueOf(StripeApiBeta.class, str);
    }

    public static StripeApiBeta[] values() {
        return (StripeApiBeta[]) $VALUES.clone();
    }
}
