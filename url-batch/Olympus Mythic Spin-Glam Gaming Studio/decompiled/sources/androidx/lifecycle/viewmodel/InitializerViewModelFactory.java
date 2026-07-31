package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: InitializerViewModelFactory.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "VM", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "[Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer[] initializers;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        ViewModelProviders viewModelProviders = ViewModelProviders.INSTANCE;
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(modelClass);
        ViewModelInitializer[] viewModelInitializerArr = this.initializers;
        return viewModelProviders.createViewModelFromInitializers$lifecycle_viewmodel(kotlinClass, extras, (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
