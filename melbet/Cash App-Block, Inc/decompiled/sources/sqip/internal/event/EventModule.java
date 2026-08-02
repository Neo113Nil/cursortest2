package sqip.internal.event;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import sqip.internal.event.EventLogger;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0015"}, d2 = {"Lsqip/internal/event/EventModule;", "", "()V", "eventJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/event/IapEventJsonData;", "moshi", "Lcom/squareup/moshi/Moshi;", "eventStreamService", "Lsqip/internal/event/EventStreamService;", "retrofit", "Lretrofit2/Retrofit;", "eventsUploadExecutor", "Ljava/util/concurrent/ExecutorService;", "okHttpClient", "Lokhttp3/OkHttpClient;", "eventsUrl", "", "BindsModule", "Events", "EventsUrl", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EventModule {
    public static final EventModule INSTANCE = new EventModule();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lsqip/internal/event/EventModule$BindsModule;", "", "eventLogger", "Lsqip/internal/event/EventLogger;", "logger", "Lsqip/internal/event/EventLogger$Real;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface BindsModule {
        EventLogger eventLogger(EventLogger.Real logger);
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lsqip/internal/event/EventModule$Events;", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface Events {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lsqip/internal/event/EventModule$EventsUrl;", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface EventsUrl {
    }

    private EventModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread eventsUploadExecutor$lambda$0(Runnable runnable) {
        return new Thread(runnable, "EventsUploadThread");
    }

    public final JsonAdapter eventJsonAdapter(Moshi moshi) {
        moshi.getClass();
        moshi.getClass();
        JsonAdapter adapter = moshi.adapter(IapEventJsonData.class, Util.NO_ANNOTATIONS);
        adapter.getClass();
        return adapter;
    }

    public final EventStreamService eventStreamService(@Events Retrofit retrofit) {
        retrofit.getClass();
        Object create = retrofit.create(EventStreamService.class);
        create.getClass();
        return (EventStreamService) create;
    }

    @Events
    public final ExecutorService eventsUploadExecutor() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new EventModule$$ExternalSyntheticLambda0(0));
        newSingleThreadExecutor.getClass();
        return newSingleThreadExecutor;
    }

    @Events
    public final Retrofit retrofit(OkHttpClient okHttpClient, Moshi moshi, @EventsUrl String eventsUrl) {
        okHttpClient.getClass();
        moshi.getClass();
        eventsUrl.getClass();
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.callFactory = okHttpClient;
        ((ArrayList) builder.converterFactories).add(MoshiConverterFactory.create(moshi));
        builder.baseUrl(eventsUrl);
        return builder.build();
    }
}
