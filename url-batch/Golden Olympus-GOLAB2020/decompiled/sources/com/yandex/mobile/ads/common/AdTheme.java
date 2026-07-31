package com.yandex.mobile.ads.common;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes2.dex */
public final class AdTheme {
    public static final AdTheme DARK;
    public static final AdTheme LIGHT;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AdTheme[] f22426c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f22427d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f22428b;

    static {
        AdTheme adTheme = new AdTheme(0, "LIGHT", "light");
        LIGHT = adTheme;
        AdTheme adTheme2 = new AdTheme(1, "DARK", "dark");
        DARK = adTheme2;
        AdTheme[] adThemeArr = {adTheme, adTheme2};
        f22426c = adThemeArr;
        f22427d = AbstractC1372b.a(adThemeArr);
    }

    private AdTheme(int i4, String str, String str2) {
        this.f22428b = str2;
    }

    @NotNull
    public static InterfaceC1371a getEntries() {
        return f22427d;
    }

    public static AdTheme valueOf(String str) {
        return (AdTheme) Enum.valueOf(AdTheme.class, str);
    }

    public static AdTheme[] values() {
        return (AdTheme[]) f22426c.clone();
    }

    @NotNull
    public final String getValue() {
        return this.f22428b;
    }
}
