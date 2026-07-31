package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xy0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<xy0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34714b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f34715c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final List<String> f34716d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final List<String> f34717e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final List<String> f34718f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final C1795a4 f34719g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f34720h;

    public static final class a implements Parcelable.Creator<xy0> {
        @Override // android.os.Parcelable.Creator
        public final xy0 createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
            for (int i4 = 0; i4 != readInt; i4++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            C1795a4 createFromParcel = parcel.readInt() == 0 ? null : C1795a4.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                for (int i5 = 0; i5 != readInt2; i5++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new xy0(readString, linkedHashMap2, createStringArrayList, createStringArrayList2, createStringArrayList3, createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final xy0[] newArray(int i4) {
            return new xy0[i4];
        }
    }

    public xy0(@NotNull String adapter, @NotNull Map<String, String> networkData, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable C1795a4 c1795a4, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        this.f34714b = adapter;
        this.f34715c = networkData;
        this.f34716d = list;
        this.f34717e = list2;
        this.f34718f = list3;
        this.f34719g = c1795a4;
        this.f34720h = map;
    }

    @Nullable
    public final C1795a4 c() {
        return this.f34719g;
    }

    @Nullable
    public final List<String> d() {
        return this.f34718f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.f34714b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy0)) {
            return false;
        }
        xy0 xy0Var = (xy0) obj;
        return Intrinsics.areEqual(this.f34714b, xy0Var.f34714b) && Intrinsics.areEqual(this.f34715c, xy0Var.f34715c) && Intrinsics.areEqual(this.f34716d, xy0Var.f34716d) && Intrinsics.areEqual(this.f34717e, xy0Var.f34717e) && Intrinsics.areEqual(this.f34718f, xy0Var.f34718f) && Intrinsics.areEqual(this.f34719g, xy0Var.f34719g) && Intrinsics.areEqual(this.f34720h, xy0Var.f34720h);
    }

    @Nullable
    public final Map<String, String> f() {
        return this.f34720h;
    }

    @Nullable
    public final List<String> g() {
        return this.f34717e;
    }

    @Nullable
    public final List<String> h() {
        return this.f34716d;
    }

    public final int hashCode() {
        int hashCode = (this.f34715c.hashCode() + (this.f34714b.hashCode() * 31)) * 31;
        List<String> list = this.f34716d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f34717e;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f34718f;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        C1795a4 c1795a4 = this.f34719g;
        int hashCode5 = (hashCode4 + (c1795a4 == null ? 0 : c1795a4.hashCode())) * 31;
        Map<String, String> map = this.f34720h;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final Map<String, String> i() {
        return this.f34715c;
    }

    @NotNull
    public final String toString() {
        return "MediationNetwork(adapter=" + this.f34714b + ", networkData=" + this.f34715c + ", impressionTrackingUrls=" + this.f34716d + ", clickTrackingUrls=" + this.f34717e + ", adResponseTrackingUrls=" + this.f34718f + ", adImpressionData=" + this.f34719g + ", biddingInfo=" + this.f34720h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f34714b);
        Map<String, String> map = this.f34715c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
        out.writeStringList(this.f34716d);
        out.writeStringList(this.f34717e);
        out.writeStringList(this.f34718f);
        C1795a4 c1795a4 = this.f34719g;
        if (c1795a4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1795a4.writeToParcel(out, i4);
        }
        Map<String, String> map2 = this.f34720h;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            out.writeString(entry2.getKey());
            out.writeString(entry2.getValue());
        }
    }
}
