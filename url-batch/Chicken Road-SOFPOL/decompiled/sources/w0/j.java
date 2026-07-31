package w0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends i6.h implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public long[] f7522f;

    /* renamed from: g, reason: collision with root package name */
    public int f7523g;

    /* renamed from: h, reason: collision with root package name */
    public int f7524h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7525j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f7526k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, g6.c cVar) {
        super(cVar);
        this.f7526k = kVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((j) l((g6.c) obj2, (x6.f) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        j jVar = new j(this.f7526k, cVar);
        jVar.f7525j = obj;
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bd -> B:7:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:20:0x0095). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        x6.f fVar;
        long[] jArr;
        int length;
        int i;
        x6.f fVar2;
        int i8;
        x6.f fVar3;
        int i9;
        k kVar = this.f7526k;
        long j7 = kVar.f7528d;
        long j8 = kVar.f7530f;
        long j9 = kVar.f7529e;
        int i10 = this.i;
        h6.a aVar = h6.a.f3204d;
        if (i10 == 0) {
            s6.a.K(obj);
            fVar = (x6.f) this.f7525j;
            jArr = kVar.f7531g;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j9 != 0) {
                fVar2 = fVar;
                i8 = 0;
                if (i8 >= 64) {
                }
            }
            if (j7 != 0) {
            }
            return c6.m.f1757a;
        }
        if (i10 == 1) {
            length = this.f7524h;
            int i11 = this.f7523g;
            jArr = this.f7522f;
            fVar = (x6.f) this.f7525j;
            s6.a.K(obj);
            i = i11 + 1;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i12 = this.f7523g;
                fVar3 = (x6.f) this.f7525j;
                s6.a.K(obj);
                i9 = i12 + 1;
                if (i9 < 64) {
                    if (((1 << i9) & j7) != 0) {
                        Long l3 = new Long(j8 + i9 + 64);
                        this.f7525j = fVar3;
                        this.f7522f = null;
                        this.f7523g = i9;
                        this.i = 3;
                        fVar3.b(l3, this);
                        return aVar;
                    }
                    i12 = i9;
                    i9 = i12 + 1;
                    if (i9 < 64) {
                    }
                }
                return c6.m.f1757a;
            }
            i8 = this.f7523g;
            fVar2 = (x6.f) this.f7525j;
            s6.a.K(obj);
            i8++;
            if (i8 >= 64) {
                fVar = fVar2;
                if (j7 != 0) {
                    fVar3 = fVar;
                    i9 = 0;
                    if (i9 < 64) {
                    }
                }
                return c6.m.f1757a;
            }
            if ((j9 & (1 << i8)) != 0) {
                Long l7 = new Long(j8 + i8);
                this.f7525j = fVar2;
                this.f7522f = null;
                this.f7523g = i8;
                this.i = 2;
                fVar2.b(l7, this);
                return aVar;
            }
            i8++;
            if (i8 >= 64) {
            }
        }
        if (i < length) {
            Long l8 = new Long(jArr[i]);
            this.f7525j = fVar;
            this.f7522f = jArr;
            this.f7523g = i;
            this.f7524h = length;
            this.i = 1;
            fVar.b(l8, this);
            return aVar;
        }
        if (j9 != 0) {
        }
        if (j7 != 0) {
        }
        return c6.m.f1757a;
    }
}
