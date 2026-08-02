package com.squareup.cash.tax.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class TaxMenuSheetViewModel {

    public final class LoadMenuItems extends TaxMenuSheetViewModel {
        public final List menuItems;

        public LoadMenuItems(List list) {
            list.getClass();
            this.menuItems = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadMenuItems) && Intrinsics.areEqual(this.menuItems, ((LoadMenuItems) obj).menuItems);
        }

        public final int hashCode() {
            return this.menuItems.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("LoadMenuItems(menuItems=", ")", this.menuItems);
        }
    }
}
