package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;

/* loaded from: classes9.dex */
public final class KmClass implements KmDeclarationContainer {
    public final ArrayList extensions;
    public int flags;
    public String inlineClassUnderlyingPropertyName;
    public KmType inlineClassUnderlyingType;
    public String name;
    public final ArrayList typeParameters = new ArrayList(0);
    public final ArrayList supertypes = new ArrayList(1);
    public final ArrayList functions = new ArrayList();
    public final ArrayList properties = new ArrayList();
    public final ArrayList typeAliases = new ArrayList(0);
    public final ArrayList constructors = new ArrayList(1);
    public final ArrayList nestedClasses = new ArrayList(0);
    public final ArrayList enumEntries = new ArrayList(0);
    public final ArrayList kmEnumEntries = new ArrayList(0);
    public final ArrayList sealedSubclasses = new ArrayList(0);
    public final ArrayList annotations = new ArrayList(0);
    public final ArrayList contextReceiverTypes = new ArrayList(0);
    public final ArrayList versionRequirements = new ArrayList(0);

    public KmClass() {
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).createClassExtension());
        }
        this.extensions = arrayList;
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final List<KmConstructor> getConstructors() {
        return this.constructors;
    }

    public final List<KmType> getContextReceiverTypes() {
        return this.contextReceiverTypes;
    }

    public final List<String> getEnumEntries() {
        return this.enumEntries;
    }

    public final List<KmClassExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public List<KmFunction> getFunctions() {
        return this.functions;
    }

    public final String getInlineClassUnderlyingPropertyName() {
        return this.inlineClassUnderlyingPropertyName;
    }

    public final KmType getInlineClassUnderlyingType() {
        return this.inlineClassUnderlyingType;
    }

    public final List<KmEnumEntry> getKmEnumEntries() {
        return this.kmEnumEntries;
    }

    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("name");
        throw null;
    }

    public final List<String> getNestedClasses() {
        return this.nestedClasses;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public List<KmProperty> getProperties() {
        return this.properties;
    }

    public final List<String> getSealedSubclasses() {
        return this.sealedSubclasses;
    }

    public final List<KmType> getSupertypes() {
        return this.supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public List<KmTypeAlias> getTypeAliases() {
        return this.typeAliases;
    }

    public final List<KmTypeParameter> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setCompanionObject(String str) {
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setInlineClassUnderlyingPropertyName(String str) {
        this.inlineClassUnderlyingPropertyName = str;
    }

    public final void setInlineClassUnderlyingType(KmType kmType) {
        this.inlineClassUnderlyingType = kmType;
    }

    public final void setName(String str) {
        str.getClass();
        this.name = str;
    }
}
