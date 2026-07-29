package com.google.ads.mediation.testsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;

/* loaded from: classes.dex */
public class Country implements Parcelable {
    public static final Parcelable.Creator<Country> CREATOR = new Parcelable.Creator<Country>() { // from class: com.google.ads.mediation.testsuite.dataobjects.Country.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Country createFromParcel(Parcel parcel) {
            return new Country(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Country[] newArray(int i) {
            return new Country[i];
        }
    };
    private String code;
    private String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Country() {
    }

    public Country(String str, String str2) {
        this.code = str;
        this.name = str2;
    }

    public static Country allCountry() {
        return new Country(NetstatsParserPatterns.TYPE_BOTH_PATTERN, "All Countries");
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.name);
    }

    private Country(Parcel parcel) {
        this.code = parcel.readString();
        this.name = parcel.readString();
    }
}
