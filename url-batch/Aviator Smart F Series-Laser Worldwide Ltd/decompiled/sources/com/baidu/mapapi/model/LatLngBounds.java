package com.baidu.mapapi.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.github.mikephil.charting.utils.i;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private LatLng f6572a;
    public final LatLng northeast;
    public final LatLng southwest;

    static class a implements Parcelable.Creator<LatLngBounds> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LatLngBounds createFromParcel(Parcel parcel) {
            return new LatLngBounds(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LatLngBounds[] newArray(int i8) {
            return new LatLngBounds[i8];
        }
    }

    LatLngBounds(LatLng latLng, LatLng latLng2) {
        this.northeast = latLng;
        this.southwest = latLng2;
    }

    public boolean contains(LatLng latLng) {
        if (latLng == null) {
            return false;
        }
        LatLng latLng2 = this.southwest;
        double d8 = latLng2.latitude;
        LatLng latLng3 = this.northeast;
        double d9 = latLng3.latitude;
        double d10 = latLng2.longitude;
        double d11 = latLng3.longitude;
        double d12 = latLng.latitude;
        double d13 = latLng.longitude;
        return d12 >= d8 && d12 <= d9 && d13 >= d10 && d13 <= d11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng getCenter() {
        LatLng latLng = this.f6572a;
        if (latLng != null) {
            return latLng;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(this.northeast);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(this.southwest);
        LatLng mc2ll = CoordUtil.mc2ll(new GeoPoint(((ll2mc.getLatitudeE6() - ll2mc2.getLatitudeE6()) / 2.0d) + ll2mc2.getLatitudeE6(), ((ll2mc.getLongitudeE6() - ll2mc2.getLongitudeE6()) / 2.0d) + ll2mc2.getLongitudeE6()));
        this.f6572a = mc2ll;
        return mc2ll;
    }

    public void setCenter(LatLng latLng) {
        this.f6572a = latLng;
    }

    public String toString() {
        return "southwest: " + this.southwest.latitude + ", " + this.southwest.longitude + "\nnortheast: " + this.northeast.latitude + ", " + this.northeast.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.northeast, i8);
        parcel.writeParcelable(this.southwest, i8);
    }

    protected LatLngBounds(Parcel parcel) {
        this.northeast = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.southwest = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private double f6573a;

        /* renamed from: b, reason: collision with root package name */
        private double f6574b;

        /* renamed from: c, reason: collision with root package name */
        private double f6575c;

        /* renamed from: d, reason: collision with root package name */
        private double f6576d;

        /* renamed from: e, reason: collision with root package name */
        private double f6577e;

        /* renamed from: f, reason: collision with root package name */
        private double f6578f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f6579g = true;

        private void a() {
            if (Math.abs(this.f6576d) + Math.abs(this.f6578f) > 180.0d) {
                c();
            } else {
                c();
                b();
            }
        }

        private void b() {
            double d8 = this.f6576d;
            if (d8 > 180.0d) {
                double d9 = d8 - 360.0d;
                this.f6576d = d9;
                double d10 = this.f6575c;
                if (d9 < d10) {
                    this.f6576d = d10;
                    this.f6575c = d9;
                }
            }
        }

        private void c() {
            double d8 = this.f6578f + 360.0d;
            this.f6575c = d8;
            double d9 = this.f6576d;
            if (d8 > d9) {
                this.f6576d = d8;
                this.f6575c = d9;
            }
        }

        public LatLngBounds build() {
            double d8 = this.f6577e;
            if (d8 != i.DOUBLE_EPSILON || this.f6578f != i.DOUBLE_EPSILON) {
                double d9 = this.f6576d;
                if (d9 == i.DOUBLE_EPSILON && this.f6575c == i.DOUBLE_EPSILON) {
                    this.f6576d = d8;
                    this.f6575c = this.f6578f;
                } else if (Math.abs(d9) > 90.0d && Math.abs(this.f6578f) > 90.0d) {
                    c();
                } else if (Math.abs(this.f6576d) >= 90.0d || Math.abs(this.f6578f) >= 90.0d) {
                    a();
                } else {
                    c();
                    b();
                }
            }
            return new LatLngBounds(new LatLng(this.f6574b, this.f6576d), new LatLng(this.f6573a, this.f6575c));
        }

        public Builder include(LatLng latLng) {
            if (latLng == null) {
                return this;
            }
            if (this.f6579g) {
                this.f6579g = false;
                double d8 = latLng.longitude;
                if (d8 >= i.DOUBLE_EPSILON) {
                    this.f6575c = d8;
                    this.f6576d = d8;
                } else {
                    this.f6578f = d8;
                    this.f6577e = d8;
                }
                double d9 = latLng.latitude;
                this.f6573a = d9;
                this.f6574b = d9;
            }
            a(latLng);
            return this;
        }

        public Builder include(List<LatLng> list) {
            if (list != null && list.size() != 0) {
                if (list.get(0) != null && this.f6579g) {
                    this.f6579g = false;
                    if (list.get(0).longitude >= i.DOUBLE_EPSILON) {
                        double d8 = list.get(0).longitude;
                        this.f6575c = d8;
                        this.f6576d = d8;
                    } else {
                        double d9 = list.get(0).longitude;
                        this.f6578f = d9;
                        this.f6577e = d9;
                    }
                    double d10 = list.get(0).latitude;
                    this.f6573a = d10;
                    this.f6574b = d10;
                }
                Iterator<LatLng> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }

        private void a(LatLng latLng) {
            if (latLng == null) {
                return;
            }
            double d8 = latLng.latitude;
            double d9 = latLng.longitude;
            if (d8 < this.f6573a) {
                this.f6573a = d8;
            }
            if (d8 > this.f6574b) {
                this.f6574b = d8;
            }
            if (d9 < i.DOUBLE_EPSILON) {
                if (d9 < this.f6578f) {
                    this.f6578f = d9;
                }
                if (d9 > this.f6577e) {
                    this.f6577e = d9;
                    return;
                }
                return;
            }
            if (d9 < this.f6575c) {
                this.f6575c = d9;
            }
            if (d9 > this.f6576d) {
                this.f6576d = d9;
                if (this.f6575c == i.DOUBLE_EPSILON) {
                    this.f6575c = d9;
                }
            }
            if (d9 == i.DOUBLE_EPSILON) {
                this.f6577e = d9;
            }
        }
    }
}
