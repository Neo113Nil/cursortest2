package com.yandex.div.storage;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public interface DivDataRepository {

    @Metadata
    public enum ActionOnError {
        ABORT_TRANSACTION,
        SKIP_ELEMENT
    }
}
