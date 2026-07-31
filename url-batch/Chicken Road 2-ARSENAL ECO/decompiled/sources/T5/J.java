package T5;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final R5.e[] f2393a = new R5.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Q5.a[] f2394b = new Q5.a[0];

    public static final C0205v a(String str, Q5.a aVar) {
        return new C0205v(str, new C0206w(aVar));
    }

    public static final R5.e[] b(List list) {
        R5.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (R5.e[]) list.toArray(new R5.e[0])) == null) ? f2393a : eVarArr;
    }

    public static final int c(R5.e eVar, R5.e[] typeParams) {
        kotlin.jvm.internal.i.e(typeParams, "typeParams");
        int hashCode = (eVar.b().hashCode() * 31) + Arrays.hashCode(typeParams);
        R5.g gVar = new R5.g(eVar);
        int i7 = 1;
        int i8 = 1;
        while (true) {
            int i9 = 0;
            if (!gVar.hasNext()) {
                break;
            }
            int i10 = i8 * 31;
            String b7 = ((R5.e) gVar.next()).b();
            if (b7 != null) {
                i9 = b7.hashCode();
            }
            i8 = i10 + i9;
        }
        R5.g gVar2 = new R5.g(eVar);
        while (gVar2.hasNext()) {
            int i11 = i7 * 31;
            A3.c c7 = ((R5.e) gVar2.next()).c();
            i7 = i11 + (c7 != null ? c7.hashCode() : 0);
        }
        return (((hashCode * 31) + i8) * 31) + i7;
    }
}
