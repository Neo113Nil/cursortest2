package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rn extends zh0 {
    public static final Parcelable.Creator<rn> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f31298c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31299d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31300e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31301f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31302g;

    /* renamed from: h, reason: collision with root package name */
    private final zh0[] f31303h;

    final class a implements Parcelable.Creator<rn> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final rn createFromParcel(Parcel parcel) {
            return new rn(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final rn[] newArray(int i4) {
            return new rn[i4];
        }
    }

    rn(Parcel parcel) {
        super("CHAP");
        this.f31298c = (String) u82.a(parcel.readString());
        this.f31299d = parcel.readInt();
        this.f31300e = parcel.readInt();
        this.f31301f = parcel.readLong();
        this.f31302g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f31303h = new zh0[readInt];
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f31303h[i4] = (zh0) parcel.readParcelable(zh0.class.getClassLoader());
        }
    }

    @Override // com.yandex.mobile.ads.impl.zh0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rn.class == obj.getClass()) {
            rn rnVar = (rn) obj;
            if (this.f31299d == rnVar.f31299d && this.f31300e == rnVar.f31300e && this.f31301f == rnVar.f31301f && this.f31302g == rnVar.f31302g && u82.a(this.f31298c, rnVar.f31298c) && Arrays.equals(this.f31303h, rnVar.f31303h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (((((((this.f31299d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f31300e) * 31) + ((int) this.f31301f)) * 31) + ((int) this.f31302g)) * 31;
        String str = this.f31298c;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f31298c);
        parcel.writeInt(this.f31299d);
        parcel.writeInt(this.f31300e);
        parcel.writeLong(this.f31301f);
        parcel.writeLong(this.f31302g);
        parcel.writeInt(this.f31303h.length);
        for (zh0 zh0Var : this.f31303h) {
            parcel.writeParcelable(zh0Var, 0);
        }
    }

    public rn(String str, int i4, int i5, long j4, long j5, zh0[] zh0VarArr) {
        super("CHAP");
        this.f31298c = str;
        this.f31299d = i4;
        this.f31300e = i5;
        this.f31301f = j4;
        this.f31302g = j5;
        this.f31303h = zh0VarArr;
    }
}
