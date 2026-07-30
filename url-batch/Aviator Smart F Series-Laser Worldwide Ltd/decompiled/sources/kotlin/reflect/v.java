package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class v implements WildcardType, t {
    public static final a Companion = new a(null);
    private static final v STAR = new v(null, null);
    private final Type lowerBound;
    private final Type upperBound;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final v getSTAR() {
            return v.STAR;
        }
    }

    public v(Type type, Type type2) {
        this.upperBound = type;
        this.lowerBound = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.t
    public String getTypeName() {
        String typeToString;
        String typeToString2;
        if (this.lowerBound != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("? super ");
            typeToString2 = TypesJVMKt.typeToString(this.lowerBound);
            sb.append(typeToString2);
            return sb.toString();
        }
        Type type = this.upperBound;
        if (type == null || kotlin.jvm.internal.s.areEqual(type, Object.class)) {
            return "?";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("? extends ");
        typeToString = TypesJVMKt.typeToString(this.upperBound);
        sb2.append(typeToString);
        return sb2.toString();
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.upperBound;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
