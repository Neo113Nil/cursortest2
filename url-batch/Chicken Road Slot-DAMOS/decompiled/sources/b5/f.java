package b5;

import android.database.SQLException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: d, reason: collision with root package name */
    public final u f1131d;

    /* renamed from: e, reason: collision with root package name */
    public final u f1132e;

    /* renamed from: i, reason: collision with root package name */
    public final u8.d f1133i;

    /* renamed from: r, reason: collision with root package name */
    public final ThreadLocal f1134r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f1135s;

    /* renamed from: t, reason: collision with root package name */
    public final long f1136t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1137u;

    public f(final c6.l lVar, final String str, int i3) {
        long i10;
        str.getClass();
        this.f1133i = new u8.d(10);
        this.f1134r = new ThreadLocal();
        ee.a aVar = ee.b.f3956e;
        ee.d dVar = ee.d.SECONDS;
        if (dVar.compareTo(dVar) <= 0) {
            i10 = ee.i.c(TimeUnit.NANOSECONDS.convert(30, TimeUnit.SECONDS));
        } else {
            i10 = ee.i.i(30, dVar);
        }
        this.f1136t = i10;
        this.f1137u = 2;
        if (i3 <= 0) {
            a1.e("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i11 = 0;
        this.f1131d = new u(i3, new Function0() { // from class: b5.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        i5.a c10 = lVar.c(str);
                        g8.b.y(c10, "PRAGMA query_only = 1");
                        return c10;
                    default:
                        return lVar.c(str);
                }
            }
        });
        final int i12 = 1;
        this.f1132e = new u(1, new Function0() { // from class: b5.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        i5.a c10 = lVar.c(str);
                        g8.b.y(c10, "PRAGMA query_only = 1");
                        return c10;
                    default:
                        return lVar.c(str);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f1135s) {
            return;
        }
        this.f1135s = true;
        this.f1131d.c();
        this.f1132e.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #0 {all -> 0x01a2, blocks: (B:55:0x0121, B:59:0x013d, B:61:0x0148, B:65:0x01a6, B:66:0x01ad), top: B:54:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6 A[Catch: all -> 0x01a2, TRY_ENTER, TryCatch #0 {all -> 0x01a2, blocks: (B:55:0x0121, B:59:0x013d, B:61:0x0148, B:65:0x01a6, B:66:0x01ad), top: B:54:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r11v1, types: [b5.d] */
    @Override // b5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(boolean z10, Function2 function2, nd.c cVar) {
        e eVar;
        int i3;
        wd.b0 b0Var;
        Throwable th;
        u uVar;
        CoroutineContext context;
        Function2 function22;
        u8.d dVar;
        u uVar2;
        wd.b0 b0Var2;
        Object obj;
        wd.b0 b0Var3;
        b0 b0Var4;
        final boolean z11 = z10;
        try {
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i10 = eVar.f1130x;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    eVar.f1130x = i10 - Integer.MIN_VALUE;
                    Object obj2 = eVar.f1128v;
                    md.a aVar = md.a.f6622d;
                    i3 = eVar.f1130x;
                    CoroutineContext coroutineContext = null;
                    boolean z12 = false;
                    boolean z13 = false;
                    boolean z14 = false;
                    if (i3 != 0) {
                        cf.c.M(obj2);
                        if (this.f1135s) {
                            g8.b.L(21, "Connection pool is closed");
                            throw null;
                        }
                        b0 b0Var5 = (b0) this.f1134r.get();
                        if (b0Var5 == null) {
                            a aVar2 = (a) eVar.getContext().m(this.f1133i);
                            b0Var5 = aVar2 != null ? aVar2.f1101e : null;
                        }
                        if (b0Var5 == null) {
                            u uVar3 = z11 ? this.f1131d : this.f1132e;
                            b0Var = new wd.b0();
                            try {
                                context = eVar.getContext();
                                u8.d dVar2 = this.f1133i;
                                long j = this.f1136t;
                                ?? r11 = new Function0() { // from class: b5.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String str = z11 ? "reader" : "writer";
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Timed out attempting to acquire a " + str + " connection.");
                                        sb2.append("\n\nWriter pool:\n");
                                        f fVar = f.this;
                                        fVar.f1132e.d(sb2);
                                        sb2.append("Reader pool:");
                                        sb2.append('\n');
                                        fVar.f1131d.d(sb2);
                                        try {
                                            g8.b.L(5, sb2.toString());
                                            throw null;
                                        } catch (SQLException e2) {
                                            int i11 = fVar.f1137u;
                                            if (i11 == 1) {
                                                throw e2;
                                            }
                                            if (i11 == 2) {
                                                e2.printStackTrace();
                                            }
                                            return Unit.f5554a;
                                        }
                                    }
                                };
                                eVar.f1122e = function2;
                                eVar.f1123i = uVar3;
                                eVar.f1124r = b0Var;
                                eVar.f1125s = context;
                                eVar.f1126t = b0Var;
                                eVar.f1127u = dVar2;
                                eVar.f1121d = z11;
                                eVar.f1130x = 3;
                                Object b10 = uVar3.b(j, r11, eVar);
                                if (b10 != aVar) {
                                    function22 = function2;
                                    dVar = dVar2;
                                    uVar2 = uVar3;
                                    obj2 = b10;
                                    b0Var2 = b0Var;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                uVar = uVar3;
                                throw th;
                            }
                        } else {
                            if (!z11 && b0Var5.f1110c) {
                                g8.b.L(1, "Cannot upgrade connection from reader to writer");
                                throw null;
                            }
                            if (eVar.getContext().m(this.f1133i) == null) {
                                a aVar3 = new a(this.f1133i, b0Var5);
                                ThreadLocal threadLocal = this.f1134r;
                                threadLocal.getClass();
                                CoroutineContext c10 = kotlin.coroutines.e.c(aVar3, new le.w(b0Var5, threadLocal));
                                a3.t tVar = new a3.t(function2, b0Var5, z12 ? 1 : 0, 1);
                                eVar.f1130x = 1;
                                Object B = ge.a0.B(c10, tVar, eVar);
                                if (B != aVar) {
                                    return B;
                                }
                            } else {
                                eVar.f1130x = 2;
                                Object invoke = function2.invoke(b0Var5, eVar);
                                if (invoke != aVar) {
                                    return invoke;
                                }
                            }
                        }
                        return aVar;
                    }
                    if (i3 == 1) {
                        cf.c.M(obj2);
                        return obj2;
                    }
                    if (i3 == 2) {
                        cf.c.M(obj2);
                        return obj2;
                    }
                    if (i3 == 3) {
                        z11 = eVar.f1121d;
                        dVar = eVar.f1127u;
                        wd.b0 b0Var6 = eVar.f1126t;
                        CoroutineContext coroutineContext2 = eVar.f1125s;
                        wd.b0 b0Var7 = eVar.f1124r;
                        uVar2 = (u) eVar.f1123i;
                        function22 = (Function2) eVar.f1122e;
                        try {
                            cf.c.M(obj2);
                            b0Var2 = b0Var6;
                            b0Var = b0Var7;
                            context = coroutineContext2;
                        } catch (Throwable th3) {
                            th = th3;
                            b0Var = b0Var7;
                            uVar = uVar2;
                            throw th;
                        }
                    } else {
                        if (i3 != 4) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b0Var3 = (wd.b0) eVar.f1123i;
                        uVar = (u) eVar.f1122e;
                        try {
                            cf.c.M(obj2);
                            b0Var4 = (b0) b0Var3.f10141d;
                            if (b0Var4 != null) {
                                if (!b0Var4.f1112e) {
                                    b0Var4.f1112e = true;
                                    if (b0Var4.f1109b.f1140d.t()) {
                                        g8.b.y(b0Var4.f1109b, "ROLLBACK TRANSACTION");
                                    }
                                }
                                i iVar = b0Var4.f1109b;
                                iVar.f1142i = null;
                                iVar.f1143r = null;
                                uVar.e(iVar);
                            }
                            return obj2;
                        } catch (Throwable th4) {
                            b0Var = b0Var3;
                            th = th4;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    i iVar2 = (i) obj2;
                    iVar2.getClass();
                    context.getClass();
                    iVar2.f1142i = context;
                    iVar2.f1143r = new Throwable();
                    b0Var2.f10141d = new b0(dVar, iVar2, this.f1131d == this.f1132e && z11);
                    obj = b0Var.f10141d;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    b0 b0Var8 = (b0) obj;
                    a aVar4 = new a(this.f1133i, b0Var8);
                    ThreadLocal threadLocal2 = this.f1134r;
                    threadLocal2.getClass();
                    CoroutineContext c11 = kotlin.coroutines.e.c(aVar4, new le.w(b0Var8, threadLocal2));
                    a3.t tVar2 = new a3.t(function22, b0Var, z13 ? 1 : 0, 2);
                    eVar.f1122e = uVar2;
                    eVar.f1123i = b0Var;
                    eVar.f1124r = null;
                    eVar.f1125s = null;
                    eVar.f1126t = null;
                    eVar.f1127u = null;
                    eVar.f1130x = 4;
                    obj2 = ge.a0.B(c11, tVar2, eVar);
                    if (obj2 != aVar) {
                        b0Var3 = b0Var;
                        uVar = uVar2;
                        b0Var4 = (b0) b0Var3.f10141d;
                        if (b0Var4 != null) {
                        }
                        return obj2;
                    }
                    return aVar;
                }
            }
            i iVar22 = (i) obj2;
            iVar22.getClass();
            context.getClass();
            iVar22.f1142i = context;
            iVar22.f1143r = new Throwable();
            b0Var2.f10141d = new b0(dVar, iVar22, this.f1131d == this.f1132e && z11);
            obj = b0Var.f10141d;
            if (obj != null) {
            }
        } catch (Throwable th5) {
            th = th5;
            uVar = uVar2;
            throw th;
        }
        eVar = new e(this, cVar);
        Object obj22 = eVar.f1128v;
        md.a aVar5 = md.a.f6622d;
        i3 = eVar.f1130x;
        CoroutineContext coroutineContext3 = null;
        boolean z122 = false;
        boolean z132 = false;
        boolean z142 = false;
        if (i3 != 0) {
        }
    }

    public f(c6.l lVar) {
        long i3;
        this.f1133i = new u8.d(10);
        this.f1134r = new ThreadLocal();
        ee.a aVar = ee.b.f3956e;
        ee.d dVar = ee.d.SECONDS;
        if (dVar.compareTo(dVar) <= 0) {
            i3 = ee.i.c(TimeUnit.NANOSECONDS.convert(30, TimeUnit.SECONDS));
        } else {
            i3 = ee.i.i(30, dVar);
        }
        this.f1136t = i3;
        this.f1137u = 2;
        u uVar = new u(1, new a1.b(5, lVar));
        this.f1131d = uVar;
        this.f1132e = uVar;
    }
}
