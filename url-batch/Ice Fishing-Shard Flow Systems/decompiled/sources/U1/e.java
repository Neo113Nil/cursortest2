package U1;

import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;
import q6.w;

/* loaded from: classes.dex */
public final class e extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2721e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.d f2722i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, T.d dVar, V5.b bVar) {
        super(2, bVar);
        this.f2721e = hVar;
        this.f2722i = dVar;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new e(this.f2721e, this.f2722i, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        Object c7;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2720d;
        if (i2 == 0) {
            V6.b.P(obj);
            q6.d data = this.f2721e.f2733c.getData();
            this.f2720d = 1;
            obj = w.d(data, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        T.b bVar = (T.b) obj;
        if (bVar == null || (c7 = bVar.c(this.f2722i)) == null) {
            return -1L;
        }
        return c7;
    }
}
