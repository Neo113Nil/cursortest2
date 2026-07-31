package com.bytedance.adsdk.ugeno.zg;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public abstract class zmn implements Parcelable {
    private final Parcelable fs;
    public static final zmn zmn = new zmn() { // from class: com.bytedance.adsdk.ugeno.zg.zmn.1
    };
    public static final Parcelable.Creator<zmn> CREATOR = new Parcelable.ClassLoaderCreator<zmn>() { // from class: com.bytedance.adsdk.ugeno.zg.zmn.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zmn createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zmn createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return zmn.zmn;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zmn[] newArray(int i) {
            return new zmn[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private zmn() {
        this.fs = null;
    }

    protected zmn(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.fs = parcelable == zmn ? null : parcelable;
    }

    protected zmn(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.fs = readParcelable == null ? zmn : readParcelable;
    }

    public final Parcelable zmn() {
        return this.fs;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.fs, i);
    }
}
