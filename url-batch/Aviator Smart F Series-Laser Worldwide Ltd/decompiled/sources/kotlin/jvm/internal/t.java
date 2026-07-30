package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.jvm.KotlinReflectionNotSupportedError;

/* loaded from: classes4.dex */
public final class t implements l {
    private final Class<?> jClass;
    private final String moduleName;

    public t(Class<?> jClass, String moduleName) {
        s.checkNotNullParameter(jClass, "jClass");
        s.checkNotNullParameter(moduleName, "moduleName");
        this.jClass = jClass;
        this.moduleName = moduleName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && s.areEqual(getJClass(), ((t) obj).getJClass());
    }

    @Override // kotlin.jvm.internal.l
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.jvm.internal.l, kotlin.reflect.g
    public Collection<kotlin.reflect.c> getMembers() {
        throw new KotlinReflectionNotSupportedError();
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public String toString() {
        return getJClass().toString() + " (Kotlin reflection is not available)";
    }
}
