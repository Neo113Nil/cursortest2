package com.yandex.div.core.state;

import kotlin.Metadata;
import kotlin.Pair;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivStatePathKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDivId(Pair<String, String> pair) {
        return pair.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getStateId(Pair<String, String> pair) {
        return pair.getSecond();
    }
}
