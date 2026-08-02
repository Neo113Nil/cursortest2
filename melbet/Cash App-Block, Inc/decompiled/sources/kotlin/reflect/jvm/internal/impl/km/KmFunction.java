package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;

/* loaded from: classes9.dex */
public final class KmFunction {
    public final ArrayList annotations;
    public final ArrayList contextParameters;
    public final ArrayList extensionReceiverParameterAnnotations;
    public final ArrayList extensions;
    public int flags;
    public final String name;
    public KmType receiverParameterType;
    public KmType returnType;
    public final ArrayList typeParameters;
    public final ArrayList valueParameters;
    public final ArrayList versionRequirements;

    public KmFunction(int i, String str) {
        str.getClass();
        this.flags = i;
        this.name = str;
        this.typeParameters = new ArrayList(0);
        this.extensionReceiverParameterAnnotations = new ArrayList(0);
        new ArrayList(0);
        this.valueParameters = new ArrayList();
        this.contextParameters = new ArrayList();
        this.versionRequirements = new ArrayList(0);
        this.annotations = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).createFunctionExtension());
        }
        this.extensions = arrayList;
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final List<KmValueParameter> getContextParameters() {
        return this.contextParameters;
    }

    public final List<KmAnnotation> getExtensionReceiverParameterAnnotations() {
        return this.extensionReceiverParameterAnnotations;
    }

    public final List<KmFunctionExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    public final String getName() {
        return this.name;
    }

    public final KmType getReceiverParameterType() {
        return this.receiverParameterType;
    }

    public final KmType getReturnType() {
        KmType kmType = this.returnType;
        if (kmType != null) {
            return kmType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("returnType");
        throw null;
    }

    public final List<KmTypeParameter> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<KmValueParameter> getValueParameters() {
        return this.valueParameters;
    }

    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setContract(KmContract kmContract) {
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setReceiverParameterType(KmType kmType) {
        this.receiverParameterType = kmType;
    }

    public final void setReturnType(KmType kmType) {
        kmType.getClass();
        this.returnType = kmType;
    }
}
