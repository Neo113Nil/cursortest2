package com.linecorp.linesdk.openchat.ui;

import a2.AbstractC1241b;
import androidx.lifecycle.B;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.openchat.OpenChatParameters;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel$createChatroom$1", f = "OpenChatInfoViewModel.kt", l = {78}, m = "invokeSuspend")
@Metadata
/* loaded from: classes2.dex */
final class OpenChatInfoViewModel$createChatroom$1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {
    final /* synthetic */ OpenChatParameters $openChatParameters;
    int label;
    final /* synthetic */ OpenChatInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenChatInfoViewModel$createChatroom$1(OpenChatInfoViewModel openChatInfoViewModel, OpenChatParameters openChatParameters, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = openChatInfoViewModel;
        this.$openChatParameters = openChatParameters;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new OpenChatInfoViewModel$createChatroom$1(this.this$0, this.$openChatParameters, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        B b4;
        B b5;
        B b6;
        B b7;
        Object f4 = AbstractC1241b.f();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.a(obj);
            b4 = this.this$0._isCreatingChatRoom;
            b4.o(kotlin.coroutines.jvm.internal.b.a(true));
            OpenChatInfoViewModel openChatInfoViewModel = this.this$0;
            OpenChatParameters openChatParameters = this.$openChatParameters;
            this.label = 1;
            obj = openChatInfoViewModel.createChatRoomAsync(openChatParameters, this);
            if (obj == f4) {
                return f4;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
        }
        LineApiResponse lineApiResponse = (LineApiResponse) obj;
        if (lineApiResponse.isSuccess()) {
            b7 = this.this$0._openChatRoomInfo;
            b7.o(lineApiResponse.getResponseData());
        } else {
            b5 = this.this$0._createChatRoomError;
            b5.o(lineApiResponse);
        }
        b6 = this.this$0._isCreatingChatRoom;
        b6.o(kotlin.coroutines.jvm.internal.b.a(false));
        return Unit.f41027a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC3316J interfaceC3316J, @Nullable kotlin.coroutines.d dVar) {
        return ((OpenChatInfoViewModel$createChatroom$1) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
    }
}
