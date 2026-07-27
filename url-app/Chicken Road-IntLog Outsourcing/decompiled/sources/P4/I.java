package P4;

import java.util.Arrays;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final N4.e[] f2330a = new N4.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final M4.a[] f2331b = new M4.a[0];

    public static final C0142v a(String str, M4.a aVar) {
        return new C0142v(str, new C0143w(aVar));
    }

    public static final N4.e[] b(List list) {
        N4.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (N4.e[]) list.toArray(new N4.e[0])) == null) ? f2330a : eVarArr;
    }

    public static final int c(N4.e eVar, N4.e[] typeParams) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(typeParams, "typeParams");
        int hashCode = (eVar.b().hashCode() * 31) + Arrays.hashCode(typeParams);
        N4.g gVar = new N4.g(eVar);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i6 = 0;
            if (!gVar.hasNext()) {
                break;
            }
            int i7 = i3 * 31;
            String b6 = ((N4.e) gVar.next()).b();
            if (b6 != null) {
                i6 = b6.hashCode();
            }
            i3 = i7 + i6;
        }
        N4.g gVar2 = new N4.g(eVar);
        while (gVar2.hasNext()) {
            int i8 = i2 * 31;
            AbstractC1341c c2 = ((N4.e) gVar2.next()).c();
            i2 = i8 + (c2 != null ? c2.hashCode() : 0);
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }
}
