package K;

import I2.l;
import L1.z;
import R1.h;
import g2.C0411g;
import j.C0475A;

/* loaded from: classes.dex */
public final class e extends h implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2643e;

    /* renamed from: f, reason: collision with root package name */
    public long[] f2644f;

    /* renamed from: g, reason: collision with root package name */
    public int f2645g;

    /* renamed from: h, reason: collision with root package name */
    public int f2646h;

    /* renamed from: i, reason: collision with root package name */
    public int f2647i;

    /* renamed from: j, reason: collision with root package name */
    public int f2648j;

    /* renamed from: k, reason: collision with root package name */
    public long f2649k;

    /* renamed from: l, reason: collision with root package name */
    public int f2650l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2651m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f2652n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, P1.d dVar) {
        super(2, dVar);
        this.f2652n = fVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        e eVar = new e(this.f2652n, dVar);
        eVar.f2651m = obj;
        return eVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((e) create((C0411g) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x008a). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0411g c0411g;
        Object[] objArr;
        long[] jArr;
        int length;
        int i3;
        long j3;
        Q1.a aVar = Q1.a.f3113d;
        int i4 = this.f2650l;
        if (i4 == 0) {
            l.Q(obj);
            c0411g = (C0411g) this.f2651m;
            C0475A c0475a = this.f2652n.f2653d;
            objArr = c0475a.f5130b;
            jArr = c0475a.f5129a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = 0;
                j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i3 != length) {
                }
            }
            return z.f2729a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i5 = this.f2648j;
        int i6 = this.f2647i;
        long j4 = this.f2649k;
        i3 = this.f2646h;
        int i7 = this.f2645g;
        long[] jArr2 = this.f2644f;
        Object[] objArr2 = this.f2643e;
        C0411g c0411g2 = (C0411g) this.f2651m;
        l.Q(obj);
        j4 >>= 8;
        i5++;
        if (i5 < i6) {
            if (i6 == 8) {
                length = i7;
                jArr = jArr2;
                objArr = objArr2;
                c0411g = c0411g2;
                if (i3 != length) {
                    i3++;
                    j3 = jArr[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        c0411g2 = c0411g;
                        i5 = 0;
                        jArr2 = jArr;
                        i7 = length;
                        i6 = 8 - ((~(i3 - length)) >>> 31);
                        objArr2 = objArr;
                        j4 = j3;
                        if (i5 < i6) {
                            if ((255 & j4) < 128) {
                                Object obj2 = objArr2[(i3 << 3) + i5];
                                this.f2651m = c0411g2;
                                this.f2643e = objArr2;
                                this.f2644f = jArr2;
                                this.f2645g = i7;
                                this.f2646h = i3;
                                this.f2649k = j4;
                                this.f2647i = i6;
                                this.f2648j = i5;
                                this.f2650l = 1;
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
            return z.f2729a;
        }
    }
}
