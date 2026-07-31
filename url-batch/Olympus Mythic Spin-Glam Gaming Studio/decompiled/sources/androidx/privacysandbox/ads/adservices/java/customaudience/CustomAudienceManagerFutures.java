package androidx.privacysandbox.ads.adservices.java.customaudience;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: CustomAudienceManagerFutures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures;", "", "Companion", "Api33Ext4JavaImpl", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CustomAudienceManagerFutures {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomAudienceManagerFutures.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures;", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "joinCustomAudienceAsync", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "fetchAndJoinCustomAudienceAsync", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "leaveCustomAudienceAsync", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "mCustomAudienceManager", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        private final CustomAudienceManager mCustomAudienceManager;

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture joinCustomAudienceAsync(@NotNull JoinCustomAudienceRequest request) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(request, "request");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture fetchAndJoinCustomAudienceAsync(@NotNull FetchAndJoinCustomAudienceRequest request) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(request, "request");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$fetchAndJoinCustomAudienceAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture leaveCustomAudienceAsync(@NotNull LeaveCustomAudienceRequest request) {
            Deferred async$default;
            Intrinsics.checkNotNullParameter(request, "request");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(async$default, null, 1, null);
        }
    }
}
