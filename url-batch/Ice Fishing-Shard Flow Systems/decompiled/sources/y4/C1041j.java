package y4;

import a.AbstractC0169a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: y4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041j extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f8594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041j(List list, V5.b bVar) {
        super(2, bVar);
        this.f8594e = list;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C1041j c1041j = new C1041j(this.f8594e, bVar);
        c1041j.f8593d = obj;
        return c1041j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1041j) create((T.b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        T.b bVar = (T.b) this.f8593d;
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        List list = this.f8594e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bVar.d(AbstractC0169a.a((String) it.next()));
            }
        } else {
            bVar.b();
            bVar.f2550a.clear();
        }
        return Unit.f6114a;
    }
}
