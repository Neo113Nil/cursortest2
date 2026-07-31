package ru.rustore.sdk.install.identifier.internal.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.install.identifier.internal.domain.RemoteInstallIdentifier;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;

@Metadata
/* loaded from: classes3.dex */
public final class RemoteInstallIdentifierRepository {

    @NotNull
    private final RemoteInstallIdentifierDataSource dataSource;

    @NotNull
    private final RemoteInstallIdentifierMapper mapper;

    public RemoteInstallIdentifierRepository(@NotNull RemoteInstallIdentifierDataSource dataSource, @NotNull RemoteInstallIdentifierMapper mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.dataSource = dataSource;
        this.mapper = mapper;
    }

    @NotNull
    public final Single<RemoteInstallIdentifier> get() {
        return SingleMapKt.map(SingleOnErrorReturnKt.onErrorReturn(this.dataSource.get(), RemoteInstallIdentifierRepository$get$1.INSTANCE), new RemoteInstallIdentifierRepository$get$2(this));
    }
}
