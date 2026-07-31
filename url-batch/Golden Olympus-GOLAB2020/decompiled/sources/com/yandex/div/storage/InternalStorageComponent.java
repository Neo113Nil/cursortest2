package com.yandex.div.storage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class InternalStorageComponent implements DivStorageComponent {

    @NotNull
    private final RawJsonRepository rawJsonRepository;

    @NotNull
    private final DivDataRepository repository;

    @NotNull
    private final DivStorage storage;

    public InternalStorageComponent(@NotNull DivDataRepository repository, @NotNull RawJsonRepository rawJsonRepository, @NotNull DivStorage storage) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(rawJsonRepository, "rawJsonRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.repository = repository;
        this.rawJsonRepository = rawJsonRepository;
        this.storage = storage;
    }

    @Override // com.yandex.div.storage.DivStorageComponent
    @NotNull
    public RawJsonRepository getRawJsonRepository() {
        return this.rawJsonRepository;
    }
}
