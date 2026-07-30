package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l8 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ zn1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(zn1 zn1Var, int i) {
        super(1);
        this.m = i;
        this.n = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        zn1 zn1Var = this.n;
        switch (i) {
            case 0:
                Configuration configuration = new Configuration((Configuration) obj);
                r00 r00Var = AndroidCompositionLocals_androidKt.a;
                zn1Var.setValue(configuration);
                break;
            case 1:
                break;
            case 2:
                k91 k91Var = (k91) obj;
                k91Var.a();
                float D = k91Var.D(((yo) zn1Var.getValue()).a);
                ns nsVar = k91Var.m;
                float b = ql2.b(nsVar.f()) - (D / 2.0f);
                yd0.U(k91Var, ((yo) zn1Var.getValue()).b, ap.i(0.0f, b), ap.i(ql2.d(nsVar.f()), b), D, 0.0f, 496);
                break;
            default:
                ((Function1) zn1Var.getValue()).invoke(new au1(((au1) obj).a));
                break;
        }
        return Unit.a;
    }
}
