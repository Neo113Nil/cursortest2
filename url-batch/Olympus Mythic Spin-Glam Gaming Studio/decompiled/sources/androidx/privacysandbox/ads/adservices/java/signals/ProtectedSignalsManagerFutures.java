package androidx.privacysandbox.ads.adservices.java.signals;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager;
import androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProtectedSignalsManagerFutures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "", "Companion", "JavaImpl", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ProtectedSignalsManagerFutures {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProtectedSignalsManagerFutures.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "updateSignalsAsync", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "mProtectedSignalsManager", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class JavaImpl extends ProtectedSignalsManagerFutures {
        private final ProtectedSignalsManager mProtectedSignalsManager;

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture updateSignalsAsync(@NotNull UpdateSignalsRequest request) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(request, "request");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }
    }
}
