package d2;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f3529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(v vVar, int i3) {
        super(1);
        this.f3528d = i3;
        this.f3529e = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3528d) {
            case 0:
                int i3 = ((i1.c) obj).f4589a;
                i1.k kVar = (i1.k) this.f3529e.getFocusOwner();
                v vVar = kVar.f4601a;
                i1.t f3 = kVar.f();
                if (f3 == null || !f3.C || !vVar.x(i3)) {
                    wd.b0 b0Var = new wd.b0();
                    b0Var.f10141d = Boolean.FALSE;
                    i1.t f10 = kVar.f();
                    Boolean e2 = kVar.e(i3, vVar.getEmbeddedViewFocusRect(), new i1.j(b0Var, i3));
                    if ((!Intrinsics.a(e2, Boolean.TRUE) || f10 == kVar.f()) && e2 != null && b0Var.f10141d != null && e2.booleanValue()) {
                        ((Boolean) b0Var.f10141d).getClass();
                    }
                }
                break;
            default:
                Function0 function0 = (Function0) obj;
                v vVar2 = this.f3529e;
                vVar2.getUncaughtExceptionHandler$ui();
                Handler handler = vVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = vVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new a3.a(3, function0));
                    }
                }
                break;
        }
        return Unit.f5554a;
    }
}
