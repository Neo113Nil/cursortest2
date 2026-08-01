package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u50 {
    public final int a;
    public final ir b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final pe[] f;
    public final sc0 g;
    public final ac h;

    public u50(int i, ir irVar) {
        this.a = i;
        this.b = irVar;
        this.f = new pe[i];
        int i2 = tc0.a;
        this.g = new sc0(i);
        ac acVar = new ac();
        if (i < 1) {
            s9.k("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            s9.k("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        acVar.c = i - 1;
        acVar.d = new Object[i];
        this.h = acVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0065, code lost:
    
        r0.j(r8.g);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: all -> 0x00cd, TryCatch #2 {all -> 0x00cd, blocks: (B:13:0x0086, B:15:0x008a, B:17:0x0090, B:20:0x0097, B:21:0x00b1, B:23:0x00b7, B:27:0x00cf, B:28:0x00d4, B:29:0x00d5, B:30:0x00dc), top: B:12:0x0086, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5 A[Catch: all -> 0x00cd, TryCatch #2 {all -> 0x00cd, blocks: (B:13:0x0086, B:15:0x008a, B:17:0x0090, B:20:0x0097, B:21:0x00b1, B:23:0x00b7, B:27:0x00cf, B:28:0x00d4, B:29:0x00d5, B:30:0x00dc), top: B:12:0x0086, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(eg egVar) {
        t50 t50Var;
        int i;
        int andDecrement;
        ReentrantLock reentrantLock;
        try {
            try {
                if (egVar instanceof t50) {
                    t50Var = (t50) egVar;
                    int i2 = t50Var.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        t50Var.l = i2 - Integer.MIN_VALUE;
                        Object obj = t50Var.j;
                        Object obj2 = bh.COROUTINE_SUSPENDED;
                        i = t50Var.l;
                        if (i != 0) {
                            mv.O(obj);
                            t50Var.i = this;
                            t50Var.l = 1;
                            sc0 sc0Var = this.g;
                            sc0Var.getClass();
                            do {
                                andDecrement = rc0.l.getAndDecrement(sc0Var);
                            } while (andDecrement > sc0Var.f);
                            Object obj3 = sk0.a;
                            if (andDecrement <= 0) {
                                ka y = d50.y(n9.z(t50Var));
                                try {
                                    if (!sc0Var.a(y)) {
                                        while (true) {
                                            int andDecrement2 = rc0.l.getAndDecrement(sc0Var);
                                            if (andDecrement2 <= sc0Var.f) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (sc0Var.a(y)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    Object u = y.u();
                                    Object obj4 = u;
                                    if (u != obj2) {
                                        obj4 = obj3;
                                    }
                                    if (obj4 == obj2) {
                                        obj3 = obj4;
                                    }
                                } catch (Throwable th) {
                                    y.A();
                                    throw th;
                                }
                            }
                            if (obj3 == obj2) {
                                return obj2;
                            }
                        } else {
                            if (i != 1) {
                                s9.u("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = t50Var.i;
                            mv.O(obj);
                        }
                        reentrantLock = this.c;
                        ac acVar = this.h;
                        reentrantLock.lock();
                        if (!this.e) {
                            gk0.S("Connection pool is closed", 21);
                            throw null;
                        }
                        if (acVar.a == acVar.b && this.d < this.a) {
                            pe peVar = new pe((cb0) this.b.a());
                            pe[] peVarArr = this.f;
                            int i3 = this.d;
                            this.d = i3 + 1;
                            peVarArr[i3] = peVar;
                            acVar.a(peVar);
                        }
                        int i4 = acVar.a;
                        if (i4 == acVar.b) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        Object[] objArr = (Object[]) acVar.d;
                        Object obj5 = objArr[i4];
                        objArr[i4] = null;
                        acVar.a = (i4 + 1) & acVar.c;
                        return (pe) obj5;
                    }
                }
                if (!this.e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.c;
            ac acVar2 = this.h;
            reentrantLock.lock();
        } catch (Throwable th2) {
            this.g.b();
            throw th2;
        }
        t50Var = new t50(this, egVar);
        Object obj6 = t50Var.j;
        Object obj22 = bh.COROUTINE_SUSPENDED;
        i = t50Var.l;
        if (i != 0) {
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (pe peVar : this.f) {
                if (peVar != null) {
                    peVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(StringBuilder sb) {
        ac acVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            dy u = bi.u();
            int i = (acVar.b - acVar.a) & acVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = acVar.b;
                    int i4 = acVar.a;
                    int i5 = acVar.c;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) acVar.d)[(i4 + i2) & i5];
                        obj.getClass();
                        u.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            dy i6 = bi.i(u);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            sc0 sc0Var = this.g;
            sc0Var.getClass();
            sb2.append(Math.max(rc0.l.get(sc0Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + i6.a() + ")[" + uc.k0(i6, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            pe[] peVarArr = this.f;
            int length = peVarArr.length;
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                pe peVar = peVarArr[i8];
                i7++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i7);
                sb3.append("] - ");
                sb3.append(peVar != null ? peVar.f.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (peVar != null) {
                    peVar.r(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(pe peVar) {
        peVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(peVar);
            reentrantLock.unlock();
            this.g.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
