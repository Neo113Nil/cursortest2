package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2331x1 {
    @NotNull
    public static EnumC1865d2 a(@Nullable String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -318297696) {
                if (hashCode != 757909789) {
                    if (hashCode == 1055572677 && str.equals(InstreamAdBreakType.MIDROLL)) {
                        return EnumC1865d2.f24401c;
                    }
                } else if (str.equals(InstreamAdBreakType.POSTROLL)) {
                    return EnumC1865d2.f24402d;
                }
            } else if (str.equals(InstreamAdBreakType.PREROLL)) {
                return EnumC1865d2.f24400b;
            }
        }
        return EnumC1865d2.f24403e;
    }
}
