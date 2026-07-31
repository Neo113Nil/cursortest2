package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3391a implements InterfaceC3396f {

    /* renamed from: r2.a$a, reason: collision with other inner class name */
    static final class C0250a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43532l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f43533m;

        /* renamed from: o, reason: collision with root package name */
        int f43535o;

        C0250a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43533m = obj;
            this.f43535o |= Integer.MIN_VALUE;
            return AbstractC3391a.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // r2.InterfaceC3396f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        C0250a c0250a;
        int i4;
        Throwable th;
        s2.t tVar;
        if (dVar instanceof C0250a) {
            c0250a = (C0250a) dVar;
            int i5 = c0250a.f43535o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0250a.f43535o = i5 - Integer.MIN_VALUE;
                Object obj = c0250a.f43533m;
                Object f4 = AbstractC1241b.f();
                i4 = c0250a.f43535o;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    s2.t tVar2 = new s2.t(interfaceC3397g, c0250a.getContext());
                    try {
                        c0250a.f43532l = tVar2;
                        c0250a.f43535o = 1;
                        if (g(tVar2, c0250a) == f4) {
                            return f4;
                        }
                        tVar = tVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        tVar = tVar2;
                        tVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = (s2.t) c0250a.f43532l;
                    try {
                        ResultKt.a(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        tVar.releaseIntercepted();
                        throw th;
                    }
                }
                tVar.releaseIntercepted();
                return Unit.f41027a;
            }
        }
        c0250a = new C0250a(dVar);
        Object obj2 = c0250a.f43533m;
        Object f42 = AbstractC1241b.f();
        i4 = c0250a.f43535o;
        if (i4 != 0) {
        }
        tVar.releaseIntercepted();
        return Unit.f41027a;
    }

    public abstract Object g(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar);
}
