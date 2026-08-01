package d2;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd.b0 f3509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(wd.b0 b0Var, int i3) {
        super(1);
        this.f3508d = i3;
        this.f3509e = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f3508d) {
            case 0:
                this.f3509e.f10141d = (i1.t) obj;
                return Boolean.TRUE;
            default:
                c2.i iVar = (c2.c2) obj;
                if (((d1.k) iVar).f3305d.B) {
                    this.f3509e.f10141d = iVar;
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
