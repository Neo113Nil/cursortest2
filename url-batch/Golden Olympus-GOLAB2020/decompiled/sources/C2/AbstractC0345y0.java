package C2;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0345y0 {
    public static final int a(A2.f fVar, A2.f[] typeParams) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable a4 = A2.h.a(fVar);
        Iterator it = a4.iterator();
        int i4 = 1;
        int i5 = 1;
        while (true) {
            int i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i7 = i5 * 31;
            String a5 = ((A2.f) it.next()).a();
            if (a5 != null) {
                i6 = a5.hashCode();
            }
            i5 = i7 + i6;
        }
        Iterator it2 = a4.iterator();
        while (it2.hasNext()) {
            int i8 = i4 * 31;
            A2.j e4 = ((A2.f) it2.next()).e();
            i4 = i8 + (e4 != null ? e4.hashCode() : 0);
        }
        return (((hashCode * 31) + i5) * 31) + i4;
    }
}
