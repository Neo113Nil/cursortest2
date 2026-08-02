package com.squareup.cash.taptopay.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.tax.primitives.Id;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TapToPayPaymentRequestScreen implements Screen, NeverInBackStackScreen {
    public static final Parcelable.Creator<TapToPayPaymentRequestScreen> CREATOR = new Id.Close.Creator(12);
    public final Money amount;
    public final byte[] authorizationData;
    public final String idempotencyToken;
    public final String initiatorNotes;
    public final boolean isDemoMode;

    public TapToPayPaymentRequestScreen(byte[] bArr, Money money, String str, String str2, boolean z) {
        bArr.getClass();
        money.getClass();
        str.getClass();
        str2.getClass();
        this.authorizationData = bArr;
        this.amount = money;
        this.initiatorNotes = str;
        this.idempotencyToken = str2;
        this.isDemoMode = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TapToPayPaymentRequestScreen.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        if (Arrays.equals(this.authorizationData, ((TapToPayPaymentRequestScreen) obj).authorizationData)) {
            return !Intrinsics.areEqual(this.amount, r5.amount);
        }
        return false;
    }

    public final int hashCode() {
        return this.amount.hashCode() + (Arrays.hashCode(this.authorizationData) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.authorizationData);
        StringBuilder sb = new StringBuilder("TapToPayPaymentRequestScreen(authorizationData=");
        sb.append(arrays);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", initiatorNotes=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.initiatorNotes, ", idempotencyToken=", this.idempotencyToken, ", isDemoMode=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isDemoMode, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeByteArray(this.authorizationData);
        parcel.writeParcelable(this.amount, i);
        parcel.writeString(this.initiatorNotes);
        parcel.writeString(this.idempotencyToken);
        parcel.writeInt(this.isDemoMode ? 1 : 0);
    }
}
