package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmValueParameterExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;

/* loaded from: classes9.dex */
public final class KmValueParameter {
    public KmAnnotationArgument annotationParameterDefaultValue;
    public final ArrayList annotations;
    public int flags;
    public final String name;

    /* renamed from: type, reason: collision with root package name */
    public KmType f1529type;
    public KmType varargElementType;

    public KmValueParameter(int i, String str) {
        str.getClass();
        this.flags = i;
        this.name = str;
        this.annotations = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            KmValueParameterExtension createValueParameterExtension = ((MetadataExtensions) it.next()).createValueParameterExtension();
            if (createValueParameterExtension != null) {
                arrayList.add(createValueParameterExtension);
            }
        }
    }

    public final KmAnnotationArgument getAnnotationParameterDefaultValue() {
        return this.annotationParameterDefaultValue;
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    public final String getName() {
        return this.name;
    }

    public final KmType getType() {
        KmType kmType = this.f1529type;
        if (kmType != null) {
            return kmType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        throw null;
    }

    public final KmType getVarargElementType() {
        return this.varargElementType;
    }

    public final void setAnnotationParameterDefaultValue(KmAnnotationArgument kmAnnotationArgument) {
        this.annotationParameterDefaultValue = kmAnnotationArgument;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setType(KmType kmType) {
        kmType.getClass();
        this.f1529type = kmType;
    }

    public final void setVarargElementType(KmType kmType) {
        this.varargElementType = kmType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KmValueParameter(String str) {
        this(0, str);
        str.getClass();
    }
}
