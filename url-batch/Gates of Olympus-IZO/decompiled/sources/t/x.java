package t;

import F.C0036e;
import I.C0132z;
import I.InterfaceC0088c0;
import M1.B;
import android.content.res.Configuration;
import android.os.CancellationSignal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.InterfaceC0285r;
import d0.InterfaceC0323d;
import e0.C0336b;
import f.AbstractC0382a;
import h1.C0438i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.J;
import r0.C0837j;
import t0.D;
import t0.E;
import t0.InterfaceC0893a;
import t0.a0;
import u.C0921C;
import u.C0928J;
import u.C0950s;
import u0.AbstractC0977i0;
import u0.C0967d0;
import u0.C0979j0;

/* loaded from: classes.dex */
public final class x extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7686f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i3, Object obj) {
        super(1);
        this.f7685e = i3;
        this.f7686f = obj;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [r0.H, t0.a] */
    @Override // Y1.c
    public final Object j(Object obj) {
        r rVar;
        int i3;
        L1.z zVar = L1.z.f2729a;
        Object obj2 = this.f7686f;
        switch (this.f7685e) {
            case 0:
                float f3 = -((Number) obj).floatValue();
                y yVar = (y) obj2;
                if ((f3 < 0.0f && !yVar.a()) || (f3 > 0.0f && !yVar.c())) {
                    f3 = 0.0f;
                } else {
                    if (Math.abs(yVar.f7692e) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + yVar.f7692e).toString());
                    }
                    float f4 = yVar.f7692e + f3;
                    yVar.f7692e = f4;
                    if (Math.abs(f4) > 0.5f) {
                        p pVar = (p) yVar.f7690c.getValue();
                        float f5 = yVar.f7692e;
                        int M3 = B.M(f5);
                        if (!pVar.f7633e) {
                            ?? r11 = pVar.f7635g;
                            if (!r11.isEmpty() && (rVar = pVar.f7629a) != null && (i3 = pVar.f7630b - M3) >= 0 && i3 < rVar.f7666g) {
                                q qVar = (q) M1.l.m0(r11);
                                q qVar2 = (q) M1.l.s0(r11);
                                qVar.getClass();
                                qVar2.getClass();
                                J j3 = pVar.f7639k;
                                int i4 = pVar.f7637i;
                                int i5 = pVar.f7636h;
                                if (M3 >= 0 ? Math.min(i5 - g2.i.T(qVar, j3), i4 - g2.i.T(qVar2, j3)) > M3 : Math.min((g2.i.T(qVar, j3) + qVar.f7655m) - i5, (g2.i.T(qVar2, j3) + qVar2.f7655m) - i4) > (-M3)) {
                                    pVar.f7630b -= M3;
                                    int size = r11.size();
                                    int i6 = 0;
                                    while (i6 < size) {
                                        q qVar3 = (q) r11.get(i6);
                                        qVar3.getClass();
                                        long j4 = qVar3.p;
                                        float f6 = f5;
                                        qVar3.p = I2.d.c((int) (j4 >> 32), ((int) (j4 & 4294967295L)) + M3);
                                        int size2 = qVar3.f7648f.size();
                                        for (int i7 = 0; i7 < size2; i7++) {
                                            qVar3.f7651i.a(i7, qVar3.f7644b);
                                        }
                                        i6++;
                                        f5 = f6;
                                    }
                                    float f7 = f5;
                                    pVar.f7632d = M3;
                                    if (!pVar.f7631c && M3 > 0) {
                                        pVar.f7631c = true;
                                    }
                                    yVar.f(pVar, true);
                                    yVar.p.setValue(zVar);
                                    yVar.h(f7 - yVar.f7692e, pVar);
                                }
                            }
                        }
                        D d3 = yVar.f7695h;
                        if (d3 != null) {
                            d3.k();
                        }
                        yVar.h(f5 - yVar.f7692e, yVar.g());
                    }
                    if (Math.abs(yVar.f7692e) > 0.5f) {
                        f3 -= yVar.f7692e;
                        yVar.f7692e = 0.0f;
                    }
                }
                return Float.valueOf(-f3);
            case 1:
                InterfaceC0893a interfaceC0893a = (InterfaceC0893a) obj;
                if (interfaceC0893a.h()) {
                    if (interfaceC0893a.i().f7739b) {
                        interfaceC0893a.e();
                    }
                    Iterator it = interfaceC0893a.i().f7746i.entrySet().iterator();
                    while (true) {
                        E e3 = (E) obj2;
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            E.a(e3, (C0837j) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0893a.A());
                        } else {
                            a0 a0Var = interfaceC0893a.A().f7878q;
                            Z1.i.c(a0Var);
                            while (!a0Var.equals(e3.f7738a.A())) {
                                for (C0837j c0837j : e3.b(a0Var).keySet()) {
                                    E.a(e3, c0837j, e3.c(a0Var, c0837j), a0Var);
                                }
                                a0Var = a0Var.f7878q;
                                Z1.i.c(a0Var);
                            }
                        }
                    }
                }
                return zVar;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((K.d) obj2).b((U.j) obj);
                return Boolean.TRUE;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return new P0.a(3, (C0950s) obj2);
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return new P0.a(5, (C0921C) obj2);
            case 5:
                Configuration configuration = new Configuration((Configuration) obj);
                C0132z c0132z = AndroidCompositionLocals_androidKt.f3737a;
                ((InterfaceC0088c0) obj2).setValue(configuration);
                return zVar;
            case 6:
                return new P0.a(6, (C0967d0) obj2);
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                if (AbstractC0977i0.f8336b.compareAndSet(false, true)) {
                    ((m2.e) obj2).g(zVar);
                }
                return zVar;
            case 8:
                InterfaceC0323d interfaceC0323d = (InterfaceC0323d) obj;
                InterfaceC0285r h3 = interfaceC0323d.P().h();
                C0036e c0036e = ((C0979j0) obj2).f8341g;
                if (c0036e != null) {
                    c0036e.g(h3, (C0336b) interfaceC0323d.P().f537c);
                }
                return zVar;
            case AbstractC0382a.f4777a /* 9 */:
                ((C0036e) obj2).g((InterfaceC0285r) obj, null);
                return zVar;
            case AbstractC0382a.f4779c /* 10 */:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return zVar;
            case 11:
                z0.s.c((z0.i) obj, ((z0.f) obj2).f8953a);
                return zVar;
            default:
                ((List) obj).add((Float) ((C0928J) obj2).b());
                return true;
        }
    }
}
