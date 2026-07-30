package j0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565c implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f5936d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5937e;

    /* renamed from: i, reason: collision with root package name */
    public final String f5938i;

    /* renamed from: l, reason: collision with root package name */
    public final String f5939l;

    public C0565c(String from, String to, int i2, int i5) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f5936d = i2;
        this.f5937e = i5;
        this.f5938i = from;
        this.f5939l = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0565c other = (C0565c) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i2 = this.f5936d - other.f5936d;
        return i2 == 0 ? this.f5937e - other.f5937e : i2;
    }
}
