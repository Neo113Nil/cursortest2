package kotlin.reflect.jvm.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.crypto.tink.subtle.Hkdf;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class JvmPropertySignature$KotlinProperty extends Hkdf {
    public final DeserializedPropertyDescriptor descriptor;
    public final NameResolver nameResolver;
    public final ProtoBuf.Property proto;
    public final JvmProtoBuf.JvmPropertySignature signature;

    /* renamed from: string, reason: collision with root package name */
    public final String f1523string;
    public final TypeTable typeTable;

    public JvmPropertySignature$KotlinProperty(DeserializedPropertyDescriptor deserializedPropertyDescriptor, ProtoBuf.Property property, JvmProtoBuf.JvmPropertySignature jvmPropertySignature, NameResolver nameResolver, TypeTable typeTable) {
        String str;
        String m;
        String string2;
        property.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        this.descriptor = deserializedPropertyDescriptor;
        this.proto = property;
        this.signature = jvmPropertySignature;
        this.nameResolver = nameResolver;
        this.typeTable = typeTable;
        if (jvmPropertySignature.hasGetter()) {
            m = nameResolver.getString(jvmPropertySignature.getGetter().getName()) + nameResolver.getString(jvmPropertySignature.getGetter().getDesc());
        } else {
            JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, property, nameResolver, typeTable, false, 8, null);
            if (jvmFieldSignature$default == null) {
                f$$ExternalSyntheticLambda0.m$1(deserializedPropertyDescriptor, "No field signature for property: ");
                throw null;
            }
            String component1 = jvmFieldSignature$default.component1();
            String component2 = jvmFieldSignature$default.component2();
            StringBuilder sb = new StringBuilder();
            sb.append(JvmAbi.getterName(component1));
            DeclarationDescriptor containingDeclaration = deserializedPropertyDescriptor.getContainingDeclaration();
            containingDeclaration.getClass();
            if (Intrinsics.areEqual(deserializedPropertyDescriptor.getVisibility(), DescriptorVisibilities.INTERNAL) && (containingDeclaration instanceof DeserializedClassDescriptor)) {
                ProtoBuf.Class classProto = ((DeserializedClassDescriptor) containingDeclaration).getClassProto();
                GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension = JvmProtoBuf.classModuleName;
                generatedExtension.getClass();
                Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(classProto, generatedExtension);
                str = "$" + NameUtils.sanitizeAsJavaIdentifier((num == null || (string2 = nameResolver.getString(num.intValue())) == null) ? "main" : string2);
            } else {
                if (Intrinsics.areEqual(deserializedPropertyDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE) && (containingDeclaration instanceof PackageFragmentDescriptor)) {
                    DeserializedContainerSource containerSource = deserializedPropertyDescriptor.getContainerSource();
                    if (containerSource instanceof JvmPackagePartSource) {
                        JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) containerSource;
                        if (jvmPackagePartSource.getFacadeClassName() != null) {
                            str = "$" + jvmPackagePartSource.getSimpleName().asString();
                        }
                    }
                }
                str = "";
            }
            m = Recorder$$ExternalSyntheticOutline2.m(sb, str, "()", component2);
        }
        this.f1523string = m;
    }

    @Override // com.google.crypto.tink.subtle.Hkdf
    public final String asString() {
        return this.f1523string;
    }

    public final PropertyDescriptor getDescriptor() {
        return this.descriptor;
    }

    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    public final ProtoBuf.Property getProto() {
        return this.proto;
    }

    public final JvmProtoBuf.JvmPropertySignature getSignature() {
        return this.signature;
    }

    public final TypeTable getTypeTable() {
        return this.typeTable;
    }
}
