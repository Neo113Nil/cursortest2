package s;

import A.AbstractC0017m;
import kotlin.jvm.functions.Function1;

/* renamed from: s.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087C extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1089E f9879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1087C(C1089E c1089e, int i2) {
        super(1);
        this.f9878d = i2;
        this.f9879e = c1089e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9878d) {
            case 0:
                r.h hVar = (r.h) this.f9879e.f9884t.invoke();
                int c4 = hVar.c();
                int i2 = 0;
                while (true) {
                    if (i2 >= c4) {
                        i2 = -1;
                    } else if (!hVar.d(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Number) obj).intValue();
                C1089E c1089e = this.f9879e;
                r.h hVar2 = (r.h) c1089e.f9884t.invoke();
                if (intValue >= 0 && intValue < hVar2.c()) {
                    W2.B.m(c1089e.p0(), null, null, new C1088D(c1089e, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder o4 = AbstractC0017m.o(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                o4.append(hVar2.c());
                o4.append(')');
                throw new IllegalArgumentException(o4.toString().toString());
        }
    }
}
