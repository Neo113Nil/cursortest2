package f0;

import A.g0;
import b0.InterfaceC0496d;
import kotlin.jvm.functions.Function1;

/* renamed from: f0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0572C {

    /* renamed from: a, reason: collision with root package name */
    public g0 f6280a;

    public abstract void a(InterfaceC0496d interfaceC0496d);

    public Function1 b() {
        return this.f6280a;
    }

    public final void c() {
        Function1 b4 = b();
        if (b4 != null) {
            b4.invoke(this);
        }
    }

    public void d(g0 g0Var) {
        this.f6280a = g0Var;
    }
}
