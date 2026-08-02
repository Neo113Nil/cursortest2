package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.KotlinGenericDeclaration;
import kotlin.reflect.KFunction;

/* loaded from: classes9.dex */
public interface ReflectKFunction extends KotlinGenericDeclaration, KFunction, ReflectKCallable {
    String getSignature();

    boolean isPrimaryConstructor();
}
