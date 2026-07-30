package T;

import X5.j;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2552d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2553e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f2554i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, V5.b bVar) {
        super(2, bVar);
        this.f2554i = (j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        c cVar = new c(this.f2554i, bVar);
        cVar.f2553e = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2552d;
        if (i2 == 0) {
            V6.b.P(obj);
            b bVar = (b) this.f2553e;
            this.f2552d = 1;
            obj = this.f2554i.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        b bVar2 = (b) obj;
        Intrinsics.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f2551b.f152e).set(true);
        return bVar2;
    }
}
