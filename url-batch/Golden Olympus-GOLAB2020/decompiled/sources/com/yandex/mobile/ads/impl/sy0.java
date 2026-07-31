package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sy0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<sy0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<xy0> f32079b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Map<String, String> f32080c;

    public static final class a implements Parcelable.Creator<sy0> {
        @Override // android.os.Parcelable.Creator
        public final sy0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i4 = 0; i4 != readInt; i4++) {
                arrayList.add(xy0.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i5 = 0; i5 != readInt2; i5++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new sy0(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final sy0[] newArray(int i4) {
            return new sy0[i4];
        }
    }

    public sy0(@NotNull ArrayList mediationNetworks, @NotNull Map passbackParameters) {
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(passbackParameters, "passbackParameters");
        this.f32079b = mediationNetworks;
        this.f32080c = passbackParameters;
    }

    @NotNull
    public final List<xy0> c() {
        return this.f32079b;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.f32080c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<xy0> list = this.f32079b;
        out.writeInt(list.size());
        Iterator<xy0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i4);
        }
        Map<String, String> map = this.f32080c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }
}
