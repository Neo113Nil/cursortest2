package l;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 implements InterfaceC0783i {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f7737a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f7738b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7739c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7740d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0792s f7741e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0792s f7742f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0792s f7743g;

    /* renamed from: h, reason: collision with root package name */
    public long f7744h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0792s f7745i;

    public e0(InterfaceC0787m interfaceC0787m, v0 v0Var, Object obj, Object obj2, AbstractC0792s abstractC0792s) {
        this.f7737a = interfaceC0787m.a(v0Var);
        this.f7738b = v0Var;
        this.f7739c = obj2;
        this.f7740d = obj;
        this.f7741e = (AbstractC0792s) v0Var.f7853a.invoke(obj);
        Function1 function1 = v0Var.f7853a;
        this.f7742f = (AbstractC0792s) function1.invoke(obj2);
        this.f7743g = abstractC0792s != null ? AbstractC0779e.f(abstractC0792s) : ((AbstractC0792s) function1.invoke(obj)).c();
        this.f7744h = -1L;
    }

    @Override // l.InterfaceC0783i
    public final boolean a() {
        return this.f7737a.a();
    }

    @Override // l.InterfaceC0783i
    public final Object b(long j4) {
        if (f(j4)) {
            return this.f7739c;
        }
        AbstractC0792s f4 = this.f7737a.f(j4, this.f7741e, this.f7742f, this.f7743g);
        int b4 = f4.b();
        for (int i2 = 0; i2 < b4; i2++) {
            if (Float.isNaN(f4.a(i2))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + f4 + ". Animation: " + this + ", playTimeNanos: " + j4);
            }
        }
        return this.f7738b.f7854b.invoke(f4);
    }

    @Override // l.InterfaceC0783i
    public final long c() {
        if (this.f7744h < 0) {
            this.f7744h = this.f7737a.b(this.f7741e, this.f7742f, this.f7743g);
        }
        return this.f7744h;
    }

    @Override // l.InterfaceC0783i
    public final v0 d() {
        return this.f7738b;
    }

    @Override // l.InterfaceC0783i
    public final Object e() {
        return this.f7739c;
    }

    @Override // l.InterfaceC0783i
    public final AbstractC0792s g(long j4) {
        if (!f(j4)) {
            return this.f7737a.g(j4, this.f7741e, this.f7742f, this.f7743g);
        }
        AbstractC0792s abstractC0792s = this.f7745i;
        if (abstractC0792s != null) {
            return abstractC0792s;
        }
        AbstractC0792s c4 = this.f7737a.c(this.f7741e, this.f7742f, this.f7743g);
        this.f7745i = c4;
        return c4;
    }

    public final void h(Object obj) {
        if (Intrinsics.a(obj, this.f7740d)) {
            return;
        }
        this.f7740d = obj;
        this.f7741e = (AbstractC0792s) this.f7738b.f7853a.invoke(obj);
        this.f7745i = null;
        this.f7744h = -1L;
    }

    public final void i(Object obj) {
        if (Intrinsics.a(this.f7739c, obj)) {
            return;
        }
        this.f7739c = obj;
        this.f7742f = (AbstractC0792s) this.f7738b.f7853a.invoke(obj);
        this.f7745i = null;
        this.f7744h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f7740d + " -> " + this.f7739c + ",initial velocity: " + this.f7743g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f7737a;
    }
}
