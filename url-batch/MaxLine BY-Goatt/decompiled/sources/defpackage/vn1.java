package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vn1 extends z92 implements Function2 {
    public wu0 n;
    public wn1 o;
    public long[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ wn1 x;
    public final /* synthetic */ wu0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(wn1 wn1Var, wu0 wu0Var, o30 o30Var) {
        super(o30Var);
        this.x = wn1Var;
        this.y = wu0Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        vn1 vn1Var = new vn1(this.x, this.y, o30Var);
        vn1Var.w = obj;
        return vn1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vn1) create((xi2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006f -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xi2 xi2Var;
        wn1 wn1Var;
        long[] jArr;
        int length;
        wu0 wu0Var;
        int i;
        long j;
        b50 b50Var = b50.m;
        int i2 = this.v;
        if (i2 == 0) {
            ca2.b(obj);
            xi2Var = (xi2) this.w;
            wn1Var = this.x;
            jArr = wn1Var.n.a;
            length = jArr.length - 2;
            if (length >= 0) {
                wu0Var = this.y;
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
            lh.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.t;
        int i4 = this.s;
        long j2 = this.u;
        int i5 = this.r;
        int i6 = this.q;
        long[] jArr2 = this.p;
        wn1 wn1Var2 = this.o;
        wu0 wu0Var2 = this.n;
        xi2 xi2Var2 = (xi2) this.w;
        ca2.b(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                wn1Var = wn1Var2;
                xi2Var = xi2Var2;
                i = i5;
                wu0Var = wu0Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        xi2Var2 = xi2Var;
                        i3 = 0;
                        wn1Var2 = wn1Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        wu0Var2 = wu0Var;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                wu0Var2.n = i7;
                                Object obj2 = wn1Var2.n.b[i7];
                                this.w = xi2Var2;
                                this.n = wu0Var2;
                                this.o = wn1Var2;
                                this.p = jArr2;
                                this.q = i6;
                                this.r = i5;
                                this.u = j2;
                                this.s = i4;
                                this.t = i3;
                                this.v = 1;
                                xi2Var2.a(obj2, this);
                                b50 b50Var2 = b50.m;
                                return b50Var;
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
