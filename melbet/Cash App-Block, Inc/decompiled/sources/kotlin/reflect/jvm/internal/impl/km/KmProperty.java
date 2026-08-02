package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* loaded from: classes9.dex */
public final class KmProperty {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference1Impl(KmProperty.class, "_hasSetter", "get_hasSetter()Z", 0), new MutablePropertyReference1Impl(KmProperty.class, "_hasGetter", "get_hasGetter()Z", 0)};
    public final ArrayList annotations;
    public final ArrayList backingFieldAnnotations;
    public final ArrayList contextParameters;
    public final ArrayList delegateFieldAnnotations;
    public final ArrayList extensionReceiverParameterAnnotations;
    public final ArrayList extensions;
    public int flags;
    public final KmPropertyAccessorAttributes getter;
    public final String name;
    public KmType receiverParameterType;
    public KmType returnType;
    public final KmPropertyAccessorAttributes setter;
    public KmValueParameter setterParameter;
    public final ArrayList typeParameters;
    public final ArrayList versionRequirements;

    public KmProperty(int i, String str, int i2, int i3) {
        str.getClass();
        this.flags = i;
        this.name = str;
        Flags.BooleanFlagField booleanFlagField = Flags.HAS_SETTER;
        booleanFlagField.getClass();
        BooleanFlagDelegate<KmProperty> propertyBooleanFlag = FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(booleanFlagField));
        Flags.BooleanFlagField booleanFlagField2 = Flags.HAS_GETTER;
        booleanFlagField2.getClass();
        BooleanFlagDelegate<KmProperty> propertyBooleanFlag2 = FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(booleanFlagField2));
        KmPropertyAccessorAttributes kmPropertyAccessorAttributes = new KmPropertyAccessorAttributes(i2);
        KProperty[] kPropertyArr = $$delegatedProperties;
        propertyBooleanFlag2.setValue(this, kPropertyArr[1], true);
        this.getter = kmPropertyAccessorAttributes;
        this.setter = propertyBooleanFlag.getValue(this, kPropertyArr[0]) ? new KmPropertyAccessorAttributes(i3) : null;
        this.typeParameters = new ArrayList(0);
        this.extensionReceiverParameterAnnotations = new ArrayList(0);
        new ArrayList(0);
        this.contextParameters = new ArrayList();
        this.versionRequirements = new ArrayList(0);
        this.annotations = new ArrayList(0);
        this.backingFieldAnnotations = new ArrayList(0);
        this.delegateFieldAnnotations = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).createPropertyExtension());
        }
        this.extensions = arrayList;
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final List<KmAnnotation> getBackingFieldAnnotations() {
        return this.backingFieldAnnotations;
    }

    public final List<KmValueParameter> getContextParameters() {
        return this.contextParameters;
    }

    public final List<KmAnnotation> getDelegateFieldAnnotations() {
        return this.delegateFieldAnnotations;
    }

    public final List<KmAnnotation> getExtensionReceiverParameterAnnotations() {
        return this.extensionReceiverParameterAnnotations;
    }

    public final List<KmPropertyExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    public final KmPropertyAccessorAttributes getGetter() {
        return this.getter;
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

    public final KmPropertyAccessorAttributes getSetter() {
        return this.setter;
    }

    public final KmValueParameter getSetterParameter() {
        return this.setterParameter;
    }

    public final List<KmTypeParameter> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.versionRequirements;
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

    public final void setSetterParameter(KmValueParameter kmValueParameter) {
        this.setterParameter = kmValueParameter;
    }
}
