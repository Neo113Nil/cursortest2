package s;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 extends nd.h implements Function2 {
    public final /* synthetic */ de.e A;

    /* renamed from: e, reason: collision with root package name */
    public de.e f8325e;

    /* renamed from: i, reason: collision with root package name */
    public k0 f8326i;

    /* renamed from: r, reason: collision with root package name */
    public long[] f8327r;

    /* renamed from: s, reason: collision with root package name */
    public int f8328s;

    /* renamed from: t, reason: collision with root package name */
    public int f8329t;

    /* renamed from: u, reason: collision with root package name */
    public int f8330u;

    /* renamed from: v, reason: collision with root package name */
    public int f8331v;

    /* renamed from: w, reason: collision with root package name */
    public long f8332w;

    /* renamed from: x, reason: collision with root package name */
    public int f8333x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f8334y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k0 f8335z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, de.e eVar, ld.a aVar) {
        super(aVar);
        this.f8335z = k0Var;
        this.A = eVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        j0 j0Var = new j0(this.f8335z, this.A, aVar);
        j0Var.f8334y = obj;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((de.g) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006f -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        de.g gVar;
        k0 k0Var;
        long[] jArr;
        int length;
        de.e eVar;
        int i3;
        long j;
        md.a aVar = md.a.f6622d;
        int i10 = this.f8333x;
        if (i10 == 0) {
            cf.c.M(obj);
            gVar = (de.g) this.f8334y;
            k0Var = this.f8335z;
            jArr = k0Var.f8342e.f8319a;
            length = jArr.length - 2;
            if (length >= 0) {
                eVar = this.A;
                i3 = 0;
                j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i3 != length) {
                }
            }
            return Unit.f5554a;
        }
        if (i10 != 1) {
            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i11 = this.f8331v;
        int i12 = this.f8330u;
        long j3 = this.f8332w;
        int i13 = this.f8329t;
        int i14 = this.f8328s;
        long[] jArr2 = this.f8327r;
        k0 k0Var2 = this.f8326i;
        de.e eVar2 = this.f8325e;
        de.g gVar2 = (de.g) this.f8334y;
        cf.c.M(obj);
        j3 >>= 8;
        i11++;
        if (i11 < i12) {
            if (i12 == 8) {
                length = i14;
                jArr = jArr2;
                k0Var = k0Var2;
                gVar = gVar2;
                i3 = i13;
                eVar = eVar2;
                if (i3 != length) {
                    i3++;
                    j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        gVar2 = gVar;
                        i11 = 0;
                        k0Var2 = k0Var;
                        jArr2 = jArr;
                        i12 = 8 - ((~(i3 - length)) >>> 31);
                        eVar2 = eVar;
                        i13 = i3;
                        i14 = length;
                        j3 = j;
                        if (i11 < i12) {
                            if ((255 & j3) < 128) {
                                int i15 = (i13 << 3) + i11;
                                eVar2.f3713e = i15;
                                Object obj2 = k0Var2.f8342e.f8320b[i15];
                                this.f8334y = gVar2;
                                this.f8325e = eVar2;
                                this.f8326i = k0Var2;
                                this.f8327r = jArr2;
                                this.f8328s = i14;
                                this.f8329t = i13;
                                this.f8332w = j3;
                                this.f8330u = i12;
                                this.f8331v = i11;
                                this.f8333x = 1;
                                gVar2.a(obj2, this);
                                md.a aVar2 = md.a.f6622d;
                                return aVar;
                            }
                            j3 >>= 8;
                            i11++;
                            if (i11 < i12) {
                            }
                        }
                    }
                    if (i3 != length) {
                    }
                }
            }
            return Unit.f5554a;
        }
    }
}
