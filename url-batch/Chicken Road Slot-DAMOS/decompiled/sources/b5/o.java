package b5;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z4.e0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements e0, c0 {

    /* renamed from: a, reason: collision with root package name */
    public final wd.n f1164a;

    /* renamed from: b, reason: collision with root package name */
    public final i5.a f1165b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f1166c;

    /* renamed from: d, reason: collision with root package name */
    public z4.d0 f1167d;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Function2 function2, i5.a aVar) {
        aVar.getClass();
        this.f1164a = (wd.n) function2;
        this.f1165b = aVar;
        this.f1166c = new AtomicInteger(0);
    }

    @Override // z4.e0
    public final Boolean a(ld.a aVar) {
        return Boolean.valueOf(this.f1167d != null || this.f1165b.t());
    }

    @Override // b5.c0
    public final i5.a b() {
        return this.f1165b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0046, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function2, wd.n] */
    @Override // z4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Function1 function1, nd.c cVar) {
        l lVar;
        Object obj;
        int i3;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f1155s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f1155s = i10 - Integer.MIN_VALUE;
                obj = lVar.f1153i;
                Object obj2 = md.a.f6622d;
                i3 = lVar.f1155s;
                if (i3 != 0) {
                    cf.c.M(obj);
                    lVar.f1151d = str;
                    lVar.f1152e = function1;
                    lVar.f1155s = 1;
                    obj = a(lVar);
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            cf.c.M(obj);
                            return obj;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = lVar.f1152e;
                    str = lVar.f1151d;
                    cf.c.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    m mVar = new m(this, str, function1, null);
                    lVar.f1151d = null;
                    lVar.f1152e = null;
                    lVar.f1155s = 2;
                    Object invoke = this.f1164a.invoke(mVar, lVar);
                    return invoke == obj2 ? obj2 : invoke;
                }
                i5.c K = this.f1165b.K(str);
                try {
                    Object invoke2 = function1.invoke(K);
                    cf.c.m(K, null);
                    return invoke2;
                } finally {
                }
            }
        }
        lVar = new l(this, cVar);
        obj = lVar.f1153i;
        Object obj22 = md.a.f6622d;
        i3 = lVar.f1155s;
        if (i3 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, wd.n] */
    @Override // z4.e0
    public final Object d(z4.d0 d0Var, Function2 function2, nd.i iVar) {
        Object invoke = this.f1164a.invoke(new n(this, d0Var, function2, (ld.a) null), iVar);
        md.a aVar = md.a.f6622d;
        return invoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(z4.d0 d0Var, Function2 function2, nd.c cVar) {
        k kVar;
        int i3;
        AtomicInteger atomicInteger;
        int i10;
        i5.a aVar;
        try {
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i11 = kVar.f1150r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    kVar.f1150r = i11 - Integer.MIN_VALUE;
                    Object obj = kVar.f1148e;
                    Object obj2 = md.a.f6622d;
                    i3 = kVar.f1150r;
                    atomicInteger = this.f1166c;
                    i10 = 1;
                    aVar = this.f1165b;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        int ordinal = d0Var.ordinal();
                        if (ordinal == 0) {
                            g8.b.y(aVar, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            g8.b.y(aVar, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                a2.r.p();
                                return null;
                            }
                            g8.b.y(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (atomicInteger.incrementAndGet() > 0) {
                            this.f1167d = d0Var;
                        }
                        Object jVar = new j(0, this);
                        kVar.f1147d = 1;
                        kVar.f1150r = 1;
                        obj = function2.invoke(jVar, kVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i10 = kVar.f1147d;
                        cf.c.M(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f1167d = null;
                    }
                    if (i10 == 0) {
                        g8.b.y(aVar, "END TRANSACTION");
                        return obj;
                    }
                    g8.b.y(aVar, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            if (atomicInteger.decrementAndGet() == 0) {
            }
            if (i10 == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f1167d = null;
                    }
                    g8.b.y(aVar, "ROLLBACK TRANSACTION");
                } catch (SQLException e2) {
                    hd.b.a(th, e2);
                }
                throw th2;
            }
        }
        kVar = new k(this, cVar);
        Object obj3 = kVar.f1148e;
        Object obj22 = md.a.f6622d;
        i3 = kVar.f1150r;
        atomicInteger = this.f1166c;
        i10 = 1;
        aVar = this.f1165b;
    }
}
