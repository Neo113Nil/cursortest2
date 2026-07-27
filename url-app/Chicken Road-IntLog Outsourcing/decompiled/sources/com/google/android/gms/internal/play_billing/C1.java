package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public final S0 f5033a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5034b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5035c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5036d;

    public C1(S0 s02, String str, Object[] objArr) {
        this.f5033a = s02;
        this.f5034b = str;
        this.f5035c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5036d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 < 55296) {
                this.f5036d = i2 | (charAt2 << i3);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i6 = i7;
            }
        }
    }

    public final S0 a() {
        return this.f5033a;
    }

    public final int b() {
        int i2 = this.f5036d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }

    public final String c() {
        return this.f5034b;
    }

    public final Object[] d() {
        return this.f5035c;
    }
}
