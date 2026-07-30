package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ca extends gu0 implements Function1 {
    public final /* synthetic */ nc1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(nc1 nc1Var) {
        super(1, l41.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.o = nc1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((ti1) obj).a;
        t81 t81Var = (t81) this.o.D.getValue();
        if (t81Var != null) {
            if (!t81Var.y()) {
                t81Var = null;
            }
            if (t81Var != null) {
                t81Var.J(fArr);
            }
        }
        return Unit.a;
    }
}
