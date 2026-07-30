package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d52 implements zn1, a50 {
    public final /* synthetic */ zn1 m;
    public final CoroutineContext n;

    public d52(zn1 zn1Var, CoroutineContext coroutineContext) {
        this.m = zn1Var;
        this.n = coroutineContext;
    }

    @Override // defpackage.so2
    public final Object getValue() {
        return this.m.getValue();
    }

    @Override // defpackage.a50
    public final CoroutineContext n() {
        return this.n;
    }

    @Override // defpackage.zn1
    public final void setValue(Object obj) {
        this.m.setValue(obj);
    }
}
