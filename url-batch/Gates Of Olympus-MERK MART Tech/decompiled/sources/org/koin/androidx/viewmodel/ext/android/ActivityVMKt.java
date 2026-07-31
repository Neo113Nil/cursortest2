package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
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

/* compiled from: ActivityVM.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0087\bø\u0001\u0000\u001aQ\u0010\f\u001a\u0002H\u0002\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"viewModel", "Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "extrasProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "getViewModel", "(Landroidx/activity/ComponentActivity;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "koin-android_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityVMKt {
    public static /* synthetic */ Lazy viewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ActivityVMKt$viewModel$1(componentActivity, qualifier, function0, function02));
    }

    public static final /* synthetic */ <T extends ViewModel> Lazy<T> viewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ActivityVMKt$viewModel$1(componentActivity, qualifier, function0, function02));
    }

    public static /* synthetic */ ViewModel getViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function02, int i, Object obj) {
        CreationExtras defaultViewModelCreationExtras;
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        if ((i & 2) != 0) {
            function0 = null;
        }
        Function0 function03 = (i & 4) != 0 ? null : function02;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = (CreationExtras) function0.invoke()) == null) {
            defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, qualifier2, koinScope, function03, 4, null);
    }

    public static final /* synthetic */ <T extends ViewModel> T getViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = function0.invoke()) == null) {
            defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, qualifier, koinScope, function02, 4, null);
    }
}
