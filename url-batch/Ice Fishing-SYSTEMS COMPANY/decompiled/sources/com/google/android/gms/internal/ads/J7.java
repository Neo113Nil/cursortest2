package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class J7 extends P7 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25736h = 3;
    public final Object i;

    public J7(C4101w7 c4101w7, C3830r6 c3830r6, int i, View view) {
        super(c4101w7, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", c3830r6, i, 57);
        this.i = view;
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void a() {
        switch (this.f25736h) {
            case 0:
                Method method = this.f26845e;
                E0 e02 = (E0) this.i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(e02.f24623c), Long.valueOf(e02.f24624d), Long.valueOf(e02.f24625e), Long.valueOf(e02.f24626f));
                C3830r6 c3830r6 = this.f26844d;
                synchronized (c3830r6) {
                    long j9 = jArr[0];
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).j0(j9);
                    long j10 = jArr[1];
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).k0(j10);
                }
                return;
            case 1:
                Method method2 = this.f26845e;
                Rx rx = (Rx) this.i;
                List list = (List) rx.f27448u;
                rx.f27448u = Collections.EMPTY_LIST;
                int intValue = ((Integer) method2.invoke(null, list)).intValue();
                C3830r6 c3830r62 = this.f26844d;
                synchronized (c3830r62) {
                    int b9 = AbstractC3035cL.b(intValue);
                    c3830r62.h();
                    ((D6) c3830r62.f30000u).u0(b9);
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
                if (stackTraceElementArr != null) {
                    C3508l7 c3508l7 = new C3508l7((String) this.f26845e.invoke(null, stackTraceElementArr));
                    C3830r6 c3830r63 = this.f26844d;
                    synchronized (c3830r63) {
                        try {
                            long longValue = c3508l7.J.longValue();
                            c3830r63.h();
                            ((D6) c3830r63.f30000u).N(longValue);
                            if (((Boolean) c3508l7.f32542K).booleanValue()) {
                                int i = true != ((Boolean) c3508l7.f32543L).booleanValue() ? 2 : 1;
                                c3830r63.h();
                                ((D6) c3830r63.f30000u).r0(i);
                            } else {
                                c3830r63.h();
                                ((D6) c3830r63.f30000u).r0(3);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.i;
                if (view != null) {
                    C3151ea c3151ea = AbstractC3368ia.f31720l4;
                    q2.r rVar = q2.r.f40116e;
                    Boolean bool = (Boolean) rVar.f40119c.a(c3151ea);
                    Boolean bool2 = (Boolean) rVar.f40119c.a(AbstractC3368ia.rc);
                    String str = (String) this.f26845e.invoke(null, view, this.f26841a.f34929a.getResources().getDisplayMetrics(), bool, bool2);
                    A7 a72 = new A7(19);
                    HashMap o9 = AbstractC2720Pd.o(str);
                    if (o9 != null) {
                        a72.f23829I = (Long) o9.get(0);
                        a72.J = (Long) o9.get(1);
                        a72.f23830K = (Long) o9.get(2);
                        a72.f23831L = (Long) o9.get(3);
                        a72.f23832M = (Long) o9.get(4);
                    }
                    B6 A8 = C6.A();
                    long longValue2 = a72.f23829I.longValue();
                    A8.h();
                    ((C6) A8.f30000u).C(longValue2);
                    long longValue3 = a72.J.longValue();
                    A8.h();
                    ((C6) A8.f30000u).D(longValue3);
                    long longValue4 = a72.f23830K.longValue();
                    A8.h();
                    ((C6) A8.f30000u).E(longValue4);
                    if (bool2.booleanValue()) {
                        long longValue5 = a72.f23832M.longValue();
                        A8.h();
                        ((C6) A8.f30000u).B(longValue5);
                    }
                    if (bool.booleanValue()) {
                        long longValue6 = a72.f23831L.longValue();
                        A8.h();
                        ((C6) A8.f30000u).F(longValue6);
                    }
                    C6 c62 = (C6) A8.j();
                    C3830r6 c3830r64 = this.f26844d;
                    c3830r64.h();
                    ((D6) c3830r64.f30000u).W(c62);
                    return;
                }
                return;
        }
    }

    public J7(C4101w7 c4101w7, C3830r6 c3830r6, int i, E0 e02) {
        super(c4101w7, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", c3830r6, i, 85);
        this.i = e02;
    }

    public J7(C4101w7 c4101w7, C3830r6 c3830r6, int i, Rx rx) {
        super(c4101w7, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", c3830r6, i, 94);
        this.i = rx;
    }

    public J7(C4101w7 c4101w7, C3830r6 c3830r6, int i, StackTraceElement[] stackTraceElementArr) {
        super(c4101w7, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", c3830r6, i, 45);
        this.i = stackTraceElementArr;
    }
}
