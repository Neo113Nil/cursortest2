package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public abstract class Sx {

    /* renamed from: h, reason: collision with root package name */
    public static final String f27648h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f27649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27651c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27652d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27653e;

    /* renamed from: f, reason: collision with root package name */
    public final C2593Hm f27654f;

    /* renamed from: g, reason: collision with root package name */
    public final Rx f27655g;

    public Sx(Context context, String str, String str2, String str3) {
        if (C2593Hm.f25414w == null) {
            C2593Hm.f25414w = new C2593Hm(context);
        }
        this.f27654f = C2593Hm.f25414w;
        this.f27655g = Rx.g(context);
        this.f27649a = str;
        this.f27650b = str.concat("_3p");
        this.f27651c = str2;
        this.f27652d = str2.concat("_3p");
        this.f27653e = str3;
    }

    public final C3288h1 a(String str, long j9, String str2, boolean z8) {
        String str3 = this.f27650b;
        C2593Hm c2593Hm = this.f27654f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f27648h)) {
                    String string = ((SharedPreferences) c2593Hm.f25416u).getString(str3, null);
                    String string2 = ((SharedPreferences) c2593Hm.f25416u).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null && !string.equals(e(str, str2, string2))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C3288h1(5);
        }
        boolean z9 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f27653e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str4 = this.f27651c;
        String str5 = this.f27652d;
        long j10 = ((SharedPreferences) c2593Hm.f25416u).getLong(z9 ? str5 : str4, -1L);
        if (j10 != -1) {
            if (currentTimeMillis < j10) {
                c2593Hm.j(Long.valueOf(currentTimeMillis), z9 ? str5 : str4);
            } else if (currentTimeMillis >= j10 + j9) {
                return b(str, str2);
            }
        }
        if (!z9) {
            str3 = this.f27649a;
        }
        String string3 = ((SharedPreferences) c2593Hm.f25416u).getString(str3, null);
        if (string3 == null && !z8) {
            return b(str, str2);
        }
        if (z9) {
            str4 = str5;
        }
        return new C3288h1(string3, ((SharedPreferences) c2593Hm.f25416u).getLong(str4, -1L), 5);
    }

    public final C3288h1 b(String str, String str2) {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f27654f.j(uuid, "paid_3p_hash_key");
        return d(e(str, str2, uuid), true);
    }

    public final void c(boolean z8) {
        String str = z8 ? this.f27652d : this.f27651c;
        C2593Hm c2593Hm = this.f27654f;
        c2593Hm.w(str);
        c2593Hm.w(z8 ? this.f27650b : this.f27649a);
    }

    public final C3288h1 d(String str, boolean z8) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f27653e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z8 ? this.f27652d : this.f27651c;
        Long valueOf = Long.valueOf(currentTimeMillis);
        C2593Hm c2593Hm = this.f27654f;
        c2593Hm.j(valueOf, str2);
        c2593Hm.j(str, z8 ? this.f27650b : this.f27649a);
        return new C3288h1(str, currentTimeMillis, 5);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(D.y.o(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        int length = str4.length();
        String str5 = str3 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder(str5.length() + length + 120);
        AbstractC5051n.j(sb, this.f27653e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb.append(str5);
        throw new IllegalArgumentException(sb.toString());
    }
}
