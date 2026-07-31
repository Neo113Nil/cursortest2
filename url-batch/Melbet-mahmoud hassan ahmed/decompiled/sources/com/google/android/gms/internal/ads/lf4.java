package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lf4 extends wf4 {
    public static final Parcelable.Creator<lf4> CREATOR = new kf4();

    /* renamed from: g, reason: collision with root package name */
    public final String f7954g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7955h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7956i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7957j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7958k;

    /* renamed from: l, reason: collision with root package name */
    private final wf4[] f7959l;

    lf4(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f7954g = readString;
        this.f7955h = parcel.readInt();
        this.f7956i = parcel.readInt();
        this.f7957j = parcel.readLong();
        this.f7958k = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7959l = new wf4[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f7959l[i8] = (wf4) parcel.readParcelable(wf4.class.getClassLoader());
        }
    }

    public lf4(String str, int i7, int i8, long j7, long j8, wf4[] wf4VarArr) {
        super("CHAP");
        this.f7954g = str;
        this.f7955h = i7;
        this.f7956i = i8;
        this.f7957j = j7;
        this.f7958k = j8;
        this.f7959l = wf4VarArr;
    }

    @Override // com.google.android.gms.internal.ads.wf4, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lf4.class == obj.getClass()) {
            lf4 lf4Var = (lf4) obj;
            if (this.f7955h == lf4Var.f7955h && this.f7956i == lf4Var.f7956i && this.f7957j == lf4Var.f7957j && this.f7958k == lf4Var.f7958k && n13.p(this.f7954g, lf4Var.f7954g) && Arrays.equals(this.f7959l, lf4Var.f7959l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (((((((this.f7955h + 527) * 31) + this.f7956i) * 31) + ((int) this.f7957j)) * 31) + ((int) this.f7958k)) * 31;
        String str = this.f7954g;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f7954g);
        parcel.writeInt(this.f7955h);
        parcel.writeInt(this.f7956i);
        parcel.writeLong(this.f7957j);
        parcel.writeLong(this.f7958k);
        parcel.writeInt(this.f7959l.length);
        for (wf4 wf4Var : this.f7959l) {
            parcel.writeParcelable(wf4Var, 0);
        }
    }
}
