package com.onesignal.core.internal.backend;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: IFeatureFlagsBackendService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/core/internal/backend/IFeatureFlagsBackendService;", "", "fetchRemoteFeatureFlags", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsFetchOutcome;", "appId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IFeatureFlagsBackendService {
    Object fetchRemoteFeatureFlags(String str, Continuation<? super RemoteFeatureFlagsFetchOutcome> continuation);
}
