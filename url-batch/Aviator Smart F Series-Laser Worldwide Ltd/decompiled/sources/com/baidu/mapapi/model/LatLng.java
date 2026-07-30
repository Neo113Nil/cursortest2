package com.baidu.mapapi.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public final class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private static final String f6571a = "LatLng";
    public final double latitude;
    public final double latitudeE6;
    public final double longitude;
    public final double longitudeE6;

    static class a implements Parcelable.Creator<LatLng> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LatLng[] newArray(int i8) {
            return new LatLng[i8];
        }
    }

    public LatLng(double d8, double d9) {
        if (Double.isNaN(d8) || Double.isNaN(d9) || Double.isInfinite(d8) || Double.isInfinite(d9)) {
            this.latitudeE6 = i.DOUBLE_EPSILON;
            this.longitudeE6 = i.DOUBLE_EPSILON;
            this.latitude = i.DOUBLE_EPSILON;
            this.longitude = i.DOUBLE_EPSILON;
            return;
        }
        double d10 = d8 * 1000000.0d;
        double d11 = d9 * 1000000.0d;
        this.latitudeE6 = d10;
        this.longitudeE6 = d11;
        this.latitude = d10 / 1000000.0d;
        this.longitude = d11 / 1000000.0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((new String("latitude: ") + this.latitude) + ", longitude: ") + this.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitudeE6);
        parcel.writeDouble(this.longitudeE6);
    }

    protected LatLng(Parcel parcel) {
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.latitudeE6 = parcel.readDouble();
        this.longitudeE6 = parcel.readDouble();
    }
}
