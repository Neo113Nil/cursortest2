package p6;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n6.C0775h;
import n6.C0787u;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f7255a = new i();

    public static c a(int i2, EnumC0830a enumC0830a, int i5) {
        if ((i5 & 2) != 0) {
            enumC0830a = EnumC0830a.f7215d;
        }
        if (i2 == -2) {
            if (enumC0830a != EnumC0830a.f7215d) {
                return new m(1, enumC0830a);
            }
            g.f7253g.getClass();
            return new c(f.f7252b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? enumC0830a == EnumC0830a.f7215d ? new c(i2) : new m(i2, enumC0830a) : new c(Integer.MAX_VALUE) : enumC0830a == EnumC0830a.f7215d ? new c(0) : new m(1, enumC0830a);
        }
        if (enumC0830a == EnumC0830a.f7215d) {
            return new m(1, EnumC0830a.f7216e);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(q qVar, A0.j jVar, X5.c cVar) {
        n frame;
        int i2;
        try {
            if (cVar instanceof n) {
                frame = (n) cVar;
                int i5 = frame.f7261i;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    frame.f7261i = i5 - Integer.MIN_VALUE;
                    Object obj = frame.f7260e;
                    W5.a aVar = W5.a.f2787d;
                    i2 = frame.f7261i;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        if (frame.getContext().g(C0787u.f7085e) != qVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        frame.f7259d = jVar;
                        frame.f7261i = 1;
                        C0775h c0775h = new C0775h(1, W5.d.b(frame));
                        c0775h.s();
                        ((p) qVar).Z(new o(c0775h));
                        Object r7 = c0775h.r();
                        if (r7 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (r7 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = frame.f7259d;
                        V6.b.P(obj);
                    }
                    jVar.invoke();
                    return Unit.f6114a;
                }
            }
            if (i2 != 0) {
            }
            jVar.invoke();
            return Unit.f6114a;
        } catch (Throwable th) {
            jVar.invoke();
            throw th;
        }
        frame = new n(cVar);
        Object obj2 = frame.f7260e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = frame.f7261i;
    }
}
