package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2063l9 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C2063l9> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f28469b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<xy0> f28470c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f28471d;

    /* renamed from: com.yandex.mobile.ads.impl.l9$a */
    public static final class a implements Parcelable.Creator<C2063l9> {
        @Override // android.os.Parcelable.Creator
        public final C2063l9 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i4 = 0; i4 != readInt; i4++) {
                arrayList.add(xy0.CREATOR.createFromParcel(parcel));
            }
            return new C2063l9(readString, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final C2063l9[] newArray(int i4) {
            return new C2063l9[i4];
        }
    }

    public C2063l9(@NotNull String adUnitId, @NotNull String rawData, @NotNull ArrayList mediationNetworks) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.f28469b = adUnitId;
        this.f28470c = mediationNetworks;
        this.f28471d = rawData;
    }

    @NotNull
    public final String c() {
        return this.f28469b;
    }

    @NotNull
    public final String d() {
        return this.f28471d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.f28469b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2063l9)) {
            return false;
        }
        C2063l9 c2063l9 = (C2063l9) obj;
        return Intrinsics.areEqual(this.f28469b, c2063l9.f28469b) && Intrinsics.areEqual(this.f28470c, c2063l9.f28470c) && Intrinsics.areEqual(this.f28471d, c2063l9.f28471d);
    }

    @NotNull
    public final List<xy0> f() {
        return this.f28470c;
    }

    public final int hashCode() {
        return this.f28471d.hashCode() + C2039k9.a(this.f28470c, this.f28469b.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "AdUnitIdBiddingSettings(adUnitId=" + this.f28469b + ", mediationNetworks=" + this.f28470c + ", rawData=" + this.f28471d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f28469b);
        List<xy0> list = this.f28470c;
        out.writeInt(list.size());
        Iterator<xy0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i4);
        }
        out.writeString(this.f28471d);
    }
}
