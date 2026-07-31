package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
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
/* compiled from: ActivityVM.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ActivityVMKt$viewModel$1<T> implements Function0<T> {
    final /* synthetic */ Function0<CreationExtras> $extrasProducer;
    final /* synthetic */ Function0<ParametersHolder> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ ComponentActivity $this_viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityVMKt$viewModel$1(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function02) {
        this.$this_viewModel = componentActivity;
        this.$qualifier = qualifier;
        this.$extrasProducer = function0;
        this.$parameters = function02;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModel invoke() {
        CreationExtras defaultViewModelCreationExtras;
        ComponentActivity componentActivity = this.$this_viewModel;
        Qualifier qualifier = this.$qualifier;
        Function0<CreationExtras> function0 = this.$extrasProducer;
        Function0<ParametersHolder> function02 = this.$parameters;
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = function0.invoke()) == null) {
            defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, qualifier, koinScope, function02, 4, null);
    }
}
