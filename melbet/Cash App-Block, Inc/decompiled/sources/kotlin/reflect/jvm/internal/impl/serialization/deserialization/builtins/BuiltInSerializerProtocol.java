package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {
    public static final BuiltInSerializerProtocol INSTANCE;

    static {
        ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
        BuiltInsProtoBuf.registerAllExtensions(newInstance);
        newInstance.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = BuiltInsProtoBuf.packageFqName;
        generatedExtension.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> generatedExtension2 = BuiltInsProtoBuf.constructorAnnotation;
        generatedExtension2.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> generatedExtension3 = BuiltInsProtoBuf.classAnnotation;
        generatedExtension3.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtension4 = BuiltInsProtoBuf.functionAnnotation;
        generatedExtension4.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension5 = BuiltInsProtoBuf.propertyAnnotation;
        generatedExtension5.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension6 = BuiltInsProtoBuf.propertyGetterAnnotation;
        generatedExtension6.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension7 = BuiltInsProtoBuf.propertySetterAnnotation;
        generatedExtension7.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> generatedExtension8 = BuiltInsProtoBuf.enumEntryAnnotation;
        generatedExtension8.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> generatedExtension9 = BuiltInsProtoBuf.compileTimeValue;
        generatedExtension9.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> generatedExtension10 = BuiltInsProtoBuf.parameterAnnotation;
        generatedExtension10.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> generatedExtension11 = BuiltInsProtoBuf.typeAnnotation;
        generatedExtension11.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> generatedExtension12 = BuiltInsProtoBuf.typeParameterAnnotation;
        generatedExtension12.getClass();
        INSTANCE = new BuiltInSerializerProtocol(newInstance, generatedExtension, generatedExtension2, generatedExtension3, generatedExtension4, null, generatedExtension5, generatedExtension6, generatedExtension7, null, null, null, generatedExtension8, generatedExtension9, generatedExtension10, generatedExtension11, generatedExtension12);
    }

    public final String getBuiltInsFileName(FqName fqName) {
        String asString;
        fqName.getClass();
        if (fqName.isRoot()) {
            asString = "default-package";
        } else {
            asString = fqName.shortName().asString();
            asString.getClass();
        }
        return asString.concat(".kotlin_builtins");
    }

    public final String getBuiltInsFilePath(FqName fqName) {
        fqName.getClass();
        return StringsKt__StringsJVMKt.replace(fqName.asString(), '.', '/', false) + '/' + getBuiltInsFileName(fqName);
    }
}
