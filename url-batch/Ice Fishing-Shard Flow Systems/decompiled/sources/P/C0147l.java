package P;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v6.InterfaceC0979a;

/* renamed from: P.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0979a f2121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f2122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.D f2123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f2124d;

    public C0147l(InterfaceC0979a interfaceC0979a, kotlin.jvm.internal.B b7, kotlin.jvm.internal.D d7, Q q4) {
        this.f2121a = interfaceC0979a;
        this.f2122b = b7;
        this.f2123c = d7;
        this.f2124d = q4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [v6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0143h c0143h, X5.c cVar) {
        C0146k c0146k;
        int i2;
        Q q4;
        v6.c cVar2;
        kotlin.jvm.internal.B b7;
        kotlin.jvm.internal.D d7;
        Function2 function2;
        InterfaceC0979a interfaceC0979a;
        InterfaceC0979a interfaceC0979a2;
        Q q7;
        Object obj;
        kotlin.jvm.internal.D d8;
        try {
            if (cVar instanceof C0146k) {
                c0146k = (C0146k) cVar;
                int i5 = c0146k.f2120p;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0146k.f2120p = i5 - Integer.MIN_VALUE;
                    Object obj2 = c0146k.f2118n;
                    W5.a aVar = W5.a.f2787d;
                    i2 = c0146k.f2120p;
                    if (i2 != 0) {
                        V6.b.P(obj2);
                        c0146k.f2113d = c0143h;
                        InterfaceC0979a interfaceC0979a3 = this.f2121a;
                        c0146k.f2114e = interfaceC0979a3;
                        kotlin.jvm.internal.B b8 = this.f2122b;
                        c0146k.f2115i = b8;
                        kotlin.jvm.internal.D d9 = this.f2123c;
                        c0146k.f2116l = d9;
                        q4 = this.f2124d;
                        c0146k.f2117m = q4;
                        c0146k.f2120p = 1;
                        cVar2 = (v6.c) interfaceC0979a3;
                        if (cVar2.c(c0146k) != aVar) {
                            b7 = b8;
                            d7 = d9;
                            function2 = c0143h;
                        }
                        return aVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c0146k.f2115i;
                            d8 = (kotlin.jvm.internal.D) c0146k.f2114e;
                            interfaceC0979a = (InterfaceC0979a) c0146k.f2113d;
                            try {
                                V6.b.P(obj2);
                                d8.f6152d = obj;
                                d7 = d8;
                                Object obj3 = d7.f6152d;
                                ((v6.c) interfaceC0979a).e(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((v6.c) interfaceC0979a).e(null);
                                throw th;
                            }
                        }
                        q7 = (Q) c0146k.f2115i;
                        d7 = (kotlin.jvm.internal.D) c0146k.f2114e;
                        interfaceC0979a2 = (InterfaceC0979a) c0146k.f2113d;
                        try {
                            V6.b.P(obj2);
                            if (!Intrinsics.a(obj2, d7.f6152d)) {
                                interfaceC0979a = interfaceC0979a2;
                                Object obj32 = d7.f6152d;
                                ((v6.c) interfaceC0979a).e(null);
                                return obj32;
                            }
                            c0146k.f2113d = interfaceC0979a2;
                            c0146k.f2114e = d7;
                            c0146k.f2115i = obj2;
                            c0146k.f2120p = 3;
                            if (q7.j(obj2, false, c0146k) != aVar) {
                                obj = obj2;
                                d8 = d7;
                                interfaceC0979a = interfaceC0979a2;
                                d8.f6152d = obj;
                                d7 = d8;
                                Object obj322 = d7.f6152d;
                                ((v6.c) interfaceC0979a).e(null);
                                return obj322;
                            }
                            return aVar;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC0979a = interfaceC0979a2;
                            ((v6.c) interfaceC0979a).e(null);
                            throw th;
                        }
                    }
                    Q q8 = c0146k.f2117m;
                    d7 = c0146k.f2116l;
                    b7 = (kotlin.jvm.internal.B) c0146k.f2115i;
                    ?? r7 = (InterfaceC0979a) c0146k.f2114e;
                    Function2 function22 = (Function2) c0146k.f2113d;
                    V6.b.P(obj2);
                    q4 = q8;
                    function2 = function22;
                    cVar2 = r7;
                    if (!b7.f6150d) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = d7.f6152d;
                    c0146k.f2113d = cVar2;
                    c0146k.f2114e = d7;
                    c0146k.f2115i = q4;
                    c0146k.f2116l = null;
                    c0146k.f2117m = null;
                    c0146k.f2120p = 2;
                    Object invoke = function2.invoke(obj4, c0146k);
                    if (invoke != aVar) {
                        interfaceC0979a2 = cVar2;
                        obj2 = invoke;
                        q7 = q4;
                        if (!Intrinsics.a(obj2, d7.f6152d)) {
                        }
                    }
                    return aVar;
                }
            }
            if (!b7.f6150d) {
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC0979a = cVar2;
            ((v6.c) interfaceC0979a).e(null);
            throw th;
        }
        c0146k = new C0146k(this, cVar);
        Object obj22 = c0146k.f2118n;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0146k.f2120p;
        if (i2 != 0) {
        }
    }
}
