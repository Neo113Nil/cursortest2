package com.stripe.android.financialconnections.features.consent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ConsentClickableText {
    public static final /* synthetic */ ConsentClickableText[] $VALUES = {new ConsentClickableText("DATA", 0), new ConsentClickableText("LEGAL_DETAILS", 1), new ConsentClickableText("MANUAL_ENTRY", 2), new ConsentClickableText("LINK_LOGIN_WARMUP", 3), new ConsentClickableText("LINK_ACCOUNT_PICKER", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    ConsentClickableText EF5;

    public static ConsentClickableText valueOf(String str) {
        return (ConsentClickableText) Enum.valueOf(ConsentClickableText.class, str);
    }

    public static ConsentClickableText[] values() {
        return (ConsentClickableText[]) $VALUES.clone();
    }
}
