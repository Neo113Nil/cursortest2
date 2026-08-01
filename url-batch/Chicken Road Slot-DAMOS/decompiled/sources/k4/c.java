package k4;

import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import wd.c0;
import wd.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f5387a;

    public c(f... fVarArr) {
        this.f5387a = fVarArr;
    }

    @Override // androidx.lifecycle.w0
    public final u0 c(Class cls, e eVar) {
        u0 u0Var;
        f fVar;
        Function1 function1;
        h a9 = c0.a(cls);
        f[] fVarArr = this.f5387a;
        f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        int length = fVarArr2.length;
        int i3 = 0;
        while (true) {
            u0Var = null;
            if (i3 >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArr2[i3];
            if (fVar.f5389a.equals(a9)) {
                break;
            }
            i3++;
        }
        if (fVar != null && (function1 = fVar.f5390b) != null) {
            u0Var = (u0) function1.invoke(eVar);
        }
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + a9.b()).toString());
    }
}
