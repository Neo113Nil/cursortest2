package kotlin.reflect.jvm.internal.impl.types;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes9.dex */
public class TypeCheckerState {
    public final boolean allowedTypeVariable;
    public int argumentsDepth;
    public final boolean isDnnTypesEqualToFlexible;
    public final boolean isErrorTypeEqualsToAnything;
    public final boolean isStubTypeEqualsToAnything;
    public final AbstractTypePreparator kotlinTypePreparator;
    public final AbstractTypeRefiner kotlinTypeRefiner;
    public ArrayDeque supertypesDeque;
    public SmartSet supertypesSet;
    public final TypeSystemContext typeSystemContext;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {
            public boolean result;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public void fork(Function0<Boolean> function0) {
                function0.getClass();
                if (this.result) {
                    return;
                }
                this.result = ((Boolean) function0.invoke()).booleanValue();
            }

            public final boolean getResult() {
                return this.result;
            }
        }

        void fork(Function0<Boolean> function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LowerCapturedTypePolicy {
        public static final /* synthetic */ LowerCapturedTypePolicy[] $VALUES;
        public static final LowerCapturedTypePolicy CHECK_ONLY_LOWER;
        public static final LowerCapturedTypePolicy CHECK_SUBTYPE_AND_LOWER;
        public static final LowerCapturedTypePolicy SKIP_LOWER;

        static {
            LowerCapturedTypePolicy lowerCapturedTypePolicy = new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0);
            CHECK_ONLY_LOWER = lowerCapturedTypePolicy;
            LowerCapturedTypePolicy lowerCapturedTypePolicy2 = new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1);
            CHECK_SUBTYPE_AND_LOWER = lowerCapturedTypePolicy2;
            LowerCapturedTypePolicy lowerCapturedTypePolicy3 = new LowerCapturedTypePolicy("SKIP_LOWER", 2);
            SKIP_LOWER = lowerCapturedTypePolicy3;
            $VALUES = new LowerCapturedTypePolicy[]{lowerCapturedTypePolicy, lowerCapturedTypePolicy2, lowerCapturedTypePolicy3};
        }

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) $VALUES.clone();
        }
    }

    public TypeCheckerState(boolean z, boolean z2, boolean z3, boolean z4, TypeSystemContext typeSystemContext, AbstractTypePreparator abstractTypePreparator, AbstractTypeRefiner abstractTypeRefiner) {
        typeSystemContext.getClass();
        abstractTypePreparator.getClass();
        abstractTypeRefiner.getClass();
        this.isErrorTypeEqualsToAnything = z;
        this.isStubTypeEqualsToAnything = z2;
        this.isDnnTypesEqualToFlexible = z3;
        this.allowedTypeVariable = z4;
        this.typeSystemContext = typeSystemContext;
        this.kotlinTypePreparator = abstractTypePreparator;
        this.kotlinTypeRefiner = abstractTypeRefiner;
    }

    public static /* synthetic */ Boolean addSubtypeConstraint$default(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return typeCheckerState.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    public Boolean addSubtypeConstraint(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return null;
    }

    public final void clear() {
        ArrayDeque arrayDeque = this.supertypesDeque;
        arrayDeque.getClass();
        arrayDeque.clear();
        SmartSet smartSet = this.supertypesSet;
        smartSet.getClass();
        smartSet.clear();
    }

    public boolean customIsSubtypeOf(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return true;
    }

    public final AbstractTypePreparator getKotlinTypePreparator() {
        return this.kotlinTypePreparator;
    }

    public LowerCapturedTypePolicy getLowerCapturedTypePolicy(RigidTypeMarker rigidTypeMarker, CapturedTypeMarker capturedTypeMarker) {
        rigidTypeMarker.getClass();
        capturedTypeMarker.getClass();
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<RigidTypeMarker> getSupertypesDeque() {
        return this.supertypesDeque;
    }

    public final Set<RigidTypeMarker> getSupertypesSet() {
        return this.supertypesSet;
    }

    public final TypeSystemContext getTypeSystemContext() {
        return this.typeSystemContext;
    }

    public final void initialize() {
        if (this.supertypesDeque == null) {
            this.supertypesDeque = new ArrayDeque(4);
        }
        if (this.supertypesSet == null) {
            this.supertypesSet = SmartSet.Companion.create();
        }
    }

    public final boolean isAllowedTypeVariable(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.allowedTypeVariable && this.typeSystemContext.isTypeVariableType(kotlinTypeMarker);
    }

    public final boolean isDnnTypesEqualToFlexible() {
        return this.isDnnTypesEqualToFlexible;
    }

    public final boolean isErrorTypeEqualsToAnything() {
        return this.isErrorTypeEqualsToAnything;
    }

    public final boolean isStubTypeEqualsToAnything() {
        return this.isStubTypeEqualsToAnything;
    }

    public final KotlinTypeMarker prepareType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.kotlinTypePreparator.prepareType(kotlinTypeMarker);
    }

    public final KotlinTypeMarker refineType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return this.kotlinTypeRefiner.refineType(kotlinTypeMarker);
    }

    public boolean runForkingPoint(Function1<? super ForkPointContext, Unit> function1) {
        function1.getClass();
        ForkPointContext.Default r0 = new ForkPointContext.Default();
        function1.invoke(r0);
        return r0.getResult();
    }

    public static abstract class SupertypesPolicy {

        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        public static final class LowerIfFlexible extends SupertypesPolicy {
            public static final LowerIfFlexible INSTANCE = new LowerIfFlexible(null);

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* renamed from: transformType */
            public RigidTypeMarker mo4155transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                return typeCheckerState.getTypeSystemContext().lowerBoundIfFlexible(kotlinTypeMarker);
            }
        }

        public static final class UpperIfFlexible extends SupertypesPolicy {
            public static final UpperIfFlexible INSTANCE = new UpperIfFlexible(null);

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* renamed from: transformType */
            public RigidTypeMarker mo4155transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                return typeCheckerState.getTypeSystemContext().upperBoundIfFlexible(kotlinTypeMarker);
            }
        }

        public SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: transformType */
        public abstract RigidTypeMarker mo4155transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker);

        public static final class None extends SupertypesPolicy {
            public static final None INSTANCE = new None(null);

            public Void transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                throw new UnsupportedOperationException("Should not be called");
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* renamed from: transformType, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ RigidTypeMarker mo4155transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                return (RigidTypeMarker) transformType(typeCheckerState, kotlinTypeMarker);
            }
        }
    }
}
