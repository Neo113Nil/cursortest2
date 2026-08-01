package n0;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o1 implements z0, ge.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f6770d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f6771e;

    public o1(z0 z0Var, CoroutineContext coroutineContext) {
        this.f6770d = z0Var;
        this.f6771e = coroutineContext;
    }

    @Override // n0.m2
    public final Object getValue() {
        return this.f6770d.getValue();
    }

    @Override // ge.x
    public final CoroutineContext h() {
        return this.f6771e;
    }

    @Override // n0.z0
    public final void setValue(Object obj) {
        this.f6770d.setValue(obj);
    }
}
