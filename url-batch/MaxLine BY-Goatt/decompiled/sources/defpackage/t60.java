package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t60 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ i70 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t60(i70 i70Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = i70Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        i70 i70Var = this.o;
        switch (i) {
            case 0:
                return new t60(i70Var, o30Var, 0);
            case 1:
                return new t60(i70Var, o30Var, 1);
            default:
                return new t60(i70Var, o30Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
        }
        return ((t60) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r10 == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r4.i(r9) == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r10.a(r1, r9) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r10 == r0) goto L41;
     */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        i70 i70Var = this.o;
        int i2 = 2;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    if (i70.d(i70Var, this) == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i3 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 1:
                b50 b50Var2 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    js0 js0Var = i70Var.u;
                    this.n = 1;
                    Object t = ((dx) js0Var.n).t(this);
                    if (t != b50Var2) {
                        t = Unit.a;
                        break;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ca2.b(obj);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                xm0 n = iv1.n(i70Var.h().c, -1);
                ba baVar = new ba(i2, i70Var);
                this.n = 2;
                break;
            default:
                j70 j70Var = i70Var.t;
                b50 b50Var3 = b50.m;
                int i5 = this.n;
                try {
                    if (i5 == 0) {
                        ca2.b(obj);
                        if (!(j70Var.b() instanceof zl0)) {
                            this.n = 1;
                            break;
                        } else {
                            return j70Var.b();
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                ca2.b(obj);
                                return (qo2) obj;
                            }
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                    }
                    this.n = 2;
                    obj = i70.e(i70Var, false, this);
                    break;
                } catch (Throwable th) {
                    return new g62(th, -1);
                }
        }
    }
}
