package com.squareup.cash.tax.primitives;

import com.knotapi.knot.utilities.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MenuItemStyle {
    public static final /* synthetic */ MenuItemStyle[] $VALUES;
    public static final MenuItemStyle Close;
    public static final MenuItemStyle Default;
    public static final MenuItemStyle Destructive;
    public static final MenuItemStyle Primary;

    static {
        MenuItemStyle menuItemStyle = new MenuItemStyle("Default", 0);
        Default = menuItemStyle;
        MenuItemStyle menuItemStyle2 = new MenuItemStyle("Primary", 1);
        Primary = menuItemStyle2;
        MenuItemStyle menuItemStyle3 = new MenuItemStyle("Destructive", 2);
        Destructive = menuItemStyle3;
        MenuItemStyle menuItemStyle4 = new MenuItemStyle(Constants.META_CLOSE, 3);
        Close = menuItemStyle4;
        $VALUES = new MenuItemStyle[]{menuItemStyle, menuItemStyle2, menuItemStyle3, menuItemStyle4};
    }

    public static MenuItemStyle valueOf(String str) {
        return (MenuItemStyle) Enum.valueOf(MenuItemStyle.class, str);
    }

    public static MenuItemStyle[] values() {
        return (MenuItemStyle[]) $VALUES.clone();
    }
}
