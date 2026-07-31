package com.yandex.div.data;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public interface Hashable {
    int hash();

    default int propertiesHash() {
        return hash();
    }
}
