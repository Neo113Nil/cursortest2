package com.yandex.div.storage.database;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class StorageException extends Exception {

    @Nullable
    private final String cardId;

    public StorageException(@Nullable String str, @Nullable Throwable th, @Nullable String str2) {
        super(str, th);
        this.cardId = str2;
    }

    @Nullable
    public final String getCardId() {
        return this.cardId;
    }
}
