package com.chicken.road.cerman.fixs.roost;

import android.content.Context;
import com.google.android.gms.actions.SearchIntents;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.OkHttpClient;

/* compiled from: RoostClient.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JB\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostClient;", "", "appContext", "Landroid/content/Context;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;)V", "http", "Lokhttp3/OkHttpClient;", SearchIntents.EXTRA_QUERY, "Lcom/chicken/road/cerman/fixs/roost/RoostReply;", "baseUrl", "", "gaid", "deviceUuid", "installReferrer", "appsId", "timeoutMs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tidyAgent", "ua", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostClient {
    public static final int $stable = 8;
    private final Context appContext;
    private final OkHttpClient http;
    private final Json json;

    public RoostClient(Context appContext, Json json) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(json, "json");
        this.appContext = appContext;
        this.json = json;
        this.http = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).readTimeout(15L, TimeUnit.SECONDS).build();
    }

    public /* synthetic */ RoostClient(Context context, Json json, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? JsonKt.Json$default(null, new Function1() { // from class: com.chicken.road.cerman.fixs.roost.RoostClient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$0;
                _init_$lambda$0 = RoostClient._init_$lambda$0((JsonBuilder) obj);
                return _init_$lambda$0;
            }
        }, 1, null) : json);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setLenient(true);
        return Unit.INSTANCE;
    }

    public final Object query(String str, String str2, String str3, String str4, String str5, long j, Continuation<? super RoostReply> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RoostClient$query$2(str, str2, str3, str4, str5, j, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String tidyAgent(String ua) {
        return StringsKt.replace$default(StringsKt.replace$default(ua, "; wv)", ")", false, 4, (Object) null), "Version/4.0 ", "", false, 4, (Object) null);
    }
}
