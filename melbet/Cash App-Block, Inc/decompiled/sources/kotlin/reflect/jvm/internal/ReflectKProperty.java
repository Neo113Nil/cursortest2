package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.KotlinGenericDeclaration;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public interface ReflectKProperty extends KotlinGenericDeclaration, KProperty, ReflectKCallable {
    Field getJavaField();

    String getSignature();
}
