package com.squareup.cash.support.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchPlaceholder implements Parcelable {
    public static final Parcelable.Creator<SearchPlaceholder> CREATOR = new Creator();
    public final String home;
    public final String search;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SearchPlaceholder(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchPlaceholder[i];
        }
    }

    public SearchPlaceholder(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.home = str;
        this.search = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPlaceholder)) {
            return false;
        }
        SearchPlaceholder searchPlaceholder = (SearchPlaceholder) obj;
        return Intrinsics.areEqual(this.home, searchPlaceholder.home) && Intrinsics.areEqual(this.search, searchPlaceholder.search);
    }

    public final int hashCode() {
        return this.search.hashCode() + (this.home.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SearchPlaceholder(home=", this.home, ", search=", this.search, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.home);
        parcel.writeString(this.search);
    }
}
