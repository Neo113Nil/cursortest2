package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g5 extends h31 implements Function2 {
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ i5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(i5 i5Var, dn dnVar) {
        super(dnVar);
        this.i = i5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((g5) h((dn) obj2, (vf1) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        g5 g5Var = new g5(this.i, dnVar);
        g5Var.h = obj;
        return g5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004c -> B:6:0x004f). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        vf1 vf1Var;
        Object obj2;
        tn tnVar = tn.d;
        int i = this.g;
        i5 i5Var = this.i;
        if (i == 0) {
            ca0.v(obj);
            vf1Var = (vf1) this.h;
            this.h = vf1Var;
            this.g = 1;
            obj = kg1.a(vf1Var, (r3 & 1) != 0, nx0.e, this);
        } else if (i == 1) {
            vf1Var = (vf1) this.h;
            ca0.v(obj);
        } else {
            if (i != 2) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vf1Var = (vf1) this.h;
            ca0.v(obj);
            List list = ((mx0) obj).a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj3 = list.get(i3);
                if (((qx0) obj3).d) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                if (xa0.n(((qx0) obj2).a, i5Var.h)) {
                    break;
                }
                i2++;
            }
            qx0 qx0Var = (qx0) obj2;
            if (qx0Var == null) {
                qx0Var = (qx0) CollectionsKt.firstOrNull(arrayList);
            }
            if (qx0Var != null) {
                i5Var.h = qx0Var.a;
                i5Var.b = qx0Var.c;
            }
            if (arrayList.isEmpty()) {
                i5Var.h = -1L;
                return Unit.a;
            }
            this.h = vf1Var;
            this.g = 2;
            obj = vf1Var.a(nx0.e, this);
        }
        qx0 qx0Var2 = (qx0) obj;
        i5Var.h = qx0Var2.a;
        i5Var.b = qx0Var2.c;
        this.h = vf1Var;
        this.g = 2;
        obj = vf1Var.a(nx0.e, this);
    }
}
