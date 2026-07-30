package com.baidu.mapapi.map;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public final class MapStatus implements Parcelable {
    public static final Parcelable.Creator<MapStatus> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private double f5946a;

    /* renamed from: b, reason: collision with root package name */
    private double f5947b;
    public final LatLngBounds bound;

    /* renamed from: c, reason: collision with root package name */
    s f5948c;
    public final float overlook;
    public final float rotate;
    public final LatLng target;
    public final Point targetScreen;
    public WinRound winRound;
    public final float zoom;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private float f5949a;

        /* renamed from: b, reason: collision with root package name */
        private LatLng f5950b;

        /* renamed from: c, reason: collision with root package name */
        private float f5951c;

        /* renamed from: d, reason: collision with root package name */
        private float f5952d;

        /* renamed from: e, reason: collision with root package name */
        private Point f5953e;

        /* renamed from: f, reason: collision with root package name */
        private LatLngBounds f5954f;

        /* renamed from: g, reason: collision with root package name */
        private double f5955g;

        /* renamed from: h, reason: collision with root package name */
        private double f5956h;

        public Builder() {
            this.f5949a = -2.1474836E9f;
            this.f5950b = null;
            this.f5951c = -2.1474836E9f;
            this.f5952d = -2.1474836E9f;
            this.f5953e = null;
            this.f5954f = null;
            this.f5955g = i.DOUBLE_EPSILON;
            this.f5956h = i.DOUBLE_EPSILON;
        }

        public MapStatus build() {
            return new MapStatus(this.f5949a, this.f5950b, this.f5951c, this.f5952d, this.f5953e, this.f5954f);
        }

        public Builder overlook(float f8) {
            this.f5951c = f8;
            return this;
        }

        public Builder rotate(float f8) {
            this.f5949a = f8;
            return this;
        }

        public Builder target(LatLng latLng) {
            this.f5950b = latLng;
            return this;
        }

        public Builder targetScreen(Point point) {
            this.f5953e = point;
            return this;
        }

        public Builder zoom(float f8) {
            this.f5952d = f8;
            return this;
        }

        public Builder(MapStatus mapStatus) {
            this.f5949a = -2.1474836E9f;
            this.f5950b = null;
            this.f5951c = -2.1474836E9f;
            this.f5952d = -2.1474836E9f;
            this.f5953e = null;
            this.f5954f = null;
            this.f5955g = i.DOUBLE_EPSILON;
            this.f5956h = i.DOUBLE_EPSILON;
            this.f5949a = mapStatus.rotate;
            this.f5950b = mapStatus.target;
            this.f5951c = mapStatus.overlook;
            this.f5952d = mapStatus.zoom;
            this.f5953e = mapStatus.targetScreen;
            this.f5955g = mapStatus.b();
            this.f5956h = mapStatus.c();
        }
    }

    static class a implements Parcelable.Creator<MapStatus> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MapStatus createFromParcel(Parcel parcel) {
            return new MapStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MapStatus[] newArray(int i8) {
            return new MapStatus[i8];
        }
    }

    MapStatus(float f8, LatLng latLng, float f9, float f10, Point point, LatLngBounds latLngBounds) {
        this.rotate = f8;
        this.target = latLng;
        this.overlook = f9;
        this.zoom = f10;
        this.targetScreen = point;
        if (latLng != null) {
            this.f5946a = CoordUtil.ll2mc(latLng).getLongitudeE6();
            this.f5947b = CoordUtil.ll2mc(latLng).getLatitudeE6();
        }
        this.bound = latLngBounds;
    }

    static MapStatus a(s sVar) {
        if (sVar == null) {
            return null;
        }
        float f8 = sVar.f8149b;
        double d8 = sVar.f8152e;
        double d9 = sVar.f8151d;
        LatLng mc2ll = CoordUtil.mc2ll(new GeoPoint(d8, d9));
        float f9 = sVar.f8150c;
        float f10 = sVar.f8148a;
        Point point = new Point(sVar.f8153f, sVar.f8154g);
        LatLng mc2ll2 = CoordUtil.mc2ll(new GeoPoint(sVar.f8158k.f8171e.getDoubleY(), sVar.f8158k.f8171e.getDoubleX()));
        LatLng mc2ll3 = CoordUtil.mc2ll(new GeoPoint(sVar.f8158k.f8172f.getDoubleY(), sVar.f8158k.f8172f.getDoubleX()));
        LatLng mc2ll4 = CoordUtil.mc2ll(new GeoPoint(sVar.f8158k.f8174h.getDoubleY(), sVar.f8158k.f8174h.getDoubleX()));
        LatLng mc2ll5 = CoordUtil.mc2ll(new GeoPoint(sVar.f8158k.f8173g.getDoubleY(), sVar.f8158k.f8173g.getDoubleX()));
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(mc2ll2);
        builder.include(mc2ll3);
        builder.include(mc2ll4);
        builder.include(mc2ll5);
        WinRound winRound = sVar.f8157j;
        LatLngBounds build = builder.build();
        build.setCenter(CoordUtil.mc2ll(new GeoPoint(((sVar.f8158k.f8173g.getDoubleY() - sVar.f8158k.f8171e.getDoubleY()) / 2.0d) + sVar.f8158k.f8171e.getDoubleY(), ((sVar.f8158k.f8173g.getDoubleX() - sVar.f8158k.f8171e.getDoubleX()) / 2.0d) + sVar.f8158k.f8171e.getDoubleX())));
        return new MapStatus(f8, mc2ll, f9, f10, point, sVar, d9, d8, build, winRound);
    }

    double b() {
        return this.f5946a;
    }

    double c() {
        return this.f5947b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.target != null) {
            sb.append("target lat: " + this.target.latitude + "\n");
            sb.append("target lng: " + this.target.longitude + "\n");
        }
        if (this.targetScreen != null) {
            sb.append("target screen x: " + this.targetScreen.x + "\n");
            sb.append("target screen y: " + this.targetScreen.y + "\n");
        }
        sb.append("zoom: " + this.zoom + "\n");
        sb.append("rotate: " + this.rotate + "\n");
        sb.append("overlook: " + this.overlook + "\n");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.rotate);
        parcel.writeParcelable(this.target, i8);
        parcel.writeFloat(this.overlook);
        parcel.writeFloat(this.zoom);
        parcel.writeParcelable(this.targetScreen, i8);
        parcel.writeParcelable(this.bound, i8);
        parcel.writeDouble(this.f5946a);
        parcel.writeDouble(this.f5947b);
    }

    s b(s sVar) {
        if (sVar == null) {
            return null;
        }
        float f8 = this.rotate;
        if (f8 != -2.1474836E9f) {
            sVar.f8149b = (int) f8;
        }
        float f9 = this.zoom;
        if (f9 != -2.1474836E9f) {
            sVar.f8148a = f9;
        }
        float f10 = this.overlook;
        if (f10 != -2.1474836E9f) {
            sVar.f8150c = (int) f10;
        }
        if (this.target != null) {
            sVar.f8151d = this.f5946a;
            sVar.f8152e = this.f5947b;
        }
        Point point = this.targetScreen;
        if (point != null) {
            sVar.f8153f = point.x;
            sVar.f8154g = point.y;
        }
        return sVar;
    }

    MapStatus(float f8, LatLng latLng, float f9, float f10, Point point, double d8, double d9, LatLngBounds latLngBounds) {
        this.rotate = f8;
        this.target = latLng;
        this.overlook = f9;
        this.zoom = f10;
        this.targetScreen = point;
        this.f5946a = d8;
        this.f5947b = d9;
        this.bound = latLngBounds;
    }

    MapStatus(float f8, LatLng latLng, float f9, float f10, Point point, s sVar, double d8, double d9, LatLngBounds latLngBounds, WinRound winRound) {
        this.rotate = f8;
        this.target = latLng;
        this.overlook = f9;
        this.zoom = f10;
        this.targetScreen = point;
        this.f5948c = sVar;
        this.f5946a = d8;
        this.f5947b = d9;
        this.bound = latLngBounds;
        this.winRound = winRound;
    }

    protected MapStatus(Parcel parcel) {
        this.rotate = parcel.readFloat();
        this.target = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.overlook = parcel.readFloat();
        this.zoom = parcel.readFloat();
        this.targetScreen = (Point) parcel.readParcelable(Point.class.getClassLoader());
        this.bound = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
        this.f5946a = parcel.readDouble();
        this.f5947b = parcel.readDouble();
    }

    s a() {
        return b(new s());
    }
}
