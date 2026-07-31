package ru.rustore.sdk.install.identifier.internal.data;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.core.util.ContextExtKt;

@Metadata
/* loaded from: classes3.dex */
public final class InstallIdentifierProvider$retrieveInstallIdentifierInternal$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<String, Unit> $onSuccess;
    final /* synthetic */ G $serviceConnection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallIdentifierProvider$retrieveInstallIdentifierInternal$1(Function1<? super String, Unit> function1, Context context, G g4) {
        super(1);
        this.$onSuccess = function1;
        this.$context = context;
        this.$serviceConnection = g4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.$onSuccess.invoke(identifier);
        ContextExtKt.unbindServiceSafely(this.$context, (ServiceConnection) this.$serviceConnection.f41132b);
    }
}
