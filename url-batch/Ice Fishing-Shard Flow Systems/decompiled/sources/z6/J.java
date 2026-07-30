package z6;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final x6.e[] f8745a = new x6.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final w6.a[] f8746b = new w6.a[0];

    public static final C1081v a(String name, w6.a primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new C1081v(name, new C1082w(primitiveSerializer));
    }

    public static final x6.e[] b(List list) {
        x6.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (x6.e[]) list.toArray(new x6.e[0])) == null) ? f8745a : eVarArr;
    }

    public static final int c(x6.e eVar, x6.e[] typeParams) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (eVar.b().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        R5.u uVar = new R5.u(eVar);
        int i2 = 1;
        int i5 = 1;
        while (true) {
            int i7 = 0;
            if (!uVar.hasNext()) {
                break;
            }
            int i8 = i5 * 31;
            String b7 = ((x6.e) uVar.next()).b();
            if (b7 != null) {
                i7 = b7.hashCode();
            }
            i5 = i8 + i7;
        }
        R5.u uVar2 = new R5.u(eVar);
        while (uVar2.hasNext()) {
            int i9 = i2 * 31;
            V6.b c7 = ((x6.e) uVar2.next()).c();
            i2 = i9 + (c7 != null ? c7.hashCode() : 0);
        }
        return (((hashCode * 31) + i5) * 31) + i2;
    }
}
