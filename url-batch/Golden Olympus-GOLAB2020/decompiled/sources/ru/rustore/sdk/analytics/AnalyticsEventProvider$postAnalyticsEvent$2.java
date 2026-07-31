package ru.rustore.sdk.analytics;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.util.ContextExtKt;

@Metadata
/* loaded from: classes3.dex */
final class AnalyticsEventProvider$postAnalyticsEvent$2 extends s implements Function1<RuStoreException, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ G $serviceConnection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsEventProvider$postAnalyticsEvent$2(Context context, G g4) {
        super(1);
        this.$context = context;
        this.$serviceConnection = g4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RuStoreException) obj);
        return Unit.f41027a;
    }

    public final void invoke(RuStoreException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ContextExtKt.unbindServiceSafely(this.$context, (ServiceConnection) this.$serviceConnection.f41132b);
    }
}
