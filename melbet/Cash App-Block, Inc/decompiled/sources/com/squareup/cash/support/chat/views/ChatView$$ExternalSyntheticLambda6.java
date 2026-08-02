package com.squareup.cash.support.chat.views;

import app.cash.broadway.ui.Ui;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatView$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatView f$0;

    public /* synthetic */ ChatView$$ExternalSyntheticLambda6(ChatView chatView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ChatView chatView = this.f$0;
        switch (i) {
            case 0:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(chatView.m3810bottomdBGyhoQ(chatView.toolbar));
            case 1:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(chatView.m3819topdBGyhoQ(chatView.chatUiUpliftEnabled ? chatView.chatInputArea : chatView.inputLayout));
            case 2:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(chatView.chatUiUpliftEnabled ? chatView.m3814getYdipdBGyhoQ(0) : chatView.m3814getYdipdBGyhoQ(1));
            case 3:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(chatView.m3810bottomdBGyhoQ(chatView.toolbar));
            case 4:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - chatView.getDip(32));
            case 5:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(chatView.getDip(16) + chatView.m3810bottomdBGyhoQ(chatView.toolbar));
            case 6:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - chatView.getDip(8));
            case 7:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(chatView.m3813getXdipTENr5nQ(48));
            case 8:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(chatView.m3819topdBGyhoQ(chatView.chatUiUpliftEnabled ? chatView.chatInputArea : chatView.inputLayout) - chatView.getDip(8));
            case 9:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(chatView.m3814getYdipdBGyhoQ(48));
            case 10:
                ChatViewEvent chatViewEvent = (ChatViewEvent) obj;
                chatViewEvent.getClass();
                Ui.EventReceiver eventReceiver = chatView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(chatViewEvent);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 11:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                chatView.updateSendButton();
                Ui.EventReceiver eventReceiver2 = chatView.eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(new ChatViewEvent.InputChanged(charSequence.toString()));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 12:
                String str = (String) obj;
                str.getClass();
                Ui.EventReceiver eventReceiver3 = chatView.eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(new ChatViewEvent.FailedMessageClicked(str));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                Ui.EventReceiver eventReceiver4 = chatView.eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(new ChatViewEvent.SuggestedReplySelected(str2));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 14:
                String str3 = (String) obj;
                str3.getClass();
                Ui.EventReceiver eventReceiver5 = chatView.eventReceiver;
                if (eventReceiver5 != null) {
                    eventReceiver5.sendEvent(new ChatViewEvent.ResendMessage(str3));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 15:
                String str4 = (String) obj;
                str4.getClass();
                Ui.EventReceiver eventReceiver6 = chatView.eventReceiver;
                if (eventReceiver6 != null) {
                    eventReceiver6.sendEvent(new ChatViewEvent.DeleteMessage(str4));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 16:
                String str5 = (String) obj;
                str5.getClass();
                Ui.EventReceiver eventReceiver7 = chatView.eventReceiver;
                if (eventReceiver7 != null) {
                    eventReceiver7.sendEvent(new ChatViewEvent.ClickImage(str5));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 17:
                String str6 = (String) obj;
                Ui.EventReceiver eventReceiver8 = chatView.eventReceiver;
                if (eventReceiver8 != null) {
                    eventReceiver8.sendEvent(new ChatViewEvent.ImageLoadFailed(str6));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 18:
                FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) obj;
                formattedPaymentHistoryActivityItem.getClass();
                Ui.EventReceiver eventReceiver9 = chatView.eventReceiver;
                if (eventReceiver9 != null) {
                    eventReceiver9.sendEvent(new ChatViewEvent.ActivityTransactionClicked(formattedPaymentHistoryActivityItem));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            default:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(chatView.m3814getYdipdBGyhoQ(1));
        }
    }
}
