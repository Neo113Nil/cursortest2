package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nf4 extends wf4 {
    public static final Parcelable.Creator<nf4> CREATOR = new mf4();

    /* renamed from: g, reason: collision with root package name */
    public final String f9075g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9076h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9077i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f9078j;

    /* renamed from: k, reason: collision with root package name */
    private final wf4[] f9079k;

    nf4(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f9075g = readString;
        this.f9076h = parcel.readByte() != 0;
        this.f9077i = parcel.readByte() != 0;
        this.f9078j = (String[]) n13.c(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f9079k = new wf4[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f9079k[i8] = (wf4) parcel.readParcelable(wf4.class.getClassLoader());
        }
    }

    public nf4(String str, boolean z6, boolean z7, String[] strArr, wf4[] wf4VarArr) {
        super("CTOC");
        this.f9075g = str;
        this.f9076h = z6;
        this.f9077i = z7;
        this.f9078j = strArr;
        this.f9079k = wf4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nf4.class == obj.getClass()) {
            nf4 nf4Var = (nf4) obj;
            if (this.f9076h == nf4Var.f9076h && this.f9077i == nf4Var.f9077i && n13.p(this.f9075g, nf4Var.f9075g) && Arrays.equals(this.f9078j, nf4Var.f9078j) && Arrays.equals(this.f9079k, nf4Var.f9079k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = ((((this.f9076h ? 1 : 0) + 527) * 31) + (this.f9077i ? 1 : 0)) * 31;
        String str = this.f9075g;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9075g);
        parcel.writeByte(this.f9076h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9077i ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f9078j);
        parcel.writeInt(this.f9079k.length);
        for (wf4 wf4Var : this.f9079k) {
            parcel.writeParcelable(wf4Var, 0);
        }
    }
}
