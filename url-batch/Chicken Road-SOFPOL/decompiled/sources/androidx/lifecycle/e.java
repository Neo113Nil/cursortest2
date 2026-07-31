package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f823d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f824e;

    public /* synthetic */ e(int i, Object obj) {
        this.f823d = i;
        this.f824e = obj;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        switch (this.f823d) {
            case 0:
                new HashMap();
                j[] jVarArr = (j[]) this.f824e;
                if (jVarArr.length > 0) {
                    j jVar = jVarArr[0];
                    throw null;
                }
                if (jVarArr.length <= 0) {
                    return;
                }
                j jVar2 = jVarArr[0];
                throw null;
            default:
                if (oVar == o.ON_CREATE) {
                    uVar.g().f(this);
                    ((n0) this.f824e).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + oVar).toString());
                }
        }
    }
}
