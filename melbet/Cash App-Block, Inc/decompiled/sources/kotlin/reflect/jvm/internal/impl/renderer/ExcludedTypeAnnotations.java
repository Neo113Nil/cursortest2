package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class ExcludedTypeAnnotations {
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();
    public static final Set internalAnnotationsForResolve = ArraysKt___ArraysKt.toSet(new FqName[]{new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")});

    public final Set<FqName> getInternalAnnotationsForResolve() {
        return internalAnnotationsForResolve;
    }
}
