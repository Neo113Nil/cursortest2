package com.stripe.android.core.browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BrowserCapabilities {
    public static final /* synthetic */ BrowserCapabilities[] $VALUES;
    public static final BrowserCapabilities CustomTabs;
    public static final BrowserCapabilities Unknown;

    static {
        BrowserCapabilities browserCapabilities = new BrowserCapabilities("CustomTabs", 0);
        CustomTabs = browserCapabilities;
        BrowserCapabilities browserCapabilities2 = new BrowserCapabilities("Unknown", 1);
        Unknown = browserCapabilities2;
        $VALUES = new BrowserCapabilities[]{browserCapabilities, browserCapabilities2};
    }

    public static BrowserCapabilities valueOf(String str) {
        return (BrowserCapabilities) Enum.valueOf(BrowserCapabilities.class, str);
    }

    public static BrowserCapabilities[] values() {
        return (BrowserCapabilities[]) $VALUES.clone();
    }
}
