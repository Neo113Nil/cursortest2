package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vh0 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ai0 n;
    public final /* synthetic */ uj0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh0(ai0 ai0Var, uj0 uj0Var, int i) {
        super(1);
        this.m = i;
        this.n = ai0Var;
        this.o = uj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r9.a.a != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r1.a.a != null) goto L26;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.m;
        ai0 ai0Var = this.n;
        th0 th0Var = th0.o;
        th0 th0Var2 = th0.n;
        th0 th0Var3 = th0.m;
        float f = 1.0f;
        uj0 uj0Var = this.o;
        switch (i) {
            case 0:
                cz2 cz2Var = (cz2) obj;
                if (cz2Var.a(th0Var3, th0Var2)) {
                    fk0 fk0Var = ai0Var.a.a;
                    return fk0Var != null ? fk0Var.a : xh0.b;
                }
                if (!cz2Var.a(th0Var2, th0Var)) {
                    return xh0.b;
                }
                fk0 fk0Var2 = uj0Var.a.a;
                return fk0Var2 != null ? fk0Var2.a : xh0.b;
            case 1:
                int ordinal = ((th0) obj).ordinal();
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            a.b();
                            return null;
                        }
                        break;
                    }
                    return Float.valueOf(f);
                }
            case 2:
                cz2 cz2Var2 = (cz2) obj;
                if (cz2Var2.a(th0Var3, th0Var2)) {
                    return xh0.b;
                }
                if (!cz2Var2.a(th0Var2, th0Var)) {
                    return xh0.b;
                }
                gz2 gz2Var = uj0Var.a;
                return xh0.b;
            default:
                int ordinal2 = ((th0) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        a.b();
                        return null;
                    }
                    gz2 gz2Var2 = uj0Var.a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
