package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeAliasExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;

/* loaded from: classes9.dex */
public final class KmTypeAlias {
    public final ArrayList annotations;
    public KmType expandedType;
    public int flags;
    public final ArrayList typeParameters;
    public KmType underlyingType;
    public final ArrayList versionRequirements;

    public KmTypeAlias(int i, String str) {
        str.getClass();
        this.flags = i;
        this.typeParameters = new ArrayList(0);
        this.annotations = new ArrayList(0);
        this.versionRequirements = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            KmTypeAliasExtension createTypeAliasExtension = ((MetadataExtensions) it.next()).createTypeAliasExtension();
            if (createTypeAliasExtension != null) {
                arrayList.add(createTypeAliasExtension);
            }
        }
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    public final List<KmTypeParameter> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setExpandedType(KmType kmType) {
        kmType.getClass();
        this.expandedType = kmType;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setUnderlyingType(KmType kmType) {
        kmType.getClass();
        this.underlyingType = kmType;
    }
}
