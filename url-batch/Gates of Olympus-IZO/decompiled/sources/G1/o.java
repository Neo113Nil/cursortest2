package G1;

import H1.v;
import H1.y;
import L1.z;
import Z1.t;
import e1.C0351N;
import e1.C0354c;
import e1.C0372v;
import e1.O;
import e1.Q;
import e1.Y;
import e1.a0;
import h1.C0438i;
import java.util.Map;
import java.util.Set;
import n2.C0692Q;
import n2.InterfaceC0701g;
import o2.C0752a;
import u0.C0987n0;

/* loaded from: classes.dex */
public final class o implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1571e;

    public /* synthetic */ o(int i3, Object obj) {
        this.f1570d = i3;
        this.f1571e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    @Override // n2.InterfaceC0701g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, P1.d dVar) {
        Object value;
        n nVar;
        com.gates.olympus.miruv.data.a aVar;
        Object value2;
        Object value3;
        I1.i iVar;
        com.gates.olympus.miruv.data.a aVar2;
        C0372v c0372v;
        int i3;
        Object b2;
        switch (this.f1570d) {
            case 0:
                Map map = (Map) obj;
                C0692Q c0692q = ((r) this.f1571e).f1577c;
                do {
                    value = c0692q.getValue();
                    nVar = (n) value;
                    aVar = (com.gates.olympus.miruv.data.a) map.get("guess");
                } while (!c0692q.i(value, n.a(nVar, null, 0, 0, null, false, false, aVar != null ? aVar.getBestScore() : 0, 63)));
                return z.f2729a;
            case 1:
                Set set = (Set) obj;
                C0692Q c0692q2 = ((y) this.f1571e).f1919c;
                do {
                    value2 = c0692q2.getValue();
                } while (!c0692q2.i(value2, v.a((v) value2, null, set, 3)));
                return z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                Map map2 = (Map) obj;
                C0692Q c0692q3 = ((I1.m) this.f1571e).f2484c;
                do {
                    value3 = c0692q3.getValue();
                    iVar = (I1.i) value3;
                    aVar2 = (com.gates.olympus.miruv.data.a) map2.get("match");
                } while (!c0692q3.i(value3, I1.i.a(iVar, null, 0, 0, false, false, aVar2 != null ? aVar2.getBestScore() : 0, 63)));
                return z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                Object d3 = ((m2.q) ((m2.r) this.f1571e)).f5977g.d(dVar, obj);
                return d3 == Q1.a.f3113d ? d3 : z.f2729a;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                if (dVar instanceof C0372v) {
                    c0372v = (C0372v) dVar;
                    int i4 = c0372v.f4746e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0372v.f4746e = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0372v.f4745d;
                        Q1.a aVar3 = Q1.a.f3113d;
                        i3 = c0372v.f4746e;
                        if (i3 != 0) {
                            I2.l.Q(obj2);
                            Y y3 = (Y) obj;
                            if (y3 instanceof Q) {
                                throw ((Q) y3).f4655b;
                            }
                            if (!(y3 instanceof C0354c)) {
                                if (y3 instanceof O ? true : y3 instanceof a0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new L1.f();
                            }
                            Object obj3 = ((C0354c) y3).f4682b;
                            c0372v.f4746e = 1;
                            if (((InterfaceC0701g) this.f1571e).emit(obj3, c0372v) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            I2.l.Q(obj2);
                        }
                        return z.f2729a;
                    }
                }
                c0372v = new C0372v(this, dVar);
                Object obj22 = c0372v.f4745d;
                Q1.a aVar32 = Q1.a.f3113d;
                i3 = c0372v.f4746e;
                if (i3 != 0) {
                }
                return z.f2729a;
            case 5:
                C0351N c0351n = (C0351N) this.f1571e;
                boolean z3 = c0351n.f4645g.l() instanceof O;
                z zVar = z.f2729a;
                return (z3 || (b2 = C0351N.b(c0351n, true, dVar)) != Q1.a.f3113d) ? zVar : b2;
            case 6:
                ((t) this.f1571e).f3480d = obj;
                throw new C0752a(this);
            default:
                ((C0987n0) this.f1571e).f8378d.h(((Number) obj).floatValue());
                return z.f2729a;
        }
    }
}
