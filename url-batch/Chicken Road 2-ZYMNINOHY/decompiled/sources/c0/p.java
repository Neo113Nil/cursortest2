package c0;

import W.InterfaceC0118k;
import a0.C0130F;
import a0.SurfaceHolderCallbackC0125A;
import io.appmetrica.analytics.impl.Sb;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5599c;

    public /* synthetic */ p(Object obj, boolean z, int i4) {
        this.f5597a = i4;
        this.f5599c = obj;
        this.f5598b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f5597a;
        final boolean z = this.f5598b;
        Object obj = this.f5599c;
        switch (i4) {
            case 0:
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = ((q) obj).f5601b;
                String str = W.J.f3263a;
                C0130F c0130f = surfaceHolderCallbackC0125A.f3838a;
                if (c0130f.f3872b0 != z) {
                    c0130f.f3872b0 = z;
                    c0130f.n.e(23, new InterfaceC0118k() { // from class: a0.z
                        @Override // W.InterfaceC0118k
                        public final void invoke(Object obj2) {
                            ((T.L) obj2).onSkipSilenceEnabledChanged(z);
                        }
                    });
                    break;
                }
                break;
            case 1:
                ((com.startapp.sdk.adsbase.c) obj).b(z);
                break;
            default:
                Sb.a((Sb) obj, z);
                break;
        }
    }
}
