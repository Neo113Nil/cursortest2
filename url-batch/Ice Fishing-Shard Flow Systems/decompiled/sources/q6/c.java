package q6;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import p6.EnumC0830a;

/* loaded from: classes.dex */
public final class c extends r6.e {

    /* renamed from: l, reason: collision with root package name */
    public final A0.k f7360l;

    /* renamed from: m, reason: collision with root package name */
    public final A0.k f7361m;

    public c(A0.k kVar, CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        super(coroutineContext, i2, enumC0830a);
        this.f7360l = kVar;
        this.f7361m = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // r6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p6.q qVar, V5.b bVar) {
        C0837b c0837b;
        int i2;
        if (bVar instanceof C0837b) {
            c0837b = (C0837b) bVar;
            int i5 = c0837b.f7359l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0837b.f7359l = i5 - Integer.MIN_VALUE;
                Object obj = c0837b.f7357e;
                W5.a aVar = W5.a.f2787d;
                i2 = c0837b.f7359l;
                if (i2 != 0) {
                    V6.b.P(obj);
                    c0837b.f7356d = qVar;
                    c0837b.f7359l = 1;
                    Object invoke = this.f7360l.invoke(qVar, c0837b);
                    if (invoke != aVar) {
                        invoke = Unit.f6114a;
                    }
                    if (invoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = c0837b.f7356d;
                    V6.b.P(obj);
                }
                if (((p6.p) qVar).f7263l.t()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return Unit.f6114a;
            }
        }
        c0837b = new C0837b(this, (X5.c) bVar);
        Object obj2 = c0837b.f7357e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0837b.f7359l;
        if (i2 != 0) {
        }
        if (((p6.p) qVar).f7263l.t()) {
        }
    }

    @Override // r6.e
    public final r6.e b(CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        return new c(this.f7361m, coroutineContext, i2, enumC0830a);
    }

    @Override // r6.e
    public final String toString() {
        return "block[" + this.f7360l + "] -> " + super.toString();
    }
}
