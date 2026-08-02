package com.squareup.cash.work.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftFilterViewModel {
    public final List sections;

    public final class Option {
        public final String id;
        public final boolean isSelected;
        public final String label;

        public Option(String str, String str2, boolean z) {
            str.getClass();
            this.id = str;
            this.label = str2;
            this.isSelected = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return Intrinsics.areEqual(this.id, option.id) && Intrinsics.areEqual(this.label, option.label) && this.isSelected == option.isSelected;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSelected) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.label);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Option(id=", this.id, ", label=", this.label, ", isSelected="), this.isSelected, ")");
        }
    }

    public final class Section {
        public final List options;
        public final String title;

        public Section(String str, List list) {
            ShiftFilterType shiftFilterType = ShiftFilterType.LOCATION;
            FilterSelectionMode filterSelectionMode = FilterSelectionMode.MULTI;
            str.getClass();
            list.getClass();
            this.title = str;
            this.options = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            ShiftFilterType shiftFilterType = ShiftFilterType.LOCATION;
            if (!Intrinsics.areEqual(this.title, section.title)) {
                return false;
            }
            FilterSelectionMode filterSelectionMode = FilterSelectionMode.MULTI;
            return Intrinsics.areEqual(this.options, section.options);
        }

        public final int hashCode() {
            return this.options.hashCode() + ((FilterSelectionMode.MULTI.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(ShiftFilterType.LOCATION.hashCode() * 31, 31, this.title)) * 31);
        }

        public final String toString() {
            return "Section(type=" + ShiftFilterType.LOCATION + ", title=" + this.title + ", selectionMode=" + FilterSelectionMode.MULTI + ", options=" + this.options + ")";
        }
    }

    public ShiftFilterViewModel(List list) {
        list.getClass();
        this.sections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShiftFilterViewModel) && Intrinsics.areEqual(this.sections, ((ShiftFilterViewModel) obj).sections);
    }

    public final int hashCode() {
        return this.sections.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("ShiftFilterViewModel(sections=", ")", this.sections);
    }
}
