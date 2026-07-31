package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new a();
    public String URI;

    /* renamed from: a, reason: collision with root package name */
    private int f14111a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f14112b;
    public Bundle header;

    class a implements Parcelable.Creator<DataBuffer> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer[] newArray(int i4) {
            return new DataBuffer[i4];
        }
    }

    /* synthetic */ DataBuffer(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static ClassLoader a(Class cls) {
        return cls.getClassLoader();
    }

    public DataBuffer addBody(Bundle bundle) {
        this.f14112b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBody() {
        return this.f14112b;
    }

    public int getBodySize() {
        return this.f14112b == null ? 0 : 1;
    }

    public int getProtocol() {
        return this.f14111a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.f14111a);
        parcel.writeString(this.URI);
        parcel.writeBundle(this.header);
        parcel.writeBundle(this.f14112b);
    }

    private DataBuffer(Parcel parcel) {
        this.header = null;
        this.f14111a = 1;
        this.f14112b = null;
        a(parcel);
    }

    private void a(Parcel parcel) {
        this.f14111a = parcel.readInt();
        this.URI = parcel.readString();
        this.header = parcel.readBundle(a(Bundle.class));
        this.f14112b = parcel.readBundle(a(Bundle.class));
    }

    public DataBuffer() {
        this.header = null;
        this.f14111a = 1;
        this.f14112b = null;
    }

    public DataBuffer(String str) {
        this.header = null;
        this.f14111a = 1;
        this.f14112b = null;
        this.URI = str;
    }

    public DataBuffer(String str, int i4) {
        this.header = null;
        this.f14112b = null;
        this.URI = str;
        this.f14111a = i4;
    }
}
