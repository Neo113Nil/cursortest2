package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CustomAudienceManager.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "", "()V", "fetchAndJoinCustomAudience", "", "request", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinCustomAudience", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leaveCustomAudience", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CustomAudienceManager {
    public abstract Object fetchAndJoinCustomAudience(FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, Continuation continuation);

    public abstract Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation continuation);

    public abstract Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation continuation);
}
