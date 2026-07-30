package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class KL {

    /* renamed from: a, reason: collision with root package name */
    public final IK f25953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25954b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f25955c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25956d;

    public KL(IK ik, String str, Object[] objArr) {
        this.f25953a = ik;
        this.f25954b = str;
        this.f25955c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f25956d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i4 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f25956d = i | (charAt2 << i4);
                return;
            } else {
                i |= (charAt2 & 8191) << i4;
                i4 += 13;
                i9 = i10;
            }
        }
    }

    public final int a() {
        int i = this.f25956d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
