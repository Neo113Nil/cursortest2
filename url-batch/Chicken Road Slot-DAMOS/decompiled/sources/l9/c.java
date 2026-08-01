package l9;

import androidx.lifecycle.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.lifecycle.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f5939e;

    public /* synthetic */ c(e eVar, int i3) {
        this.f5938d = i3;
        this.f5939e = eVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, androidx.lifecycle.o oVar) {
        switch (this.f5938d) {
            case 0:
                if (oVar == androidx.lifecycle.o.ON_RESUME) {
                    this.f5939e.f5942b = false;
                    break;
                }
                break;
            default:
                if (oVar == androidx.lifecycle.o.ON_RESUME) {
                    this.f5939e.f5942b = false;
                    break;
                }
                break;
        }
    }
}
