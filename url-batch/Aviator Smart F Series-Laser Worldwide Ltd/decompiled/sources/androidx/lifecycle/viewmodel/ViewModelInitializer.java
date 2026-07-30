package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import f6.l;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final Class<T> clazz;
    private final l initializer;

    public ViewModelInitializer(Class<T> clazz, l initializer) {
        s.checkNotNullParameter(clazz, "clazz");
        s.checkNotNullParameter(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final l getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }
}
