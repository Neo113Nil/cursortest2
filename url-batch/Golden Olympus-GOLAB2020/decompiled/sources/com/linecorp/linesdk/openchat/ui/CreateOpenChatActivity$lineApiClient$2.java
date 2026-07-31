package com.linecorp.linesdk.openchat.ui;

import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.api.LineApiClientBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class CreateOpenChatActivity$lineApiClient$2 extends kotlin.jvm.internal.s implements Function0<LineApiClient> {
    final /* synthetic */ CreateOpenChatActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateOpenChatActivity$lineApiClient$2(CreateOpenChatActivity createOpenChatActivity) {
        super(0);
        this.this$0 = createOpenChatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LineApiClient invoke() {
        String stringExtra = this.this$0.getIntent().getStringExtra("arg_channel_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        LineApiClient build = new LineApiClientBuilder(this.this$0, stringExtra).build();
        Intrinsics.checkNotNullExpressionValue(build, "LineApiClientBuilder(thi…lId)\n            .build()");
        return build;
    }
}
