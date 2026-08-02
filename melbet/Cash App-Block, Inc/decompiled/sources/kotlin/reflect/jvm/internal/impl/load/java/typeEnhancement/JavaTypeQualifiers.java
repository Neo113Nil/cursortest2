package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class JavaTypeQualifiers {
    public static final Companion Companion = new Companion(null);
    public static final JavaTypeQualifiers NONE = new JavaTypeQualifiers(null, null, false, false, false, 24, null);
    public final boolean definitelyNotNull;
    public final boolean isMutabilityQualifierForWarning;
    public final boolean isNullabilityQualifierForWarning;
    public final MutabilityQualifier mutability;
    public final NullabilityQualifier nullability;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.NONE;
        }
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    public static /* synthetic */ JavaTypeQualifiers copy$default(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.nullability;
        }
        if ((i & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.mutability;
        }
        if ((i & 4) != 0) {
            z = javaTypeQualifiers.definitelyNotNull;
        }
        if ((i & 8) != 0) {
            z2 = javaTypeQualifiers.isNullabilityQualifierForWarning;
        }
        if ((i & 16) != 0) {
            z3 = javaTypeQualifiers.isMutabilityQualifierForWarning;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return javaTypeQualifiers.copy(nullabilityQualifier, mutabilityQualifier, z5, z2, z4);
    }

    public final JavaTypeQualifiers copy(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, boolean z3) {
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj;
        return this.nullability == javaTypeQualifiers.nullability && this.mutability == javaTypeQualifiers.mutability && this.definitelyNotNull == javaTypeQualifiers.definitelyNotNull && this.isNullabilityQualifierForWarning == javaTypeQualifiers.isNullabilityQualifierForWarning && this.isMutabilityQualifierForWarning == javaTypeQualifiers.isMutabilityQualifierForWarning;
    }

    public final boolean getDefinitelyNotNull() {
        return this.definitelyNotNull;
    }

    public final MutabilityQualifier getMutability() {
        return this.mutability;
    }

    public final NullabilityQualifier getNullability() {
        return this.nullability;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.nullability;
        int hashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.mutability;
        return Boolean.hashCode(this.isMutabilityQualifierForWarning) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31, 31, this.definitelyNotNull), 31, this.isNullabilityQualifierForWarning);
    }

    public final boolean isMutabilityQualifierForWarning() {
        return this.isMutabilityQualifierForWarning;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.isNullabilityQualifierForWarning;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.nullability);
        sb.append(", mutability=");
        sb.append(this.mutability);
        sb.append(", definitelyNotNull=");
        sb.append(this.definitelyNotNull);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.isNullabilityQualifierForWarning);
        sb.append(", isMutabilityQualifierForWarning=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isMutabilityQualifierForWarning, ')');
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, boolean z3) {
        this.nullability = nullabilityQualifier;
        this.mutability = mutabilityQualifier;
        this.definitelyNotNull = z;
        this.isNullabilityQualifierForWarning = z2;
        this.isMutabilityQualifierForWarning = z3;
    }
}
