package A;

import a0.InterfaceC0354i;
import a2.EnumC0421j;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import l.InterfaceC0797x;
import q.AbstractC1024c;
import u2.InterfaceC1228a;
import u2.InterfaceC1229b;
import w2.C1292a;
import w2.C1293b;
import w2.C1294c;

/* renamed from: A.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0022s implements InterfaceC1228a, InterfaceC0354i, Z1.e, InterfaceC0797x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182a;

    public /* synthetic */ C0022s(int i2) {
        this.f182a = i2;
    }

    @Override // l.InterfaceC0797x
    public float a(float f4) {
        return f4;
    }

    @Override // u2.InterfaceC1228a
    public void b(InterfaceC1229b interfaceC1229b) {
    }

    @Override // a0.InterfaceC0354i
    public double c(double d4) {
        double d5;
        switch (this.f182a) {
            case 12:
                double d6 = d4 < 0.0d ? -d4 : d4;
                if (d6 >= 0.0031308049535603718d) {
                    d6 = Math.pow(d6, 0.4166666666666667d) - 0.05213270142180095d;
                    d5 = 0.9478672985781991d;
                } else {
                    d5 = 0.07739938080495357d;
                }
                return Math.copySign(d6 / d5, d4);
            case 13:
                double d7 = d4 < 0.0d ? -d4 : d4;
                return Math.copySign(d7 >= 0.04045d ? Math.pow((0.9478672985781991d * d7) + 0.05213270142180095d, 2.4d) : d7 * 0.07739938080495357d, d4);
            default:
                return d4;
        }
    }

    @Override // Z1.e
    public Object d(Z1.v vVar) {
        b2.f lambda$getComponents$0;
        switch (this.f182a) {
            case AbstractC1024c.f9246g /* 15 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6057a.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6059c.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6058b.get();
            case 18:
                Z1.o oVar = ExecutorsRegistrar.f6057a;
                return EnumC0421j.f4935d;
            case 19:
                lambda$getComponents$0 = DatabaseRegistrar.lambda$getComponents$0(vVar);
                return lambda$getComponents$0;
            default:
                Set d4 = vVar.d(Z1.t.a(C1292a.class));
                C1294c c1294c = C1294c.f11387e;
                if (c1294c == null) {
                    synchronized (C1294c.class) {
                        try {
                            c1294c = C1294c.f11387e;
                            if (c1294c == null) {
                                c1294c = new C1294c(0);
                                C1294c.f11387e = c1294c;
                            }
                        } finally {
                        }
                    }
                }
                return new C1293b(d4, c1294c);
        }
    }
}
