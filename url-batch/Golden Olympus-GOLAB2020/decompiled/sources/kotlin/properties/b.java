package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class b implements c {
    private Object value;

    public b(Object obj) {
        this.value = obj;
    }

    protected abstract void afterChange(h hVar, Object obj, Object obj2);

    protected boolean beforeChange(@NotNull h property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.c
    public Object getValue(@Nullable Object obj, @NotNull h property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.c
    public void setValue(@Nullable Object obj, @NotNull h property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
