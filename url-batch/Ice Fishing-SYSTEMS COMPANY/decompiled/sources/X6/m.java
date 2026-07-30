package X6;

import b7.C0531a;
import c7.t;
import c7.u;
import d7.C4461a;
import i7.C4585a;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import k7.C4668i;
import m7.C4788b;
import m7.C4792f;
import m7.C4793g;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3870b;

    public /* synthetic */ m(int i, Object obj) {
        this.f3869a = i;
        this.f3870b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f3869a) {
            case 0:
                U6.a aVar = (U6.a) obj;
                n nVar = (n) this.f3870b;
                nVar.f3875w.apply(aVar);
                C0531a c0531a = C0531a.f5575a;
                boolean z8 = l.f3866c;
                h hVar = nVar.f3872n;
                return z8 ? new e(hVar, aVar, c0531a) : new l(hVar, aVar, c0531a);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getValue() == null) {
                    return new C4585a(new C4668i(new ArrayList((ArrayList) this.f3870b)));
                }
                throw new ClassCastException();
            case 2:
                U6.a aVar2 = (U6.a) obj;
                u uVar = (u) this.f3870b;
                uVar.getClass();
                uVar.f5757z.apply(aVar2);
                return new t(uVar.f5754w, aVar2, uVar.f5752u, C4461a.f37207a);
            default:
                ((C4793g) this.f3870b).f39594v.apply((U6.a) obj);
                return C4792f.f39590a ? new C4788b() : new C4792f();
        }
    }
}
