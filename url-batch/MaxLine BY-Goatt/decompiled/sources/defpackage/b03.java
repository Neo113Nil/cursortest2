package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b03 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ f03 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b03(f03 f03Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.p = f03Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        f03 f03Var = this.p;
        switch (i) {
            case 0:
                b03 b03Var = new b03(f03Var, o30Var, 0);
                b03Var.o = obj;
                return b03Var;
            case 1:
                b03 b03Var2 = new b03(f03Var, o30Var, 1);
                b03Var2.o = obj;
                return b03Var2;
            default:
                b03 b03Var3 = new b03(f03Var, o30Var, 2);
                b03Var3.o = obj;
                return b03Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
        }
        return ((b03) create((uy2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r4.a(r2, r5, r19) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003c, code lost:
    
        if (r8 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0104, code lost:
    
        if (r0 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e6, code lost:
    
        if (r4 == r1) goto L68;
     */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uy2 uy2Var;
        Object d;
        Object a;
        uy2 uy2Var2;
        Object d2;
        ut1[] ut1VarArr;
        ut1 ut1Var;
        int i = this.m;
        boolean z = false;
        boolean z2 = true;
        f03 f03Var = this.p;
        o30 o30Var = null;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                d32 d32Var = (d32) this.o;
                this.n = 1;
                Object a2 = f03.a(f03Var, d32Var, this);
                return a2 == b50Var ? b50Var : a2;
            case 1:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                try {
                    if (i3 == 0) {
                        ca2.b(obj);
                        uy2Var = (uy2) this.o;
                        this.o = uy2Var;
                        this.n = 1;
                        d = uy2Var.d(this);
                        break;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj);
                            a = obj;
                            return (Set) a;
                        }
                        uy2Var = (uy2) this.o;
                        ca2.b(obj);
                        d = obj;
                    }
                    if (!((Boolean) d).booleanValue()) {
                        ty2 ty2Var = ty2.n;
                        b03 b03Var = new b03(f03Var, o30Var, 0);
                        this.o = null;
                        this.n = 2;
                        a = uy2Var.a(ty2Var, b03Var, this);
                        break;
                    } else {
                        return fh0.m;
                    }
                } catch (SQLException unused) {
                    return fh0.m;
                }
            default:
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    uy2Var2 = (uy2) this.o;
                    this.o = uy2Var2;
                    this.n = 1;
                    d2 = uy2Var2.d(this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ca2.b(obj);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uy2Var2 = (uy2) this.o;
                    ca2.b(obj);
                    d2 = obj;
                }
                if (((Boolean) d2).booleanValue()) {
                    return Unit.a;
                }
                w50 w50Var = f03Var.h;
                long[] jArr = (long[]) w50Var.c;
                ReentrantLock reentrantLock = (ReentrantLock) w50Var.b;
                reentrantLock.lock();
                try {
                    if (w50Var.a) {
                        w50Var.a = false;
                        int length = jArr.length;
                        ut1VarArr = new ut1[length];
                        int i5 = 0;
                        boolean z3 = false;
                        while (i5 < length) {
                            boolean z4 = jArr[i5] > 0 ? z2 : z;
                            boolean[] zArr = (boolean[]) w50Var.d;
                            if (z4 != zArr[i5]) {
                                zArr[i5] = z4;
                                ut1Var = z4 ? ut1.n : ut1.o;
                                z3 = true;
                            } else {
                                ut1Var = ut1.m;
                            }
                            ut1VarArr[i5] = ut1Var;
                            i5++;
                            z = false;
                            z2 = true;
                        }
                        if (!z3) {
                            ut1VarArr = null;
                        }
                        reentrantLock.unlock();
                    } else {
                        reentrantLock.unlock();
                        ut1VarArr = null;
                    }
                    if (ut1VarArr != null) {
                        ty2 ty2Var2 = ty2.n;
                        gj1 gj1Var = new gj1(ut1VarArr, f03Var, uy2Var2, null);
                        this.o = null;
                        this.n = 2;
                        break;
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }
}
