package org.koin.androidx.compose.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: NavViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ak\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"koinNavViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "key", "", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "scope", "Lorg/koin/core/scope/Scope;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/qualifier/Qualifier;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/viewmodel/CreationExtras;Lorg/koin/core/scope/Scope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "koin-androidx-compose-navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavViewModelKt {
    @Deprecated(message = "koinNavViewModel is deprecated. Use koinViewModel instead.", replaceWith = @ReplaceWith(expression = "koinViewModel()", imports = {"org.koin.compose.viewmodel.koinViewModel"}))
    public static final /* synthetic */ <T extends ViewModel> T koinNavViewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, String str, CreationExtras creationExtras, Scope scope, Function0<? extends ParametersHolder> function0, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1141137090, "CC(koinNavViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)50@1828L7,55@2030L18:NavViewModel.kt#yfaubq");
        Qualifier qualifier2 = (i2 & 1) != 0 ? null : qualifier;
        if ((i2 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        String str2 = (i2 & 4) != 0 ? null : str;
        if ((i2 & 8) != 0) {
            creationExtras = CreationExtrasExtKt.defaultExtras(viewModelStoreOwner);
        }
        CreationExtras creationExtras2 = creationExtras;
        if ((i2 & 16) != 0) {
            scope = KoinApplicationKt.currentKoinScope(composer, 0);
        }
        Scope scope2 = scope;
        Function0<? extends ParametersHolder> function02 = (i2 & 32) != 0 ? null : function0;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStoreOwner.getViewModelStore(), str2, creationExtras2, qualifier2, scope2, function02);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return t;
    }
}
