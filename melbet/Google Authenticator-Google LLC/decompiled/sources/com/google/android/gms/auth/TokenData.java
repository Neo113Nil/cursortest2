package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.aqr;
import defpackage.cri;
import defpackage.oy;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TokenData extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aqr(4);
    final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.a = i;
        oy.ar(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && Objects.equals(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && Objects.equals(this.f, tokenData.f) && Objects.equals(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.I(parcel, 2, this.b);
        oy.G(parcel, 3, this.c);
        oy.s(parcel, 4, this.d);
        oy.s(parcel, 5, this.e);
        oy.K(parcel, 6, this.f);
        oy.I(parcel, 7, this.g);
        oy.r(parcel, q);
    }
}
