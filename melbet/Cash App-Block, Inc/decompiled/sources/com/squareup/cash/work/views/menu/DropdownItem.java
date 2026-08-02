package com.squareup.cash.work.views.menu;

import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class DropdownItem {
    public final Icons icon;
    public final Function0 onClick;
    public final int textRes;

    public DropdownItem(int i, Icons icons, Function0 function0) {
        function0.getClass();
        this.textRes = i;
        this.icon = icons;
        this.onClick = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownItem)) {
            return false;
        }
        DropdownItem dropdownItem = (DropdownItem) obj;
        return this.textRes == dropdownItem.textRes && this.icon == dropdownItem.icon && Intrinsics.areEqual(this.onClick, dropdownItem.onClick);
    }

    public final int hashCode() {
        return this.onClick.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + (Integer.hashCode(this.textRes) * 31)) * 31, 31, true);
    }

    public final String toString() {
        return "DropdownItem(textRes=" + this.textRes + ", icon=" + this.icon + ", enabled=true, onClick=" + this.onClick + ")";
    }
}
