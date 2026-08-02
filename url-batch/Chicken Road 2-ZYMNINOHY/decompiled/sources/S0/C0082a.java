package S0;

import E.AbstractC0005f;
import W.J;
import y0.C;

/* renamed from: S0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082a implements C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2392a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f2393b;

    /* renamed from: c, reason: collision with root package name */
    public long f2394c;

    /* renamed from: d, reason: collision with root package name */
    public int f2395d;

    public /* synthetic */ C0082a() {
    }

    public String toString() {
        switch (this.f2392a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(J.X(this.f2393b));
                sb.append(", size=");
                sb.append(this.f2394c);
                sb.append(", minHeaderSize=");
                return AbstractC0005f.o(sb, this.f2395d, "}");
            default:
                return super.toString();
        }
    }

    public C0082a(long j4, int i4, int i5) {
        this.f2393b = i4;
        this.f2394c = j4;
        this.f2395d = i5;
    }
}
