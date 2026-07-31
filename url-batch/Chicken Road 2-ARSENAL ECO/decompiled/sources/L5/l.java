package L5;

import M5.v;
import o5.C0570j;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final v f1515a = new v("NULL", 0);

    public static K5.c a(a aVar, I5.e eVar, int i7, int i8, int i9) {
        InterfaceC0569i interfaceC0569i = eVar;
        if ((i9 & 1) != 0) {
            interfaceC0569i = C0570j.f5620f;
        }
        if ((i9 & 2) != 0) {
            i7 = -3;
        }
        if ((i9 & 4) != 0) {
            i8 = 1;
        }
        int i10 = aVar.f1485h;
        int i11 = aVar.f1484g;
        InterfaceC0569i interfaceC0569i2 = (InterfaceC0569i) aVar.f1486i;
        InterfaceC0569i v5 = interfaceC0569i.v(interfaceC0569i2);
        if (i8 == 1) {
            if (i11 != -3) {
                if (i7 != -3) {
                    if (i11 != -2) {
                        if (i7 != -2) {
                            i7 += i11;
                            if (i7 < 0) {
                                i7 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i7 = i11;
            }
            i8 = i10;
        }
        return (kotlin.jvm.internal.i.a(v5, interfaceC0569i2) && i7 == i11 && i8 == i10) ? aVar : aVar.d(v5, i7, i8);
    }

    public static final Object b(InterfaceC0569i interfaceC0569i, Object obj, Object obj2, InterfaceC0747p interfaceC0747p, AbstractC0607c abstractC0607c) {
        Object m4 = M5.a.m(interfaceC0569i, obj2);
        try {
            n nVar = new n(abstractC0607c, interfaceC0569i);
            kotlin.jvm.internal.v.b(2, interfaceC0747p);
            Object invoke = interfaceC0747p.invoke(obj, nVar);
            M5.a.g(interfaceC0569i, m4);
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            return invoke;
        } catch (Throwable th) {
            M5.a.g(interfaceC0569i, m4);
            throw th;
        }
    }
}
