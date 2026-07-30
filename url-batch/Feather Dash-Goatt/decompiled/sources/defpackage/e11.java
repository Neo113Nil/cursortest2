package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e11 {
    public final ArrayList a = new ArrayList();

    public e11(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, t50 t50Var, Object obj) {
        ArrayList arrayList = t50Var.a;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                if (!(obj2 instanceof d3)) {
                    if (!(obj2 instanceof t50)) {
                        af.j(obj2, "Unexpected child source info ");
                        break;
                    }
                    if (a(i, (t50) obj2, obj)) {
                        b(0, t50Var, obj2);
                        return true;
                    }
                } else if (obj2 == obj) {
                    b(0, t50Var, obj2);
                    return true;
                }
                i2++;
            }
        } else {
            b(i, t50Var, null);
            return true;
        }
    }

    public final void b(int i, t50 t50Var, Object obj) {
        this.a.add(new wk(i, null, null));
    }

    public final void c(int i, Object obj, t50 t50Var, Object obj2) {
        if (Intrinsics.a(obj, bl.a)) {
            b(i, t50Var, null);
        }
    }
}
