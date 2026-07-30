package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a32 {
    public final int a;
    public final Function0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final j10[] f;
    public final qi2 g;
    public final gn h;

    public a32(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
        this.f = new j10[i];
        int i2 = ri2.a;
        this.g = new qi2(i);
        gn gnVar = new gn(1);
        if (i < 1) {
            lh.e("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            lh.e("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        gnVar.d = i - 1;
        gnVar.e = new Object[i];
        this.h = gnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:13:0x0047, B:15:0x004b, B:17:0x0051, B:20:0x0058, B:21:0x0072, B:23:0x0078, B:27:0x0090, B:28:0x0095, B:29:0x0096, B:30:0x009d), top: B:12:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:13:0x0047, B:15:0x004b, B:17:0x0051, B:20:0x0058, B:21:0x0072, B:23:0x0078, B:27:0x0090, B:28:0x0095, B:29:0x0096, B:30:0x009d), top: B:12:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r30 r30Var) {
        z22 z22Var;
        int i;
        ReentrantLock reentrantLock;
        try {
            try {
                if (r30Var instanceof z22) {
                    z22Var = (z22) r30Var;
                    int i2 = z22Var.p;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        z22Var.p = i2 - Integer.MIN_VALUE;
                        Object obj = z22Var.n;
                        b50 b50Var = b50.m;
                        i = z22Var.p;
                        if (i != 0) {
                            ca2.b(obj);
                            z22Var.m = this;
                            z22Var.p = 1;
                            if (this.g.a(z22Var) == b50Var) {
                                return b50Var;
                            }
                        } else {
                            if (i != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = z22Var.m;
                            ca2.b(obj);
                        }
                        reentrantLock = this.c;
                        gn gnVar = this.h;
                        reentrantLock.lock();
                        if (!this.e) {
                            s03.P(21, "Connection pool is closed");
                            throw null;
                        }
                        if (gnVar.b == gnVar.c && this.d < this.a) {
                            j10 j10Var = new j10((nc2) this.b.invoke());
                            j10[] j10VarArr = this.f;
                            int i3 = this.d;
                            this.d = i3 + 1;
                            j10VarArr[i3] = j10Var;
                            gnVar.a(j10Var);
                        }
                        int i4 = gnVar.b;
                        if (i4 == gnVar.c) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        Object[] objArr = (Object[]) gnVar.e;
                        Object obj2 = objArr[i4];
                        objArr[i4] = null;
                        gnVar.b = (i4 + 1) & gnVar.d;
                        return (j10) obj2;
                    }
                }
                if (!this.e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.c;
            gn gnVar2 = this.h;
            reentrantLock.lock();
        } catch (Throwable th) {
            this.g.d();
            throw th;
        }
        z22Var = new z22(this, r30Var);
        Object obj3 = z22Var.n;
        b50 b50Var2 = b50.m;
        i = z22Var.p;
        if (i != 0) {
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (j10 j10Var : this.f) {
                if (j10Var != null) {
                    j10Var.close();
                }
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder sb) {
        gn gnVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            le1 b = pv.b();
            int i = (gnVar.c - gnVar.b) & gnVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = gnVar.c;
                    int i4 = gnVar.b;
                    int i5 = gnVar.d;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) gnVar.e)[(i4 + i2) & i5];
                        obj.getClass();
                        b.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            le1 a = pv.a(b);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            qi2 qi2Var = this.g;
            qi2Var.getClass();
            sb2.append(Math.max(pi2.s.get(qi2Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + a.a() + ")[" + zv.A(a, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            j10[] j10VarArr = this.f;
            int length = j10VarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                j10 j10Var = j10VarArr[i7];
                i6++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i6);
                sb3.append("] - ");
                sb3.append(j10Var != null ? j10Var.m.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (j10Var != null) {
                    j10Var.m(sb);
                }
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(j10 j10Var) {
        j10Var.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(j10Var);
            Unit unit = Unit.a;
            reentrantLock.unlock();
            this.g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
