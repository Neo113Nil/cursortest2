package K;

import b0.C0178i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final B2.d f771a = new B2.d();

    /* renamed from: b, reason: collision with root package name */
    public final C0178i f772b = new C0178i(7);

    /* renamed from: c, reason: collision with root package name */
    public final b0.r f773c = new b0.r((l2.p) new g0(2, null));

    public h0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f772b.f2532b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.c(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(l2.l lVar, AbstractC0326c abstractC0326c) {
        e0 e0Var;
        EnumC0317a enumC0317a;
        int i3;
        B2.d dVar;
        Throwable th;
        B2.a aVar;
        Object invoke;
        try {
            if (abstractC0326c instanceof e0) {
                e0Var = (e0) abstractC0326c;
                int i4 = e0Var.f760h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    e0Var.f760h = i4 - Integer.MIN_VALUE;
                    Object obj = e0Var.f;
                    enumC0317a = EnumC0317a.f4969a;
                    i3 = e0Var.f760h;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        e0Var.f757d = lVar;
                        dVar = this.f771a;
                        e0Var.f758e = dVar;
                        e0Var.f760h = 1;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (B2.a) e0Var.f757d;
                            try {
                                android.support.v4.media.session.a.T(obj);
                                ((B2.d) aVar).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((B2.d) aVar).e(null);
                                throw th;
                            }
                        }
                        B2.d dVar2 = e0Var.f758e;
                        l2.l lVar2 = (l2.l) e0Var.f757d;
                        android.support.v4.media.session.a.T(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    e0Var.f757d = dVar;
                    e0Var.f758e = null;
                    e0Var.f760h = 2;
                    invoke = lVar.invoke(e0Var);
                    if (invoke != enumC0317a) {
                        B2.d dVar3 = dVar;
                        obj = invoke;
                        aVar = dVar3;
                        ((B2.d) aVar).e(null);
                        return obj;
                    }
                    return enumC0317a;
                }
            }
            e0Var.f757d = dVar;
            e0Var.f758e = null;
            e0Var.f760h = 2;
            invoke = lVar.invoke(e0Var);
            if (invoke != enumC0317a) {
            }
            return enumC0317a;
        } catch (Throwable th3) {
            B2.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((B2.d) aVar).e(null);
            throw th;
        }
        e0Var = new e0(this, abstractC0326c);
        Object obj2 = e0Var.f;
        enumC0317a = EnumC0317a.f4969a;
        i3 = e0Var.f760h;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(l2.p pVar, AbstractC0326c abstractC0326c) {
        f0 f0Var;
        int i3;
        B2.d dVar;
        Throwable th;
        boolean z;
        if (abstractC0326c instanceof f0) {
            f0Var = (f0) abstractC0326c;
            int i4 = f0Var.f765h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                f0Var.f765h = i4 - Integer.MIN_VALUE;
                Object obj = f0Var.f;
                Object obj2 = EnumC0317a.f4969a;
                i3 = f0Var.f765h;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj);
                    B2.d dVar2 = this.f771a;
                    boolean d3 = dVar2.d();
                    try {
                        Object valueOf = Boolean.valueOf(d3);
                        f0Var.f762d = dVar2;
                        f0Var.f763e = d3;
                        f0Var.f765h = 1;
                        Object invoke = pVar.invoke(valueOf, f0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z = d3;
                    } catch (Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z = d3;
                        if (z) {
                            dVar.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = f0Var.f763e;
                    dVar = f0Var.f762d;
                    try {
                        android.support.v4.media.session.a.T(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    dVar.e(null);
                }
                return obj;
            }
        }
        f0Var = new f0(this, abstractC0326c);
        Object obj3 = f0Var.f;
        Object obj22 = EnumC0317a.f4969a;
        i3 = f0Var.f765h;
        if (i3 != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}
