package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyw extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(13);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Account d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final boolean i;

    public cyw(boolean z, boolean z2, boolean z3, Account account, boolean z4, boolean z5, String str, List list, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = account;
        this.e = z4;
        this.f = z5;
        this.g = str;
        this.h = list;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyw)) {
            return false;
        }
        cyw cywVar = (cyw) obj;
        return this.a == cywVar.a && this.b == cywVar.b && this.c == cywVar.c && this.e == cywVar.e && this.f == cywVar.f && this.i == cywVar.i && Objects.equals(this.d, cywVar.d) && Objects.equals(this.g, cywVar.g) && Objects.equals(this.h, cywVar.h);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.i), Boolean.valueOf(this.f), this.g, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 1, z);
        oy.s(parcel, 2, this.b);
        oy.s(parcel, 3, this.c);
        oy.H(parcel, 4, this.d, i);
        oy.s(parcel, 5, this.e);
        oy.s(parcel, 6, this.f);
        oy.I(parcel, 7, this.g);
        oy.M(parcel, 8, this.h);
        oy.s(parcel, 9, this.i);
        oy.r(parcel, q);
    }
}
