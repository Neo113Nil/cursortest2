package I;

import E2.i;
import i.C0661B;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class e extends i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public Object[] f3333i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f3334j;

    /* renamed from: k, reason: collision with root package name */
    public int f3335k;

    /* renamed from: l, reason: collision with root package name */
    public int f3336l;

    /* renamed from: m, reason: collision with root package name */
    public int f3337m;

    /* renamed from: n, reason: collision with root package name */
    public int f3338n;

    /* renamed from: o, reason: collision with root package name */
    public long f3339o;

    /* renamed from: p, reason: collision with root package name */
    public int f3340p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f3341q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f3342r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, C2.a aVar) {
        super(2, aVar);
        this.f3342r = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((e) j((C2.a) obj2, (T2.i) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        e eVar = new e(this.f3342r, aVar);
        eVar.f3341q = obj;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x008a). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        T2.i iVar;
        Object[] objArr;
        long[] jArr;
        int length;
        int i2;
        long j4;
        D2.a aVar = D2.a.f2163d;
        int i4 = this.f3340p;
        if (i4 == 0) {
            AbstractC1343r.b(obj);
            iVar = (T2.i) this.f3341q;
            C0661B c0661b = this.f3342r.f3343d;
            objArr = c0661b.f6885b;
            jArr = c0661b.f6884a;
            length = jArr.length - 2;
            if (length >= 0) {
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
        int i5 = this.f3338n;
        int i6 = this.f3337m;
        long j5 = this.f3339o;
        i2 = this.f3336l;
        int i7 = this.f3335k;
        long[] jArr2 = this.f3334j;
        Object[] objArr2 = this.f3333i;
        T2.i iVar2 = (T2.i) this.f3341q;
        AbstractC1343r.b(obj);
        j5 >>= 8;
        i5++;
        if (i5 < i6) {
            if (i6 == 8) {
                length = i7;
                jArr = jArr2;
                objArr = objArr2;
                iVar = iVar2;
                if (i2 != length) {
                    i2++;
                    j4 = jArr[i2];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        iVar2 = iVar;
                        i5 = 0;
                        jArr2 = jArr;
                        i7 = length;
                        i6 = 8 - ((~(i2 - length)) >>> 31);
                        objArr2 = objArr;
                        j5 = j4;
                        if (i5 < i6) {
                            if ((255 & j5) < 128) {
                                Object obj2 = objArr2[(i2 << 3) + i5];
                                this.f3341q = iVar2;
                                this.f3333i = objArr2;
                                this.f3334j = jArr2;
                                this.f3335k = i7;
                                this.f3336l = i2;
                                this.f3339o = j5;
                                this.f3337m = i6;
                                this.f3338n = i5;
                                this.f3340p = 1;
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
