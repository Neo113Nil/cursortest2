package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes9.dex */
public abstract class JvmType {
    public static final Companion Companion = new Companion(null);
    public static final Primitive BOOLEAN = new Primitive(JvmPrimitiveType.BOOLEAN);
    public static final Primitive CHAR = new Primitive(JvmPrimitiveType.CHAR);
    public static final Primitive BYTE = new Primitive(JvmPrimitiveType.BYTE);
    public static final Primitive SHORT = new Primitive(JvmPrimitiveType.SHORT);
    public static final Primitive INT = new Primitive(JvmPrimitiveType.INT);
    public static final Primitive FLOAT = new Primitive(JvmPrimitiveType.FLOAT);
    public static final Primitive LONG = new Primitive(JvmPrimitiveType.LONG);
    public static final Primitive DOUBLE = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {
        public final JvmType elementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(JvmType jvmType) {
            super(null);
            jvmType.getClass();
            this.elementType = jvmType;
        }

        public final JvmType getElementType() {
            return this.elementType;
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.BOOLEAN;
        }

        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.BYTE;
        }

        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.CHAR;
        }

        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.DOUBLE;
        }

        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.FLOAT;
        }

        public final Primitive getINT$descriptors_jvm() {
            return JvmType.INT;
        }

        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.LONG;
        }

        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.SHORT;
        }
    }

    public static final class Object extends JvmType {
        public final String internalName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(String str) {
            super(null);
            str.getClass();
            this.internalName = str;
        }

        public final String getInternalName() {
            return this.internalName;
        }
    }

    public static final class Primitive extends JvmType {
        public final JvmPrimitiveType jvmPrimitiveType;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.jvmPrimitiveType = jvmPrimitiveType;
        }

        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.jvmPrimitiveType;
        }
    }

    public JvmType(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public String toString() {
        return JvmTypeFactoryImpl.toString(this);
    }
}
