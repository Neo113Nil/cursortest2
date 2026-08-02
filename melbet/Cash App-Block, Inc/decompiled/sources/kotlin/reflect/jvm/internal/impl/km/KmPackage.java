package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;

/* loaded from: classes9.dex */
public final class KmPackage implements KmDeclarationContainer {
    public final ArrayList extensions;
    public final ArrayList functions = new ArrayList();
    public final ArrayList properties = new ArrayList();
    public final ArrayList typeAliases = new ArrayList(0);

    public KmPackage() {
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).createPackageExtension());
        }
        this.extensions = arrayList;
    }

    public final List<KmPackageExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public List<KmFunction> getFunctions() {
        return this.functions;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public List<KmProperty> getProperties() {
        return this.properties;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public List<KmTypeAlias> getTypeAliases() {
        return this.typeAliases;
    }
}
