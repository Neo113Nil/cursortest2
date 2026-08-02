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
    public AdDetails[] f7986a;

    /* renamed from: b, reason: collision with root package name */
    public float f7987b;

    /* renamed from: c, reason: collision with root package name */
    public int f7988c;

    /* renamed from: d, reason: collision with root package name */
    public int f7989d;

    /* renamed from: e, reason: collision with root package name */
    public int f7990e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7991f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7992g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7993h;

    /* renamed from: i, reason: collision with root package name */
    public AdInformationOverrides f7994i;

    /* renamed from: j, reason: collision with root package name */
    public BannerOptions f7995j;

    /* renamed from: k, reason: collision with root package name */
    public final AdRulesResult f7996k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7997l;

    /* renamed from: m, reason: collision with root package name */
    public c1[] f7998m;

    public z0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        if (!this.f7997l) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.f7990e);
        parcel.writeFloat(this.f7987b);
        parcel.writeInt(this.f7988c);
        parcel.writeInt(this.f7989d);
        parcel.writeParcelableArray(this.f7986a, i4);
        parcel.writeInt(this.f7991f ? 1 : 0);
        parcel.writeInt(this.f7992g ? 1 : 0);
        parcel.writeInt(this.f7993h ? 1 : 0);
        c1[] c1VarArr = this.f7998m;
        if (c1VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(c1VarArr.length);
            for (c1 c1Var : this.f7998m) {
                parcel.writeParcelable(c1Var, i4);
            }
        }
        parcel.writeSerializable(this.f7994i);
        parcel.writeSerializable(this.f7995j);
        parcel.writeSerializable(this.f7996k);
    }

    public z0(Parcel parcel) {
        super(parcel);
        if (parcel.readInt() != 1) {
            this.f7997l = false;
            return;
        }
        this.f7997l = true;
        this.f7990e = parcel.readInt();
        this.f7987b = parcel.readFloat();
        this.f7988c = parcel.readInt();
        this.f7989d = parcel.readInt();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
        if (readParcelableArray != null) {
            AdDetails[] adDetailsArr = new AdDetails[readParcelableArray.length];
            this.f7986a = adDetailsArr;
            System.arraycopy(readParcelableArray, 0, adDetailsArr, 0, readParcelableArray.length);
        }
        int readInt = parcel.readInt();
        this.f7991f = false;
        if (readInt == 1) {
            this.f7991f = true;
        }
        int readInt2 = parcel.readInt();
        this.f7992g = false;
        if (readInt2 == 1) {
            this.f7992g = true;
        }
        int readInt3 = parcel.readInt();
        this.f7993h = false;
        if (readInt3 == 1) {
            this.f7993h = true;
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            this.f7998m = new c1[readInt4];
            for (int i4 = 0; i4 < readInt4; i4++) {
                this.f7998m[i4] = (c1) parcel.readParcelable(c1.class.getClassLoader());
            }
        }
        this.f7994i = (AdInformationOverrides) parcel.readSerializable();
        this.f7995j = (BannerOptions) parcel.readSerializable();
        this.f7996k = (AdRulesResult) parcel.readSerializable();
    }
}
