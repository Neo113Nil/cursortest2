package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;

/* loaded from: classes9.dex */
public final class JvmTypeFactoryImpl implements JvmTypeFactory {
    public static final JvmTypeFactoryImpl INSTANCE = new JvmTypeFactoryImpl();

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static JvmType createFromString(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        str.getClass();
        char charAt = str.charAt(0);
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = values[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (charAt == '[') {
            return new JvmType.Array(createFromString(str.substring(1)));
        }
        if (charAt == 'L') {
            StringsKt.endsWith$default(str, ';');
        }
        return new JvmType.Object(Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, str));
    }

    public static String toString(JvmType jvmType) {
        String desc;
        jvmType.getClass();
        if (jvmType instanceof JvmType.Array) {
            return "[".concat(toString(((JvmType.Array) jvmType).getElementType()));
        }
        if (jvmType instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) jvmType).getJvmPrimitiveType();
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY : desc;
        }
        if (!(jvmType instanceof JvmType.Object)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return "L" + ((JvmType.Object) jvmType).getInternalName() + ';';
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final Object boxType(Object obj) {
        JvmType jvmType = (JvmType) obj;
        jvmType.getClass();
        if (!(jvmType instanceof JvmType.Primitive)) {
            return jvmType;
        }
        JvmType.Primitive primitive = (JvmType.Primitive) jvmType;
        if (primitive.getJvmPrimitiveType() == null) {
            return jvmType;
        }
        String internalName = JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName()).getInternalName();
        internalName.getClass();
        return new JvmType.Object(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final Object createObjectType(String str) {
        str.getClass();
        return new JvmType.Object(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final Object createPrimitiveType(PrimitiveType primitiveType) {
        primitiveType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[primitiveType.ordinal()]) {
            case 1:
                return JvmType.Companion.getBOOLEAN$descriptors_jvm();
            case 2:
                return JvmType.Companion.getCHAR$descriptors_jvm();
            case 3:
                return JvmType.Companion.getBYTE$descriptors_jvm();
            case 4:
                return JvmType.Companion.getSHORT$descriptors_jvm();
            case 5:
                return JvmType.Companion.getINT$descriptors_jvm();
            case 6:
                return JvmType.Companion.getFLOAT$descriptors_jvm();
            case 7:
                return JvmType.Companion.getLONG$descriptors_jvm();
            case 8:
                return JvmType.Companion.getDOUBLE$descriptors_jvm();
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final Object getJavaLangClassType() {
        return new JvmType.Object("java/lang/Class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final /* bridge */ /* synthetic */ String toString(Object obj) {
        return toString((JvmType) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: createFromString, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object mo4150createFromString(String str) {
        return createFromString(str);
    }
}
