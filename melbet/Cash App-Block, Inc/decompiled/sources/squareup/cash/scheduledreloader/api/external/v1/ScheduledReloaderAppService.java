package squareup.cash.scheduledreloader.api.external.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lsquareup/cash/scheduledreloader/api/external/v1/ScheduledReloaderAppService;", "", "Lsquareup/cash/scheduledreloader/api/external/v1/ExternalCreateOrUpdateScheduledReloadPreferenceRequest;", "request", "Lapp/cash/api/ApiResult;", "Lsquareup/cash/scheduledreloader/api/external/v1/ExternalCreateOrUpdateScheduledReloadPreferenceResponse;", "externalCreateOrUpdateScheduledReloadPreference", "(Lsquareup/cash/scheduledreloader/api/external/v1/ExternalCreateOrUpdateScheduledReloadPreferenceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsquareup/cash/scheduledreloader/api/external/v1/ExternalGetLatestScheduledReloadPreferenceRequest;", "Lsquareup/cash/scheduledreloader/api/external/v1/ExternalGetLatestScheduledReloadPreferenceResponse;", "externalGetLatestScheduledReloadPreference", "(Lsquareup/cash/scheduledreloader/api/external/v1/ExternalGetLatestScheduledReloadPreferenceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ScheduledReloaderAppService {
    @POST("/cash-app/scheduled-reloader/create-or-update-scheduled-reload-preference")
    Object externalCreateOrUpdateScheduledReloadPreference(@Body ExternalCreateOrUpdateScheduledReloadPreferenceRequest externalCreateOrUpdateScheduledReloadPreferenceRequest, Continuation<? super ApiResult<ExternalCreateOrUpdateScheduledReloadPreferenceResponse>> continuation);

    @POST("/cash-app/scheduled-reloader/get-latest-scheduled-reload-preference")
    Object externalGetLatestScheduledReloadPreference(@Body ExternalGetLatestScheduledReloadPreferenceRequest externalGetLatestScheduledReloadPreferenceRequest, Continuation<? super ApiResult<ExternalGetLatestScheduledReloadPreferenceResponse>> continuation);
}
