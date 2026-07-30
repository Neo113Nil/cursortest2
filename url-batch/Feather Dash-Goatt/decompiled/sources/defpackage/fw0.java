package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fw0 implements Function0 {
    public final /* synthetic */ gw0 d;

    public fw0(gw0 gw0Var) {
        this.d = gw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList arrayList = this.d.a;
        vn0 vn0Var = new vn0(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gc0 gc0Var = (gc0) arrayList.get(i);
            Object obj = gc0Var.b;
            int i2 = gc0Var.a;
            Object rb0Var = obj != null ? new rb0(Integer.valueOf(i2), gc0Var.b) : Integer.valueOf(i2);
            int f = vn0Var.f(rb0Var);
            boolean z = f < 0;
            Object obj2 = z ? null : vn0Var.c[f];
            if (obj2 != null) {
                if (obj2 instanceof mn0) {
                    mn0 mn0Var = (mn0) obj2;
                    mn0Var.a(gc0Var);
                    gc0Var = mn0Var;
                } else {
                    Object[] objArr = rq0.a;
                    mn0 mn0Var2 = new mn0(2);
                    mn0Var2.a(obj2);
                    mn0Var2.a(gc0Var);
                    gc0Var = mn0Var2;
                }
            }
            if (z) {
                int i3 = ~f;
                vn0Var.b[i3] = rb0Var;
                vn0Var.c[i3] = gc0Var;
            } else {
                vn0Var.c[f] = gc0Var;
            }
        }
        return new zm0(vn0Var);
    }
}
