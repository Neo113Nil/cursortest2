package androidx.lifecycle;

import M2.C0256h;
import kotlin.jvm.internal.Intrinsics;
import p1.C0993c;

/* loaded from: classes.dex */
public interface V {
    default T a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default T b(Class modelClass, C0993c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return a(modelClass);
    }

    default T c(C0256h modelClass, C0993c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(u3.l.g0(modelClass), extras);
    }
}
