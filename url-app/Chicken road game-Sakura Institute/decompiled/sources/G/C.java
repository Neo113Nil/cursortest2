package G;

import W2.C0286h;
import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class C implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2639d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0286h f2640e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f2641i;

    public C(C0286h c0286h, Function1 function1) {
        this.f2640e = c0286h;
        this.f2641i = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        Object a4;
        Object a5;
        C0286h c0286h = this.f2640e;
        Function1 function1 = this.f2641i;
        switch (this.f2639d) {
            case 0:
                D d4 = D.f2644d;
                try {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    a5 = function1.invoke(Long.valueOf(j4));
                } catch (Throwable th) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    a5 = AbstractC1343r.a(th);
                }
                c0286h.u(a5);
                break;
            default:
                try {
                    AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                    a4 = function1.invoke(Long.valueOf(j4));
                } catch (Throwable th2) {
                    AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
                    a4 = AbstractC1343r.a(th2);
                }
                c0286h.u(a4);
                break;
        }
    }

    public C(C0286h c0286h, s0.W w4, Function1 function1) {
        this.f2640e = c0286h;
        this.f2641i = function1;
    }
}
