package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class gh {

    /* renamed from: d, reason: collision with root package name */
    public static final long f2344d;

    /* renamed from: e, reason: collision with root package name */
    public static final gh f2345e;

    /* renamed from: a, reason: collision with root package name */
    public final int f2346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2348c;

    static {
        long j = 0;
        for (int i3 = 0; i3 < 7; i3++) {
            j |= (i3 + 1) << ((int) ((" #(+,-0".charAt(i3) - ' ') * 3));
        }
        f2344d = j;
        f2345e = new gh(0, -1, -1);
    }

    public gh(int i3, int i10, int i11) {
        this.f2346a = i3;
        this.f2347b = i10;
        this.f2348c = i11;
    }

    public static int e(String str, int i3, int i10) {
        if (i3 == i10) {
            throw d0.b(i3 - 1, "missing precision", str);
        }
        int i11 = 0;
        for (int i12 = i3; i12 < i10; i12++) {
            char charAt = (char) (str.charAt(i12) - '0');
            if (charAt >= '\n') {
                throw d0.b(i12, "invalid precision character", str);
            }
            i11 = (i11 * 10) + charAt;
            if (i11 > 999999) {
                throw d0.a(i3, i10, "precision too large", str);
            }
        }
        if (i11 != 0) {
            return i11;
        }
        if (i10 == i3 + 1) {
            return 0;
        }
        throw d0.a(i3, i10, "invalid precision", str);
    }

    public final boolean a() {
        return this == f2345e;
    }

    public final boolean b(int i3, boolean z10) {
        int i10;
        if (a()) {
            return true;
        }
        int i11 = ~i3;
        int i12 = this.f2346a;
        if ((i11 & i12) != 0) {
            return false;
        }
        if ((!z10 && this.f2348c != -1) || (i12 & 9) == 9 || (i10 = i12 & 96) == 96) {
            return false;
        }
        return i10 == 0 || this.f2347b != -1;
    }

    public final boolean c() {
        return (this.f2346a & 128) != 0;
    }

    public final void d(StringBuilder sb2) {
        if (a()) {
            return;
        }
        int i3 = 0;
        while (true) {
            int i10 = this.f2346a & (-129);
            int i11 = 1 << i3;
            if (i11 > i10) {
                break;
            }
            if ((i10 & i11) != 0) {
                sb2.append(" #(+,-0".charAt(i3));
            }
            i3++;
        }
        int i12 = this.f2347b;
        if (i12 != -1) {
            sb2.append(i12);
        }
        int i13 = this.f2348c;
        if (i13 != -1) {
            sb2.append('.');
            sb2.append(i13);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gh) {
            gh ghVar = (gh) obj;
            if (ghVar.f2346a == this.f2346a && ghVar.f2347b == this.f2347b && ghVar.f2348c == this.f2348c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2346a * 31) + this.f2347b) * 31) + this.f2348c;
    }
}
