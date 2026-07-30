package i0;

import d6.z;
import i.b0;
import j6.h;
import y6.g;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public Object[] f4843g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f4844h;

    /* renamed from: i, reason: collision with root package name */
    public int f4845i;

    /* renamed from: j, reason: collision with root package name */
    public int f4846j;

    /* renamed from: k, reason: collision with root package name */
    public int f4847k;

    /* renamed from: l, reason: collision with root package name */
    public int f4848l;

    /* renamed from: m, reason: collision with root package name */
    public long f4849m;

    /* renamed from: n, reason: collision with root package name */
    public int f4850n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4851o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f f4852p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h6.d dVar) {
        super(2, dVar);
        this.f4852p = fVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        e eVar = new e(this.f4852p, dVar);
        eVar.f4851o = obj;
        return eVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((e) create((g) obj, (h6.d) obj2)).invokeSuspend(z.f2639a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:6:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0069 -> B:5:0x0088). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        Object[] objArr;
        long[] jArr;
        int length;
        int i7;
        long j8;
        int i8 = this.f4850n;
        if (i8 == 0) {
            d6.a.e(obj);
            gVar = (g) this.f4851o;
            b0 b0Var = this.f4852p.f4853f;
            objArr = b0Var.f4722b;
            jArr = b0Var.f4721a;
            length = jArr.length - 2;
            if (length >= 0) {
                i7 = 0;
                j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i7 != length) {
                }
            }
            return z.f2639a;
        }
        if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i9 = this.f4848l;
        int i10 = this.f4847k;
        long j9 = this.f4849m;
        i7 = this.f4846j;
        int i11 = this.f4845i;
        long[] jArr2 = this.f4844h;
        Object[] objArr2 = this.f4843g;
        g gVar2 = (g) this.f4851o;
        d6.a.e(obj);
        j9 >>= 8;
        i9++;
        if (i9 < i10) {
            if (i10 == 8) {
                length = i11;
                jArr = jArr2;
                objArr = objArr2;
                gVar = gVar2;
                if (i7 != length) {
                    i7++;
                    j8 = jArr[i7];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        gVar2 = gVar;
                        i9 = 0;
                        jArr2 = jArr;
                        i11 = length;
                        i10 = 8 - ((~(i7 - length)) >>> 31);
                        objArr2 = objArr;
                        j9 = j8;
                        if (i9 < i10) {
                            if ((255 & j9) < 128) {
                                Object obj2 = objArr2[(i7 << 3) + i9];
                                this.f4851o = gVar2;
                                this.f4843g = objArr2;
                                this.f4844h = jArr2;
                                this.f4845i = i11;
                                this.f4846j = i7;
                                this.f4849m = j9;
                                this.f4847k = i10;
                                this.f4848l = i9;
                                this.f4850n = 1;
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
            return z.f2639a;
        }
    }
}
