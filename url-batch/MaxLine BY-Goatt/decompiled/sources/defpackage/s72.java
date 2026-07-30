package defpackage;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s72 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s72(Function2 function2) {
        super(1);
        this.m = 9;
        k03 k03Var = v33.a;
        this.n = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                ((u72) obj2).a((pf0) obj);
                return Unit.a;
            case 1:
                return obj == ((un1) obj2) ? "(this)" : String.valueOf(obj);
            case 2:
                float floatValue = ((Number) obj).floatValue();
                jf2 jf2Var = (jf2) obj2;
                iz1 iz1Var = jf2Var.a;
                float h = iz1Var.h() + floatValue + jf2Var.e;
                float b = d.b(h, 0.0f, jf2Var.d.h());
                boolean z = h == b;
                float h2 = b - iz1Var.h();
                int round = Math.round(h2);
                iz1Var.i(iz1Var.h() + round);
                jf2Var.e = h2 - round;
                if (!z) {
                    floatValue = h2;
                }
                return Float.valueOf(floatValue);
            case 3:
                ((tf2) obj2).R.F = (t81) obj;
                return Unit.a;
            case 4:
                cg2 cg2Var = (cg2) obj2;
                return new au1(cg2.a(cg2Var, cg2Var.h, ((au1) obj).a, cg2Var.g));
            case 5:
                ii2.b((sh2) obj, ((fb2) obj2).a);
                return Unit.a;
            case 6:
                ((List) obj).add((Float) ((bc1) obj2).invoke());
                return true;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ia2 ia2Var = (ia2) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj2;
                ia2Var.h(ia2Var.y.d() * 3.0f);
                ia2Var.i(shadowGraphicsLayerElement.a);
                ia2Var.c(shadowGraphicsLayerElement.b);
                ia2Var.b(shadowGraphicsLayerElement.c);
                ia2Var.j(shadowGraphicsLayerElement.d);
                return Unit.a;
            case 8:
                ia2 ia2Var2 = (ia2) obj;
                gl2 gl2Var = (gl2) obj2;
                ia2Var2.e(gl2Var.A);
                ia2Var2.g(gl2Var.B);
                ia2Var2.a(gl2Var.C);
                ia2Var2.h(gl2Var.D);
                float f = gl2Var.E;
                if (ia2Var2.t != f) {
                    ia2Var2.m |= 2048;
                    ia2Var2.t = f;
                }
                ia2Var2.l(gl2Var.F);
                ia2Var2.i(gl2Var.G);
                ia2Var2.c(gl2Var.H);
                ia2Var2.b(gl2Var.I);
                ia2Var2.j(gl2Var.J);
                int i2 = gl2Var.K;
                if (ia2Var2.A != i2) {
                    ia2Var2.m |= 524288;
                    ia2Var2.A = i2;
                }
                return Unit.a;
            case 9:
                ld ldVar = (ld) obj;
                Object value = ldVar.e.getValue();
                k03 k03Var = v33.a;
                ((Function2) obj2).invoke(value, Float.valueOf(((od) ldVar.f).a));
                return Unit.a;
            case 10:
                return ((Function1) obj2).invoke(Long.valueOf(((Number) obj).longValue()));
            case 11:
                Throwable th = (Throwable) obj;
                ur2 ur2Var = (ur2) obj2;
                fs fsVar = ur2Var.o;
                if (fsVar != null) {
                    fsVar.g(th);
                }
                ur2Var.o = null;
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                float[] fArr = ((ti1) obj).a;
                t81 t81Var = (t81) obj2;
                if (t81Var.y()) {
                    yk3.D(t81Var).L(t81Var, fArr);
                }
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                float floatValue2 = ((Number) obj).floatValue();
                dv2 dv2Var = (dv2) obj2;
                hz1 hz1Var = dv2Var.a;
                float h3 = hz1Var.h() + floatValue2;
                hz1 hz1Var2 = dv2Var.b;
                if (h3 > hz1Var2.h()) {
                    floatValue2 = hz1Var2.h() - hz1Var.h();
                } else if (h3 < 0.0f) {
                    floatValue2 = -hz1Var.h();
                }
                dv2Var.a.i(hz1Var.h() + floatValue2);
                return Float.valueOf(floatValue2);
            default:
                return new au1(((au1) ((Function0) obj2).invoke()).a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s72(int i, Object obj) {
        super(1);
        this.m = i;
        this.n = obj;
    }
}
