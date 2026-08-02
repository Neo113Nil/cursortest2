package com.stripe.android.financialconnections.ui.theme;

import com.stripe.android.model.LinkBrand;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class Theme {
    public static final /* synthetic */ Theme[] $VALUES;
    public static final POPMatchingFactory Companion;
    public static final Theme DefaultLight;
    public static final Theme LinkLight;

    /* renamed from: default, reason: not valid java name */
    public static final Theme f825default;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                POPMatchingFactory pOPMatchingFactory = Theme.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LinkBrand.values().length];
            try {
                iArr2[LinkBrand.Onelink.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LinkBrand.Link.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Theme theme = new Theme("DefaultLight", 0);
        DefaultLight = theme;
        Theme theme2 = new Theme("LinkLight", 1);
        LinkLight = theme2;
        $VALUES = new Theme[]{theme, theme2};
        Companion = new POPMatchingFactory(11);
        f825default = theme;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }
}
