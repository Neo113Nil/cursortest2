package J0;

import O7.InterfaceC0397w;
import androidx.work.CoroutineWorker;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public final class f extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f1311n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1312u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f1312u = coroutineWorker;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new f(this.f1312u, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f1311n;
        CoroutineWorker coroutineWorker = this.f1312u;
        try {
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                this.f1311n = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            coroutineWorker.getFuture$work_runtime_ktx_release().j((q) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture$work_runtime_ktx_release().k(th);
        }
        return q7.v.f40183a;
    }
}
