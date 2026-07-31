package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kl0 implements Parcelable.Creator<jl0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jl0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 2:
                    str = s3.b.f(parcel, o7);
                    break;
                case 3:
                    str2 = s3.b.f(parcel, o7);
                    break;
                case 4:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 5:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case 6:
                    arrayList = s3.b.h(parcel, o7);
                    break;
                case c4.w0.f2149o /* 7 */:
                    z8 = s3.b.m(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                    z9 = s3.b.m(parcel, o7);
                    break;
                case 9:
                    arrayList2 = s3.b.h(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new jl0(str, str2, z6, z7, arrayList, z8, z9, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jl0[] newArray(int i7) {
        return new jl0[i7];
    }
}
