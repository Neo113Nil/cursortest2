package m;

import I.C0089d;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5876a;

    public w0(int i3) {
        switch (i3) {
            case 1:
                this.f5876a = new LinkedHashMap();
                break;
            default:
                this.f5876a = C0089d.J(Boolean.FALSE, I.X.f2228i);
                break;
        }
    }

    public abstract Object a();

    public abstract Object b();

    public abstract void c(Object obj);

    public abstract void d(s0 s0Var);

    public abstract void e();
}
