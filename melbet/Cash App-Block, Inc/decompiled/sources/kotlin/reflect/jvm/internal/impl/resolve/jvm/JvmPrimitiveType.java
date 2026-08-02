package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes3.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, InquiryField.BooleanField.TYPE, "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, InquiryField.FloatField.TYPE, "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");

    public final String desc;
    public final String name;
    public final PrimitiveType primitiveType;
    public final FqName wrapperFqName;
    public static final HashMap TYPE_BY_NAME = new HashMap();
    public static final EnumMap TYPE_BY_PRIMITIVE_TYPE = new EnumMap(PrimitiveType.class);
    public static final HashMap TYPE_BY_DESC = new HashMap();
    public static final HashSet WRAPPER_CLASS_INTERNAL_NAMES = new HashSet();
    public static final HashMap OWNER_TO_BOXING_METHOD_DESCRIPTOR = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Object[] objArr;
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 4 && i != 6) {
                switch (i) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                objArr = new Object[i2];
                switch (i) {
                    case 1:
                        objArr[0] = "owner";
                        break;
                    case 2:
                        objArr[0] = "methodDescriptor";
                        break;
                    case 3:
                    case 9:
                        objArr[0] = "name";
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 5:
                        objArr[0] = "type";
                        break;
                    case 7:
                    case 10:
                        objArr[0] = "desc";
                        break;
                    case 8:
                        objArr[0] = "primitiveType";
                        break;
                    case 11:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "internalName";
                        break;
                }
                if (i == 4 && i != 6) {
                    switch (i) {
                        case 12:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 13:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 14:
                            objArr[1] = "getDesc";
                            break;
                        case 15:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i) {
                    case 1:
                    case 2:
                        objArr[2] = "isBoxingMethodDescriptor";
                        break;
                    case 3:
                    case 5:
                        objArr[2] = "get";
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 7:
                        objArr[2] = "getByDesc";
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassInternalName";
                        break;
                }
                String format2 = String.format(str, objArr);
                if (i != 4 && i != 6) {
                    switch (i) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            throw new IllegalArgumentException(format2);
                    }
                }
                throw new IllegalStateException(format2);
            }
            i2 = 2;
            objArr = new Object[i2];
            switch (i) {
            }
            if (i == 4) {
            }
            objArr[1] = "get";
            switch (i) {
            }
            String format22 = String.format(str, objArr);
            if (i != 4) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format22);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 4) {
            switch (i) {
            }
            objArr = new Object[i2];
            switch (i) {
            }
            if (i == 4) {
            }
            objArr[1] = "get";
            switch (i) {
            }
            String format222 = String.format(str, objArr);
            if (i != 4) {
            }
            throw new IllegalStateException(format222);
        }
        i2 = 2;
        objArr = new Object[i2];
        switch (i) {
        }
        if (i == 4) {
        }
        objArr[1] = "get";
        switch (i) {
        }
        String format2222 = String.format(str, objArr);
        if (i != 4) {
        }
        throw new IllegalStateException(format2222);
    }

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            TYPE_BY_NAME.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            TYPE_BY_PRIMITIVE_TYPE.put((EnumMap) jvmPrimitiveType.getPrimitiveType(), (PrimitiveType) jvmPrimitiveType);
            TYPE_BY_DESC.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
            String replace = jvmPrimitiveType.wrapperFqName.asString().replace('.', '/');
            WRAPPER_CLASS_INTERNAL_NAMES.add(replace);
            OWNER_TO_BOXING_METHOD_DESCRIPTOR.put(replace, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("("), jvmPrimitiveType.desc, ")L", replace, ";"));
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, String str2, String str3) {
        if (primitiveType == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        this.primitiveType = primitiveType;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new FqName(str3);
    }

    public static JvmPrimitiveType get(String str) {
        if (str == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) TYPE_BY_NAME.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        a$$ExternalSyntheticBUOutline0.m$1((Object) "Non-primitive type name passed: ".concat(str));
        return null;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getJavaKeywordName() {
        return this.name;
    }

    public PrimitiveType getPrimitiveType() {
        PrimitiveType primitiveType = this.primitiveType;
        if (primitiveType != null) {
            return primitiveType;
        }
        $$$reportNull$$$0(12);
        throw null;
    }

    public FqName getWrapperFqName() {
        FqName fqName = this.wrapperFqName;
        if (fqName != null) {
            return fqName;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    public static JvmPrimitiveType get(PrimitiveType primitiveType) {
        if (primitiveType != null) {
            JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) TYPE_BY_PRIMITIVE_TYPE.get(primitiveType);
            if (jvmPrimitiveType != null) {
                return jvmPrimitiveType;
            }
            $$$reportNull$$$0(6);
            throw null;
        }
        $$$reportNull$$$0(5);
        throw null;
    }
}
