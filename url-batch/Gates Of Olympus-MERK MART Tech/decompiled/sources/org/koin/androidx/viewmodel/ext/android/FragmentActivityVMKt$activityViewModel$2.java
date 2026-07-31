package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.viewmodel.GetViewModelKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: FragmentActivityVM.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class FragmentActivityVMKt$activityViewModel$2<T> implements Function0<T> {
    final /* synthetic */ Function0<CreationExtras> $extrasProducer;
    final /* synthetic */ Function0<ViewModelStoreOwner> $ownerProducer;
    final /* synthetic */ Function0<ParametersHolder> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Fragment $this_activityViewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentActivityVMKt$activityViewModel$2(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> function0, Function0<? extends CreationExtras> function02, Function0<? extends ParametersHolder> function03) {
        this.$this_activityViewModel = fragment;
        this.$qualifier = qualifier;
        this.$ownerProducer = function0;
        this.$extrasProducer = function02;
        this.$parameters = function03;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModel invoke() {
        CreationExtras defaultViewModelCreationExtras;
        Fragment fragment = this.$this_activityViewModel;
        Qualifier qualifier = this.$qualifier;
        Function0<ViewModelStoreOwner> function0 = this.$ownerProducer;
        Function0<CreationExtras> function02 = this.$extrasProducer;
        Function0<ParametersHolder> function03 = this.$parameters;
        ViewModelStoreOwner invoke = function0.invoke();
        ViewModelStore viewModelStore = invoke.getViewModelStore();
        if (function02 == null || (defaultViewModelCreationExtras = function02.invoke()) == null) {
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
        return GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, creationExtras, qualifier, koinScope, function03, 4, null);
    }
}
