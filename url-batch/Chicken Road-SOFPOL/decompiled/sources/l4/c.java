package l4;

import androidx.lifecycle.r0;
import androidx.lifecycle.t0;
import java.util.Arrays;
import q6.i;
import q6.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f4830a;

    public c(f... fVarArr) {
        i.e(fVarArr, "initializers");
        this.f4830a = fVarArr;
    }

    @Override // androidx.lifecycle.t0
    public final r0 c(Class cls, e eVar) {
        r0 r0Var;
        f fVar;
        p6.c cVar;
        q6.e a8 = t.a(cls);
        f[] fVarArr = this.f4830a;
        f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        i.e(fVarArr2, "initializers");
        int length = fVarArr2.length;
        int i = 0;
        while (true) {
            r0Var = null;
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArr2[i];
            if (fVar.f4832a.equals(a8)) {
                break;
            }
            i++;
        }
        if (fVar != null && (cVar = fVar.f4833b) != null) {
            r0Var = (r0) cVar.i(eVar);
        }
        if (r0Var != null) {
            return r0Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + m.a.x(a8)).toString());
    }
}
