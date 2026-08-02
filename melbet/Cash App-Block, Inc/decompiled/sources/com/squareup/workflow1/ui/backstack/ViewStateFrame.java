package com.squareup.workflow1.ui.backstack;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public final class ViewStateFrame implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR();
    public final String key;
    public final SparseArray viewState;

    public final class CREATOR implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String m = NavAction$$ExternalSyntheticOutline0.m(parcel);
            SparseArray readSparseArray = parcel.readSparseArray(ViewStateFrame.class.getClassLoader());
            readSparseArray.getClass();
            return new ViewStateFrame(m, readSparseArray);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ViewStateFrame[i];
        }
    }

    public ViewStateFrame(String str, SparseArray sparseArray) {
        this.key = str;
        this.viewState = sparseArray;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewStateFrame)) {
            return false;
        }
        ViewStateFrame viewStateFrame = (ViewStateFrame) obj;
        return this.key.equals(viewStateFrame.key) && this.viewState.equals(viewStateFrame.viewState);
    }

    public final int hashCode() {
        return this.viewState.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        return "ViewStateFrame(key=" + this.key + ", viewState=" + this.viewState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.key);
        parcel.writeSparseArray(this.viewState);
    }
}
