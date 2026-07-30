package a0;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements a1.i, e5.f, z5.a, l.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134a;

    public /* synthetic */ s(int i7) {
        this.f134a = i7;
    }

    @Override // e5.f
    public Object b(e5.v vVar) {
        g5.f lambda$getComponents$0;
        switch (this.f134a) {
            case 13:
                Set f9 = vVar.f(e5.t.a(b6.a.class));
                b6.c cVar = b6.c.f1392h;
                if (cVar == null) {
                    synchronized (b6.c.class) {
                        try {
                            cVar = b6.c.f1392h;
                            if (cVar == null) {
                                cVar = new b6.c(0);
                                b6.c.f1392h = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new b6.b(f9, cVar);
            case 14:
            default:
                lambda$getComponents$0 = DatabaseRegistrar.lambda$getComponents$0(vVar);
                return lambda$getComponents$0;
            case q.c.f7263g /* 15 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1802a.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1804c.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1803b.get();
            case 18:
                e5.p pVar = ExecutorsRegistrar.f1802a;
                return f5.j.f3393f;
        }
    }

    @Override // a1.i
    public double d(double d8) {
        double d9;
        switch (this.f134a) {
            case 4:
                double d10 = d8 < 0.0d ? -d8 : d8;
                if (d10 >= 0.0031308049535603718d) {
                    d10 = Math.pow(d10, 0.4166666666666667d) - 0.05213270142180095d;
                    d9 = 0.9478672985781991d;
                } else {
                    d9 = 0.07739938080495357d;
                }
                return Math.copySign(d10 / d9, d8);
            case 5:
                double d11 = d8 < 0.0d ? -d8 : d8;
                return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d8);
            default:
                return d8;
        }
    }

    @Override // z5.a
    public void a(z5.b bVar) {
    }

    @Override // l.y
    public float c(float f9) {
        return f9;
    }
}
