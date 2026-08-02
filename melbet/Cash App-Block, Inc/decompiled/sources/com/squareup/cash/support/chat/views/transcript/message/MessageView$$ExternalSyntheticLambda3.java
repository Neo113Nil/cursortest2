package com.squareup.cash.support.chat.views.transcript.message;

import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class MessageView$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MessageView f$0;

    public /* synthetic */ MessageView$$ExternalSyntheticLambda3(MessageView messageView, int i) {
        this.$r8$classId = i;
        this.f$0 = messageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MessageView messageView = this.f$0;
        switch (i) {
            case 0:
                String str = messageView.timestampText;
                if (str != null && str.length() != 0) {
                    boolean z = !messageView.showTimestamp;
                    messageView.showTimestamp = z;
                    StatusTimestampView statusTimestampView = messageView.statusTimestampView;
                    statusTimestampView.model$delegate.setValue(ChatContentViewModel.StatusTimestampViewModel.copy$default(statusTimestampView.getModel(), null, null, false, null, z, 15));
                }
                break;
            default:
                String str2 = messageView.idempotenceToken;
                if (str2 != null) {
                    messageView.onStatusIconClick.invoke(str2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
