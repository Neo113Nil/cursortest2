package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class LegLinked implements Parcelable {
    public static final Parcelable.Creator<LegLinked> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f6769a;

    /* renamed from: b, reason: collision with root package name */
    private int f6770b;

    static class a implements Parcelable.Creator<LegLinked> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LegLinked[] newArray(int i8) {
            return new LegLinked[i8];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LegLinked createFromParcel(Parcel parcel) {
            return new LegLinked(parcel);
        }
    }

    public LegLinked() {
        this.f6769a = -1;
        this.f6770b = -1;
    }

    public int a() {
        return this.f6769a;
    }

    public int b() {
        return this.f6770b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f6769a);
        parcel.writeInt(this.f6770b);
    }

    protected LegLinked(Parcel parcel) {
        this.f6769a = -1;
        this.f6770b = -1;
        this.f6769a = parcel.readInt();
        this.f6770b = parcel.readInt();
    }

    public void a(int i8) {
        this.f6769a = i8;
    }

    public void b(int i8) {
        this.f6770b = i8;
    }
}
