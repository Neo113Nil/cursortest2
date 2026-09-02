package U;

import W.F;
import W.J;
import a.AbstractC0124a;
import a0.AbstractC0135a;
import a0.C0155v;
import a0.M;
import a0.SurfaceHolderCallbackC0125A;
import android.os.Looper;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3035c;

    public /* synthetic */ f(int i4, int i5, Object obj) {
        this.f3033a = i5;
        this.f3035c = obj;
        this.f3034b = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f3033a;
        int i5 = this.f3034b;
        Object obj = this.f3035c;
        switch (i4) {
            case 0:
                ((g) obj).f3037b.onAudioFocusChange(i5);
                break;
            case 1:
                M m4 = (M) obj;
                b0.d dVar = m4.f3974w;
                int i6 = ((AbstractC0135a) m4.f3949a[i5].f4202e).f4038b;
                dVar.l(dVar.k(), 1033, new b0.b(3));
                break;
            default:
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = ((c0.q) obj).f5601b;
                String str = J.f3263a;
                K3.n nVar = surfaceHolderCallbackC0125A.f3838a.f3849D;
                C0155v c0155v = new C0155v(i5, 2);
                nVar.getClass();
                AbstractC0124a.t(Looper.myLooper() == ((F) nVar.f1598d).f3257a.getLooper());
                nVar.f1596b++;
                nVar.g(new R1.e(nVar, 4, c0155v));
                nVar.l(Integer.valueOf(i5));
                break;
        }
    }

    public /* synthetic */ f(M m4, int i4, boolean z) {
        this.f3033a = 1;
        this.f3035c = m4;
        this.f3034b = i4;
    }
}
