package l0;

import H5.InterfaceC0163x;
import androidx.work.CoroutineWorker;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class e extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public k f5263f;

    /* renamed from: g, reason: collision with root package name */
    public int f5264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f5265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f5266i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, CoroutineWorker coroutineWorker, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f5265h = kVar;
        this.f5266i = coroutineWorker;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        return new e(this.f5265h, this.f5266i, interfaceC0564d);
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0163x) obj, (InterfaceC0564d) obj2)).invokeSuspend(k5.v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f5264g;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            k kVar2 = this.f5265h;
            this.f5263f = kVar2;
            this.f5264g = 1;
            Object foregroundInfo = this.f5266i.getForegroundInfo(this);
            if (foregroundInfo == enumC0580a) {
                return enumC0580a;
            }
            kVar = kVar2;
            obj = foregroundInfo;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.f5263f;
            AbstractC0676f.w(obj);
        }
        kVar.f5278f.i(obj);
        return k5.v.f5219a;
    }
}
