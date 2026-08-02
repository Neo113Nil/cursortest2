package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmEnumEntryExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;

/* loaded from: classes9.dex */
public final class KmEnumEntry {
    public final ArrayList annotations;
    public final String name;

    public KmEnumEntry(String str) {
        str.getClass();
        this.name = str;
        this.annotations = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            KmEnumEntryExtension createEnumEntryExtension = ((MetadataExtensions) it.next()).createEnumEntryExtension();
            if (createEnumEntryExtension != null) {
                arrayList.add(createEnumEntryExtension);
            }
        }
    }

    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public String toString() {
        return this.name;
    }
}
