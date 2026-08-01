package i0;

import j1.h;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3149b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3150c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3151d;

    public C0178c(int i, int i2, String str, String str2) {
        this.f3148a = i;
        this.f3149b = i2;
        this.f3150c = str;
        this.f3151d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0178c c0178c = (C0178c) obj;
        h.e(c0178c, "other");
        int i = this.f3148a - c0178c.f3148a;
        return i == 0 ? this.f3149b - c0178c.f3149b : i;
    }
}
