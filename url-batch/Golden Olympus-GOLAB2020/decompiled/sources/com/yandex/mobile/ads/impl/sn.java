package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sn extends zh0 {
    public static final Parcelable.Creator<sn> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f31875c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31876d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31877e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f31878f;

    /* renamed from: g, reason: collision with root package name */
    private final zh0[] f31879g;

    final class a implements Parcelable.Creator<sn> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final sn createFromParcel(Parcel parcel) {
            return new sn(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final sn[] newArray(int i4) {
            return new sn[i4];
        }
    }

    sn(Parcel parcel) {
        super("CTOC");
        this.f31875c = (String) u82.a(parcel.readString());
        this.f31876d = parcel.readByte() != 0;
        this.f31877e = parcel.readByte() != 0;
        this.f31878f = (String[]) u82.a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f31879g = new zh0[readInt];
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f31879g[i4] = (zh0) parcel.readParcelable(zh0.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sn.class == obj.getClass()) {
            sn snVar = (sn) obj;
            if (this.f31876d == snVar.f31876d && this.f31877e == snVar.f31877e && u82.a(this.f31875c, snVar.f31875c) && Arrays.equals(this.f31878f, snVar.f31878f) && Arrays.equals(this.f31879g, snVar.f31879g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = ((((this.f31876d ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f31877e ? 1 : 0)) * 31;
        String str = this.f31875c;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f31875c);
        parcel.writeByte(this.f31876d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f31877e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f31878f);
        parcel.writeInt(this.f31879g.length);
        for (zh0 zh0Var : this.f31879g) {
            parcel.writeParcelable(zh0Var, 0);
        }
    }

    public sn(String str, boolean z4, boolean z5, String[] strArr, zh0[] zh0VarArr) {
        super("CTOC");
        this.f31875c = str;
        this.f31876d = z4;
        this.f31877e = z5;
        this.f31878f = strArr;
        this.f31879g = zh0VarArr;
    }
}
