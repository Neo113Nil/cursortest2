package com.linecorp.linesdk.openchat.ui;

import a2.AbstractC1241b;
import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.openchat.OpenChatParameters;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel$createChatRoomAsync$2", f = "OpenChatInfoViewModel.kt", l = {}, m = "invokeSuspend")
@Metadata
/* loaded from: classes2.dex */
final class OpenChatInfoViewModel$createChatRoomAsync$2 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {
    final /* synthetic */ OpenChatParameters $openChatParameters;
    int label;
    final /* synthetic */ OpenChatInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenChatInfoViewModel$createChatRoomAsync$2(OpenChatInfoViewModel openChatInfoViewModel, OpenChatParameters openChatParameters, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = openChatInfoViewModel;
        this.$openChatParameters = openChatParameters;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new OpenChatInfoViewModel$createChatRoomAsync$2(this.this$0, this.$openChatParameters, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LineApiClient lineApiClient;
        AbstractC1241b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.a(obj);
        lineApiClient = this.this$0.lineApiClient;
        return lineApiClient.createOpenChatRoom(this.$openChatParameters);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC3316J interfaceC3316J, @Nullable kotlin.coroutines.d dVar) {
        return ((OpenChatInfoViewModel$createChatRoomAsync$2) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
    }
}
