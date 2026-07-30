package G0;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class f extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public m f802d;

    /* renamed from: e, reason: collision with root package name */
    public int f803e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f804i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f805l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, CoroutineWorker coroutineWorker, V5.b bVar) {
        super(2, bVar);
        this.f804i = mVar;
        this.f805l = coroutineWorker;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new f(this.f804i, this.f805l, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f803e;
        if (i2 == 0) {
            V6.b.P(obj);
            m mVar2 = this.f804i;
            this.f802d = mVar2;
            this.f803e = 1;
            Object foregroundInfo = this.f805l.getForegroundInfo(this);
            if (foregroundInfo == aVar) {
                return aVar;
            }
            mVar = mVar2;
            obj = foregroundInfo;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = this.f802d;
            V6.b.P(obj);
        }
        mVar.f819d.i(obj);
        return Unit.f6114a;
    }
}
