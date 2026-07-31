package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class RawJsonRepositoryException extends Exception {

    @Nullable
    private final String jsonId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawJsonRepositoryException(@NotNull StorageException storageException) {
        super(storageException.getMessage(), storageException);
        Intrinsics.checkNotNullParameter(storageException, "storageException");
        this.jsonId = storageException.getCardId();
    }
}
