package l;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5679a;

    public u1(int i7) {
        switch (i7) {
            case 1:
                this.f5679a = new LinkedHashMap();
                break;
            default:
                this.f5679a = g0.d.J(Boolean.FALSE, g0.t0.f3903k);
                break;
        }
    }

    public abstract Object a();

    public abstract Object b();

    public abstract void c(Object obj);

    public abstract void d(p1 p1Var);

    public abstract void e();
}
