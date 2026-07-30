package T;

import X5.j;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2558d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2559e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f2560i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(Function2 function2, V5.b bVar) {
        super(2, bVar);
        this.f2560i = (j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        h hVar = new h(this.f2560i, bVar);
        hVar.f2559e = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2558d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f2559e;
            V6.b.P(obj);
            return bVar;
        }
        V6.b.P(obj);
        b bVar2 = new b(I.j(((b) this.f2559e).a()), false);
        this.f2559e = bVar2;
        this.f2558d = 1;
        return this.f2560i.invoke(bVar2, this) == aVar ? aVar : bVar2;
    }
}
