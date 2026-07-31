package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.model.AdDetails;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class w0 extends View.BaseSavedState {
    public static final Parcelable.Creator<w0> CREATOR = new v0();

    /* renamed from: a, reason: collision with root package name */
    public AdDetails[] f475a;
    public float b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public AdInformationOverrides i;
    public BannerOptions j;
    public final AdRulesResult k;
    public boolean l;
    public z0[] m;

    public w0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (!this.l) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelableArray(this.f475a, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        z0[] z0VarArr = this.m;
        if (z0VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(z0VarArr.length);
            for (z0 z0Var : this.m) {
                parcel.writeParcelable(z0Var, i);
            }
        }
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.j);
        parcel.writeSerializable(this.k);
    }

    public w0(Parcel parcel) {
        super(parcel);
        if (parcel.readInt() != 1) {
            this.l = false;
            return;
        }
        this.l = true;
        this.e = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
        if (readParcelableArray != null) {
            AdDetails[] adDetailsArr = new AdDetails[readParcelableArray.length];
            this.f475a = adDetailsArr;
            System.arraycopy(readParcelableArray, 0, adDetailsArr, 0, readParcelableArray.length);
        }
        int readInt = parcel.readInt();
        this.f = false;
        if (readInt == 1) {
            this.f = true;
        }
        int readInt2 = parcel.readInt();
        this.g = false;
        if (readInt2 == 1) {
            this.g = true;
        }
        int readInt3 = parcel.readInt();
        this.h = false;
        if (readInt3 == 1) {
            this.h = true;
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            this.m = new z0[readInt4];
            for (int i = 0; i < readInt4; i++) {
                this.m[i] = (z0) parcel.readParcelable(z0.class.getClassLoader());
            }
        }
        this.i = (AdInformationOverrides) parcel.readSerializable();
        this.j = (BannerOptions) parcel.readSerializable();
        this.k = (AdRulesResult) parcel.readSerializable();
    }
}
