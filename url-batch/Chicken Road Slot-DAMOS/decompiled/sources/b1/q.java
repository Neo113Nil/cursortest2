package b1;

import c2.c2;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f1027e;

    public /* synthetic */ q(int i3, Function1 function1) {
        this.f1026d = i3;
        this.f1027e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1026d) {
            case 0:
                i iVar = (i) this.f1027e.invoke((o) obj);
                synchronized (r.f1030c) {
                    r.f1031d = r.f1031d.g(iVar.g());
                }
                return iVar;
            case 1:
                Function1 function1 = this.f1027e;
                Long l10 = (Long) obj;
                l10.getClass();
                return function1.invoke(l10);
            default:
                Function1 function12 = this.f1027e;
                c2 c2Var = (c2) obj;
                if (!(c2Var instanceof x.r)) {
                    kotlin.collections.i0.l("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) function12.invoke(((x.r) c2Var).C);
                bool.getClass();
                return bool;
        }
    }
}
