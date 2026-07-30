package G0;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class g extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CoroutineWorker coroutineWorker, V5.b bVar) {
        super(2, bVar);
        this.f807e = coroutineWorker;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new g(this.f807e, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f806d;
        CoroutineWorker coroutineWorker = this.f807e;
        try {
            if (i2 == 0) {
                V6.b.P(obj);
                this.f806d = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            coroutineWorker.getFuture$work_runtime_ktx_release().i((q) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture$work_runtime_ktx_release().j(th);
        }
        return Unit.f6114a;
    }
}
