package w0;

import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f41572n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41573u;

    /* renamed from: v, reason: collision with root package name */
    public final String f41574v;

    /* renamed from: w, reason: collision with root package name */
    public final String f41575w;

    public c(int i, int i4, String str, String str2) {
        this.f41572n = i;
        this.f41573u = i4;
        this.f41574v = str;
        this.f41575w = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        h.e(other, "other");
        int i = this.f41572n - other.f41572n;
        return i == 0 ? this.f41573u - other.f41573u : i;
    }
}
