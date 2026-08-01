package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vj0 extends tg0 implements xr {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bk0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj0(bk0 bk0Var, dg dgVar, int i) {
        super(dgVar);
        this.j = i;
        this.m = bk0Var;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        sk0 sk0Var = sk0.a;
        switch (i) {
            case 0:
                return ((vj0) i((dg) obj2, (x50) obj)).l(sk0Var);
            case 1:
                return ((vj0) i((dg) obj2, (ej0) obj)).l(sk0Var);
            default:
                return ((vj0) i((dg) obj2, (ej0) obj)).l(sk0Var);
        }
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        int i = this.j;
        bk0 bk0Var = this.m;
        switch (i) {
            case 0:
                vj0 vj0Var = new vj0(bk0Var, dgVar, 0);
                vj0Var.l = obj;
                return vj0Var;
            case 1:
                vj0 vj0Var2 = new vj0(bk0Var, dgVar, 1);
                vj0Var2.l = obj;
                return vj0Var2;
            default:
                vj0 vj0Var3 = new vj0(bk0Var, dgVar, 2);
                vj0Var3.l = obj;
                return vj0Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r4.a(r2, r3, r20) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x003f, code lost:
    
        if (r8 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0101, code lost:
    
        if (r0 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e4, code lost:
    
        if (r3 == r1) goto L68;
     */
    @Override // defpackage.f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        ej0 ej0Var;
        Object c;
        Object a;
        ej0 ej0Var2;
        Object c2;
        i40[] i40VarArr;
        i40 i40Var;
        int i = this.j;
        boolean z = false;
        boolean z2 = true;
        bk0 bk0Var = this.m;
        dg dgVar = null;
        switch (i) {
            case 0:
                bh bhVar = bh.COROUTINE_SUSPENDED;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        mv.O(obj);
                        return obj;
                    }
                    s9.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mv.O(obj);
                x50 x50Var = (x50) this.l;
                this.k = 1;
                Object a2 = bk0.a(bk0Var, x50Var, this);
                return a2 == bhVar ? bhVar : a2;
            case 1:
                bh bhVar2 = bh.COROUTINE_SUSPENDED;
                int i3 = this.k;
                try {
                    if (i3 == 0) {
                        mv.O(obj);
                        ej0Var = (ej0) this.l;
                        this.l = ej0Var;
                        this.k = 1;
                        c = ej0Var.c(this);
                        break;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                s9.u("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mv.O(obj);
                            a = obj;
                            return (Set) a;
                        }
                        ej0Var = (ej0) this.l;
                        mv.O(obj);
                        c = obj;
                    }
                    if (!((Boolean) c).booleanValue()) {
                        dj0 dj0Var = dj0.IMMEDIATE;
                        vj0 vj0Var = new vj0(bk0Var, dgVar, 0);
                        this.l = null;
                        this.k = 2;
                        a = ej0Var.a(dj0Var, vj0Var, this);
                        break;
                    }
                } catch (SQLException unused) {
                }
                return ym.f;
            default:
                bh bhVar3 = bh.COROUTINE_SUSPENDED;
                int i4 = this.k;
                sk0 sk0Var = sk0.a;
                if (i4 == 0) {
                    mv.O(obj);
                    ej0Var2 = (ej0) this.l;
                    this.l = ej0Var2;
                    this.k = 1;
                    c2 = ej0Var2.c(this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            mv.O(obj);
                            return sk0Var;
                        }
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ej0Var2 = (ej0) this.l;
                    mv.O(obj);
                    c2 = obj;
                }
                if (!((Boolean) c2).booleanValue()) {
                    dq dqVar = bk0Var.h;
                    long[] jArr = (long[]) dqVar.c;
                    ReentrantLock reentrantLock = (ReentrantLock) dqVar.b;
                    reentrantLock.lock();
                    try {
                        if (dqVar.a) {
                            dqVar.a = false;
                            int length = jArr.length;
                            i40VarArr = new i40[length];
                            int i5 = 0;
                            boolean z3 = false;
                            while (i5 < length) {
                                if (jArr[i5] > 0) {
                                    z = z2;
                                }
                                boolean[] zArr = (boolean[]) dqVar.d;
                                if (z != zArr[i5]) {
                                    zArr[i5] = z;
                                    i40Var = z ? i40.ADD : i40.REMOVE;
                                    z3 = true;
                                } else {
                                    i40Var = i40.NO_OP;
                                }
                                i40VarArr[i5] = i40Var;
                                i5++;
                                z = false;
                                z2 = true;
                            }
                            if (!z3) {
                                i40VarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            i40VarArr = null;
                        }
                        if (i40VarArr != null) {
                            dj0 dj0Var2 = dj0.IMMEDIATE;
                            ak0 ak0Var = new ak0(i40VarArr, bk0Var, ej0Var2, null);
                            this.l = null;
                            this.k = 2;
                            break;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return sk0Var;
        }
    }
}
