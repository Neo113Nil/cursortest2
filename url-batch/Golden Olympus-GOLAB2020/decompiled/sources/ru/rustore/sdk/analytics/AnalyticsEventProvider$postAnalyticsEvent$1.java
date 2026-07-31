package ru.rustore.sdk.analytics;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.core.util.ContextExtKt;

@Metadata
/* loaded from: classes3.dex */
final class AnalyticsEventProvider$postAnalyticsEvent$1 extends s implements Function0<Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ G $serviceConnection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsEventProvider$postAnalyticsEvent$1(Context context, G g4) {
        super(0);
        this.$context = context;
        this.$serviceConnection = g4;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m261invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m261invoke() {
        ContextExtKt.unbindServiceSafely(this.$context, (ServiceConnection) this.$serviceConnection.f41132b);
    }
}
