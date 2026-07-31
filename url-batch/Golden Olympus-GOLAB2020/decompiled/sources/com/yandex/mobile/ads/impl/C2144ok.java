package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2144ok implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C2144ok> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<C2063l9> f30064b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final tz0 f30065c;

    /* renamed from: com.yandex.mobile.ads.impl.ok$a */
    public static final class a implements Parcelable.Creator<C2144ok> {
        @Override // android.os.Parcelable.Creator
        public final C2144ok createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i4 = 0; i4 != readInt; i4++) {
                arrayList.add(C2063l9.CREATOR.createFromParcel(parcel));
            }
            return new C2144ok(arrayList, parcel.readInt() == 0 ? null : tz0.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final C2144ok[] newArray(int i4) {
            return new C2144ok[i4];
        }
    }

    public C2144ok(@NotNull ArrayList adUnitIdBiddingSettingsList, @Nullable tz0 tz0Var) {
        Intrinsics.checkNotNullParameter(adUnitIdBiddingSettingsList, "adUnitIdBiddingSettingsList");
        this.f30064b = adUnitIdBiddingSettingsList;
        this.f30065c = tz0Var;
    }

    @NotNull
    public final List<C2063l9> c() {
        return this.f30064b;
    }

    @Nullable
    public final tz0 d() {
        return this.f30065c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2144ok)) {
            return false;
        }
        C2144ok c2144ok = (C2144ok) obj;
        return Intrinsics.areEqual(this.f30064b, c2144ok.f30064b) && Intrinsics.areEqual(this.f30065c, c2144ok.f30065c);
    }

    public final int hashCode() {
        int hashCode = this.f30064b.hashCode() * 31;
        tz0 tz0Var = this.f30065c;
        return hashCode + (tz0Var == null ? 0 : tz0Var.hashCode());
    }

    @NotNull
    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.f30064b + ", mediationPrefetchSettings=" + this.f30065c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<C2063l9> list = this.f30064b;
        out.writeInt(list.size());
        Iterator<C2063l9> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i4);
        }
        tz0 tz0Var = this.f30065c;
        if (tz0Var == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            tz0Var.writeToParcel(out, i4);
        }
    }
}
