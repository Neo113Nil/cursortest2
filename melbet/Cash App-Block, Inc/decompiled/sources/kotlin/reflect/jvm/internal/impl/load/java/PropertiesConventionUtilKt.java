package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class PropertiesConventionUtilKt {
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(Name name) {
        name.getClass();
        String asString = name.asString();
        asString.getClass();
        return JvmAbi.isGetterName(asString) ? CollectionsKt__CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name)) : JvmAbi.isSetterName(asString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    public static final Name propertyNameByGetMethodName(Name name) {
        name.getClass();
        Name propertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(name, "get", null, 12);
        return propertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(name, "is", null, 8) : propertyNameFromAccessorMethodName$default;
    }

    public static final Name propertyNameBySetMethodName(Name name, boolean z) {
        name.getClass();
        return propertyNameFromAccessorMethodName$default(name, "set", z ? "is" : null, 4);
    }

    public static Name propertyNameFromAccessorMethodName$default(Name name, String str, String str2, int i) {
        char charAt;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!name.isSpecial()) {
            String identifier = name.getIdentifier();
            identifier.getClass();
            if (StringsKt__StringsJVMKt.startsWith(identifier, str, false) && identifier.length() != str.length() && ('a' > (charAt = identifier.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    return Name.identifier(str2.concat(StringsKt.removePrefix(str, identifier)));
                }
                if (!z) {
                    return name;
                }
                String decapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(StringsKt.removePrefix(str, identifier), true);
                if (Name.isValidIdentifier(decapitalizeSmartForCompiler)) {
                    return Name.identifier(decapitalizeSmartForCompiler);
                }
            }
        }
        return null;
    }

    public static final List<Name> propertyNamesBySetMethodName(Name name) {
        name.getClass();
        return ArraysKt___ArraysKt.filterNotNull(new Name[]{propertyNameBySetMethodName(name, false), propertyNameBySetMethodName(name, true)});
    }
}
