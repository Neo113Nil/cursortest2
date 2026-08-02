package com.squareup.cash.tax.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.tax.primitives.Id;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxMenuItem implements Parcelable {
    public static final Parcelable.Creator<TaxMenuItem> CREATOR = new Id.Close.Creator(29);
    public final Id id;
    public final MenuItemStyle style;
    public final String title;

    public TaxMenuItem(Id id, String str, MenuItemStyle menuItemStyle) {
        id.getClass();
        str.getClass();
        menuItemStyle.getClass();
        this.id = id;
        this.title = str;
        this.style = menuItemStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxMenuItem)) {
            return false;
        }
        TaxMenuItem taxMenuItem = (TaxMenuItem) obj;
        return Intrinsics.areEqual(this.id, taxMenuItem.id) && Intrinsics.areEqual(this.title, taxMenuItem.title) && this.style == taxMenuItem.style;
    }

    public final int hashCode() {
        return this.style.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        return "TaxMenuItem(id=" + this.id + ", title=" + this.title + ", style=" + this.style + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.title);
        parcel.writeString(this.style.name());
    }
}
