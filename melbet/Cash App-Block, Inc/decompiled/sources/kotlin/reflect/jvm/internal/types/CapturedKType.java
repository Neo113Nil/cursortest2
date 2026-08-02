package kotlin.reflect.jvm.internal.types;

import com.nimbusds.jose.util.X509CertChainUtils;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class CapturedKType extends AbstractKType implements CapturedTypeMarker {
    public final boolean isMarkedNullable;
    public final KType lowerType;
    public final CapturedKTypeConstructor typeConstructor;

    /* renamed from: kotlin.reflect.jvm.internal.types.CapturedKType$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(0, X509CertChainUtils.class, "javaTypeNotSupported", "javaTypeNotSupported()Ljava/lang/Void;", 1);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            throw new KotlinReflectionInternalError("javaType for captured types is not supported");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturedKType(KType kType, CapturedKTypeConstructor capturedKTypeConstructor, boolean z) {
        super(AnonymousClass1.INSTANCE);
        capturedKTypeConstructor.getClass();
        this.lowerType = kType;
        this.typeConstructor = capturedKTypeConstructor;
        this.isMarkedNullable = z;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean equals(Object obj) {
        if (!(obj instanceof CapturedKType)) {
            return false;
        }
        CapturedKType capturedKType = (CapturedKType) obj;
        return Intrinsics.areEqual(this.lowerType, capturedKType.lowerType) && Intrinsics.areEqual(this.typeConstructor, capturedKType.typeConstructor) && this.isMarkedNullable == capturedKType.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final KType getAbbreviation() {
        return null;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final KClass getMutableCollectionClass() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final int hashCode() {
        KType kType = this.lowerType;
        int hashCode = kType != null ? kType.hashCode() : 0;
        return Boolean.hashCode(this.isMarkedNullable) + ((this.typeConstructor.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isDefinitelyNotNullType() {
        return false;
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isNothingType() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isRawType() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isSuspendFunctionType() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType lowerBoundIfFlexible() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType makeDefinitelyNotNullAsSpecified(boolean z) {
        if (!z) {
            return this;
        }
        f$$ExternalSyntheticLambda0.m$1(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType makeNullableAsSpecified(boolean z) {
        return z == this.isMarkedNullable ? this : new CapturedKType(this.lowerType, this.typeConstructor, z);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final String toString() {
        return this.typeConstructor.toString();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final AbstractKType upperBoundIfFlexible() {
        return null;
    }
}
