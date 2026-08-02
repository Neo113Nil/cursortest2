package com.squareup.scannerview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.SetupIntentResult;

/* loaded from: classes8.dex */
public final class AspectRatio implements Comparable, Parcelable {
    public final int x;
    public final int y;
    public static final SparseArrayCompat sCache = new SparseArrayCompat(16);
    public static final Parcelable.Creator<AspectRatio> CREATOR = new SetupIntentResult.Creator(6);

    public AspectRatio(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AspectRatio aspectRatio = (AspectRatio) obj;
        aspectRatio.getClass();
        if (equals(aspectRatio)) {
            return 0;
        }
        return (((float) this.x) / ((float) this.y)) - (((float) aspectRatio.x) / ((float) aspectRatio.y)) > RecyclerView.DECELERATION_RATE ? 1 : -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatio) {
            AspectRatio aspectRatio = (AspectRatio) obj;
            if (this.x == aspectRatio.x && this.y == aspectRatio.y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.x;
        int i2 = i << 16;
        return this.y ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.x + ":" + this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
    }
}
