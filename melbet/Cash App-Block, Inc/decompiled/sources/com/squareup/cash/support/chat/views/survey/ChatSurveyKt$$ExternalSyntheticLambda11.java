package com.squareup.cash.support.chat.views.survey;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.chat.views.transcript.message.NameView;
import com.squareup.cash.support.chat.views.transcript.message.StatusTimestampView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageActionComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageFileComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatSurveyKt$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ChatSurveyKt$$ExternalSyntheticLambda11(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                break;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                break;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver3);
                break;
            case 3:
                ((ChatViewEvent) obj).getClass();
                break;
            case 4:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 5:
                ((String) obj).getClass();
                break;
            case 6:
                ((BodyViewModel$ActionBodyViewModel.Action) obj).getClass();
                break;
            case 7:
                ((String) obj).getClass();
                break;
            case 8:
                break;
            case 9:
                ((FormattedPaymentHistoryActivityItem) obj).getClass();
                break;
            case 10:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 11:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 12:
                ((String) obj).getClass();
                break;
            case 13:
                int i = NameView.$r8$clinit;
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 14:
                int i2 = StatusTimestampView.$r8$clinit;
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 15:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 16:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 17:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 18:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 19:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 20:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 21:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 22:
                int i3 = MessageActionComposeView.$r8$clinit;
                ((BodyViewModel$ActionBodyViewModel.Action) obj).getClass();
                break;
            case 23:
                ((FormattedPaymentHistoryActivityItem) obj).getClass();
                break;
            case 24:
                ((String) obj).getClass();
                break;
            case 25:
                ((String) obj).getClass();
                break;
            case 26:
                int i4 = MessageFileComposeView.$r8$clinit;
                ((String) obj).getClass();
                break;
            case 27:
                int i5 = MessageFileComposeView.$r8$clinit;
                ((String) obj).getClass();
                break;
            case 28:
                ((String) obj).getClass();
                break;
            default:
                break;
        }
        return Unit.INSTANCE;
    }
}
