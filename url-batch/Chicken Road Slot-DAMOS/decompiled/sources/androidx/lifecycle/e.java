package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f680d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f681e;

    public /* synthetic */ e(int i3, Object obj) {
        this.f680d = i3;
        this.f681e = obj;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, o oVar) {
        switch (this.f680d) {
            case 0:
                new HashMap();
                j[] jVarArr = (j[]) this.f681e;
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
                if (oVar != o.ON_CREATE) {
                    a2.r.q(oVar, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    uVar.g().f(this);
                    ((p0) this.f681e).b();
                    return;
                }
        }
    }
}
