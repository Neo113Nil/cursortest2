package com.squareup.cash.tax.primitives;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxToolbarConfig {
    public final boolean hidden;
    public final String title;
    public final ArrayList toolbarItems;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ToolbarItem {
        public static final /* synthetic */ ToolbarItem[] $VALUES;
        public static final ToolbarItem BACK;
        public static final ToolbarItem CLOSE;
        public static final ToolbarItem DESKTOP;
        public static final ToolbarItem HELP;
        public static final ToolbarItem MENU;

        static {
            ToolbarItem toolbarItem = new ToolbarItem("BACK", 0);
            BACK = toolbarItem;
            ToolbarItem toolbarItem2 = new ToolbarItem("HELP", 1);
            HELP = toolbarItem2;
            ToolbarItem toolbarItem3 = new ToolbarItem("MENU", 2);
            MENU = toolbarItem3;
            ToolbarItem toolbarItem4 = new ToolbarItem("CLOSE", 3);
            CLOSE = toolbarItem4;
            ToolbarItem toolbarItem5 = new ToolbarItem("DESKTOP", 4);
            DESKTOP = toolbarItem5;
            $VALUES = new ToolbarItem[]{toolbarItem, toolbarItem2, toolbarItem3, toolbarItem4, toolbarItem5};
        }

        public static ToolbarItem valueOf(String str) {
            return (ToolbarItem) Enum.valueOf(ToolbarItem.class, str);
        }

        public static ToolbarItem[] values() {
            return (ToolbarItem[]) $VALUES.clone();
        }
    }

    public TaxToolbarConfig(String str, ArrayList arrayList, boolean z) {
        this.toolbarItems = arrayList;
        this.title = str;
        this.hidden = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxToolbarConfig)) {
            return false;
        }
        TaxToolbarConfig taxToolbarConfig = (TaxToolbarConfig) obj;
        return this.toolbarItems.equals(taxToolbarConfig.toolbarItems) && Intrinsics.areEqual(this.title, taxToolbarConfig.title) && this.hidden == taxToolbarConfig.hidden;
    }

    public final int hashCode() {
        int hashCode = this.toolbarItems.hashCode() * 31;
        String str = this.title;
        return Boolean.hashCode(this.hidden) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxToolbarConfig(toolbarItems=");
        sb.append(this.toolbarItems);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", hidden=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hidden, ")");
    }
}
