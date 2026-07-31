package l0;

import H5.InterfaceC0163x;
import androidx.work.CoroutineWorker;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class f extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f5267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f5268g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f5268g = coroutineWorker;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        return new f(this.f5268g, interfaceC0564d);
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0163x) obj, (InterfaceC0564d) obj2)).invokeSuspend(k5.v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f5267f;
        CoroutineWorker coroutineWorker = this.f5268g;
        try {
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                this.f5267f = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            coroutineWorker.getFuture$work_runtime_ktx_release().i((o) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture$work_runtime_ktx_release().j(th);
        }
        return k5.v.f5219a;
    }
}
