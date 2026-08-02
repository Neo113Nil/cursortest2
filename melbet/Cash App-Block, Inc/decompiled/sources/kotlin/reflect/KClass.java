package kotlin.reflect;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface KClass extends KDeclarationContainer, KAnnotatedElement, KClassifier {
    Collection getConstructors();

    String getQualifiedName();

    String getSimpleName();

    List getSupertypes();

    List getTypeParameters();

    int hashCode();

    boolean isInner();

    boolean isInstance(Object obj);

    boolean isValue();
}
