package z4;

import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10724e;

    public /* synthetic */ a0(int i3, Object obj) {
        this.f10723d = i3;
        this.f10724e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10723d) {
            case 0:
                b0 b0Var = (b0) this.f10724e;
                String b10 = b0Var.b();
                u uVar = b0Var.f10725a;
                uVar.getClass();
                uVar.a();
                uVar.b();
                return uVar.k().G().h(b10);
            default:
                return ((Callable) this.f10724e).call();
        }
    }
}
