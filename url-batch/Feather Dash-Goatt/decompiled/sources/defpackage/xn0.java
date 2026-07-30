package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xn0 extends h31 implements Function2 {
    public n40 g;
    public yn0 h;
    public long[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ yn0 q;
    public final /* synthetic */ n40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn0(yn0 yn0Var, n40 n40Var, dn dnVar) {
        super(dnVar);
        this.q = yn0Var;
        this.r = n40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((xn0) h((dn) obj2, (g91) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        xn0 xn0Var = new xn0(this.q, this.r, dnVar);
        xn0Var.p = obj;
        return xn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006f -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        g91 g91Var;
        yn0 yn0Var;
        long[] jArr;
        int length;
        n40 n40Var;
        int i;
        long j;
        tn tnVar = tn.d;
        int i2 = this.o;
        if (i2 == 0) {
            ca0.v(obj);
            g91Var = (g91) this.p;
            yn0Var = this.q;
            jArr = yn0Var.e.a;
            length = jArr.length - 2;
            if (length >= 0) {
                n40Var = this.r;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            dd0.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.m;
        int i4 = this.l;
        long j2 = this.n;
        int i5 = this.k;
        int i6 = this.j;
        long[] jArr2 = this.i;
        yn0 yn0Var2 = this.h;
        n40 n40Var2 = this.g;
        g91 g91Var2 = (g91) this.p;
        ca0.v(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                yn0Var = yn0Var2;
                g91Var = g91Var2;
                i = i5;
                n40Var = n40Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        g91Var2 = g91Var;
                        i3 = 0;
                        yn0Var2 = yn0Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        n40Var2 = n40Var;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                n40Var2.e = i7;
                                Object obj2 = yn0Var2.e.b[i7];
                                this.p = g91Var2;
                                this.g = n40Var2;
                                this.h = yn0Var2;
                                this.i = jArr2;
                                this.j = i6;
                                this.k = i5;
                                this.n = j2;
                                this.l = i4;
                                this.m = i3;
                                this.o = 1;
                                g91Var2.a(obj2, this);
                                tn tnVar2 = tn.d;
                                return tnVar;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return Unit.a;
        }
    }
}
