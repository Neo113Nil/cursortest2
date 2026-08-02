package com.squareup.cash.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ActiveStorageLinkFlowKt$activeStorageLinkFlow$3$1 implements FlowCollector {
    public static final ActiveStorageLinkFlowKt$activeStorageLinkFlow$3$1 INSTANCE = new ActiveStorageLinkFlowKt$activeStorageLinkFlow$3$1();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Timber.Forest.i("ActiveStorageLink: Final StateFlow emitted: " + ((StorageLink) obj), new Object[0]);
        return Unit.INSTANCE;
    }
}
