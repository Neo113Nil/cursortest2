package com.yandex.div.core.downloader;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public interface PersistentDivDataObserver {
    void onAfterDivDataChanged();

    default void onBeforeDivDataChanged() {
    }
}
