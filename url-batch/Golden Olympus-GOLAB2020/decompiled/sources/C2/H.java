package C2;

import java.lang.annotation.Annotation;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public abstract class H {
    public static final InterfaceC3527b a(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        F f4 = new F(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                f4.s(annotation);
            }
        }
        int length = values.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Enum r4 = values[i4];
            int i6 = i5 + 1;
            String str = (String) AbstractC3219i.N(names, i5);
            if (str == null) {
                str = r4.name();
            }
            C0343x0.m(f4, str, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC3219i.N(entryAnnotations, i5);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    f4.r(annotation2);
                }
            }
            i4++;
            i5 = i6;
        }
        return new G(serialName, values, f4);
    }
}
