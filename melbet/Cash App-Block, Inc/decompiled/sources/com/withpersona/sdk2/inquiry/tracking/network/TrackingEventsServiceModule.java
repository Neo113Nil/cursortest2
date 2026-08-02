package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Retrofit;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00070\u0005¢\u0006\u0002\b\tH\u0007J\b\u0010\n\u001a\u00020\u0003H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;", "", "context", "Landroid/content/Context;", "trackingEventsServiceServerEndpoint", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "serverEndpoint", "Lcom/withpersona/sdk2/inquiry/network/core/ServerEndpoint;", "provideContext", "provideTrackingEventsServiceApi", "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "retrofit", "Lretrofit2/Retrofit;", "Companion", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingEventsServiceModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private final String trackingEventsServiceServerEndpoint;

    public TrackingEventsServiceModule(Context context, String str) {
        context.getClass();
        str.getClass();
        this.context = context;
        this.trackingEventsServiceServerEndpoint = str;
    }

    public static final Set<Object> provideMoshiJsonAdapter() {
        return INSTANCE.provideMoshiJsonAdapter();
    }

    public static final Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
        return INSTANCE.provideMoshiJsonAdapterBinding();
    }

    /* renamed from: provideContext, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final TrackingEventsServiceApi provideTrackingEventsServiceApi(Retrofit retrofit) {
        retrofit.getClass();
        Object create = retrofit.create(TrackingEventsServiceApi.class);
        create.getClass();
        return (TrackingEventsServiceApi) create;
    }

    /* renamed from: serverEndpoint, reason: from getter */
    public final String getTrackingEventsServiceServerEndpoint() {
        return this.trackingEventsServiceServerEndpoint;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007J\u0013\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;", "", "<init>", "()V", "provideMoshiJsonAdapterBinding", "", "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;", "provideMoshiJsonAdapter", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<Object> provideMoshiJsonAdapter() {
            return SetsKt__SetsJVMKt.setOf(UiComponentError.Companion);
        }

        public final Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
            return EmptySet.INSTANCE;
        }

        private Companion() {
        }
    }
}
