package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

/* loaded from: classes9.dex */
public final class AnnotationUtilKt {
    public static final Name DEPRECATED_LEVEL_NAME;
    public static final Name DEPRECATED_MESSAGE_NAME;
    public static final Name DEPRECATED_REPLACE_WITH_NAME;
    public static final Name REPLACE_WITH_EXPRESSION_NAME;
    public static final Name REPLACE_WITH_IMPORTS_NAME;

    static {
        Name identifier = Name.identifier("message");
        identifier.getClass();
        DEPRECATED_MESSAGE_NAME = identifier;
        Name identifier2 = Name.identifier("replaceWith");
        identifier2.getClass();
        DEPRECATED_REPLACE_WITH_NAME = identifier2;
        Name identifier3 = Name.identifier("level");
        identifier3.getClass();
        DEPRECATED_LEVEL_NAME = identifier3;
        Name identifier4 = Name.identifier("expression");
        identifier4.getClass();
        REPLACE_WITH_EXPRESSION_NAME = identifier4;
        Name identifier5 = Name.identifier("imports");
        identifier5.getClass();
        REPLACE_WITH_IMPORTS_NAME = identifier5;
    }

    public static final AnnotationDescriptor createDeprecatedAnnotation(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z) {
        kotlinBuiltIns.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        boolean z2 = false;
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, MapsKt__MapsKt.mapOf(new Pair(REPLACE_WITH_EXPRESSION_NAME, new StringValue(str2)), new Pair(REPLACE_WITH_IMPORTS_NAME, new ArrayValue(EmptyList.INSTANCE, new KotlinBuiltIns.AnonymousClass3(kotlinBuiltIns, 1)))), z2, 8, null);
        FqName fqName = StandardNames.FqNames.deprecated;
        Pair pair = new Pair(DEPRECATED_MESSAGE_NAME, new StringValue(str));
        Pair pair2 = new Pair(DEPRECATED_REPLACE_WITH_NAME, new AnnotationValue(builtInAnnotationDescriptor));
        ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.deprecationLevel);
        Name identifier = Name.identifier(str3);
        identifier.getClass();
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt__MapsKt.mapOf(pair, pair2, new Pair(DEPRECATED_LEVEL_NAME, new EnumValue(classId, identifier))), z);
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3, z);
    }
}
