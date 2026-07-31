package K;

import R1.y;
import X1.h;
import e2.InterfaceC0426e;
import j.C0519A;
import m2.C0657g;

/* loaded from: classes.dex */
public final class e extends h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3217f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f3218g;

    /* renamed from: h, reason: collision with root package name */
    public int f3219h;

    /* renamed from: i, reason: collision with root package name */
    public int f3220i;

    /* renamed from: j, reason: collision with root package name */
    public int f3221j;

    /* renamed from: k, reason: collision with root package name */
    public int f3222k;

    /* renamed from: l, reason: collision with root package name */
    public long f3223l;

    /* renamed from: m, reason: collision with root package name */
    public int f3224m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3225n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f3226o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, V1.d dVar) {
        super(2, dVar);
        this.f3226o = fVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((e) o((V1.d) obj2, (C0657g) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        e eVar = new e(this.f3226o, dVar);
        eVar.f3225n = obj;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x0088). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0657g c0657g;
        Object[] objArr;
        long[] jArr;
        int length;
        int i3;
        long j3;
        W1.a aVar = W1.a.f4608d;
        int i4 = this.f3224m;
        if (i4 == 0) {
            R1.a.e(obj);
            c0657g = (C0657g) this.f3225n;
            C0519A c0519a = this.f3226o.f3227d;
            objArr = c0519a.f6248b;
            jArr = c0519a.f6247a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = 0;
                j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i3 != length) {
                }
            }
            return y.f4171a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i5 = this.f3222k;
        int i6 = this.f3221j;
        long j4 = this.f3223l;
        i3 = this.f3220i;
        int i7 = this.f3219h;
        long[] jArr2 = this.f3218g;
        Object[] objArr2 = this.f3217f;
        C0657g c0657g2 = (C0657g) this.f3225n;
        R1.a.e(obj);
        j4 >>= 8;
        i5++;
        if (i5 < i6) {
            if (i6 == 8) {
                length = i7;
                jArr = jArr2;
                objArr = objArr2;
                c0657g = c0657g2;
                if (i3 != length) {
                    i3++;
                    j3 = jArr[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        c0657g2 = c0657g;
                        i5 = 0;
                        jArr2 = jArr;
                        i7 = length;
                        i6 = 8 - ((~(i3 - length)) >>> 31);
                        objArr2 = objArr;
                        j4 = j3;
                        if (i5 < i6) {
                            if ((255 & j4) < 128) {
                                Object obj2 = objArr2[(i3 << 3) + i5];
                                this.f3225n = c0657g2;
                                this.f3217f = objArr2;
                                this.f3218g = jArr2;
                                this.f3219h = i7;
                                this.f3220i = i3;
                                this.f3223l = j4;
                                this.f3221j = i6;
                                this.f3222k = i5;
                                this.f3224m = 1;
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
            return y.f4171a;
        }
    }
}
