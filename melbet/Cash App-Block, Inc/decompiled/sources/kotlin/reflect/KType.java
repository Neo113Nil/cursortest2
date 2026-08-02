package kotlin.reflect;

import java.util.List;

/* loaded from: classes9.dex */
public interface KType extends KAnnotatedElement {
    List getArguments();

    KClassifier getClassifier();

    boolean isMarkedNullable();
}
