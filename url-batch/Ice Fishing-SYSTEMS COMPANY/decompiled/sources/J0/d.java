package J0;

import com.google.android.gms.internal.ads.CL;
import java.util.Set;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class d {
    public static final d i = new d(1, false, false, false, false, -1, -1, r7.r.f40360n);

    /* renamed from: a, reason: collision with root package name */
    public final int f1299a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1300b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1301c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1302d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1303e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1304f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1305g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f1306h;

    public d(int i4, boolean z8, boolean z9, boolean z10, boolean z11, long j9, long j10, Set contentUriTriggers) {
        CL.o(i4, "requiredNetworkType");
        kotlin.jvm.internal.h.e(contentUriTriggers, "contentUriTriggers");
        this.f1299a = i4;
        this.f1300b = z8;
        this.f1301c = z9;
        this.f1302d = z10;
        this.f1303e = z11;
        this.f1304f = j9;
        this.f1305g = j10;
        this.f1306h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1300b == dVar.f1300b && this.f1301c == dVar.f1301c && this.f1302d == dVar.f1302d && this.f1303e == dVar.f1303e && this.f1304f == dVar.f1304f && this.f1305g == dVar.f1305g && this.f1299a == dVar.f1299a) {
            return kotlin.jvm.internal.h.a(this.f1306h, dVar.f1306h);
        }
        return false;
    }

    public final int hashCode() {
        int d2 = ((((((((AbstractC5088e.d(this.f1299a) * 31) + (this.f1300b ? 1 : 0)) * 31) + (this.f1301c ? 1 : 0)) * 31) + (this.f1302d ? 1 : 0)) * 31) + (this.f1303e ? 1 : 0)) * 31;
        long j9 = this.f1304f;
        int i4 = (d2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f1305g;
        return this.f1306h.hashCode() + ((i4 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
