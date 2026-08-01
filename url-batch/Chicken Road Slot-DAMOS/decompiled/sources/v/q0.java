package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f9862a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.s f9863b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9864c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9865d;

    /* renamed from: e, reason: collision with root package name */
    public l f9866e;

    /* renamed from: f, reason: collision with root package name */
    public l f9867f;
    public final l g;

    /* renamed from: h, reason: collision with root package name */
    public long f9868h;

    /* renamed from: i, reason: collision with root package name */
    public l f9869i;

    public q0(f fVar, c6.s sVar, Object obj, Object obj2, l lVar) {
        this.f9862a = fVar.a(sVar);
        this.f9863b = sVar;
        this.f9864c = obj2;
        this.f9865d = obj;
        Function1 function1 = (Function1) sVar.f1868d;
        this.f9866e = (l) function1.invoke(obj);
        this.f9867f = (l) function1.invoke(obj2);
        this.g = lVar != null ? c.c(lVar) : ((l) function1.invoke(obj)).c();
        this.f9868h = -1L;
    }

    public final long a() {
        if (this.f9868h < 0) {
            this.f9868h = this.f9862a.j(this.f9866e, this.f9867f, this.g);
        }
        return this.f9868h;
    }

    public final Object b(long j) {
        if (j >= a()) {
            return this.f9864c;
        }
        l i3 = this.f9862a.i(j, this.f9866e, this.f9867f, this.g);
        int b10 = i3.b();
        for (int i10 = 0; i10 < b10; i10++) {
            if (Float.isNaN(i3.a(i10))) {
                y.b("AnimationVector cannot contain a NaN. " + i3 + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((Function1) this.f9863b.f1869e).invoke(i3);
    }

    public final l c(long j) {
        if (j < a()) {
            return this.f9862a.n(j, this.f9866e, this.f9867f, this.g);
        }
        l lVar = this.f9869i;
        if (lVar != null) {
            return lVar;
        }
        l k10 = this.f9862a.k(this.f9866e, this.f9867f, this.g);
        this.f9869i = k10;
        return k10;
    }

    public final void d(Object obj) {
        if (Intrinsics.a(obj, this.f9865d)) {
            return;
        }
        this.f9865d = obj;
        this.f9866e = (l) ((Function1) this.f9863b.f1868d).invoke(obj);
        this.f9869i = null;
        this.f9868h = -1L;
    }

    public final void e(Object obj) {
        if (Intrinsics.a(this.f9864c, obj)) {
            return;
        }
        this.f9864c = obj;
        this.f9867f = (l) ((Function1) this.f9863b.f1868d).invoke(obj);
        this.f9869i = null;
        this.f9868h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f9865d + " -> " + this.f9864c + ",initial velocity: " + this.g + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.f9862a;
    }
}
