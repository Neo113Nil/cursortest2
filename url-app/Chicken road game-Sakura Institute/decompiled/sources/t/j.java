package t;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import r0.AbstractC1065f;
import r0.InterfaceC1072m;
import r0.a0;

/* loaded from: classes.dex */
public final class j implements InterfaceC1197a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1072m f10636d;

    public j(InterfaceC1072m interfaceC1072m) {
        this.f10636d = interfaceC1072m;
    }

    @Override // t.InterfaceC1197a
    public final Object j(a0 a0Var, Function0 function0, E2.c cVar) {
        View x2 = AbstractC1065f.x(this.f10636d);
        long Q3 = a0Var.Q(0L);
        Y.d dVar = (Y.d) function0.invoke();
        Y.d h4 = dVar != null ? dVar.h(Q3) : null;
        if (h4 != null) {
            x2.requestRectangleOnScreen(new Rect((int) h4.f4374a, (int) h4.f4375b, (int) h4.f4376c, (int) h4.f4377d), false);
        }
        return Unit.f7487a;
    }
}
