package com.linecorp.linesdk.openchat.ui;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel", f = "OpenChatInfoViewModel.kt", l = {AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "createChatRoomAsync")
@Metadata
/* loaded from: classes2.dex */
final class OpenChatInfoViewModel$createChatRoomAsync$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OpenChatInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenChatInfoViewModel$createChatRoomAsync$1(OpenChatInfoViewModel openChatInfoViewModel, kotlin.coroutines.d dVar) {
        super(dVar);
        this.this$0 = openChatInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object createChatRoomAsync;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createChatRoomAsync = this.this$0.createChatRoomAsync(null, this);
        return createChatRoomAsync;
    }
}
