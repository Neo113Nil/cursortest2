package sqip.internal.event;

import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import sqip.internal.GzipRequestInterceptor;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lsqip/internal/event/EventStreamService;", "", "logEvents", "Lretrofit2/Call;", "Lsqip/internal/event/LogEventsResponse;", "request", "Lsqip/internal/event/LogEventsRequest;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface EventStreamService {
    @Headers({GzipRequestInterceptor.GZIP_BODY_ENABLED})
    @POST("/2.0/log/eventstream")
    Call<LogEventsResponse> logEvents(@Body LogEventsRequest request);
}
