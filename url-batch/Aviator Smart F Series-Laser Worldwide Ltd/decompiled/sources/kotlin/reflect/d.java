package kotlin.reflect;

import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public interface d extends g, b, f {
    boolean equals(Object obj);

    /* synthetic */ List getAnnotations();

    Collection<h> getConstructors();

    @Override // kotlin.reflect.g
    Collection<c> getMembers();

    Collection<d> getNestedClasses();

    Object getObjectInstance();

    String getQualifiedName();

    List<d> getSealedSubclasses();

    String getSimpleName();

    List<q> getSupertypes();

    List<r> getTypeParameters();

    KVisibility getVisibility();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isFun();

    boolean isInner();

    boolean isInstance(Object obj);

    boolean isOpen();

    boolean isSealed();

    boolean isValue();
}
