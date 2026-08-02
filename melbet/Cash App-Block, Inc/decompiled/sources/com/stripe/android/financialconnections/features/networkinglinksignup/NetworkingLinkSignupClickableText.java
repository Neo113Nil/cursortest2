package com.stripe.android.financialconnections.features.networkinglinksignup;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class NetworkingLinkSignupClickableText {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ NetworkingLinkSignupClickableText[] $VALUES;

    static {
        NetworkingLinkSignupClickableText[] networkingLinkSignupClickableTextArr = {new NetworkingLinkSignupClickableText("LEGAL_DETAILS", 0)};
        $VALUES = networkingLinkSignupClickableTextArr;
        $ENTRIES = new EnumEntriesList(networkingLinkSignupClickableTextArr);
    }

    public static NetworkingLinkSignupClickableText valueOf(String str) {
        return (NetworkingLinkSignupClickableText) Enum.valueOf(NetworkingLinkSignupClickableText.class, str);
    }

    public static NetworkingLinkSignupClickableText[] values() {
        return (NetworkingLinkSignupClickableText[]) $VALUES.clone();
    }
}
