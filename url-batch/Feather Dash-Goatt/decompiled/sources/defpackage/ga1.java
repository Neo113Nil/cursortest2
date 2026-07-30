package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ga1 {
    public final k8 a;
    public final ha1 b;
    public final Context c;
    public final String d;
    public final cg1 e;
    public final LinkedHashSet f;

    public ga1(Context context, String str, Set set, k8 k8Var, ha1 ha1Var) {
        context.getClass();
        set.getClass();
        w3 w3Var = new w3(context, 10, str);
        this.a = k8Var;
        this.b = ha1Var;
        this.c = context;
        this.d = str;
        this.e = ee0.b(w3Var);
        this.f = set == ja1.a ? null : CollectionsKt.z(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, fn fnVar) {
        fa1 fa1Var;
        Object obj2;
        int i;
        if (fnVar instanceof fa1) {
            fa1Var = (fa1) fnVar;
            int i2 = fa1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fa1Var.k = i2 - Integer.MIN_VALUE;
                obj2 = fa1Var.i;
                tn tnVar = tn.d;
                i = fa1Var.k;
                boolean z = true;
                if (i != 0) {
                    ca0.v(obj2);
                    fa1Var.h = this;
                    fa1Var.k = 1;
                    obj2 = this.a.b(obj, fa1Var);
                    if (obj2 == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = fa1Var.h;
                    ca0.v(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.f;
                cg1 cg1Var = this.e;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) cg1Var.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                Map<String, ?> all = ((SharedPreferences) cg1Var.getValue()).getAll();
                all.getClass();
            }
        }
        fa1Var = new fa1(this, fnVar);
        obj2 = fa1Var.i;
        tn tnVar2 = tn.d;
        i = fa1Var.k;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
