package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sk extends sf1 implements Function2 {
    public int i;
    public /* synthetic */ float j;
    public final /* synthetic */ tk k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(tk tkVar, dn dnVar) {
        super(2, dnVar);
        this.k = tkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((sk) h((dn) obj2, Float.valueOf(((Number) obj).floatValue()))).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        sk skVar = new sk(this.k, dnVar);
        skVar.j = ((Number) obj).floatValue();
        return skVar;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        int i = this.i;
        if (i == 0) {
            ca0.v(obj);
            float f = this.j;
            tk tkVar = this.k;
            Object g = tkVar.a.d.d.g(g81.e);
            Function2 function2 = (Function2) (g != null ? g : null);
            if (function2 == null) {
                throw qy0.g("Required value was null.");
            }
            wq0 wq0Var = new wq0((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.i = 1;
            obj = function2.b(wq0Var, this);
            if (obj == tnVar) {
                return tnVar;
            }
        } else {
            if (i != 1) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca0.v(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((wq0) obj).a & 4294967295L)));
    }
}
