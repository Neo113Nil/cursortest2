package j;

import e2.InterfaceC0426e;
import m2.C0657g;

/* renamed from: j.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551y extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public O.c f6350f;

    /* renamed from: g, reason: collision with root package name */
    public C0519A f6351g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f6352h;

    /* renamed from: i, reason: collision with root package name */
    public int f6353i;

    /* renamed from: j, reason: collision with root package name */
    public int f6354j;

    /* renamed from: k, reason: collision with root package name */
    public int f6355k;

    /* renamed from: l, reason: collision with root package name */
    public int f6356l;

    /* renamed from: m, reason: collision with root package name */
    public long f6357m;

    /* renamed from: n, reason: collision with root package name */
    public int f6358n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f6359o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0519A f6360p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ O.c f6361q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0551y(C0519A c0519a, O.c cVar, V1.d dVar) {
        super(2, dVar);
        this.f6360p = c0519a;
        this.f6361q = cVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0551y) o((V1.d) obj2, (C0657g) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0551y c0551y = new C0551y(this.f6360p, this.f6361q, dVar);
        c0551y.f6359o = obj;
        return c0551y;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0091). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0657g c0657g;
        C0519A c0519a;
        long[] jArr;
        int length;
        O.c cVar;
        int i3;
        long j3;
        W1.a aVar = W1.a.f4608d;
        int i4 = this.f6358n;
        if (i4 == 0) {
            R1.a.e(obj);
            c0657g = (C0657g) this.f6359o;
            c0519a = this.f6360p;
            jArr = c0519a.f6247a;
            length = jArr.length - 2;
            if (length >= 0) {
                cVar = this.f6361q;
                i3 = 0;
                j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i3 != length) {
                }
            }
            return R1.y.f4171a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i5 = this.f6356l;
        int i6 = this.f6355k;
        long j4 = this.f6357m;
        int i7 = this.f6354j;
        int i8 = this.f6353i;
        long[] jArr2 = this.f6352h;
        C0519A c0519a2 = this.f6351g;
        O.c cVar2 = this.f6350f;
        C0657g c0657g2 = (C0657g) this.f6359o;
        R1.a.e(obj);
        j4 >>= 8;
        i5++;
        if (i5 < i6) {
            if (i6 == 8) {
                length = i8;
                jArr = jArr2;
                c0519a = c0519a2;
                c0657g = c0657g2;
                i3 = i7;
                cVar = cVar2;
                if (i3 != length) {
                    i3++;
                    j3 = jArr[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        c0657g2 = c0657g;
                        i5 = 0;
                        c0519a2 = c0519a;
                        jArr2 = jArr;
                        i6 = 8 - ((~(i3 - length)) >>> 31);
                        cVar2 = cVar;
                        i7 = i3;
                        i8 = length;
                        j4 = j3;
                        if (i5 < i6) {
                            if ((255 & j4) < 128) {
                                int i9 = (i7 << 3) + i5;
                                cVar2.f3722e = i9;
                                Object obj2 = c0519a2.f6248b[i9];
                                this.f6359o = c0657g2;
                                this.f6350f = cVar2;
                                this.f6351g = c0519a2;
                                this.f6352h = jArr2;
                                this.f6353i = i8;
                                this.f6354j = i7;
                                this.f6357m = j4;
                                this.f6355k = i6;
                                this.f6356l = i5;
                                this.f6358n = 1;
                                c0657g2.b(obj2, this);
                                return aVar;
                            }
                            j4 >>= 8;
                            i5++;
                            if (i5 < i6) {
                            }
                        }
                    }
                    if (i3 != length) {
                    }
                }
            }
            return R1.y.f4171a;
        }
    }
}
