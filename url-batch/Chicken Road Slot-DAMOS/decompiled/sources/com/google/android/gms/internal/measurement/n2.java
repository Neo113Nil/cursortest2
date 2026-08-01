package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f2559a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2560b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2561c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2562d;

    public n2(o0 o0Var, String str, Object[] objArr) {
        this.f2559a = o0Var;
        this.f2560b = str;
        this.f2561c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2562d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f2562d = i3 | (charAt2 << i11);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i3 = this.f2562d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
