package com.google.android.gms.people.cpg.actionpreferences;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctt;
import defpackage.oy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RawContactActionPreference extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctt(10);
    public final long a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;

    public RawContactActionPreference(long j, int i, String str, int i2, String str2, String str3, String str4, long j2) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RawContactActionPreference) {
            RawContactActionPreference rawContactActionPreference = (RawContactActionPreference) obj;
            if (this.a == rawContactActionPreference.a && this.b == rawContactActionPreference.b && Objects.equals(this.c, rawContactActionPreference.c) && this.d == rawContactActionPreference.d && Objects.equals(this.e, rawContactActionPreference.e) && Objects.equals(this.f, rawContactActionPreference.f) && Objects.equals(this.g, rawContactActionPreference.g) && this.h == rawContactActionPreference.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, this.f, this.g, Long.valueOf(this.h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int q = oy.q(parcel, 20293);
        oy.w(parcel, 1, j);
        oy.v(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.v(parcel, 4, this.d);
        oy.I(parcel, 5, this.e);
        oy.I(parcel, 6, this.f);
        oy.I(parcel, 7, this.g);
        oy.w(parcel, 8, this.h);
        oy.r(parcel, q);
    }
}
