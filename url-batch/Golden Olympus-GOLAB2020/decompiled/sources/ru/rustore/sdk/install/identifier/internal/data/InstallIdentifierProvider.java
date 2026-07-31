package ru.rustore.sdk.install.identifier.internal.data;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.reactive.single.Single;

@Metadata
/* loaded from: classes3.dex */
public final class InstallIdentifierProvider {

    @Deprecated
    @NotNull
    public static final String ACTION = "ru.vk.store.provider.RuStoreInstallIdentifierProvider";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrieveInstallIdentifierInternal(Context context, String str, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intent intent = new Intent(ACTION);
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.q…ryIntentServices(this, 0)");
        ComponentName findRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(queryIntentServices);
        if (findRuStoreServiceComponentName == null) {
            throw new RuStoreOutdatedException();
        }
        intent.setComponent(findRuStoreServiceComponentName);
        G g4 = new G();
        InstallIdentifierProviderServiceConnection installIdentifierProviderServiceConnection = new InstallIdentifierProviderServiceConnection(str, new InstallIdentifierProvider$retrieveInstallIdentifierInternal$1(function1, context, g4), new InstallIdentifierProvider$retrieveInstallIdentifierInternal$2(function12, context, g4));
        g4.f41132b = installIdentifierProviderServiceConnection;
        context.bindService(intent, installIdentifierProviderServiceConnection, 1);
    }

    @NotNull
    public final Single<String> provide(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Single.Companion.create(new InstallIdentifierProvider$provide$1(this, context));
    }
}
