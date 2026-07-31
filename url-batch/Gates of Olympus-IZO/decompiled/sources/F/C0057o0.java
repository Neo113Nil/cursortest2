package F;

import e2.AbstractC0381e;
import java.util.List;
import java.util.NoSuchElementException;
import r0.InterfaceC0827A;

/* renamed from: F.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057o0 implements InterfaceC0827A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y1.a f1318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q.a f1319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1320c;

    public C0057o0(Y1.a aVar, Q.a aVar2, boolean z3) {
        this.f1318a = aVar;
        this.f1319b = aVar2;
        this.f1320c = z3;
    }

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        Object obj;
        r0.H h3;
        r0.H h4;
        C0057o0 c0057o0 = this;
        float floatValue = ((Number) c0057o0.f1318a.b()).floatValue();
        long a3 = M0.a.a(j3, 0, 0, 0, 0, 10);
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            r0.z zVar = (r0.z) list.get(i3);
            if (Z1.i.a(androidx.compose.ui.layout.a.a(zVar), "icon")) {
                r0.H b2 = zVar.b(a3);
                float f3 = 2;
                int k3 = o3.k(AbstractC0062r0.f1359d * f3) + b2.f7114d;
                int M3 = M1.B.M(k3 * floatValue);
                int k4 = o3.k(AbstractC0062r0.f1360e * f3) + b2.f7115e;
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    r0.z zVar2 = (r0.z) list.get(i4);
                    int i5 = size2;
                    if (Z1.i.a(androidx.compose.ui.layout.a.a(zVar2), "indicatorRipple")) {
                        float f4 = floatValue;
                        if (!(k3 >= 0 && k4 >= 0)) {
                            M1.B.O("width(" + k3 + ") and height(" + k4 + ") must be >= 0");
                            throw null;
                        }
                        float f5 = f3;
                        r0.H b3 = zVar2.b(I2.l.s(k3, k3, k4, k4));
                        int size3 = list.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                obj = null;
                                break;
                            }
                            Object obj2 = list.get(i6);
                            int i7 = size3;
                            obj = obj2;
                            if (Z1.i.a(androidx.compose.ui.layout.a.a((r0.z) obj2), "indicator")) {
                                break;
                            }
                            i6++;
                            size3 = i7;
                        }
                        r0.z zVar3 = (r0.z) obj;
                        if (zVar3 == null) {
                            h3 = null;
                        } else {
                            if (M3 < 0 || k4 < 0) {
                                M1.B.O("width(" + M3 + ") and height(" + k4 + ") must be >= 0");
                                throw null;
                            }
                            h3 = zVar3.b(I2.l.s(M3, M3, k4, k4));
                        }
                        Q.a aVar = c0057o0.f1319b;
                        if (aVar != null) {
                            int size4 = list.size();
                            for (int i8 = 0; i8 < size4; i8++) {
                                r0.z zVar4 = (r0.z) list.get(i8);
                                if (Z1.i.a(androidx.compose.ui.layout.a.a(zVar4), "label")) {
                                    h4 = zVar4.b(a3);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        h4 = null;
                        M1.v vVar = M1.v.f2804d;
                        if (aVar == null) {
                            int h5 = M0.a.h(j3);
                            int p = I2.l.p(j3, o3.k(AbstractC0062r0.f1356a));
                            return o3.Y(h5, p, vVar, new C0059p0(h3, b2, (h5 - b2.f7114d) / 2, (p - b2.f7115e) / 2, b3, (h5 - b3.f7114d) / 2, (p - b3.f7115e) / 2, h5, p));
                        }
                        Z1.i.c(h4);
                        float f6 = b2.f7115e;
                        float f7 = AbstractC0062r0.f1360e;
                        float a4 = (o3.a() * f7) + f6;
                        float f8 = AbstractC0062r0.f1358c;
                        float a5 = (o3.a() * f8) + a4 + h4.f7115e;
                        float n3 = AbstractC0381e.n((M0.a.i(j3) - a5) / f5, o3.a() * f7);
                        float f9 = (n3 * f5) + a5;
                        boolean z3 = c0057o0.f1320c;
                        float f10 = (1 - f4) * ((z3 ? n3 : (f9 - b2.f7115e) / f5) - n3);
                        float a6 = (o3.a() * f8) + (o3.a() * f7) + b2.f7115e + n3;
                        int h6 = M0.a.h(j3);
                        return o3.Y(h6, M1.B.M(f9), vVar, new C0061q0(h3, z3, f4, h4, (h6 - h4.f7114d) / 2, a6, f10, b2, (h6 - b2.f7114d) / 2, n3, b3, (h6 - b3.f7114d) / 2, n3 - (o3.a() * f7), h6, o3));
                    }
                    i4++;
                    c0057o0 = this;
                    size2 = i5;
                    floatValue = floatValue;
                    f3 = f3;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i3++;
            c0057o0 = this;
            floatValue = floatValue;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
