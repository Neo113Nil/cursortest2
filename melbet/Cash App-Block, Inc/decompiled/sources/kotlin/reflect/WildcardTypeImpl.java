package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class WildcardTypeImpl implements WildcardType, Type {
    public static final Companion Companion = new Companion(null);
    public static final WildcardTypeImpl STAR = new WildcardTypeImpl(null, null);
    public final Type lowerBound;
    public final Type upperBound;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public WildcardTypeImpl(Type type2, Type type3) {
        this.upperBound = type2;
        this.lowerBound = type3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type2 = this.lowerBound;
        return type2 == null ? new Type[0] : new Type[]{type2};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type2 = this.lowerBound;
        if (type2 != null) {
            return "? super " + TypesJVMKt.access$typeToString(type2);
        }
        Type type3 = this.upperBound;
        if (type3 == null || Intrinsics.areEqual(type3, Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.access$typeToString(type3);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type2 = this.upperBound;
        if (type2 == null) {
            type2 = Object.class;
        }
        return new Type[]{type2};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
