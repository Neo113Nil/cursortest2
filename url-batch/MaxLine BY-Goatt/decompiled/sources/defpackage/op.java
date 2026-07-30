package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class op {
    public final eo1 a = new eo1(new pp[16]);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (r6 < r8) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:10:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w72 w72Var, r30 r30Var) {
        np npVar;
        int i;
        int i2;
        Object[] objArr;
        int i3;
        if (r30Var instanceof np) {
            npVar = (np) r30Var;
            int i4 = npVar.s;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                npVar.s = i4 - Integer.MIN_VALUE;
                Object obj = npVar.q;
                b50 b50Var = b50.m;
                i = npVar.s;
                if (i != 0) {
                    ca2.b(obj);
                    eo1 eo1Var = this.a;
                    i2 = eo1Var.o;
                    if (i2 > 0) {
                        objArr = eo1Var.m;
                        i3 = 0;
                        pp ppVar = (pp) objArr[i3];
                        npVar.m = w72Var;
                        npVar.n = objArr;
                        npVar.o = i2;
                        npVar.p = i3;
                        npVar.s = 1;
                        if (iv1.T(ppVar, w72Var, npVar) == b50Var) {
                            return b50Var;
                        }
                        i3++;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = npVar.p;
                int i5 = npVar.o;
                objArr = npVar.n;
                w72 w72Var2 = npVar.m;
                ca2.b(obj);
                i2 = i5;
                w72Var = w72Var2;
                i3++;
            }
        }
        npVar = new np(this, r30Var);
        Object obj2 = npVar.q;
        b50 b50Var2 = b50.m;
        i = npVar.s;
        if (i != 0) {
        }
    }
}
