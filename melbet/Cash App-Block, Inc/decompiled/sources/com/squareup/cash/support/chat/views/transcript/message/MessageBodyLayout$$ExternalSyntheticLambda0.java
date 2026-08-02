package com.squareup.cash.support.chat.views.transcript.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class MessageBodyLayout$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MessageBodyLayout f$0;

    public /* synthetic */ MessageBodyLayout$$ExternalSyntheticLambda0(MessageBodyLayout messageBodyLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = messageBodyLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MessageBodyLayout messageBodyLayout = this.f$0;
        switch (i) {
            case 0:
                messageBodyLayout.loadImage(messageBodyLayout.imageView, messageBodyLayout.imagePlaceholderView, messageBodyLayout.imageUrl);
                messageBodyLayout.onRetryImageLoadClick.invoke();
                break;
            default:
                Function0 function0 = messageBodyLayout.onTextBodyClick;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
