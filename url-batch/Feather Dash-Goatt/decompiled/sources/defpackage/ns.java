package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ns implements j21 {
    public final Function1 d;
    public os e;

    public ns(Function1 function1) {
        this.d = function1;
    }

    @Override // defpackage.j21
    public final void c() {
        this.e = (os) this.d.invoke(p4.e);
    }

    @Override // defpackage.j21
    public final void g() {
        os osVar = this.e;
        if (osVar != null) {
            osVar.a();
        }
        this.e = null;
    }

    @Override // defpackage.j21
    public final void e() {
    }
}
