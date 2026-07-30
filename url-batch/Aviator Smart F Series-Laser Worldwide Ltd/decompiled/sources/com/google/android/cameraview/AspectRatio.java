package com.google.android.cameraview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;

/* loaded from: classes3.dex */
public class AspectRatio implements Comparable<AspectRatio>, Parcelable {
    private final int mX;
    private final int mY;
    private static final SparseArrayCompat<SparseArrayCompat<AspectRatio>> sCache = new SparseArrayCompat<>(16);
    public static final Parcelable.Creator<AspectRatio> CREATOR = new Parcelable.Creator<AspectRatio>() { // from class: com.google.android.cameraview.AspectRatio.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AspectRatio createFromParcel(Parcel parcel) {
            return AspectRatio.of(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AspectRatio[] newArray(int i8) {
            return new AspectRatio[i8];
        }
    };

    private AspectRatio(int i8, int i9) {
        this.mX = i8;
        this.mY = i9;
    }

    private static int gcd(int i8, int i9) {
        while (true) {
            int i10 = i9;
            int i11 = i8;
            i8 = i10;
            if (i8 == 0) {
                return i11;
            }
            i9 = i11 % i8;
        }
    }

    public static AspectRatio of(int i8, int i9) {
        int gcd = gcd(i8, i9);
        int i10 = i8 / gcd;
        int i11 = i9 / gcd;
        SparseArrayCompat<SparseArrayCompat<AspectRatio>> sparseArrayCompat = sCache;
        SparseArrayCompat<AspectRatio> sparseArrayCompat2 = sparseArrayCompat.get(i10);
        if (sparseArrayCompat2 == null) {
            AspectRatio aspectRatio = new AspectRatio(i10, i11);
            SparseArrayCompat<AspectRatio> sparseArrayCompat3 = new SparseArrayCompat<>();
            sparseArrayCompat3.put(i11, aspectRatio);
            sparseArrayCompat.put(i10, sparseArrayCompat3);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = sparseArrayCompat2.get(i11);
        if (aspectRatio2 != null) {
            return aspectRatio2;
        }
        AspectRatio aspectRatio3 = new AspectRatio(i10, i11);
        sparseArrayCompat2.put(i11, aspectRatio3);
        return aspectRatio3;
    }

    public static AspectRatio parse(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Malformed aspect ratio: " + str);
        }
        try {
            return of(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (NumberFormatException e8) {
            throw new IllegalArgumentException("Malformed aspect ratio: " + str, e8);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatio)) {
            return false;
        }
        AspectRatio aspectRatio = (AspectRatio) obj;
        return this.mX == aspectRatio.mX && this.mY == aspectRatio.mY;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
        return this.mY;
    }

    public int hashCode() {
        int i8 = this.mY;
        int i9 = this.mX;
        return i8 ^ ((i9 >>> 16) | (i9 << 16));
    }

    public AspectRatio inverse() {
        return of(this.mY, this.mX);
    }

    public boolean matches(Size size) {
        int gcd = gcd(size.getWidth(), size.getHeight());
        return this.mX == size.getWidth() / gcd && this.mY == size.getHeight() / gcd;
    }

    public float toFloat() {
        return this.mX / this.mY;
    }

    public String toString() {
        return this.mX + ":" + this.mY;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.mX);
        parcel.writeInt(this.mY);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull AspectRatio aspectRatio) {
        if (equals(aspectRatio)) {
            return 0;
        }
        return toFloat() - aspectRatio.toFloat() > 0.0f ? 1 : -1;
    }
}
