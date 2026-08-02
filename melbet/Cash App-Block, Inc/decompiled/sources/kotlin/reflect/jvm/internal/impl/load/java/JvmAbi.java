package kotlin.reflect.jvm.internal.impl.load.java;

import com.plaid.internal.EnumC0170g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class JvmAbi {
    public static final JvmAbi INSTANCE = new JvmAbi();
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;
    public static final ClassId REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        ClassId.Companion companion = ClassId.Companion;
        JVM_FIELD_ANNOTATION_CLASS_ID = companion.topLevel(fqName);
        companion.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION = ClassId.Companion.fromString$default(companion, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    public static final String getterName(String str) {
        str.getClass();
        if (startsWithIsPrefix(str)) {
            return str;
        }
        return "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str);
    }

    public static final boolean isGetterName(String str) {
        str.getClass();
        return StringsKt__StringsJVMKt.startsWith(str, "get", false) || StringsKt__StringsJVMKt.startsWith(str, "is", false);
    }

    public static final boolean isSetterName(String str) {
        str.getClass();
        return StringsKt__StringsJVMKt.startsWith(str, "set", false);
    }

    public static final String setterName(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("set");
        sb.append(startsWithIsPrefix(str) ? str.substring(2) : CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
        return sb.toString();
    }

    public static final boolean startsWithIsPrefix(String str) {
        str.getClass();
        if (StringsKt__StringsJVMKt.startsWith(str, "is", false) && str.length() != 2) {
            char charAt = str.charAt(2);
            if (Intrinsics.compare(97, (int) charAt) > 0 || Intrinsics.compare((int) charAt, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) > 0) {
                return true;
            }
        }
        return false;
    }

    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;
    }
}
