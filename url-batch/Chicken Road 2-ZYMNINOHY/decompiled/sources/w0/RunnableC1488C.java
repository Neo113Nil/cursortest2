package w0;

import W.J;
import a0.SurfaceHolderCallbackC0125A;
import q0.C1353B;

/* renamed from: w0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1488C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.q f15767b;

    public /* synthetic */ RunnableC1488C(c0.q qVar, int i4, long j4) {
        this.f15766a = 3;
        this.f15767b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f15766a;
        c0.q qVar = this.f15767b;
        switch (i4) {
            case 0:
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = qVar.f5601b;
                String str = J.f3263a;
                b0.d dVar = surfaceHolderCallbackC0125A.f3838a.f3897t;
                dVar.l(dVar.k(), 1016, new b0.b(11));
                break;
            case 1:
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A2 = qVar.f5601b;
                String str2 = J.f3263a;
                b0.d dVar2 = surfaceHolderCallbackC0125A2.f3838a.f3897t;
                dVar2.l(dVar2.k(), 1030, new D0.d(22));
                break;
            case 2:
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A3 = qVar.f5601b;
                String str3 = J.f3263a;
                b0.d dVar3 = surfaceHolderCallbackC0125A3.f3838a.f3897t;
                dVar3.l(dVar3.k(), 1019, new D0.d(29));
                break;
            case 3:
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A4 = qVar.f5601b;
                String str4 = J.f3263a;
                b0.d dVar4 = surfaceHolderCallbackC0125A4.f3838a.f3897t;
                dVar4.l(dVar4.i((C1353B) dVar4.f5272d.f1637e), 1018, new b0.b(16));
                break;
            case 4:
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A5 = qVar.f5601b;
                String str5 = J.f3263a;
                b0.d dVar5 = surfaceHolderCallbackC0125A5.f3838a.f3897t;
                dVar5.l(dVar5.i((C1353B) dVar5.f5272d.f1637e), 1021, new b0.b(18));
                break;
            default:
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A6 = qVar.f5601b;
                String str6 = J.f3263a;
                b0.d dVar6 = surfaceHolderCallbackC0125A6.f3838a.f3897t;
                dVar6.l(dVar6.k(), 1015, new b0.b(26));
                break;
        }
    }

    public /* synthetic */ RunnableC1488C(c0.q qVar, long j4, int i4) {
        this.f15766a = 4;
        this.f15767b = qVar;
    }

    public /* synthetic */ RunnableC1488C(c0.q qVar, Object obj, int i4) {
        this.f15766a = i4;
        this.f15767b = qVar;
    }

    public /* synthetic */ RunnableC1488C(c0.q qVar, String str, long j4, long j5) {
        this.f15766a = 0;
        this.f15767b = qVar;
    }
}
