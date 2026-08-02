package kotlin.reflect.jvm.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class ReflectKParameter implements KAnnotatedElement {
    public final Lazy annotations$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KotlinKPropertyN$$Lambda$0(this, 2));

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReflectKParameter)) {
            return false;
        }
        ReflectKParameter reflectKParameter = (ReflectKParameter) obj;
        return Intrinsics.areEqual(getCallable(), reflectKParameter.getCallable()) && getIndex() == reflectKParameter.getIndex();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        return (List) this.annotations$delegate.getValue();
    }

    public abstract ReflectKCallable getCallable();

    public abstract boolean getDeclaresDefaultValue();

    public abstract int getIndex();

    public abstract KParameter$Kind getKind();

    public abstract String getName();

    public abstract KType getType();

    public final int hashCode() {
        return Integer.hashCode(getIndex()) + (getCallable().hashCode() * 31);
    }

    public abstract boolean isOptional();

    public abstract boolean isVararg();

    public final String toString() {
        String renderFunction;
        StringBuilder sb = new StringBuilder();
        int ordinal = getKind().ordinal();
        if (ordinal == 0) {
            sb.append("instance parameter");
        } else if (ordinal == 1) {
            sb.append("context parameter " + getName());
        } else if (ordinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            sb.append("parameter #" + getIndex() + ' ' + getName());
        }
        sb.append(" of ");
        ReflectKCallable callable = getCallable();
        if (callable instanceof KProperty) {
            renderFunction = ReflectionObjectRenderer.renderProperty((KProperty) callable);
        } else {
            if (!(callable instanceof KFunction)) {
                Path$$ExternalSyntheticBUOutline0.m$1(callable, "Illegal callable: ");
                return null;
            }
            renderFunction = ReflectionObjectRenderer.renderFunction((KFunction) callable);
        }
        sb.append(renderFunction);
        return sb.toString();
    }
}
