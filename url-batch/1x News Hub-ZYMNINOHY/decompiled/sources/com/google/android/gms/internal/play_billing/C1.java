package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public final S0 f2717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2718b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2719c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2720d;

    public C1(S0 s02, String str, Object[] objArr) {
        this.f2717a = s02;
        this.f2718b = str;
        this.f2719c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2720d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.f2720d = i3 | (charAt2 << i4);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i5 = i6;
            }
        }
    }

    public final int a() {
        int i3 = this.f2720d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
