package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qm2 extends z92 implements Function2 {
    public long[] n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ rm2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm2(rm2 rm2Var, o30 o30Var) {
        super(o30Var);
        this.s = rm2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        qm2 qm2Var = new qm2(this.s, o30Var);
        qm2Var.r = obj;
        return qm2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qm2) create((xi2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c5 -> B:7:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:20:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xi2 xi2Var;
        long[] jArr;
        int length;
        int i;
        xi2 xi2Var2;
        int i2;
        xi2 xi2Var3;
        int i3;
        rm2 rm2Var = this.s;
        long j = rm2Var.m;
        long j2 = rm2Var.o;
        long j3 = rm2Var.n;
        b50 b50Var = b50.m;
        int i4 = this.q;
        if (i4 == 0) {
            ca2.b(obj);
            xi2Var = (xi2) this.r;
            jArr = rm2Var.p;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                xi2Var2 = xi2Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return Unit.a;
        }
        if (i4 == 1) {
            length = this.p;
            int i5 = this.o;
            jArr = this.n;
            xi2Var = (xi2) this.r;
            ca2.b(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.o;
                xi2Var3 = (xi2) this.r;
                ca2.b(obj);
                i3++;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.r = xi2Var3;
                        this.n = null;
                        this.o = i3;
                        this.q = 3;
                        xi2Var3.a(l, this);
                        b50 b50Var2 = b50.m;
                        return b50Var;
                    }
                    i3++;
                    if (i3 < 64) {
                    }
                }
                return Unit.a;
            }
            i2 = this.o;
            xi2Var2 = (xi2) this.r;
            ca2.b(obj);
            i2++;
            if (i2 >= 64) {
                xi2Var = xi2Var2;
                if (j != 0) {
                    xi2Var3 = xi2Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.r = xi2Var2;
                this.n = null;
                this.o = i2;
                this.q = 2;
                xi2Var2.a(l2, this);
                b50 b50Var3 = b50.m;
                return b50Var;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.r = xi2Var;
            this.n = jArr;
            this.o = i;
            this.p = length;
            this.q = 1;
            xi2Var.a(l3, this);
            return b50Var;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return Unit.a;
    }
}
