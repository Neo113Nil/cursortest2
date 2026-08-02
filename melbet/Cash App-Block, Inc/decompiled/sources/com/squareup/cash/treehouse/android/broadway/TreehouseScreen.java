package com.squareup.cash.treehouse.android.broadway;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes.dex */
public final class TreehouseScreen implements Screen {
    public static final Parcelable.Creator<TreehouseScreen> CREATOR = new WalletHomeScreen.Creator(25);

    /* renamed from: app, reason: collision with root package name */
    public final String f1218app;
    public final String link;
    public final ByteString parameters;
    public final boolean retainInstance;

    public TreehouseScreen(String str, String str2, ByteString byteString, boolean z) {
        str.getClass();
        str2.getClass();
        this.f1218app = str;
        this.link = str2;
        this.parameters = byteString;
        this.retainInstance = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreehouseScreen)) {
            return false;
        }
        TreehouseScreen treehouseScreen = (TreehouseScreen) obj;
        return Intrinsics.areEqual(this.f1218app, treehouseScreen.f1218app) && Intrinsics.areEqual(this.link, treehouseScreen.link) && Intrinsics.areEqual(this.parameters, treehouseScreen.parameters) && this.retainInstance == treehouseScreen.retainInstance;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1218app.hashCode() * 31, 31, this.link);
        ByteString byteString = this.parameters;
        return Boolean.hashCode(this.retainInstance) + ((m + (byteString == null ? 0 : byteString.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TreehouseScreen(app=", this.f1218app, ", link=", this.link, ", parameters=");
        m.append(this.parameters);
        m.append(", retainInstance=");
        m.append(this.retainInstance);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f1218app);
        parcel.writeString(this.link);
        parcel.writeSerializable(this.parameters);
        parcel.writeInt(this.retainInstance ? 1 : 0);
    }
}
