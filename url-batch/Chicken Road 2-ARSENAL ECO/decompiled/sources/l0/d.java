package l0;

import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f5254i = new d(1, false, false, false, false, -1, -1, l5.r.f5305f);

    /* renamed from: a, reason: collision with root package name */
    public final int f5255a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5256b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5257c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5258d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5259e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5260f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5261g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f5262h;

    public d(int i7, boolean z5, boolean z6, boolean z7, boolean z8, long j4, long j7, Set contentUriTriggers) {
        W4.o.f("requiredNetworkType", i7);
        kotlin.jvm.internal.i.e(contentUriTriggers, "contentUriTriggers");
        this.f5255a = i7;
        this.f5256b = z5;
        this.f5257c = z6;
        this.f5258d = z7;
        this.f5259e = z8;
        this.f5260f = j4;
        this.f5261g = j7;
        this.f5262h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f5256b == dVar.f5256b && this.f5257c == dVar.f5257c && this.f5258d == dVar.f5258d && this.f5259e == dVar.f5259e && this.f5260f == dVar.f5260f && this.f5261g == dVar.f5261g && this.f5255a == dVar.f5255a) {
            return kotlin.jvm.internal.i.a(this.f5262h, dVar.f5262h);
        }
        return false;
    }

    public final int hashCode() {
        int c7 = ((((((((N.p.c(this.f5255a) * 31) + (this.f5256b ? 1 : 0)) * 31) + (this.f5257c ? 1 : 0)) * 31) + (this.f5258d ? 1 : 0)) * 31) + (this.f5259e ? 1 : 0)) * 31;
        long j4 = this.f5260f;
        int i7 = (c7 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j7 = this.f5261g;
        return this.f5262h.hashCode() + ((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }
}
