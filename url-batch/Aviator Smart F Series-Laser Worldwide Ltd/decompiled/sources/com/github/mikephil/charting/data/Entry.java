package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class Entry extends f implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new a();

    /* renamed from: x, reason: collision with root package name */
    private float f14110x;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Entry[] newArray(int i8) {
            return new Entry[i8];
        }
    }

    public Entry() {
        this.f14110x = 0.0f;
    }

    public Entry copy() {
        return new Entry(this.f14110x, getY(), getData());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equalTo(Entry entry) {
        if (entry == null || entry.getData() != getData()) {
            return false;
        }
        float abs = Math.abs(entry.f14110x - this.f14110x);
        float f8 = com.github.mikephil.charting.utils.i.FLOAT_EPSILON;
        return abs <= f8 && Math.abs(entry.getY() - getY()) <= f8;
    }

    public float getX() {
        return this.f14110x;
    }

    public void setX(float f8) {
        this.f14110x = f8;
    }

    public String toString() {
        return "Entry, x: " + this.f14110x + " y: " + getY();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.f14110x);
        parcel.writeFloat(getY());
        if (getData() == null) {
            parcel.writeInt(0);
        } else {
            if (!(getData() instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) getData(), i8);
        }
    }

    public Entry(float f8, float f9) {
        super(f9);
        this.f14110x = f8;
    }

    public Entry(float f8, float f9, Object obj) {
        super(f9, obj);
        this.f14110x = f8;
    }

    public Entry(float f8, float f9, Drawable drawable) {
        super(f9, drawable);
        this.f14110x = f8;
    }

    public Entry(float f8, float f9, Drawable drawable, Object obj) {
        super(f9, drawable, obj);
        this.f14110x = f8;
    }

    protected Entry(Parcel parcel) {
        this.f14110x = 0.0f;
        this.f14110x = parcel.readFloat();
        setY(parcel.readFloat());
        if (parcel.readInt() == 1) {
            setData(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
