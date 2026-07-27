package l0;

import W2.C0286h;
import W2.InterfaceC0284f;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.ranges.IntRange;
import o.C0888h;
import p0.InterfaceC0980p;
import s.C1104h;
import y2.AbstractC1341p;

/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0810h {

    /* renamed from: a, reason: collision with root package name */
    public final I.d f7906a;

    public C0810h(int i2) {
        switch (i2) {
            case 1:
                this.f7906a = new I.d(new C0888h[16]);
                break;
            case 2:
                this.f7906a = new I.d(new C1104h[16]);
                break;
            default:
                this.f7906a = new I.d(new C0809g[16]);
                break;
        }
    }

    public boolean a(i.m mVar, InterfaceC0980p interfaceC0980p, y.t tVar, boolean z4) {
        I.d dVar = this.f7906a;
        int i2 = dVar.f3332i;
        if (i2 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f3330d;
        int i4 = 0;
        boolean z5 = false;
        do {
            z5 = ((C0809g) objArr[i4]).a(mVar, interfaceC0980p, tVar, z4) || z5;
            i4++;
        } while (i4 < i2);
        return z5;
    }

    public void b(CancellationException cancellationException) {
        I.d dVar = this.f7906a;
        int i2 = dVar.f3332i;
        InterfaceC0284f[] interfaceC0284fArr = new InterfaceC0284f[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            interfaceC0284fArr[i4] = ((C0888h) dVar.f3330d[i4]).f8774b;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            interfaceC0284fArr[i5].H(cancellationException);
        }
        if (!dVar.k()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void c(y.t tVar) {
        I.d dVar = this.f7906a;
        int i2 = dVar.f3332i;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            }
            if (((C0809g) dVar.f3330d[i2]).f7899c.f3164a == 0) {
                dVar.n(i2);
            }
        }
    }

    public void d() {
        int i2 = 0;
        while (true) {
            I.d dVar = this.f7906a;
            if (i2 >= dVar.f3332i) {
                return;
            }
            C0809g c0809g = (C0809g) dVar.f3330d[i2];
            if (c0809g.f7898b.f3990s) {
                i2++;
                c0809g.d();
            } else {
                c0809g.f();
                dVar.n(i2);
            }
        }
    }

    public void e() {
        I.d dVar = this.f7906a;
        int i2 = 0;
        int i4 = new IntRange(0, dVar.f3332i - 1, 1).f7506e;
        if (i4 >= 0) {
            while (true) {
                C0286h c0286h = ((C0888h) dVar.f3330d[i2]).f8774b;
                Unit unit = Unit.f7487a;
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                c0286h.u(unit);
                if (i2 == i4) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        dVar.g();
    }
}
