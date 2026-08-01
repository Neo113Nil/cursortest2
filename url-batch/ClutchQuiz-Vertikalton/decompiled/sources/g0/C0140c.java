package g0;

import g1.f;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2551b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2552c;
    public final String d;

    public C0140c(int i, int i2, String str, String str2) {
        this.f2550a = i;
        this.f2551b = i2;
        this.f2552c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0140c c0140c = (C0140c) obj;
        f.e(c0140c, "other");
        int i = this.f2550a - c0140c.f2550a;
        return i == 0 ? this.f2551b - c0140c.f2551b : i;
    }
}
