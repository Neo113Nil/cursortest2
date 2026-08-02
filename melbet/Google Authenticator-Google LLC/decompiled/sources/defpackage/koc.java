package defpackage;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class koc {
    public static final koi a(int i, kri kriVar) {
        return i + (-1) != 1 ? new kox(kriVar) : new koo(kriVar);
    }

    public static final void b(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = krf.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = kre.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final kuq c(final kqn kqnVar, kae kaeVar, krx krxVar) {
        if (kaeVar.a == kad.a) {
            final fvv fvvVar = new fvv(kaeVar, krxVar, 9);
            return new kuq(kaeVar, new kbh() { // from class: knb
                @Override // defpackage.kbh
                public final ixf a(kbg kbgVar, kaa kaaVar) {
                    Object a = kmy.a.a(jxr.k());
                    a.getClass();
                    kqn plus = kqn.this.plus((kqn) a);
                    jxr k = jxr.k();
                    k.getClass();
                    kqn plus2 = plus.plus(new kmz(k));
                    kuq kuqVar = new kuq(new ggy(kbgVar, 12));
                    kys h = ixj.h(1, 0, 6);
                    return new knc(ixg.i(kvp.g(plus2), null, 0, new kng(fvvVar, new kzj(new knd(new AtomicBoolean(false), kbgVar, h, null)), kuqVar, kbgVar, null), 3), h, kbgVar, kuqVar);
                }
            }, (byte[]) null);
        }
        Objects.toString(kaeVar);
        throw new IllegalArgumentException("Expected a unary method descriptor but got ".concat(kaeVar.toString()));
    }
}
