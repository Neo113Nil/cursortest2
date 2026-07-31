package ru.rustore.sdk.install.identifier.internal.data;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.single.Single;

@Metadata
/* loaded from: classes3.dex */
public final class RemoteInstallIdentifierDataSource {

    @NotNull
    private final Context context;

    @NotNull
    private final InstallIdentifierProvider installIdentifierProvider;

    public RemoteInstallIdentifierDataSource(@NotNull InstallIdentifierProvider installIdentifierProvider, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(installIdentifierProvider, "installIdentifierProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.installIdentifierProvider = installIdentifierProvider;
        this.context = context;
    }

    @NotNull
    public final Single<String> get() {
        return this.installIdentifierProvider.provide(this.context);
    }
}
