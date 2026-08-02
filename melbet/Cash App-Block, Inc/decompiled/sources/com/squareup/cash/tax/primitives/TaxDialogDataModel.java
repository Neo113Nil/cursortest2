package com.squareup.cash.tax.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.tax.primitives.Id;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxDialogDataModel implements Parcelable {
    public static final Parcelable.Creator<TaxDialogDataModel> CREATOR = new Id.Close.Creator(23);
    public final String message;
    public final Button primaryButton;
    public final Button secondaryButton;
    public final String title;

    public final class Action implements Parcelable {
        public static final Parcelable.Creator<Action> CREATOR = new Id.Close.Creator(21);
        public final int value;

        public Action(int i) {
            this.value = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Action) && this.value == ((Action) obj).value;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "Action(value=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.value);
        }
    }

    public final class Button implements Parcelable {
        public static final Parcelable.Creator<Button> CREATOR = new Id.Close.Creator(22);
        public final Action action;
        public final String id;
        public final Style style;
        public final String title;

        public Button(String str, String str2, Style style, Action action) {
            str.getClass();
            str2.getClass();
            style.getClass();
            action.getClass();
            this.id = str;
            this.title = str2;
            this.style = style;
            this.action = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(this.id, button.id) && Intrinsics.areEqual(this.title, button.title) && this.style == button.style && Intrinsics.areEqual(this.action, button.action);
        }

        public final int hashCode() {
            return Integer.hashCode(this.action.value) + ((this.style.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Button(id=", this.id, ", title=", this.title, ", style=");
            m.append(this.style);
            m.append(", action=");
            m.append(this.action);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.style.name());
            Action action = this.action;
            action.getClass();
            parcel.writeInt(action.value);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Style {
        public static final /* synthetic */ Style[] $VALUES;
        public static final Style Default;
        public static final Style Destructive;

        static {
            Style style = new Style("Default", 0);
            Default = style;
            Style style2 = new Style("Destructive", 1);
            Destructive = style2;
            $VALUES = new Style[]{style, style2};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public TaxDialogDataModel(String str, String str2, Button button, Button button2) {
        this.title = str;
        this.message = str2;
        this.primaryButton = button;
        this.secondaryButton = button2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxDialogDataModel)) {
            return false;
        }
        TaxDialogDataModel taxDialogDataModel = (TaxDialogDataModel) obj;
        return Intrinsics.areEqual(this.title, taxDialogDataModel.title) && Intrinsics.areEqual(this.message, taxDialogDataModel.message) && Intrinsics.areEqual(this.primaryButton, taxDialogDataModel.primaryButton) && Intrinsics.areEqual(this.secondaryButton, taxDialogDataModel.secondaryButton);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Button button = this.primaryButton;
        int hashCode3 = (hashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.secondaryButton;
        return hashCode3 + (button2 != null ? button2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TaxDialogDataModel(title=", this.title, ", message=", this.message, ", primaryButton=");
        m.append(this.primaryButton);
        m.append(", secondaryButton=");
        m.append(this.secondaryButton);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        Button button = this.primaryButton;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i);
        }
        Button button2 = this.secondaryButton;
        if (button2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button2.writeToParcel(parcel, i);
        }
    }
}
