package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

/* loaded from: classes9.dex */
public final class UtilsKt {
    public static final String debugInfo(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + typeConstructor);
        sb.append('\n');
        sb.append("hashCode: " + typeConstructor.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + typeConstructor.getClass().getCanonicalName());
        sb.append('\n');
        for (DeclarationDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor(); mo4153getDeclarationDescriptor != null; mo4153getDeclarationDescriptor = mo4153getDeclarationDescriptor.getContainingDeclaration()) {
            sb.append("fqName: " + DescriptorRenderer.FQ_NAMES_IN_TYPES.render(mo4153getDeclarationDescriptor));
            sb.append('\n');
            sb.append("javaClass: " + mo4153getDeclarationDescriptor.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    public static final KotlinType findCorrespondingSupertype(KotlinType kotlinType, KotlinType kotlinType2, TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        kotlinType.getClass();
        kotlinType2.getClass();
        typeCheckingProcedureCallbacks.getClass();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new SubtypePathNode(kotlinType, null));
        TypeConstructor constructor = kotlinType2.getConstructor();
        while (!arrayDeque.isEmpty()) {
            SubtypePathNode subtypePathNode = (SubtypePathNode) arrayDeque.poll();
            KotlinType kotlinType3 = subtypePathNode.f1538type;
            TypeConstructor constructor2 = kotlinType3.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean isMarkedNullable = kotlinType3.isMarkedNullable();
                for (SubtypePathNode subtypePathNode2 = subtypePathNode.previous; subtypePathNode2 != null; subtypePathNode2 = subtypePathNode2.previous) {
                    KotlinType kotlinType4 = subtypePathNode2.f1538type;
                    List<TypeProjection> arguments = kotlinType4.getArguments();
                    if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                        Iterator<T> it = arguments.iterator();
                        while (it.hasNext()) {
                            Variance projectionKind = ((TypeProjection) it.next()).getProjectionKind();
                            Variance variance = Variance.INVARIANT;
                            if (projectionKind != variance) {
                                KotlinType safeSubstitute = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(kotlinType4), false, 1, null).buildSubstitutor().safeSubstitute(kotlinType3, variance);
                                safeSubstitute.getClass();
                                kotlinType3 = CapturedTypeApproximationKt.approximateCapturedTypes(safeSubstitute).getUpper();
                                break;
                            }
                        }
                    }
                    kotlinType3 = TypeConstructorSubstitution.Companion.create(kotlinType4).buildSubstitutor().safeSubstitute(kotlinType3, Variance.INVARIANT);
                    kotlinType3.getClass();
                    isMarkedNullable = isMarkedNullable || kotlinType4.isMarkedNullable();
                }
                TypeConstructor constructor3 = kotlinType3.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return TypeUtils.makeNullableAsSpecified(kotlinType3, isMarkedNullable);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + debugInfo(constructor3) + ", \n\nsupertype: " + debugInfo(constructor) + " \n" + typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
            }
            for (KotlinType kotlinType5 : constructor2.getSupertypes()) {
                kotlinType5.getClass();
                arrayDeque.add(new SubtypePathNode(kotlinType5, subtypePathNode));
            }
        }
        return null;
    }
}
