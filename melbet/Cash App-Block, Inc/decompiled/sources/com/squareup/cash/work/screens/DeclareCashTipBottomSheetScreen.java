package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.work.screens.WorkHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeclareCashTipBottomSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<DeclareCashTipBottomSheetScreen> CREATOR = new WorkHomeScreen.Creator(13);
    public final AskedQuestion askedQuestion;
    public final String currencyCode;
    public final String merchantToken;
    public final String timecardToken;

    public DeclareCashTipBottomSheetScreen(String str, String str2, String str3, AskedQuestion askedQuestion) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.timecardToken = str;
        this.merchantToken = str2;
        this.currencyCode = str3;
        this.askedQuestion = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeclareCashTipBottomSheetScreen)) {
            return false;
        }
        DeclareCashTipBottomSheetScreen declareCashTipBottomSheetScreen = (DeclareCashTipBottomSheetScreen) obj;
        return Intrinsics.areEqual(this.timecardToken, declareCashTipBottomSheetScreen.timecardToken) && Intrinsics.areEqual(this.merchantToken, declareCashTipBottomSheetScreen.merchantToken) && Intrinsics.areEqual(this.currencyCode, declareCashTipBottomSheetScreen.currencyCode) && Intrinsics.areEqual(this.askedQuestion, declareCashTipBottomSheetScreen.askedQuestion);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.timecardToken.hashCode() * 31, 31, this.merchantToken), 31, this.currencyCode);
        AskedQuestion askedQuestion = this.askedQuestion;
        return m + (askedQuestion == null ? 0 : askedQuestion.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeclareCashTipBottomSheetScreen(timecardToken=", this.timecardToken, ", merchantToken=", this.merchantToken, ", currencyCode=");
        m.append(this.currencyCode);
        m.append(", askedQuestion=");
        m.append(this.askedQuestion);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.timecardToken);
        parcel.writeString(this.merchantToken);
        parcel.writeString(this.currencyCode);
        parcel.writeParcelable(this.askedQuestion, i);
    }
}
