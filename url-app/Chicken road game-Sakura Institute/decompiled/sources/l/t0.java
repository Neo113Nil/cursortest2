package l;

import G.C0192d;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7841a;

    public t0(Function1 function1) {
        this.f7841a = function1;
    }

    public abstract Object l();

    public abstract Object m();

    public abstract void n(Object obj);

    public abstract void o(m0 m0Var);

    public abstract void p();

    public t0(int i2) {
        switch (i2) {
            case 1:
                this.f7841a = new LinkedHashMap();
                break;
            default:
                this.f7841a = C0192d.K(Boolean.FALSE, G.W.f2779l);
                break;
        }
    }
}
