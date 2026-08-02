package com.squareup.cash.work.webview.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.SetupIntentResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class WorkWebScreen implements Screen {
    public static final Parcelable.Creator<WorkWebScreen> CREATOR = new SetupIntentResult.Creator(5);
    public final WorkWebKey key;
    public final String merchantToken;
    public final String url;
    public final boolean useOtk;

    public WorkWebScreen(String str, boolean z, WorkWebKey workWebKey, String str2) {
        str.getClass();
        workWebKey.getClass();
        this.url = str;
        this.useOtk = z;
        this.key = workWebKey;
        this.merchantToken = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkWebScreen)) {
            return false;
        }
        WorkWebScreen workWebScreen = (WorkWebScreen) obj;
        return Intrinsics.areEqual(this.url, workWebScreen.url) && this.useOtk == workWebScreen.useOtk && this.key == workWebScreen.key && Intrinsics.areEqual(this.merchantToken, workWebScreen.merchantToken);
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.useOtk)) * 31;
        String str = this.merchantToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("WorkWebScreen(url=", this.url, ", useOtk=", ", key=", this.useOtk);
        m1540m.append(this.key);
        m1540m.append(", merchantToken=");
        m1540m.append(this.merchantToken);
        m1540m.append(")");
        return m1540m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.url);
        parcel.writeInt(this.useOtk ? 1 : 0);
        parcel.writeString(this.key.name());
        parcel.writeString(this.merchantToken);
    }
}
