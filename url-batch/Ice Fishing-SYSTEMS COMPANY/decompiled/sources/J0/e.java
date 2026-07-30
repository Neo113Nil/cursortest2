package J0;

import O7.InterfaceC0397w;
import androidx.work.CoroutineWorker;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public final class e extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public m f1307n;

    /* renamed from: u, reason: collision with root package name */
    public int f1308u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f1309v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, CoroutineWorker coroutineWorker, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f1309v = mVar;
        this.f1310w = coroutineWorker;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new e(this.f1309v, this.f1310w, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f1308u;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            m mVar2 = this.f1309v;
            this.f1307n = mVar2;
            this.f1308u = 1;
            Object foregroundInfo = this.f1310w.getForegroundInfo(this);
            if (foregroundInfo == enumC5179a) {
                return enumC5179a;
            }
            mVar = mVar2;
            obj = foregroundInfo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = this.f1307n;
            com.bumptech.glide.f.r(obj);
        }
        mVar.f1325n.j(obj);
        return q7.v.f40183a;
    }
}
