package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckr extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(2);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public ckr(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ckr) {
            ckr ckrVar = (ckr) obj;
            if (Objects.equals(this.a, ckrVar.a) && this.b == ckrVar.b && this.c == ckrVar.c && Objects.equals(this.f, ckrVar.f) && Objects.equals(this.d, ckrVar.d) && this.e == ckrVar.e && this.g == ckrVar.g && this.h == ckrVar.h && Objects.equals(this.i, ckrVar.i) && this.j == ckrVar.j && this.k == ckrVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.v(parcel, 3, this.b);
        oy.v(parcel, 4, this.c);
        oy.I(parcel, 5, this.d);
        oy.s(parcel, 7, this.e);
        oy.I(parcel, 8, this.f);
        oy.s(parcel, 9, this.g);
        oy.v(parcel, 10, this.h);
        oy.E(parcel, 11, this.i);
        oy.s(parcel, 12, this.j);
        oy.v(parcel, 13, this.k);
        oy.r(parcel, q);
    }
}
