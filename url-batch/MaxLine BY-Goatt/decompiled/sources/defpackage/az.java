package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class az extends View.DragShadowBuilder {
    public final da0 a;
    public final long b;
    public final Function1 c;

    public az(da0 da0Var, long j, Function1 function1) {
        this.a = da0Var;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        ns nsVar = new ns();
        u81 u81Var = u81.m;
        Canvas canvas2 = z6.a;
        y6 y6Var = new y6();
        y6Var.a = canvas;
        ms msVar = nsVar.m;
        ca0 ca0Var = msVar.a;
        u81 u81Var2 = msVar.b;
        ls lsVar = msVar.c;
        long j = msVar.d;
        msVar.a = this.a;
        msVar.b = u81Var;
        msVar.c = y6Var;
        msVar.d = this.b;
        y6Var.m();
        this.c.invoke(nsVar);
        y6Var.j();
        msVar.a = ca0Var;
        msVar.b = u81Var2;
        msVar.c = lsVar;
        msVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        da0 da0Var = this.a;
        point.set(da0Var.R(intBitsToFloat / da0Var.d()), da0Var.R(Float.intBitsToFloat((int) (j & 4294967295L)) / da0Var.d()));
        point2.set(point.x / 2, point.y / 2);
    }
}
