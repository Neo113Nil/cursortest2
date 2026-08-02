package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.model.AdDetails;

/* loaded from: classes.dex */
public final class z0 extends View.BaseSavedState {
    public static final Parcelable.Creator<z0> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    public AdDetails[] f4838a;

    /* renamed from: b, reason: collision with root package name */
    public float f4839b;

    /* renamed from: c, reason: collision with root package name */
    public int f4840c;

    /* renamed from: d, reason: collision with root package name */
    public int f4841d;

    /* renamed from: e, reason: collision with root package name */
    public int f4842e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4843g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4844h;

    /* renamed from: i, reason: collision with root package name */
    public AdInformationOverrides f4845i;

    /* renamed from: j, reason: collision with root package name */
    public BannerOptions f4846j;

    /* renamed from: k, reason: collision with root package name */
    public final AdRulesResult f4847k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4848l;

    /* renamed from: m, reason: collision with root package name */
    public c1[] f4849m;

    public z0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        if (!this.f4848l) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.f4842e);
        parcel.writeFloat(this.f4839b);
        parcel.writeInt(this.f4840c);
        parcel.writeInt(this.f4841d);
        parcel.writeParcelableArray(this.f4838a, i3);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.f4843g ? 1 : 0);
        parcel.writeInt(this.f4844h ? 1 : 0);
        c1[] c1VarArr = this.f4849m;
        if (c1VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(c1VarArr.length);
            for (c1 c1Var : this.f4849m) {
                parcel.writeParcelable(c1Var, i3);
            }
        }
        parcel.writeSerializable(this.f4845i);
        parcel.writeSerializable(this.f4846j);
        parcel.writeSerializable(this.f4847k);
    }

    public z0(Parcel parcel) {
        super(parcel);
        if (parcel.readInt() != 1) {
            this.f4848l = false;
            return;
        }
        this.f4848l = true;
        this.f4842e = parcel.readInt();
        this.f4839b = parcel.readFloat();
        this.f4840c = parcel.readInt();
        this.f4841d = parcel.readInt();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
        if (readParcelableArray != null) {
            AdDetails[] adDetailsArr = new AdDetails[readParcelableArray.length];
            this.f4838a = adDetailsArr;
            System.arraycopy(readParcelableArray, 0, adDetailsArr, 0, readParcelableArray.length);
        }
        int readInt = parcel.readInt();
        this.f = false;
        if (readInt == 1) {
            this.f = true;
        }
        int readInt2 = parcel.readInt();
        this.f4843g = false;
        if (readInt2 == 1) {
            this.f4843g = true;
        }
        int readInt3 = parcel.readInt();
        this.f4844h = false;
        if (readInt3 == 1) {
            this.f4844h = true;
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            this.f4849m = new c1[readInt4];
            for (int i3 = 0; i3 < readInt4; i3++) {
                this.f4849m[i3] = (c1) parcel.readParcelable(c1.class.getClassLoader());
            }
        }
        this.f4845i = (AdInformationOverrides) parcel.readSerializable();
        this.f4846j = (BannerOptions) parcel.readSerializable();
        this.f4847k = (AdRulesResult) parcel.readSerializable();
    }
}
