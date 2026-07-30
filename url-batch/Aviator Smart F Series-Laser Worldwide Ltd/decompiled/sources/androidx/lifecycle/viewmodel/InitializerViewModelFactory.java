package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.l;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... initializers) {
        s.checkNotNullParameter(initializers, "initializers");
        this.initializers = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return l.a(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        s.checkNotNullParameter(modelClass, "modelClass");
        s.checkNotNullParameter(extras, "extras");
        T t7 = null;
        for (ViewModelInitializer<?> viewModelInitializer : this.initializers) {
            if (s.areEqual(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), modelClass)) {
                Object invoke = viewModelInitializer.getInitializer$lifecycle_viewmodel_release().invoke(extras);
                t7 = invoke instanceof ViewModel ? (T) invoke : null;
            }
        }
        if (t7 != null) {
            return t7;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
