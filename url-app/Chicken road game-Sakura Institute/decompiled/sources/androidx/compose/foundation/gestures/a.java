package androidx.compose.foundation.gestures;

import E2.c;
import M2.B;
import S.o;
import m.b0;
import m.i0;
import o.C0898m;
import o.C0908r0;
import o.InterfaceC0880d;
import o.InterfaceC0893j0;
import o.N;
import o.U;
import o.V;
import o.W;
import o.X;
import o.Y;
import p.C0935k;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final V f5054a = new V();

    /* renamed from: b, reason: collision with root package name */
    public static final U f5055b = new U();

    /* renamed from: c, reason: collision with root package name */
    public static final W f5056c = new W();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0908r0 c0908r0, long j4, c cVar) {
        X x2;
        int i2;
        B b4;
        if (cVar instanceof X) {
            x2 = (X) cVar;
            int i4 = x2.f8731m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x2.f8731m = i4 - Integer.MIN_VALUE;
                Object obj = x2.f8730l;
                D2.a aVar = D2.a.f2163d;
                i2 = x2.f8731m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    b4 = new B();
                    b0 b0Var = b0.f8079d;
                    Y y4 = new Y(c0908r0, j4, b4, null);
                    x2.f8728j = c0908r0;
                    x2.f8729k = b4;
                    x2.f8731m = 1;
                    if (c0908r0.e(b0Var, y4, x2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    B b5 = x2.f8729k;
                    C0908r0 c0908r02 = x2.f8728j;
                    AbstractC1343r.b(obj);
                    b4 = b5;
                    c0908r0 = c0908r02;
                }
                return new Y.c(c0908r0.g(b4.f3577d));
            }
        }
        x2 = new X(cVar);
        Object obj2 = x2.f8730l;
        D2.a aVar2 = D2.a.f2163d;
        i2 = x2.f8731m;
        if (i2 != 0) {
        }
        return new Y.c(c0908r0.g(b4.f3577d));
    }

    public static final o b(o oVar, InterfaceC0893j0 interfaceC0893j0, N n2, i0 i0Var, boolean z4, boolean z5, C0898m c0898m, C0935k c0935k, InterfaceC0880d interfaceC0880d) {
        return oVar.h(new ScrollableElement(i0Var, interfaceC0880d, c0898m, n2, interfaceC0893j0, c0935k, z4, z5));
    }
}
