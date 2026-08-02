package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ald implements ali, ajp {
    public final ana a;
    private final krx b;
    private final AtomicInteger c;
    private akg d;

    public ald(krx krxVar, ana anaVar) {
        anaVar.getClass();
        this.b = krxVar;
        this.a = anaVar;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0047, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v1, types: [krt] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.ajp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, krt krtVar, kqj kqjVar) {
        ala alaVar;
        Object obj;
        int i;
        ?? r7;
        if (kqjVar instanceof ala) {
            alaVar = (ala) kqjVar;
            int i2 = alaVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alaVar.d = i2 - Integer.MIN_VALUE;
                obj = alaVar.b;
                kqp kqpVar = kqp.a;
                i = alaVar.d;
                if (i != 0) {
                    ixc.Y(obj);
                    alaVar.e = str;
                    alaVar.a = krtVar;
                    alaVar.d = 1;
                    obj = e();
                    r7 = krtVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ixc.Y(obj);
                        return obj;
                    }
                    Object obj2 = alaVar.a;
                    str = alaVar.e;
                    ixc.Y(obj);
                    r7 = obj2;
                }
                if (!((Boolean) obj).booleanValue()) {
                    krx krxVar = this.b;
                    alb albVar = new alb(this, str, r7, null);
                    alaVar.e = null;
                    alaVar.a = null;
                    alaVar.d = 2;
                    Object a = krxVar.a(albVar, alaVar);
                    return a == kqpVar ? kqpVar : a;
                }
                amh a2 = this.a.a(str);
                try {
                    Object a3 = r7.a(a2);
                    ixf.i(a2, null);
                    return a3;
                } finally {
                }
            }
        }
        alaVar = new ala(this, kqjVar);
        obj = alaVar.b;
        kqp kqpVar2 = kqp.a;
        i = alaVar.d;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.ali
    public final ana b() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(akg akgVar, krx krxVar, kqj kqjVar) {
        akz akzVar;
        int i;
        int i2;
        Throwable th;
        try {
            if (kqjVar instanceof akz) {
                akzVar = (akz) kqjVar;
                int i3 = akzVar.d;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    akzVar.d = i3 - Integer.MIN_VALUE;
                    Object obj = akzVar.b;
                    Object obj2 = kqp.a;
                    i = akzVar.d;
                    i2 = 1;
                    if (i != 0) {
                        ixc.Y(obj);
                        int ordinal = akgVar.ordinal();
                        if (ordinal == 0) {
                            yj.o(this.a, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            yj.o(this.a, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new koj();
                            }
                            yj.o(this.a, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (this.c.incrementAndGet() > 0) {
                            this.d = akgVar;
                        }
                        Object akyVar = new aky(this);
                        akzVar.a = 1;
                        akzVar.d = 1;
                        obj = krxVar.a(akyVar, akzVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = akzVar.a;
                        ixc.Y(obj);
                    }
                    if (this.c.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    ana anaVar = this.a;
                    if (i2 == 0) {
                        yj.o(anaVar, "END TRANSACTION");
                        return obj;
                    }
                    yj.o(anaVar, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i != 0) {
            }
            if (this.c.decrementAndGet() == 0) {
            }
            ana anaVar2 = this.a;
            if (i2 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                if (th instanceof aku) {
                    aku akuVar = th;
                    throw null;
                }
                try {
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        if (this.c.decrementAndGet() == 0) {
                            this.d = null;
                        }
                        yj.o(this.a, "ROLLBACK TRANSACTION");
                    } catch (SQLException e) {
                        if (th == null) {
                            throw e;
                        }
                        koc.b(th, e);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = null;
            }
        }
        akzVar = new akz(this, kqjVar);
        Object obj3 = akzVar.b;
        Object obj22 = kqp.a;
        i = akzVar.d;
        i2 = 1;
    }

    public final Object d(akg akgVar, krx krxVar, kqj kqjVar) {
        return this.b.a(new alc(this, akgVar, krxVar, null), kqjVar);
    }

    public final Object e() {
        boolean z = true;
        if (this.d == null && !this.a.a.g()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
