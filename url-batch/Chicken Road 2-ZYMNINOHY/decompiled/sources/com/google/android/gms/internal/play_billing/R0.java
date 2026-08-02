package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0320h0 f5904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5905b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5906c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5907d;

    public R0(AbstractC0320h0 abstractC0320h0, String str, Object[] objArr) {
        this.f5904a = abstractC0320h0;
        this.f5905b = str;
        this.f5906c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5907d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.f5907d = i4 | (charAt2 << i6);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    public final int a() {
        int i4 = this.f5907d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
