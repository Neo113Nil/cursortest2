package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.km.Modality;

/* loaded from: classes9.dex */
public abstract class KotlinKCallable extends ReflectKCallableImpl {
    public abstract Modality getModality();

    @Override // kotlin.reflect.KCallable
    public final boolean isAbstract() {
        return getModality() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isFinal() {
        return getModality() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isOpen() {
        return getModality() == Modality.OPEN;
    }
}
