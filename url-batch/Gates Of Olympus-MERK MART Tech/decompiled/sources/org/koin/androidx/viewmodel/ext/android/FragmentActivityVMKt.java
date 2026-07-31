package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: FragmentActivityVM.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ab\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\n\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\n\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u0087\bø\u0001\u0000\u001aa\u0010\u000e\u001a\u0002H\u0002\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\n\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\n\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"activityViewModel", "Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "ownerProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "getActivityViewModel", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "koin-android_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentActivityVMKt {
    public static /* synthetic */ Lazy activityViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 ownerProducer, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            ownerProducer = new Function0<ViewModelStoreOwner>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentActivityVMKt$activityViewModel$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStoreOwner invoke() {
                    FragmentActivity requireActivity = Fragment.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    return requireActivity;
                }
            };
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Function0 function03 = (i & 8) != 0 ? null : function02;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new FragmentActivityVMKt$activityViewModel$2(fragment, qualifier, ownerProducer, function0, function03));
    }

    public static final /* synthetic */ <T extends ViewModel> Lazy<T> activityViewModel(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new FragmentActivityVMKt$activityViewModel$2(fragment, qualifier, ownerProducer, function0, function02));
    }

    public static /* synthetic */ ViewModel getActivityViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 ownerProducer, Function0 function0, Function0 function02, int i, Object obj) {
        CreationExtras defaultViewModelCreationExtras;
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        if ((i & 2) != 0) {
            ownerProducer = new Function0<ViewModelStoreOwner>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentActivityVMKt$getActivityViewModel$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStoreOwner invoke() {
                    FragmentActivity requireActivity = Fragment.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    return requireActivity;
                }
            };
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Function0 function03 = (i & 8) != 0 ? null : function02;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) ownerProducer.invoke();
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = (CreationExtras) function0.invoke()) == null) {
            ComponentActivity componentActivity = viewModelStoreOwner instanceof ComponentActivity ? (ComponentActivity) viewModelStoreOwner : null;
            if (componentActivity != null) {
                defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            }
        }
        CreationExtras creationExtras = defaultViewModelCreationExtras;
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, creationExtras, qualifier2, koinScope, function03, 4, null);
    }

    public static final /* synthetic */ <T extends ViewModel> T getActivityViewModel(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        ViewModelStoreOwner invoke = ownerProducer.invoke();
        ViewModelStore viewModelStore = invoke.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = function0.invoke()) == null) {
            ComponentActivity componentActivity = invoke instanceof ComponentActivity ? (ComponentActivity) invoke : null;
            if (componentActivity != null) {
                defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            }
        }
        CreationExtras creationExtras = defaultViewModelCreationExtras;
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, creationExtras, qualifier, koinScope, function02, 4, null);
    }
}
