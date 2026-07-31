package C2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;

/* renamed from: C2.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0339v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final A2.f[] f338a = new A2.f[0];

    public static final Set a(A2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof InterfaceC0323n) {
            return ((InterfaceC0323n) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.f());
        int f4 = fVar.f();
        for (int i4 = 0; i4 < f4; i4++) {
            hashSet.add(fVar.g(i4));
        }
        return hashSet;
    }

    public static final A2.f[] b(List list) {
        A2.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (A2.f[]) list.toArray(new A2.f[0])) == null) ? f338a : fVarArr;
    }

    public static final m2.c c(m2.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        m2.d g4 = kVar.g();
        if (g4 instanceof m2.c) {
            return (m2.c) g4;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + g4).toString());
    }

    public static final String d(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final String e(m2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String e4 = cVar.e();
        if (e4 == null) {
            e4 = "<local class name not available>";
        }
        return d(e4);
    }

    public static final Void f(m2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        throw new C3534i(e(cVar));
    }
}
