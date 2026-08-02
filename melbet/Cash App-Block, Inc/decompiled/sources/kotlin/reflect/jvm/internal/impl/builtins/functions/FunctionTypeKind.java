package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes3.dex */
public abstract class FunctionTypeKind {
    public static final Companion Companion = new Companion(null);
    public final String classNamePrefix;
    public final int maxArity;
    public final FqName packageFqName;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class Function extends FunctionTypeKind {
        public static final Function INSTANCE = new Function(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, null, true, 0, 32, null);
    }

    public static final class KFunction extends FunctionTypeKind {
        public static final KFunction INSTANCE = new KFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction", true, null, false, Function.INSTANCE.getMaxArity());
    }

    public static final class KSuspendFunction extends FunctionTypeKind {
        public static final KSuspendFunction INSTANCE = new KSuspendFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction", true, null, false, SuspendFunction.INSTANCE.getMaxArity());
    }

    public static final class SuspendFunction extends FunctionTypeKind {
        public static final SuspendFunction INSTANCE = new SuspendFunction(StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", false, null, true, Function.INSTANCE.getMaxArity() - 1);
    }

    public /* synthetic */ FunctionTypeKind(FqName fqName, String str, boolean z, ClassId classId, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, str, z, classId, z2, (i2 & 32) != 0 ? EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE : i);
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final int getMaxArity() {
        return this.maxArity;
    }

    public final FqName getPackageFqName() {
        return this.packageFqName;
    }

    public final ClassId numberedClassId(int i) {
        return new ClassId(this.packageFqName, numberedClassName(i));
    }

    public final Name numberedClassName(int i) {
        Name identifier = Name.identifier(this.classNamePrefix + i);
        identifier.getClass();
        return identifier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.packageFqName);
        sb.append('.');
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.classNamePrefix, 'N');
    }

    public FunctionTypeKind(FqName fqName, String str, boolean z, ClassId classId, boolean z2, int i) {
        fqName.getClass();
        str.getClass();
        this.packageFqName = fqName;
        this.classNamePrefix = str;
        this.maxArity = i;
    }
}
