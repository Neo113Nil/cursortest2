package j;

import g2.C0411g;

/* renamed from: j.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507y extends R1.h implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public O.c f5232e;

    /* renamed from: f, reason: collision with root package name */
    public C0475A f5233f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f5234g;

    /* renamed from: h, reason: collision with root package name */
    public int f5235h;

    /* renamed from: i, reason: collision with root package name */
    public int f5236i;

    /* renamed from: j, reason: collision with root package name */
    public int f5237j;

    /* renamed from: k, reason: collision with root package name */
    public int f5238k;

    /* renamed from: l, reason: collision with root package name */
    public long f5239l;

    /* renamed from: m, reason: collision with root package name */
    public int f5240m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5241n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0475A f5242o;
    public final /* synthetic */ O.c p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507y(C0475A c0475a, O.c cVar, P1.d dVar) {
        super(2, dVar);
        this.f5242o = c0475a;
        this.p = cVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0507y c0507y = new C0507y(this.f5242o, this.p, dVar);
        c0507y.f5241n = obj;
        return c0507y;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0507y) create((C0411g) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0093). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0411g c0411g;
        C0475A c0475a;
        long[] jArr;
        int length;
        O.c cVar;
        int i3;
        long j3;
        Q1.a aVar = Q1.a.f3113d;
        int i4 = this.f5240m;
        if (i4 == 0) {
            I2.l.Q(obj);
            c0411g = (C0411g) this.f5241n;
            c0475a = this.f5242o;
            jArr = c0475a.f5129a;
            length = jArr.length - 2;
            if (length >= 0) {
                cVar = this.p;
                i3 = 0;
                j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i3 != length) {
                }
            }
            return L1.z.f2729a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i5 = this.f5238k;
        int i6 = this.f5237j;
        long j4 = this.f5239l;
        int i7 = this.f5236i;
        int i8 = this.f5235h;
        long[] jArr2 = this.f5234g;
        C0475A c0475a2 = this.f5233f;
        O.c cVar2 = this.f5232e;
        C0411g c0411g2 = (C0411g) this.f5241n;
        I2.l.Q(obj);
        j4 >>= 8;
        i5++;
        if (i5 < i6) {
            if (i6 == 8) {
                length = i8;
                jArr = jArr2;
                c0475a = c0475a2;
                c0411g = c0411g2;
                i3 = i7;
                cVar = cVar2;
                if (i3 != length) {
                    i3++;
                    j3 = jArr[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        c0411g2 = c0411g;
                        i5 = 0;
                        c0475a2 = c0475a;
                        jArr2 = jArr;
                        i6 = 8 - ((~(i3 - length)) >>> 31);
                        cVar2 = cVar;
                        i7 = i3;
                        i8 = length;
                        j4 = j3;
                        if (i5 < i6) {
                            if ((255 & j4) < 128) {
                                int i9 = (i7 << 3) + i5;
                                cVar2.f2984f = i9;
                                Object obj2 = c0475a2.f5130b[i9];
                                this.f5241n = c0411g2;
                                this.f5232e = cVar2;
                                this.f5233f = c0475a2;
                                this.f5234g = jArr2;
                                this.f5235h = i8;
                                this.f5236i = i7;
                                this.f5239l = j4;
                                this.f5237j = i6;
                                this.f5238k = i5;
                                this.f5240m = 1;
                                c0411g2.b(obj2, this);
                                Q1.a aVar2 = Q1.a.f3113d;
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
            return L1.z.f2729a;
        }
    }
}
