package z0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class b extends y0.b {
    @Override // y0.b
    public final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Integer num = a.f1272a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
