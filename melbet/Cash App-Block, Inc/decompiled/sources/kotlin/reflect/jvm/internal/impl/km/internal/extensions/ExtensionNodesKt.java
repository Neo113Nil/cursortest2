package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;

/* loaded from: classes9.dex */
public final class ExtensionNodesKt {
    public static final KmClassExtension getExtension(KmClass kmClass, KmExtensionType kmExtensionType) {
        kmClass.getClass();
        kmExtensionType.getClass();
        return (KmClassExtension) singleOfType(kmClass.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final KmExtension singleOfType(Collection collection, KmExtensionType kmExtensionType) {
        Iterator it = collection.iterator();
        KmExtension kmExtension = null;
        while (it.hasNext()) {
            KmExtension kmExtension2 = (KmExtension) it.next();
            if (Intrinsics.areEqual(kmExtension2.getType(), kmExtensionType)) {
                if (kmExtension != null) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(kmExtensionType, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                kmExtension = kmExtension2;
            }
        }
        if (kmExtension != null) {
            return kmExtension;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(kmExtensionType, "No extensions handle the extension type: ");
        return null;
    }

    public static final KmPackageExtension getExtension(KmPackage kmPackage, KmExtensionType kmExtensionType) {
        kmPackage.getClass();
        kmExtensionType.getClass();
        return (KmPackageExtension) singleOfType(kmPackage.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final KmFunctionExtension getExtension(KmFunction kmFunction, KmExtensionType kmExtensionType) {
        kmFunction.getClass();
        kmExtensionType.getClass();
        return (KmFunctionExtension) singleOfType(kmFunction.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final KmPropertyExtension getExtension(KmProperty kmProperty, KmExtensionType kmExtensionType) {
        kmProperty.getClass();
        kmExtensionType.getClass();
        return (KmPropertyExtension) singleOfType(kmProperty.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final KmConstructorExtension getExtension(KmConstructor kmConstructor, KmExtensionType kmExtensionType) {
        kmConstructor.getClass();
        kmExtensionType.getClass();
        return (KmConstructorExtension) singleOfType(kmConstructor.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final KmTypeParameterExtension getExtension(KmTypeParameter kmTypeParameter, KmExtensionType kmExtensionType) {
        kmTypeParameter.getClass();
        kmExtensionType.getClass();
        return (KmTypeParameterExtension) singleOfType(kmTypeParameter.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final KmTypeExtension getExtension(KmType kmType, KmExtensionType kmExtensionType) {
        kmType.getClass();
        kmExtensionType.getClass();
        return (KmTypeExtension) singleOfType(kmType.getExtensions$kotlin_metadata(), kmExtensionType);
    }
}
