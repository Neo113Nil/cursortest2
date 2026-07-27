package M3;

import R3.u;
import R3.v;
import b4.C0287b;
import b4.C0291f;
import b4.C0292g;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1980b;

    public /* synthetic */ n(int i2, Object obj) {
        this.f1979a = i2;
        this.f1980b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f1979a) {
            case 0:
                J3.a aVar = (J3.a) obj;
                o oVar = (o) this.f1980b;
                oVar.f1985d.apply(aVar);
                Q3.a aVar2 = Q3.a.f2493a;
                boolean z = m.f1976c;
                i iVar = oVar.f1982a;
                return z ? new e(iVar, aVar, aVar2) : new m(iVar, aVar, aVar2);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getValue() == null) {
                    return new X3.a(new Z3.i(new ArrayList((ArrayList) this.f1980b)));
                }
                throw new ClassCastException();
            case 2:
                J3.a aVar3 = (J3.a) obj;
                v vVar = (v) this.f1980b;
                vVar.getClass();
                vVar.f2668g.apply(aVar3);
                return new u(vVar.f2665d, aVar3, vVar.f2663b, S3.a.f2750a);
            default:
                ((C0292g) this.f1980b).f4842c.apply((J3.a) obj);
                return C0291f.f4838a ? new C0287b() : new C0291f();
        }
    }
}
