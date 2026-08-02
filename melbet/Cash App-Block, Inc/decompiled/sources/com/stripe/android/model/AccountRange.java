package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes8.dex */
public final class AccountRange implements StripeModel {
    public static final Parcelable.Creator<AccountRange> CREATOR = new Card.Creator(2);
    public final BinRange binRange;
    public final BrandInfo brandInfo;
    public final String country;
    public final CardFunding funding;
    public final int panLength;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BrandInfo {
        public static final /* synthetic */ BrandInfo[] $VALUES;
        public static final BrandInfo AmericanExpress;
        public static final BrandInfo CartesBancaires;
        public static final BrandInfo DinersClub;
        public static final BrandInfo Discover;
        public static final BrandInfo JCB;
        public static final BrandInfo Mastercard;
        public static final BrandInfo UnionPay;
        public static final BrandInfo Visa;

        static {
            y0 y0Var = CardBrand.Companion;
            BrandInfo brandInfo = new BrandInfo("Visa", 0);
            Visa = brandInfo;
            BrandInfo brandInfo2 = new BrandInfo("Mastercard", 1);
            Mastercard = brandInfo2;
            BrandInfo brandInfo3 = new BrandInfo("AmericanExpress", 2);
            AmericanExpress = brandInfo3;
            BrandInfo brandInfo4 = new BrandInfo("JCB", 3);
            JCB = brandInfo4;
            BrandInfo brandInfo5 = new BrandInfo("DinersClub", 4);
            DinersClub = brandInfo5;
            BrandInfo brandInfo6 = new BrandInfo("Discover", 5);
            Discover = brandInfo6;
            BrandInfo brandInfo7 = new BrandInfo("UnionPay", 6);
            UnionPay = brandInfo7;
            BrandInfo brandInfo8 = new BrandInfo("CartesBancaires", 7);
            CartesBancaires = brandInfo8;
            $VALUES = new BrandInfo[]{brandInfo, brandInfo2, brandInfo3, brandInfo4, brandInfo5, brandInfo6, brandInfo7, brandInfo8};
        }

        public static BrandInfo valueOf(String str) {
            return (BrandInfo) Enum.valueOf(BrandInfo.class, str);
        }

        public static BrandInfo[] values() {
            return (BrandInfo[]) $VALUES.clone();
        }
    }

    public AccountRange(BinRange binRange, int i, BrandInfo brandInfo, CardFunding cardFunding, String str) {
        binRange.getClass();
        brandInfo.getClass();
        cardFunding.getClass();
        this.binRange = binRange;
        this.panLength = i;
        this.brandInfo = brandInfo;
        this.funding = cardFunding;
        this.country = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountRange)) {
            return false;
        }
        AccountRange accountRange = (AccountRange) obj;
        return Intrinsics.areEqual(this.binRange, accountRange.binRange) && this.panLength == accountRange.panLength && this.brandInfo == accountRange.brandInfo && this.funding == accountRange.funding && Intrinsics.areEqual(this.country, accountRange.country);
    }

    public final int hashCode() {
        int hashCode = (this.funding.hashCode() + ((this.brandInfo.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.panLength, this.binRange.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.country;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountRange(binRange=");
        sb.append(this.binRange);
        sb.append(", panLength=");
        sb.append(this.panLength);
        sb.append(", brandInfo=");
        sb.append(this.brandInfo);
        sb.append(", funding=");
        sb.append(this.funding);
        sb.append(", country=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.country, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.binRange.writeToParcel(parcel, i);
        parcel.writeInt(this.panLength);
        parcel.writeString(this.brandInfo.name());
        parcel.writeString(this.funding.name());
        parcel.writeString(this.country);
    }

    public /* synthetic */ AccountRange(BinRange binRange, int i, BrandInfo brandInfo) {
        this(binRange, i, brandInfo, CardFunding.Unknown, null);
    }
}
