package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.anythink.basead.exoplayer.g.b.d.1
        private static d a(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i) {
            return new d[i];
        }

        private static d[] a(int i) {
            return new d[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7449a = "CTOC";

    /* renamed from: b, reason: collision with root package name */
    public final String f7450b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7451c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7452d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f7453e;

    /* renamed from: f, reason: collision with root package name */
    private final h[] f7454f;

    public d(String str, boolean z8, boolean z9, String[] strArr, h[] hVarArr) {
        super(f7449a);
        this.f7450b = str;
        this.f7451c = z8;
        this.f7452d = z9;
        this.f7453e = strArr;
        this.f7454f = hVarArr;
    }

    private int a() {
        return this.f7454f.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f7451c == dVar.f7451c && this.f7452d == dVar.f7452d && af.a((Object) this.f7450b, (Object) dVar.f7450b) && Arrays.equals(this.f7453e, dVar.f7453e) && Arrays.equals(this.f7454f, dVar.f7454f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f7451c ? 1 : 0) + 527) * 31) + (this.f7452d ? 1 : 0)) * 31;
        String str = this.f7450b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7450b);
        parcel.writeByte(this.f7451c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7452d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f7453e);
        parcel.writeInt(this.f7454f.length);
        for (h hVar : this.f7454f) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    private h a(int i) {
        return this.f7454f[i];
    }

    public d(Parcel parcel) {
        super(f7449a);
        this.f7450b = parcel.readString();
        this.f7451c = parcel.readByte() != 0;
        this.f7452d = parcel.readByte() != 0;
        this.f7453e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f7454f = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f7454f[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
