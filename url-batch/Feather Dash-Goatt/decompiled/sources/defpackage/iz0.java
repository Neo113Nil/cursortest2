package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iz0 implements ao0, sn {
    public final /* synthetic */ ao0 d;
    public final CoroutineContext e;

    public iz0(ao0 ao0Var, CoroutineContext coroutineContext) {
        this.d = ao0Var;
        this.e = coroutineContext;
    }

    @Override // defpackage.sn
    public final CoroutineContext f() {
        return this.e;
    }

    @Override // defpackage.yd1
    public final Object getValue() {
        return this.d.getValue();
    }

    @Override // defpackage.ao0
    public final void setValue(Object obj) {
        this.d.setValue(obj);
    }
}
