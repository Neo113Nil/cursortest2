package kotlin.reflect.jvm.internal.impl.km;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class KmAnnotation {
    public final Map arguments;
    public final String className;

    public KmAnnotation(String str, Map<String, ? extends KmAnnotationArgument> map) {
        str.getClass();
        map.getClass();
        this.className = str;
        this.arguments = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmAnnotation)) {
            return false;
        }
        KmAnnotation kmAnnotation = (KmAnnotation) obj;
        return Intrinsics.areEqual(this.className, kmAnnotation.className) && Intrinsics.areEqual(this.arguments, kmAnnotation.arguments);
    }

    public final Map<String, KmAnnotationArgument> getArguments() {
        return this.arguments;
    }

    public final String getClassName() {
        return this.className;
    }

    public int hashCode() {
        return this.arguments.hashCode() + (this.className.hashCode() * 31);
    }

    public String toString() {
        return "@" + this.className + '(' + CollectionsKt.joinToString$default(MapsKt___MapsKt.toList(this.arguments), null, null, null, 0, null, KmAnnotation$$Lambda$0.INSTANCE, 31) + ')';
    }
}
