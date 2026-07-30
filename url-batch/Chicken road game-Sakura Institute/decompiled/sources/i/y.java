package i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public z f4818g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f4819h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f4820i;

    /* renamed from: j, reason: collision with root package name */
    public int f4821j;

    /* renamed from: k, reason: collision with root package name */
    public int f4822k;

    /* renamed from: l, reason: collision with root package name */
    public int f4823l;

    /* renamed from: m, reason: collision with root package name */
    public int f4824m;

    /* renamed from: n, reason: collision with root package name */
    public long f4825n;

    /* renamed from: o, reason: collision with root package name */
    public int f4826o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4827p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b0 f4828q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f4829r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, z zVar, h6.d dVar) {
        super(2, dVar);
        this.f4828q = b0Var;
        this.f4829r = zVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        y yVar = new y(this.f4828q, this.f4829r, dVar);
        yVar.f4827p = obj;
        return yVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((y) create((y6.g) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:14:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:6:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006c -> B:5:0x0091). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y6.g gVar;
        b0 b0Var;
        long[] jArr;
        int length;
        z zVar;
        int i7;
        long j8;
        int i8 = this.f4826o;
        if (i8 == 0) {
            d6.a.e(obj);
            gVar = (y6.g) this.f4827p;
            b0Var = this.f4828q;
            jArr = b0Var.f4721a;
            length = jArr.length - 2;
            if (length >= 0) {
                zVar = this.f4829r;
                i7 = 0;
                j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i7 != length) {
                }
            }
            return d6.z.f2639a;
        }
        if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i9 = this.f4824m;
        int i10 = this.f4823l;
        long j9 = this.f4825n;
        int i11 = this.f4822k;
        int i12 = this.f4821j;
        long[] jArr2 = this.f4820i;
        b0 b0Var2 = this.f4819h;
        z zVar2 = this.f4818g;
        y6.g gVar2 = (y6.g) this.f4827p;
        d6.a.e(obj);
        j9 >>= 8;
        i9++;
        if (i9 < i10) {
            if (i10 == 8) {
                length = i12;
                jArr = jArr2;
                b0Var = b0Var2;
                gVar = gVar2;
                i7 = i11;
                zVar = zVar2;
                if (i7 != length) {
                    i7++;
                    j8 = jArr[i7];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        gVar2 = gVar;
                        i9 = 0;
                        b0Var2 = b0Var;
                        jArr2 = jArr;
                        i10 = 8 - ((~(i7 - length)) >>> 31);
                        zVar2 = zVar;
                        i11 = i7;
                        i12 = length;
                        j9 = j8;
                        if (i9 < i10) {
                            if ((255 & j9) < 128) {
                                int i13 = (i11 << 3) + i9;
                                zVar2.f4831g = i13;
                                Object obj2 = b0Var2.f4722b[i13];
                                this.f4827p = gVar2;
                                this.f4818g = zVar2;
                                this.f4819h = b0Var2;
                                this.f4820i = jArr2;
                                this.f4821j = i12;
                                this.f4822k = i11;
                                this.f4825n = j9;
                                this.f4823l = i10;
                                this.f4824m = i9;
                                this.f4826o = 1;
                                gVar2.b(obj2, this);
                                return i6.a.f4956f;
                            }
                            j9 >>= 8;
                            i9++;
                            if (i9 < i10) {
                            }
                        }
                    }
                    if (i7 != length) {
                    }
                }
            }
            return d6.z.f2639a;
        }
    }
}
