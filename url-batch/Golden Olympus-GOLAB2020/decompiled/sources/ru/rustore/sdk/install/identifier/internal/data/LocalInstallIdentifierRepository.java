package ru.rustore.sdk.install.identifier.internal.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.install.identifier.internal.domain.LocalInstallIdentifier;

@Metadata
/* loaded from: classes3.dex */
public final class LocalInstallIdentifierRepository {

    @NotNull
    private final LocalInstallIdentifierDataSource dataSource;

    @NotNull
    private final LocalInstallIdentifierMapper mapper;

    public LocalInstallIdentifierRepository(@NotNull LocalInstallIdentifierDataSource dataSource, @NotNull LocalInstallIdentifierMapper mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.dataSource = dataSource;
        this.mapper = mapper;
    }

    @Nullable
    public final LocalInstallIdentifier get() {
        String str = this.dataSource.get();
        if (str != null) {
            return this.mapper.mapToModel(str);
        }
        return null;
    }

    public final void set(@NotNull LocalInstallIdentifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.dataSource.set(this.mapper.mapToDto(identifier));
    }
}
