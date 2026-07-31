package ru.rustore.sdk.pay;

import android.content.Context;
import com.ironsource.b9;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.pay.internal.jj;
import ru.rustore.sdk.pay.internal.kj;
import ru.rustore.sdk.pay.internal.lj;
import ru.rustore.sdk.pay.internal.yj;
import ru.rustore.sdk.pay.model.ConsoleApplicationId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata
/* loaded from: classes3.dex */
public final class RuStorePayClientProvider {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuStorePayClient provide$default(RuStorePayClientProvider ruStorePayClientProvider, Context context, ConsoleApplicationId consoleApplicationId, Map map, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            map = null;
        }
        return ruStorePayClientProvider.provide(context, consoleApplicationId, map);
    }

    @NotNull
    public final RuStorePayClient provide(@NotNull Context applicationContext, @Nullable ConsoleApplicationId consoleApplicationId, @Nullable Map<String, ? extends Object> map) {
        yj yjVar;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        new yj.a();
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        synchronized (yj.a.class) {
            if (yj.I3 != null) {
                Intrinsics.checkNotNullExpressionValue("SDK Pay already initialized. If you want manual initialization, add tools:node=\"remove\" to RuStorePayContentProvider <provider> tag in your AndroidManifest.xml. ", "StringBuilder().apply(builderAction).toString()");
                throw new RuStorePaymentException.RuStorePayClientAlreadyExist("SDK Pay already initialized. If you want manual initialization, add tools:node=\"remove\" to RuStorePayContentProvider <provider> tag in your AndroidManifest.xml. ", null, 2, null);
            }
            yjVar = new yj(applicationContext, consoleApplicationId, map);
            yj.I3 = yjVar;
        }
        lj ljVar = (lj) yjVar.f45496d3.getValue();
        ljVar.getClass();
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(MapsKt.mapOf(TuplesKt.to("sdkName", BuildConfig.SDK_NAME), TuplesKt.to("sdkType", ljVar.f44603b.f44957a.a().f44347a), TuplesKt.to("sdkVersion", BuildConfig.SDK_VERSION)));
        String value = (String) ljVar.f44602a.f43790a.f45305b.getValue();
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        if (value != null) {
        }
        createMapBuilder.put(b9.h.f15462V, ljVar.f44605d.getPackageName());
        Map build = MapsKt.build(createMapBuilder);
        SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(ljVar.f44604c.send(new MetricsEvent("sdkInfo", build)), Dispatchers.INSTANCE.getIo()), new jj(build)), null, kj.f44488a, 1, null);
        return (RuStorePayClient) yjVar.f45287B3.getValue();
    }
}
