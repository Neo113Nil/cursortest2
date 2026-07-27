package i;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class z extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public M.c f6988i;

    /* renamed from: j, reason: collision with root package name */
    public C0661B f6989j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f6990k;

    /* renamed from: l, reason: collision with root package name */
    public int f6991l;

    /* renamed from: m, reason: collision with root package name */
    public int f6992m;

    /* renamed from: n, reason: collision with root package name */
    public int f6993n;

    /* renamed from: o, reason: collision with root package name */
    public int f6994o;

    /* renamed from: p, reason: collision with root package name */
    public long f6995p;

    /* renamed from: q, reason: collision with root package name */
    public int f6996q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6997r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0661B f6998s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ M.c f6999t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0661B c0661b, M.c cVar, C2.a aVar) {
        super(2, aVar);
        this.f6998s = c0661b;
        this.f6999t = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((z) j((C2.a) obj2, (T2.i) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        z zVar = new z(this.f6998s, this.f6999t, aVar);
        zVar.f6997r = obj;
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0093). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        T2.i iVar;
        C0661B c0661b;
        long[] jArr;
        int length;
        M.c cVar;
        int i2;
        long j4;
        D2.a aVar = D2.a.f2163d;
        int i4 = this.f6996q;
        if (i4 == 0) {
            AbstractC1343r.b(obj);
            iVar = (T2.i) this.f6997r;
            c0661b = this.f6998s;
            jArr = c0661b.f6884a;
            length = jArr.length - 2;
            if (length >= 0) {
                cVar = this.f6999t;
                i2 = 0;
                j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i2 != length) {
                }
            }
            return Unit.f7487a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i5 = this.f6994o;
        int i6 = this.f6993n;
        long j5 = this.f6995p;
        int i7 = this.f6992m;
        int i8 = this.f6991l;
        long[] jArr2 = this.f6990k;
        C0661B c0661b2 = this.f6989j;
        M.c cVar2 = this.f6988i;
        T2.i iVar2 = (T2.i) this.f6997r;
        AbstractC1343r.b(obj);
        j5 >>= 8;
        i5++;
        if (i5 < i6) {
            if (i6 == 8) {
                length = i8;
                jArr = jArr2;
                c0661b = c0661b2;
                iVar = iVar2;
                i2 = i7;
                cVar = cVar2;
                if (i2 != length) {
                    i2++;
                    j4 = jArr[i2];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        iVar2 = iVar;
                        i5 = 0;
                        c0661b2 = c0661b;
                        jArr2 = jArr;
                        i6 = 8 - ((~(i2 - length)) >>> 31);
                        cVar2 = cVar;
                        i7 = i2;
                        i8 = length;
                        j5 = j4;
                        if (i5 < i6) {
                            if ((255 & j5) < 128) {
                                int i9 = (i7 << 3) + i5;
                                cVar2.f3537i = i9;
                                Object obj2 = c0661b2.f6885b[i9];
                                this.f6997r = iVar2;
                                this.f6988i = cVar2;
                                this.f6989j = c0661b2;
                                this.f6990k = jArr2;
                                this.f6991l = i8;
                                this.f6992m = i7;
                                this.f6995p = j5;
                                this.f6993n = i6;
                                this.f6994o = i5;
                                this.f6996q = 1;
                                iVar2.b(obj2, this);
                                D2.a aVar2 = D2.a.f2163d;
                                return aVar;
                            }
                            j5 >>= 8;
                            i5++;
                            if (i5 < i6) {
                            }
                        }
                    }
                    if (i2 != length) {
                    }
                }
            }
            return Unit.f7487a;
        }
    }
}
