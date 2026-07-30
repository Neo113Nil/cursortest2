package com.baidu.mapapi.map;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.map.q;

/* loaded from: classes2.dex */
public final class BaiduMapOptions implements Parcelable {
    public static final Parcelable.Creator<BaiduMapOptions> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    MapStatus f5690a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5691b;

    /* renamed from: c, reason: collision with root package name */
    int f5692c;

    /* renamed from: d, reason: collision with root package name */
    boolean f5693d;

    /* renamed from: e, reason: collision with root package name */
    boolean f5694e;

    /* renamed from: f, reason: collision with root package name */
    boolean f5695f;

    /* renamed from: g, reason: collision with root package name */
    boolean f5696g;

    /* renamed from: h, reason: collision with root package name */
    boolean f5697h;

    /* renamed from: i, reason: collision with root package name */
    boolean f5698i;

    /* renamed from: j, reason: collision with root package name */
    LogoPosition f5699j;

    /* renamed from: k, reason: collision with root package name */
    Point f5700k;

    /* renamed from: l, reason: collision with root package name */
    Point f5701l;

    static class a implements Parcelable.Creator<BaiduMapOptions> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BaiduMapOptions createFromParcel(Parcel parcel) {
            return new BaiduMapOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BaiduMapOptions[] newArray(int i8) {
            return new BaiduMapOptions[i8];
        }
    }

    public BaiduMapOptions() {
        this.f5690a = new MapStatus(0.0f, new LatLng(39.914935d, 116.403119d), 0.0f, 12.0f, null, null);
        this.f5691b = false;
        this.f5692c = 1;
        this.f5693d = true;
        this.f5694e = true;
        this.f5695f = true;
        this.f5696g = true;
        this.f5697h = true;
        this.f5698i = true;
    }

    q a() {
        return new q().a(this.f5690a.a()).a(this.f5691b).a(this.f5692c).c(this.f5693d).d(this.f5694e).b(this.f5695f).e(this.f5696g);
    }

    public BaiduMapOptions compassEnabled(boolean z7) {
        this.f5691b = z7;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaiduMapOptions logoPosition(LogoPosition logoPosition) {
        this.f5699j = logoPosition;
        return this;
    }

    public BaiduMapOptions mapStatus(MapStatus mapStatus) {
        if (mapStatus != null) {
            this.f5690a = mapStatus;
        }
        return this;
    }

    public BaiduMapOptions mapType(int i8) {
        this.f5692c = i8;
        return this;
    }

    public BaiduMapOptions overlookingGesturesEnabled(boolean z7) {
        this.f5695f = z7;
        return this;
    }

    public BaiduMapOptions rotateGesturesEnabled(boolean z7) {
        this.f5693d = z7;
        return this;
    }

    public BaiduMapOptions scaleControlEnabled(boolean z7) {
        this.f5698i = z7;
        return this;
    }

    public BaiduMapOptions scaleControlPosition(Point point) {
        this.f5700k = point;
        return this;
    }

    public BaiduMapOptions scrollGesturesEnabled(boolean z7) {
        this.f5694e = z7;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f5690a, i8);
        parcel.writeByte(this.f5691b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f5692c);
        parcel.writeByte(this.f5693d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5694e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5695f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5696g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5697h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5698i ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f5700k, i8);
        parcel.writeParcelable(this.f5701l, i8);
    }

    public BaiduMapOptions zoomControlsEnabled(boolean z7) {
        this.f5697h = z7;
        return this;
    }

    public BaiduMapOptions zoomControlsPosition(Point point) {
        this.f5701l = point;
        return this;
    }

    public BaiduMapOptions zoomGesturesEnabled(boolean z7) {
        this.f5696g = z7;
        return this;
    }

    protected BaiduMapOptions(Parcel parcel) {
        this.f5690a = new MapStatus(0.0f, new LatLng(39.914935d, 116.403119d), 0.0f, 12.0f, null, null);
        this.f5691b = false;
        this.f5692c = 1;
        this.f5693d = true;
        this.f5694e = true;
        this.f5695f = true;
        this.f5696g = true;
        this.f5697h = true;
        this.f5698i = true;
        this.f5690a = (MapStatus) parcel.readParcelable(MapStatus.class.getClassLoader());
        this.f5691b = parcel.readByte() != 0;
        this.f5692c = parcel.readInt();
        this.f5693d = parcel.readByte() != 0;
        this.f5694e = parcel.readByte() != 0;
        this.f5695f = parcel.readByte() != 0;
        this.f5696g = parcel.readByte() != 0;
        this.f5697h = parcel.readByte() != 0;
        this.f5698i = parcel.readByte() != 0;
        this.f5700k = (Point) parcel.readParcelable(Point.class.getClassLoader());
        this.f5701l = (Point) parcel.readParcelable(Point.class.getClassLoader());
    }
}
