package org.koin.androidx.compose.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.viewmodel.CreationExtrasExtKt;

/* compiled from: NavViewModelInternals.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"defaultNavExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/viewmodel/CreationExtras;", "koin-androidx-compose-navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavViewModelInternalsKt {
    @Deprecated(message = "koinNavViewModel() is deprecated in favor of koinViewModel().")
    public static final CreationExtras defaultNavExtras(ViewModelStoreOwner viewModelStoreOwner, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        ComposerKt.sourceInformationMarkerStart(composer, 590526948, "C(defaultNavExtras)N(viewModelStoreOwner):NavViewModelInternals.kt#yfaubq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590526948, i, -1, "org.koin.androidx.compose.navigation.defaultNavExtras (NavViewModelInternals.kt:34)");
        }
        CreationExtras defaultExtras = CreationExtrasExtKt.defaultExtras(viewModelStoreOwner);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultExtras;
    }
}
