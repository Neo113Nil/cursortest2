package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.viewmodel.BundleExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: ViewModelLazy.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0080\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\b\u0012\u00060\rj\u0002`\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fj\u0004\u0018\u0001`\u0014H\u0007\u001a\u0086\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\b\u0012\u00060\rj\u0002`\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fj\u0004\u0018\u0001`\u0014H\u0007¨\u0006\u0016"}, d2 = {"viewModelForClass", "Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "clazz", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "Lorg/koin/viewmodel/SavedStateDefinition;", "key", "", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "Landroidx/fragment/app/Fragment;", "koin-android_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewModelLazyKt {
    public static /* synthetic */ Lazy viewModelForClass$default(ComponentActivity componentActivity, KClass kClass, Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, Function0 function0, String str, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            viewModelStoreOwner = componentActivity;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            function02 = null;
        }
        return viewModelForClass(componentActivity, kClass, qualifier, viewModelStoreOwner, (Function0<Bundle>) function0, str, (Function0<? extends ParametersHolder>) function02);
    }

    public static final <T extends ViewModel> Lazy<T> viewModelForClass(final ComponentActivity componentActivity, final KClass<T> clazz, final Qualifier qualifier, final ViewModelStoreOwner owner, final Function0<Bundle> function0, final String str, final Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(owner, "owner");
        final ViewModelStore viewModelStore = owner.getViewModelStore();
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModel viewModelForClass$lambda$0;
                viewModelForClass$lambda$0 = ViewModelLazyKt.viewModelForClass$lambda$0(Function0.this, owner, componentActivity, clazz, viewModelStore, str, qualifier, function02);
                return viewModelForClass$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModel viewModelForClass$lambda$0(Function0 function0, ViewModelStoreOwner viewModelStoreOwner, ComponentActivity componentActivity, KClass kClass, ViewModelStore viewModelStore, String str, Qualifier qualifier, Function0 function02) {
        CreationExtras.Empty empty;
        Bundle bundle;
        if (function0 == null || (bundle = (Bundle) function0.invoke()) == null || (empty = BundleExtKt.toExtras(bundle, viewModelStoreOwner)) == null) {
            empty = CreationExtras.Empty.INSTANCE;
        }
        return GetViewModelKt.resolveViewModel(kClass, viewModelStore, str, empty, qualifier, AndroidKoinScopeExtKt.getKoinScope(componentActivity), function02);
    }

    public static /* synthetic */ Lazy viewModelForClass$default(final Fragment fragment, KClass kClass, Qualifier qualifier, Function0 function0, Function0 function02, String str, Function0 function03, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ViewModelStoreOwner viewModelForClass$lambda$1;
                    viewModelForClass$lambda$1 = ViewModelLazyKt.viewModelForClass$lambda$1(Fragment.this);
                    return viewModelForClass$lambda$1;
                }
            };
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            function03 = null;
        }
        return viewModelForClass(fragment, kClass, qualifier, (Function0<? extends ViewModelStoreOwner>) function0, (Function0<Bundle>) function02, str, (Function0<? extends ParametersHolder>) function03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelStoreOwner viewModelForClass$lambda$1(Fragment fragment) {
        return fragment;
    }

    public static final <T extends ViewModel> Lazy<T> viewModelForClass(final Fragment fragment, final KClass<T> clazz, final Qualifier qualifier, final Function0<? extends ViewModelStoreOwner> owner, final Function0<Bundle> function0, final String str, final Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(owner, "owner");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModel viewModelForClass$lambda$2;
                viewModelForClass$lambda$2 = ViewModelLazyKt.viewModelForClass$lambda$2(Function0.this, function0, fragment, clazz, str, qualifier, function02);
                return viewModelForClass$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModel viewModelForClass$lambda$2(Function0 function0, Function0 function02, Fragment fragment, KClass kClass, String str, Qualifier qualifier, Function0 function03) {
        CreationExtras.Empty empty;
        Bundle bundle;
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) function0.invoke();
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        if (function02 == null || (bundle = (Bundle) function02.invoke()) == null || (empty = BundleExtKt.toExtras(bundle, viewModelStoreOwner)) == null) {
            empty = CreationExtras.Empty.INSTANCE;
        }
        return GetViewModelKt.resolveViewModel(kClass, viewModelStore, str, empty, qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), function03);
    }
}
