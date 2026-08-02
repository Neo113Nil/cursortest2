package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class ReflectKotlinClassFinderKt {
    public static final String access$toRuntimeFqName(ClassId classId) {
        String replace = StringsKt__StringsJVMKt.replace(classId.getRelativeClassName().asString(), '.', '$', false);
        if (classId.getPackageFqName().isRoot()) {
            return replace;
        }
        return classId.getPackageFqName() + '.' + replace;
    }
}
