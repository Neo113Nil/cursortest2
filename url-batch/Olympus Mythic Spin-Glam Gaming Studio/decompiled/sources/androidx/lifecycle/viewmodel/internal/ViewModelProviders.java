package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: ViewModelProviders.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001a\u001a\u00020\u00162\u001a\u0010\u001d\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b\"\u0006\u0012\u0002\b\u00030\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "", "getDefaultKey$lifecycle_viewmodel", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "getDefaultKey", "VM", "unsupportedCreateViewModel$lifecycle_viewmodel", "()Landroidx/lifecycle/ViewModel;", "unsupportedCreateViewModel", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultFactory$lifecycle_viewmodel", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras$lifecycle_viewmodel", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras", "extras", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "createViewModelFromInitializers$lifecycle_viewmodel", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;[Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModel;", "createViewModelFromInitializers", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewModelProviders {
    public static final ViewModelProviders INSTANCE = new ViewModelProviders();

    private ViewModelProviders() {
    }

    public final String getDefaultKey$lifecycle_viewmodel(KClass modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = CanonicalName_jvmKt.getCanonicalName(modelClass);
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
    }

    public final ViewModel unsupportedCreateViewModel$lifecycle_viewmodel() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel(ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof HasDefaultViewModelProviderFactory) {
            return ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory();
        }
        return DefaultViewModelProviderFactory.INSTANCE;
    }

    public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel(ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof HasDefaultViewModelProviderFactory) {
            return ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras();
        }
        return CreationExtras.Empty.INSTANCE;
    }

    public final ViewModel createViewModelFromInitializers$lifecycle_viewmodel(KClass modelClass, CreationExtras extras, ViewModelInitializer... initializers) {
        ViewModel viewModel;
        ViewModelInitializer viewModelInitializer;
        Function1 initializer;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i = 0;
        while (true) {
            viewModel = null;
            if (i >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = initializers[i];
            if (Intrinsics.areEqual(viewModelInitializer.getClazz(), modelClass)) {
                break;
            }
            i++;
        }
        if (viewModelInitializer != null && (initializer = viewModelInitializer.getInitializer()) != null) {
            viewModel = (ViewModel) initializer.invoke(extras);
        }
        if (viewModel != null) {
            return viewModel;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + CanonicalName_jvmKt.getCanonicalName(modelClass)).toString());
    }
}
