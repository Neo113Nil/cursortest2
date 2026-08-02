package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpc extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(2);
    public static final bpa a = bpa.SHA1;
    private static final Duration m = Duration.ofDays(10);
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final int i;
    public final long j;
    public final boolean k;
    public final Long l;

    public bpc(String str, String str2, String str3, String str4, Integer num, String str5, String str6, int i, long j, boolean z, Long l) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
        this.h = str6;
        this.i = i;
        this.j = j;
        this.k = z;
        this.l = l;
    }

    public static bpc c(jjq jjqVar, Long l, long j) {
        jkd a2 = jkd.a();
        bmv bmvVar = bmv.a;
        jju f = jjqVar.f();
        jkp w = jkp.w(bmvVar, f, a2);
        f.D(0);
        jkp.N(w);
        return d((bmv) w, l, j);
    }

    public static bpc d(bmv bmvVar, Long l, long j) {
        String str;
        bpa bpaVar;
        int x = a.x(bmvVar.h);
        if (x == 0) {
            x = 1;
        }
        int i = bpt.a;
        if (x == 2) {
            str = "hotp";
        } else {
            if (x != 3) {
                throw new bps("Could not parse a migration otp type");
            }
            str = "totp";
        }
        Integer valueOf = str.equals("totp") ? null : Integer.valueOf((int) bmvVar.i);
        String str2 = bmvVar.e.isEmpty() ? null : bmvVar.e;
        bpb bpbVar = new bpb();
        bpbVar.e(bmvVar.d);
        bpbVar.a = str2;
        bpbVar.g(hpx.f.g(bmvVar.c.x()));
        bpbVar.f(str);
        bpbVar.b = valueOf;
        bpbVar.h(j);
        bpbVar.d(false);
        int A = a.A(bmvVar.f);
        if (A == 0) {
            A = 1;
        }
        bpa bpaVar2 = bpa.SHA1;
        int i2 = A - 1;
        if (i2 == 1) {
            bpaVar = bpa.SHA1;
        } else if (i2 == 2) {
            bpaVar = bpa.SHA256;
        } else {
            if (i2 != 3) {
                throw new boz("Could not parse algorithm during migration");
            }
            bpaVar = bpa.SHA512;
        }
        bpbVar.b(bpaVar.d);
        int y = a.y(bmvVar.g);
        int i3 = (y != 0 ? y : 1) - 1;
        bpbVar.c(i3 != 2 ? i3 != 3 ? 6 : 7 : 8);
        bpbVar.i(bmvVar.j);
        bpbVar.c = l;
        return bpbVar.a();
    }

    public final bmv a() {
        jkj k = bmv.a.k();
        if (!k.b.M()) {
            k.t();
        }
        String str = this.b;
        bmv bmvVar = (bmv) k.b;
        str.getClass();
        int i = 2;
        bmvVar.b |= 2;
        bmvVar.d = str;
        jjq r = jjq.r(hpx.f.h(this.d));
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        bmv bmvVar2 = (bmv) jkpVar;
        r.getClass();
        bmvVar2.b |= 1;
        bmvVar2.c = r;
        String str2 = this.g;
        if (!jkpVar.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        bmv bmvVar3 = (bmv) jkpVar2;
        str2.getClass();
        bmvVar3.b |= 128;
        bmvVar3.j = str2;
        int i2 = this.i;
        int i3 = i2 != 7 ? i2 != 8 ? 2 : 3 : 4;
        if (!jkpVar2.M()) {
            k.t();
        }
        bmv bmvVar4 = (bmv) k.b;
        bmvVar4.g = i3 - 1;
        bmvVar4.b |= 16;
        int i4 = bpa.a(this.h).e;
        if (!k.b.M()) {
            k.t();
        }
        bmv bmvVar5 = (bmv) k.b;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        bmvVar5.f = i5;
        bmvVar5.b |= 8;
        String str3 = this.e;
        int i6 = bpt.a;
        if (!str3.equals("hotp")) {
            if (!str3.equals("totp")) {
                throw new bps("Could not create a migration otp type");
            }
            i = 3;
        }
        if (!k.b.M()) {
            k.t();
        }
        bmv bmvVar6 = (bmv) k.b;
        bmvVar6.h = i - 1;
        bmvVar6.b |= 32;
        if (str3.equals("hotp")) {
            long intValue = this.f.intValue();
            if (!k.b.M()) {
                k.t();
            }
            bmv bmvVar7 = (bmv) k.b;
            bmvVar7.b |= 64;
            bmvVar7.i = intValue;
        }
        String str4 = this.c;
        if (!TextUtils.isEmpty(str4)) {
            if (!k.b.M()) {
                k.t();
            }
            bmv bmvVar8 = (bmv) k.b;
            str4.getClass();
            bmvVar8.b |= 4;
            bmvVar8.e = str4;
        }
        return (bmv) k.q();
    }

    public final bpb b() {
        bpb bpbVar = new bpb();
        bpbVar.e(this.b);
        bpbVar.a = this.c;
        bpbVar.g(this.d);
        bpbVar.f(this.e);
        bpbVar.b = this.f;
        bpbVar.h(this.j);
        bpbVar.d(this.k);
        bpbVar.b(this.h);
        bpbVar.c(this.i);
        bpbVar.i(this.g);
        bpbVar.c = this.l;
        return bpbVar;
    }

    public final String e() {
        String upperCase = this.d.replaceAll("\\s+", "").toUpperCase(Locale.US);
        String lowerCase = this.b.toLowerCase(Locale.US);
        String str = this.c;
        return upperCase + "|" + lowerCase + "|" + (str != null ? str.toLowerCase(Locale.US) : "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpc)) {
            return false;
        }
        bpc bpcVar = (bpc) obj;
        return this.i == bpcVar.i && this.j == bpcVar.j && this.k == bpcVar.k && Objects.equals(this.b, bpcVar.b) && Objects.equals(this.c, bpcVar.c) && Objects.equals(this.d, bpcVar.d) && Objects.equals(this.e, bpcVar.e) && Objects.equals(this.f, bpcVar.f) && Objects.equals(this.g, bpcVar.g) && Objects.equals(this.h, bpcVar.h) && Objects.equals(this.l, bpcVar.l);
    }

    public final String f() {
        String str = this.c;
        String str2 = this.b;
        if (str == null) {
            return str2;
        }
        return str + ": " + str2;
    }

    public final boolean g() {
        return this.l != null;
    }

    public final boolean h(long j) {
        return this.k && j - this.j > m.toMillis();
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.d, this.e, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.I(parcel, 2, this.c);
        oy.I(parcel, 3, this.d);
        oy.I(parcel, 4, this.e);
        oy.E(parcel, 5, this.f);
        oy.I(parcel, 6, this.g);
        oy.I(parcel, 7, this.h);
        oy.v(parcel, 8, this.i);
        oy.w(parcel, 9, this.j);
        oy.s(parcel, 10, this.k);
        oy.G(parcel, 11, this.l);
        oy.r(parcel, q);
    }
}
