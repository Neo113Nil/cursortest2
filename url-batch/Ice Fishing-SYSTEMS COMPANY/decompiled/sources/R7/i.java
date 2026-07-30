package R7;

import X.C0401a;
import X.E;
import X.F;
import kotlin.jvm.internal.r;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class i implements c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2863n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2864u;

    public /* synthetic */ i(int i, Object obj) {
        this.f2863n = i;
        this.f2864u = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // R7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5133d interfaceC5133d) {
        X.p pVar;
        int i;
        switch (this.f2863n) {
            case 0:
                ((r) this.f2864u).f38861n = obj;
                throw new S7.a(this);
            default:
                if (interfaceC5133d instanceof X.p) {
                    pVar = (X.p) interfaceC5133d;
                    int i4 = pVar.f3579u;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pVar.f3579u = i4 - Integer.MIN_VALUE;
                        Object obj2 = pVar.f3578n;
                        EnumC5179a enumC5179a = EnumC5179a.f41704n;
                        i = pVar.f3579u;
                        if (i != 0) {
                            com.bumptech.glide.f.r(obj2);
                            E e6 = (E) obj;
                            if (e6 instanceof X.h) {
                                throw ((X.h) e6).f3562a;
                            }
                            if (e6 instanceof X.g) {
                                throw ((X.g) e6).f3561a;
                            }
                            if (!(e6 instanceof C0401a)) {
                                if (e6 instanceof F) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new B0.c();
                            }
                            Object obj3 = ((C0401a) e6).f3545a;
                            pVar.f3579u = 1;
                            if (((c) this.f2864u).a(obj3, pVar) == enumC5179a) {
                                return enumC5179a;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.f.r(obj2);
                        }
                        return v.f40183a;
                    }
                }
                pVar = new X.p(this, interfaceC5133d);
                Object obj22 = pVar.f3578n;
                EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
                i = pVar.f3579u;
                if (i != 0) {
                }
                return v.f40183a;
        }
    }
}
