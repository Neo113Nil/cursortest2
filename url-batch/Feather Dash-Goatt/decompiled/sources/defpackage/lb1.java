package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lb1 extends h31 implements Function2 {
    public long[] g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mb1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(mb1 mb1Var, dn dnVar) {
        super(dnVar);
        this.l = mb1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((lb1) h((dn) obj2, (g91) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        lb1 lb1Var = new lb1(this.l, dnVar);
        lb1Var.k = obj;
        return lb1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c5 -> B:7:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:20:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        g91 g91Var;
        long[] jArr;
        int length;
        int i;
        g91 g91Var2;
        int i2;
        g91 g91Var3;
        int i3;
        mb1 mb1Var = this.l;
        long j = mb1Var.d;
        long j2 = mb1Var.g;
        long j3 = mb1Var.e;
        tn tnVar = tn.d;
        int i4 = this.j;
        if (i4 == 0) {
            ca0.v(obj);
            g91Var = (g91) this.k;
            jArr = mb1Var.h;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                g91Var2 = g91Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return Unit.a;
        }
        if (i4 == 1) {
            length = this.i;
            int i5 = this.h;
            jArr = this.g;
            g91Var = (g91) this.k;
            ca0.v(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.h;
                g91Var3 = (g91) this.k;
                ca0.v(obj);
                i3++;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.k = g91Var3;
                        this.g = null;
                        this.h = i3;
                        this.j = 3;
                        g91Var3.a(l, this);
                        tn tnVar2 = tn.d;
                        return tnVar;
                    }
                    i3++;
                    if (i3 < 64) {
                    }
                }
                return Unit.a;
            }
            i2 = this.h;
            g91Var2 = (g91) this.k;
            ca0.v(obj);
            i2++;
            if (i2 >= 64) {
                g91Var = g91Var2;
                if (j != 0) {
                    g91Var3 = g91Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.k = g91Var2;
                this.g = null;
                this.h = i2;
                this.j = 2;
                g91Var2.a(l2, this);
                tn tnVar3 = tn.d;
                return tnVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.k = g91Var;
            this.g = jArr;
            this.h = i;
            this.i = length;
            this.j = 1;
            g91Var.a(l3, this);
            return tnVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return Unit.a;
    }
}
