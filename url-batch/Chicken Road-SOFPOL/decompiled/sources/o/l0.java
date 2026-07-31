package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 extends i6.h implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public h0 f5499f;

    /* renamed from: g, reason: collision with root package name */
    public m0 f5500g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f5501h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f5502j;

    /* renamed from: k, reason: collision with root package name */
    public int f5503k;

    /* renamed from: l, reason: collision with root package name */
    public int f5504l;

    /* renamed from: m, reason: collision with root package name */
    public long f5505m;

    /* renamed from: n, reason: collision with root package name */
    public int f5506n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f5507o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m0 f5508p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h0 f5509q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, h0 h0Var, g6.c cVar) {
        super(cVar);
        this.f5508p = m0Var;
        this.f5509q = h0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((l0) l((g6.c) obj2, (x6.f) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        l0 l0Var = new l0(this.f5508p, this.f5509q, cVar);
        l0Var.f5507o = obj;
        return l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0095). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        x6.f fVar;
        m0 m0Var;
        long[] jArr;
        int length;
        h0 h0Var;
        int i;
        long j7;
        int i8 = this.f5506n;
        if (i8 == 0) {
            s6.a.K(obj);
            fVar = (x6.f) this.f5507o;
            m0Var = this.f5508p;
            jArr = m0Var.f5512e.f5489a;
            length = jArr.length - 2;
            if (length >= 0) {
                h0Var = this.f5509q;
                i = 0;
                j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return c6.m.f1757a;
        }
        if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i9 = this.f5504l;
        int i10 = this.f5503k;
        long j8 = this.f5505m;
        int i11 = this.f5502j;
        int i12 = this.i;
        long[] jArr2 = this.f5501h;
        m0 m0Var2 = this.f5500g;
        h0 h0Var2 = this.f5499f;
        x6.f fVar2 = (x6.f) this.f5507o;
        s6.a.K(obj);
        j8 >>= 8;
        i9++;
        if (i9 < i10) {
            if (i10 == 8) {
                length = i12;
                jArr = jArr2;
                m0Var = m0Var2;
                fVar = fVar2;
                i = i11;
                h0Var = h0Var2;
                if (i != length) {
                    i++;
                    j7 = jArr[i];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        fVar2 = fVar;
                        i9 = 0;
                        m0Var2 = m0Var;
                        jArr2 = jArr;
                        i10 = 8 - ((~(i - length)) >>> 31);
                        h0Var2 = h0Var;
                        i11 = i;
                        i12 = length;
                        j8 = j7;
                        if (i9 < i10) {
                            if ((255 & j8) < 128) {
                                int i13 = (i11 << 3) + i9;
                                h0Var2.f5475e = i13;
                                Object obj2 = m0Var2.f5512e.f5490b[i13];
                                this.f5507o = fVar2;
                                this.f5499f = h0Var2;
                                this.f5500g = m0Var2;
                                this.f5501h = jArr2;
                                this.i = i12;
                                this.f5502j = i11;
                                this.f5505m = j8;
                                this.f5503k = i10;
                                this.f5504l = i9;
                                this.f5506n = 1;
                                fVar2.b(obj2, this);
                                return h6.a.f3204d;
                            }
                            j8 >>= 8;
                            i9++;
                            if (i9 < i10) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return c6.m.f1757a;
        }
    }
}
