package D5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import v5.C0975a;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f398b;

    public /* synthetic */ w(int i2, Object obj) {
        this.f397a = i2;
        this.f398b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f397a) {
            case 0:
                List list = (List) this.f398b;
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getValue() == null) {
                    return new J5.a(new L5.i(new ArrayList(list)));
                }
                throw new ClassCastException();
            case 1:
                x xVar = (x) this.f398b;
                C0975a c0975a = (C0975a) obj;
                K5.b bVar = xVar.f403l;
                List list2 = xVar.f401e;
                xVar.f406o.apply(c0975a);
                return new u(bVar, c0975a, list2, E5.a.f705a);
            case 2:
                ((N5.h) this.f398b).f1854i.apply((C0975a) obj);
                return N5.g.f1850a ? new N5.b() : new N5.g();
            default:
                y5.m mVar = (y5.m) this.f398b;
                C0975a c0975a2 = (C0975a) obj;
                y5.h hVar = mVar.f8697d;
                mVar.f8700l.apply(c0975a2);
                boolean z7 = y5.l.f8693c;
                C5.a aVar = C5.a.f318a;
                return z7 ? new y5.e(hVar, c0975a2, aVar) : new y5.l(hVar, c0975a2, aVar);
        }
    }
}
