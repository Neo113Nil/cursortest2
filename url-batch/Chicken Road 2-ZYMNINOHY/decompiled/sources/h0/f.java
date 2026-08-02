package h0;

import a.AbstractC0124a;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f9089a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f9090b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f9091c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9092d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9093e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9094f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9095g;

    /* renamed from: h, reason: collision with root package name */
    public final List f9096h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9097i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9098j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9099k;

    /* renamed from: l, reason: collision with root package name */
    public final I f9100l;

    /* renamed from: m, reason: collision with root package name */
    public final I f9101m;
    public final a0 n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final String f9102p;

    /* renamed from: q, reason: collision with root package name */
    public final String f9103q;

    /* renamed from: r, reason: collision with root package name */
    public final long f9104r;

    /* renamed from: s, reason: collision with root package name */
    public final long f9105s;

    /* renamed from: t, reason: collision with root package name */
    public final String f9106t;

    public f(String str, Uri uri, Uri uri2, long j4, long j5, long j6, long j7, ArrayList arrayList, boolean z, long j8, long j9, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z4, String str2, String str3, long j10, long j11, String str4) {
        AbstractC0124a.h((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f9089a = str;
        this.f9090b = uri;
        this.f9091c = uri2;
        this.f9092d = j4;
        this.f9093e = j5;
        this.f9094f = j6;
        this.f9095g = j7;
        this.f9096h = arrayList;
        this.f9097i = z;
        this.f9098j = j8;
        this.f9099k = j9;
        this.f9100l = I.k(arrayList2);
        this.f9101m = I.k(arrayList3);
        this.n = I.q(new B.c(5), arrayList4);
        this.o = z4;
        this.f9102p = str2;
        this.f9103q = str3;
        this.f9104r = j10;
        this.f9105s = j11;
        this.f9106t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9092d == fVar.f9092d && this.f9093e == fVar.f9093e && this.f9094f == fVar.f9094f && this.f9095g == fVar.f9095g && this.f9097i == fVar.f9097i && this.f9098j == fVar.f9098j && this.f9099k == fVar.f9099k && this.o == fVar.o && this.f9104r == fVar.f9104r && this.f9105s == fVar.f9105s && Objects.equals(this.f9089a, fVar.f9089a) && Objects.equals(this.f9090b, fVar.f9090b) && Objects.equals(this.f9091c, fVar.f9091c) && Objects.equals(this.f9096h, fVar.f9096h) && Objects.equals(this.f9100l, fVar.f9100l) && Objects.equals(this.f9101m, fVar.f9101m) && Objects.equals(this.n, fVar.n) && Objects.equals(this.f9102p, fVar.f9102p) && Objects.equals(this.f9103q, fVar.f9103q) && Objects.equals(this.f9106t, fVar.f9106t);
    }

    public final int hashCode() {
        return Objects.hash(this.f9089a, this.f9090b, this.f9091c, Long.valueOf(this.f9092d), Long.valueOf(this.f9093e), Long.valueOf(this.f9094f), Long.valueOf(this.f9095g), this.f9096h, Boolean.valueOf(this.f9097i), Long.valueOf(this.f9098j), Long.valueOf(this.f9099k), this.f9100l, this.f9101m, this.n, Boolean.valueOf(this.o), this.f9102p, this.f9103q, Long.valueOf(this.f9104r), Long.valueOf(this.f9105s), this.f9106t);
    }
}
