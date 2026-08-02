package w0;

import W.J;
import a0.C0130F;
import a0.SurfaceHolderCallbackC0125A;
import b0.C0255a;

/* renamed from: w0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1489D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0.q f15768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15770c;

    public /* synthetic */ RunnableC1489D(c0.q qVar, Object obj, long j4) {
        this.f15768a = qVar;
        this.f15769b = obj;
        this.f15770c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = this.f15768a.f5601b;
        String str = J.f3263a;
        C0130F c0130f = surfaceHolderCallbackC0125A.f3838a;
        b0.d dVar = c0130f.f3897t;
        C0255a k4 = dVar.k();
        Object obj = this.f15769b;
        dVar.l(k4, 26, new D0.a(k4, obj, this.f15770c));
        if (c0130f.f3864T == obj) {
            c0130f.n.e(26, new D0.d(19));
        }
    }
}
