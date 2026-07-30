package com.facebook.ads.internal.util.parcelable;

import F0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a(15);

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f23683n;

    public WrappedParcelable(Parcel parcel) {
        this.f23683n = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.f23683n;
        if (bArr == null) {
            return null;
        }
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Parcelable readParcelable = obtain.readParcelable(classLoader);
        obtain.recycle();
        return readParcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f23683n);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f23683n = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f23683n = bArr;
    }
}
