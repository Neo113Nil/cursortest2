package m;

import I.C0143d;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6877a;

    public s0(int i3) {
        switch (i3) {
            case 1:
                this.f6877a = new LinkedHashMap();
                break;
            default:
                this.f6877a = C0143d.K(Boolean.FALSE, I.W.f2783i);
                break;
        }
    }

    public abstract Object a();

    public abstract Object b();

    public abstract void c(Object obj);

    public abstract void d(l0 l0Var);

    public abstract void e();
}
