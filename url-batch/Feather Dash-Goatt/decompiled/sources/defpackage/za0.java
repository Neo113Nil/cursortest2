package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class za0 extends mb0 {
    public final Function1 l;

    public za0(Function1 function1) {
        this.l = function1;
    }

    @Override // defpackage.mb0
    public final boolean r() {
        return false;
    }

    @Override // defpackage.mb0
    public final void s(Throwable th) {
        this.l.invoke(th);
    }
}
