package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;

/* loaded from: classes9.dex */
public final class TypeUtilsKt$$Lambda$0 implements Function1 {
    public static final TypeUtilsKt$$Lambda$0 INSTANCE = new TypeUtilsKt$$Lambda$0(0);
    public static final TypeUtilsKt$$Lambda$0 INSTANCE$1 = new TypeUtilsKt$$Lambda$0(1);
    public static final TypeUtilsKt$$Lambda$0 INSTANCE$2 = new TypeUtilsKt$$Lambda$0(2);
    public static final TypeUtilsKt$$Lambda$0 INSTANCE$3 = new TypeUtilsKt$$Lambda$0(3);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TypeUtilsKt$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = true;
        UnwrappedType unwrappedType = (UnwrappedType) obj;
        switch (this.$r8$classId) {
            case 0:
                return Boolean.valueOf(TypeUtils.isTypeParameter(unwrappedType));
            case 1:
                unwrappedType.getClass();
                ClassifierDescriptor mo4153getDeclarationDescriptor = unwrappedType.getConstructor().mo4153getDeclarationDescriptor();
                return Boolean.valueOf(mo4153getDeclarationDescriptor != null ? TypeUtilsKt.isTypeAliasParameter(mo4153getDeclarationDescriptor) : false);
            case 2:
                unwrappedType.getClass();
                ClassifierDescriptor mo4153getDeclarationDescriptor2 = unwrappedType.getConstructor().mo4153getDeclarationDescriptor();
                if (mo4153getDeclarationDescriptor2 == null || (!(mo4153getDeclarationDescriptor2 instanceof TypeAliasDescriptor) && !(mo4153getDeclarationDescriptor2 instanceof TypeParameterDescriptor))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                unwrappedType.getClass();
                if (!(unwrappedType instanceof StubTypeForBuilderInference) && !(unwrappedType.getConstructor() instanceof TypeVariableTypeConstructorMarker) && !KotlinTypeKt.isError(unwrappedType)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
