package M6;

import J6.k;
import J6.l;
import J6.o;
import L6.m;
import h6.i;
import j6.C4603e;

/* loaded from: classes2.dex */
public final class b extends l {

    /* renamed from: b, reason: collision with root package name */
    public final long f1898b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1899c;

    /* renamed from: d, reason: collision with root package name */
    public final J6.a f1900d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1901e;

    /* renamed from: f, reason: collision with root package name */
    public final l f1902f;

    /* renamed from: g, reason: collision with root package name */
    public final m[] f1903g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1904h;
    public final C4603e i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1905j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1906k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f1907l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(long j9, long j10, J6.a aVar, byte[] bArr, l lVar, m[] mVarArr, int i, C4603e c4603e, String str, String str2, byte[] bArr2) {
        super(k.b(R6.a.f2808k, bArr2) + (str2 != null ? R6.a.f2807j.f1402c + k.f1436b : 0) + (str == null ? 0 : R6.a.i.f1402c + k.f1435a) + r8 + r16);
        int i4;
        int i9;
        int i10;
        int c4 = k.c(R6.a.f2800b, j10) + k.c(R6.a.f2799a, j9);
        J6.b bVar = R6.a.f2801c;
        int i11 = aVar.f1398a;
        if (i11 == 0) {
            i9 = 0;
        } else {
            int i12 = bVar.f1402c;
            if (i11 >= 0) {
                i4 = J6.d.b(i11);
            } else {
                int i13 = J6.d.f1408e;
                i4 = 10;
            }
            i9 = i12 + i4;
        }
        int b9 = k.b(R6.a.f2802d, bArr) + i9 + c4;
        int b10 = (i == 0 ? 0 : J6.d.b(i) + R6.a.f2805g.f1402c) + k.e(R6.a.f2804f, mVarArr) + (lVar != null ? b9 + k.d(R6.a.f2803e, lVar) : b9);
        J6.b bVar2 = R6.a.f2806h;
        if ((c4603e.f38575b & 255) == 0) {
            i10 = 0;
        } else {
            int i14 = bVar2.f1402c;
            int i15 = J6.d.f1408e;
            i10 = i14 + 4;
        }
        this.f1898b = j9;
        this.f1899c = j10;
        this.f1905j = str;
        this.f1906k = str2;
        this.i = c4603e;
        this.f1900d = aVar;
        this.f1901e = bArr;
        this.f1902f = lVar;
        this.f1903g = mVarArr;
        this.f1904h = i;
        this.f1907l = bArr2;
    }

    public static J6.a d(i iVar) {
        switch (iVar) {
            case UNDEFINED_SEVERITY_NUMBER:
                return R6.d.f2815a;
            case TRACE:
                return R6.d.f2816b;
            case TRACE2:
                return R6.d.f2817c;
            case TRACE3:
                return R6.d.f2818d;
            case TRACE4:
                return R6.d.f2819e;
            case DEBUG:
                return R6.d.f2820f;
            case DEBUG2:
                return R6.d.f2821g;
            case DEBUG3:
                return R6.d.f2822h;
            case DEBUG4:
                return R6.d.i;
            case INFO:
                return R6.d.f2823j;
            case INFO2:
                return R6.d.f2824k;
            case INFO3:
                return R6.d.f2825l;
            case INFO4:
                return R6.d.f2826m;
            case WARN:
                return R6.d.f2827n;
            case WARN2:
                return R6.d.f2828o;
            case ERROR3:
                return R6.d.f2829p;
            case ERROR4:
                return R6.d.f2830q;
            case ERROR:
                return R6.d.f2831r;
            case ERROR4:
                return R6.d.f2832s;
            case ERROR3:
                return R6.d.f2833t;
            case ERROR4:
                return R6.d.f2834u;
            case FATAL:
                return R6.d.f2835v;
            case FATAL2:
                return R6.d.f2836w;
            case FATAL3:
                return R6.d.f2837x;
            case FATAL4:
                return R6.d.f2838y;
            default:
                return R6.d.f2815a;
        }
    }

    @Override // J6.f
    public final void c(o oVar) {
        J6.b bVar = R6.a.f2799a;
        long j9 = this.f1898b;
        if (j9 != 0) {
            oVar.F(bVar, j9);
        }
        J6.b bVar2 = R6.a.f2800b;
        long j10 = this.f1899c;
        if (j10 != 0) {
            oVar.F(bVar2, j10);
        }
        J6.b bVar3 = R6.a.f2801c;
        J6.a aVar = this.f1900d;
        if (aVar.f1398a != 0) {
            oVar.D(bVar3, aVar);
        }
        oVar.n(R6.a.f2802d, this.f1901e);
        l lVar = this.f1902f;
        if (lVar != null) {
            oVar.a(R6.a.f2803e, lVar);
        }
        oVar.j(R6.a.f2804f, this.f1903g);
        J6.b bVar4 = R6.a.f2805g;
        int i = this.f1904h;
        if (i != 0) {
            oVar.b0(bVar4, i);
        }
        J6.b bVar5 = R6.a.f2806h;
        int i4 = this.i.f38575b & 255;
        if (i4 != 0) {
            oVar.E(bVar5, i4);
        }
        J6.b bVar6 = R6.a.i;
        String str = this.f1905j;
        if (str != null) {
            oVar.Z(bVar6, str);
        }
        J6.b bVar7 = R6.a.f2807j;
        String str2 = this.f1906k;
        if (str2 != null) {
            oVar.I(bVar7, str2);
        }
        oVar.n(R6.a.f2808k, this.f1907l);
    }
}
