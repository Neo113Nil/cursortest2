package com.squareup.cash.support.chat.views.transcript;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.common.FileTypes;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.dialog.ComposeDialogKt$Modal$3$1$1$dialog$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActivityBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$FileBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ImageBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$SystemMessageBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TextBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TransactionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TypingIndicatorBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$UnknownBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Failed;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Recorded;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Sending;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyView;
import com.squareup.cash.support.chat.views.transcript.message.EnhancedSuggestedRepliesView;
import com.squareup.cash.support.chat.views.transcript.message.ImagePlaceholderView;
import com.squareup.cash.support.chat.views.transcript.message.MessageBodyLayout;
import com.squareup.cash.support.chat.views.transcript.message.MessageBodyLayout$$ExternalSyntheticLambda8;
import com.squareup.cash.support.chat.views.transcript.message.MessageView;
import com.squareup.cash.support.chat.views.transcript.message.NameView;
import com.squareup.cash.support.chat.views.transcript.message.StatusTimestampView;
import com.squareup.cash.support.chat.views.transcript.message.SuggestedRepliesView;
import com.squareup.cash.support.chat.views.transcript.message.TypingIndicatorBodyView;
import com.squareup.cash.support.chat.views.transcript.message.UnknownMessageBodyView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageActionComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageActionComposeViewHolder;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageActivityComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageActivityComposeViewHolder;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageFileComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageFileComposeViewHolder;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageImageComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageImageComposeViewHolder;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageSystemMessageComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageSystemMessageComposeViewHolder;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageTextComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageTextComposeViewHolder;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageTypingIndicatorComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageTypingIndicatorComposeViewHolder;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageUnknownComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageUnknownComposeViewHolder;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ChatAdapter extends ListAdapter {
    public final SupportActivityItemLoader activityItemLoader;
    public final RealImageLoader authenticatedImageLoader;
    public final RealImageLoader imageLoader;
    public final AndroidStringManager stringManager;

    public ChatAdapter(AndroidStringManager androidStringManager, RealImageLoader realImageLoader, RealImageLoader realImageLoader2, SupportActivityItemLoader supportActivityItemLoader) {
        super(new ItemDiffCallback(0));
        this.stringManager = androidStringManager;
        this.imageLoader = realImageLoader;
        this.authenticatedImageLoader = realImageLoader2;
        this.activityItemLoader = supportActivityItemLoader;
        setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
    }

    public static void layoutRow(View view) {
        view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    public final ChatRowViewModel getItem(int i) {
        Object obj = this.mDiffer.mReadOnlyList.get(i);
        obj.getClass();
        return (ChatRowViewModel) obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ViewType viewType;
        boolean z;
        ChatRowViewModel item = getItem(i);
        if (item instanceof ChatRowViewModel.StatusRowViewModel) {
            viewType = ViewType.STATUS;
        } else if (item instanceof ChatRowViewModel.MessageRowViewModel) {
            ChatContentViewModel.EntryViewModel entryViewModel = ((ChatRowViewModel.MessageRowViewModel) item).model;
            if (entryViewModel instanceof ChatContentViewModel.MessageViewModel) {
                z = ((ChatContentViewModel.MessageViewModel) entryViewModel).chatUiUpliftEnabled;
            } else {
                if (!(entryViewModel instanceof ChatContentViewModel.TypingIndicatorViewModel)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                z = ((ChatContentViewModel.TypingIndicatorViewModel) entryViewModel).body.chatUiUpliftEnabled;
            }
            BodyViewModel$UnknownBodyViewModel bodyViewModel$UnknownBodyViewModel = BodyViewModel$UnknownBodyViewModel.INSTANCE;
            if (z) {
                ViewModelKt body = entryViewModel.getBody();
                if (body instanceof BodyViewModel$ActionBodyViewModel) {
                    viewType = ViewType.MESSAGE_ACTION_COMPOSE;
                } else if (body instanceof BodyViewModel$FileBodyViewModel) {
                    viewType = ViewType.MESSAGE_FILE_COMPOSE;
                } else if (body instanceof BodyViewModel$ImageBodyViewModel) {
                    viewType = ViewType.MESSAGE_IMAGE_COMPOSE;
                } else if (body instanceof BodyViewModel$TextBodyViewModel) {
                    viewType = ViewType.MESSAGE_TEXT_COMPOSE;
                } else if (body instanceof BodyViewModel$TransactionBodyViewModel) {
                    viewType = ViewType.MESSAGE_TRANSACTION;
                } else if (body instanceof BodyViewModel$ActivityBodyViewModel) {
                    viewType = ViewType.MESSAGE_ACTIVITY_COMPOSE;
                } else if (body instanceof BodyViewModel$TypingIndicatorBodyViewModel) {
                    viewType = ViewType.MESSAGE_TYPING_INDICATOR_COMPOSE;
                } else if (body instanceof BodyViewModel$SystemMessageBodyViewModel) {
                    viewType = ViewType.MESSAGE_SYSTEM_MESSAGE_COMPOSE;
                } else {
                    if (!Intrinsics.areEqual(body, bodyViewModel$UnknownBodyViewModel)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    viewType = ViewType.MESSAGE_UNKNOWN_COMPOSE;
                }
            } else {
                ViewModelKt body2 = entryViewModel.getBody();
                if (body2 instanceof BodyViewModel$ActionBodyViewModel) {
                    viewType = ViewType.MESSAGE_ACTION;
                } else if (body2 instanceof BodyViewModel$FileBodyViewModel) {
                    viewType = ViewType.MESSAGE_FILE;
                } else if (body2 instanceof BodyViewModel$ImageBodyViewModel) {
                    viewType = ViewType.MESSAGE_IMAGE;
                } else if (body2 instanceof BodyViewModel$TextBodyViewModel) {
                    viewType = ViewType.MESSAGE_TEXT;
                } else if (body2 instanceof BodyViewModel$TransactionBodyViewModel) {
                    viewType = ViewType.MESSAGE_TRANSACTION;
                } else if (body2 instanceof BodyViewModel$ActivityBodyViewModel) {
                    viewType = ViewType.MESSAGE_ACTIVITY;
                } else if (body2 instanceof BodyViewModel$TypingIndicatorBodyViewModel) {
                    viewType = ViewType.MESSAGE_TYPING_INDICATOR;
                } else if (body2 instanceof BodyViewModel$SystemMessageBodyViewModel) {
                    viewType = ViewType.MESSAGE_SYSTEM_MESSAGE;
                } else {
                    if (!Intrinsics.areEqual(body2, bodyViewModel$UnknownBodyViewModel)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    viewType = ViewType.MESSAGE_UNKNOWN;
                }
            }
        } else if (item instanceof ChatRowViewModel.DisclaimerRowViewModel) {
            viewType = ViewType.DISCLAIMER;
        } else if (item instanceof ChatRowViewModel.TimestampDividerRowViewModel) {
            viewType = ViewType.TIMESTAMP_DIVIDER;
        } else if (item instanceof ChatRowViewModel.SuggestedRepliesRowViewModel) {
            viewType = ((ChatRowViewModel.SuggestedRepliesRowViewModel) item).model.useEnhancedStyle ? ViewType.ENHANCED_SUGGESTED_REPLIES : ViewType.SUGGESTED_REPLIES;
        } else if (item instanceof ChatRowViewModel.LoadOldMessagesRowViewModel) {
            viewType = ViewType.LOAD_OLD_MESSAGES;
        } else if (item instanceof ChatRowViewModel.ErrorRowViewModel) {
            viewType = ViewType.ERROR;
        } else if (item instanceof ChatRowViewModel.BottomBookmarkRowViewModel) {
            viewType = ViewType.BOTTOM_BOOKMARK;
        } else if (item instanceof ChatRowViewModel.StatusTimestampRowViewModel) {
            viewType = ViewType.STATUS_TIMESTAMP;
        } else if (item instanceof ChatRowViewModel.NameDisplayRowViewModel) {
            viewType = ViewType.NAME_DISPLAY;
        } else {
            if (!(item instanceof ChatRowViewModel.DividerRowViewModel)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            viewType = ViewType.DIVIDER;
        }
        return viewType.ordinal();
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03f4  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String createContentDescription;
        LinearLayout.LayoutParams layoutParams;
        String str;
        String str2;
        String string2;
        viewHolder.getClass();
        final int i2 = 0;
        final int i3 = 1;
        if (!(viewHolder instanceof MessageViewHolder)) {
            if (viewHolder instanceof MessageTextComposeViewHolder) {
                ChatRowViewModel.MessageRowViewModel messageRowViewModel = (ChatRowViewModel.MessageRowViewModel) getItem(i);
                MessageTextComposeView messageTextComposeView = ((MessageTextComposeViewHolder) viewHolder).composeView;
                messageTextComposeView.setViewModel(messageRowViewModel.model);
                messageTextComposeView.setOnResendMessage(messageRowViewModel.onResendMessage);
                messageTextComposeView.setOnDeleteMessage(messageRowViewModel.onDeleteMessage);
                messageTextComposeView.setOnUrlClickListener(messageRowViewModel.onUrlClick);
                View childAt = messageTextComposeView.getChildAt(0);
                if (childAt != null) {
                    childAt.requestLayout();
                    return;
                }
                return;
            }
            if (viewHolder instanceof MessageImageComposeViewHolder) {
                ChatRowViewModel.MessageRowViewModel messageRowViewModel2 = (ChatRowViewModel.MessageRowViewModel) getItem(i);
                MessageImageComposeView messageImageComposeView = ((MessageImageComposeViewHolder) viewHolder).composeView;
                messageImageComposeView.setViewModel(messageRowViewModel2.model);
                messageImageComposeView.setOnImageClickListener(messageRowViewModel2.onImageClick);
                messageImageComposeView.setOnImageLoadFailedListener(messageRowViewModel2.onImageLoadFailed);
                messageImageComposeView.setOnRetryImageLoadClickListener(messageRowViewModel2.onRetryImageLoadClick);
                messageImageComposeView.setOnResendMessage(messageRowViewModel2.onResendMessage);
                messageImageComposeView.setOnDeleteMessage(messageRowViewModel2.onDeleteMessage);
                View childAt2 = messageImageComposeView.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.requestLayout();
                    return;
                }
                return;
            }
            if (viewHolder instanceof MessageFileComposeViewHolder) {
                ChatRowViewModel.MessageRowViewModel messageRowViewModel3 = (ChatRowViewModel.MessageRowViewModel) getItem(i);
                MessageFileComposeView messageFileComposeView = ((MessageFileComposeViewHolder) viewHolder).composeView;
                messageFileComposeView.setViewModel(messageRowViewModel3.model);
                messageFileComposeView.setOnResendMessage(messageRowViewModel3.onResendMessage);
                messageFileComposeView.setOnDeleteMessage(messageRowViewModel3.onDeleteMessage);
                View childAt3 = messageFileComposeView.getChildAt(0);
                if (childAt3 != null) {
                    childAt3.requestLayout();
                    return;
                }
                return;
            }
            if (viewHolder instanceof MessageActionComposeViewHolder) {
                ChatRowViewModel.MessageRowViewModel messageRowViewModel4 = (ChatRowViewModel.MessageRowViewModel) getItem(i);
                MessageActionComposeView messageActionComposeView = ((MessageActionComposeViewHolder) viewHolder).composeView;
                messageActionComposeView.setViewModel(messageRowViewModel4.model);
                messageActionComposeView.setOnActionClickListener(messageRowViewModel4.onActionClick);
                View childAt4 = messageActionComposeView.getChildAt(0);
                if (childAt4 != null) {
                    childAt4.requestLayout();
                    return;
                }
                return;
            }
            if (viewHolder instanceof MessageActivityComposeViewHolder) {
                ChatRowViewModel.MessageRowViewModel messageRowViewModel5 = (ChatRowViewModel.MessageRowViewModel) getItem(i);
                MessageActivityComposeView messageActivityComposeView = ((MessageActivityComposeViewHolder) viewHolder).composeView;
                messageActivityComposeView.setViewModel(messageRowViewModel5.model);
                messageActivityComposeView.setOnActivityClickListener(messageRowViewModel5.onActivityTransactionClick);
                messageActivityComposeView.setOnResendMessage(messageRowViewModel5.onResendMessage);
                messageActivityComposeView.setOnDeleteMessage(messageRowViewModel5.onDeleteMessage);
                View childAt5 = messageActivityComposeView.getChildAt(0);
                if (childAt5 != null) {
                    childAt5.requestLayout();
                    return;
                }
                return;
            }
            if (viewHolder instanceof MessageTypingIndicatorComposeViewHolder) {
                return;
            }
            if (viewHolder instanceof MessageSystemMessageComposeViewHolder) {
                ChatRowViewModel.MessageRowViewModel messageRowViewModel6 = (ChatRowViewModel.MessageRowViewModel) getItem(i);
                MessageSystemMessageComposeView messageSystemMessageComposeView = ((MessageSystemMessageComposeViewHolder) viewHolder).composeView;
                messageSystemMessageComposeView.setViewModel(messageRowViewModel6.model);
                messageSystemMessageComposeView.setOnUrlClickListener(messageRowViewModel6.onUrlClick);
                View childAt6 = messageSystemMessageComposeView.getChildAt(0);
                if (childAt6 != null) {
                    childAt6.requestLayout();
                    return;
                }
                return;
            }
            if (viewHolder instanceof MessageUnknownComposeViewHolder) {
                ChatRowViewModel.MessageRowViewModel messageRowViewModel7 = (ChatRowViewModel.MessageRowViewModel) getItem(i);
                MessageUnknownComposeView messageUnknownComposeView = ((MessageUnknownComposeViewHolder) viewHolder).composeView;
                messageUnknownComposeView.setViewModel(messageRowViewModel7.model);
                messageUnknownComposeView.setOnUpdateCashAppClickListener(messageRowViewModel7.onUpdateCashAppClick);
                View childAt7 = messageUnknownComposeView.getChildAt(0);
                if (childAt7 != null) {
                    childAt7.requestLayout();
                    return;
                }
                return;
            }
            if (viewHolder instanceof DisclaimerViewHolder) {
                ChatRowViewModel.DisclaimerRowViewModel disclaimerRowViewModel = (ChatRowViewModel.DisclaimerRowViewModel) getItem(i);
                DisclaimerView disclaimerView = ((DisclaimerViewHolder) viewHolder).view;
                disclaimerView.setModel(disclaimerRowViewModel);
                disclaimerView.setEventReceiver(new ChatAdapter$$ExternalSyntheticLambda5(0));
                return;
            }
            if (viewHolder instanceof StatusViewHolder) {
                ChatRowViewModel.StatusRowViewModel statusRowViewModel = (ChatRowViewModel.StatusRowViewModel) getItem(i);
                StatusView statusView = ((StatusViewHolder) viewHolder).view;
                ChatContentViewModel.StatusViewModel statusViewModel = statusRowViewModel.model;
                statusView.getClass();
                statusView.text = statusViewModel.text;
                return;
            }
            if (viewHolder instanceof DividerViewHolder) {
                ChatRowViewModel.DividerRowViewModel dividerRowViewModel = (ChatRowViewModel.DividerRowViewModel) getItem(i);
                DividerView dividerView = ((DividerViewHolder) viewHolder).view;
                ChatContentViewModel.DividerViewModel dividerViewModel = dividerRowViewModel.model;
                dividerView.getClass();
                dividerView.chatUiUpliftEnabled$delegate.setValue(Boolean.valueOf(dividerViewModel.chatUiUpliftEnabled));
                return;
            }
            if (viewHolder instanceof TimestampDividerViewHolder) {
                ((TimestampDividerViewHolder) viewHolder).view.setViewModel(((ChatRowViewModel.TimestampDividerRowViewModel) getItem(i)).model);
                return;
            }
            if (viewHolder instanceof SuggestedRepliesViewHolder) {
                ((SuggestedRepliesViewHolder) viewHolder).view.setViewModel((ChatRowViewModel.SuggestedRepliesRowViewModel) getItem(i));
                return;
            }
            if (viewHolder instanceof EnhancedSuggestedRepliesViewHolder) {
                ((EnhancedSuggestedRepliesViewHolder) viewHolder).view.setViewModel((ChatRowViewModel.SuggestedRepliesRowViewModel) getItem(i));
                return;
            }
            if (viewHolder instanceof ErrorViewHolder) {
                ((ErrorViewHolder) viewHolder).view.setOnRetryClick(((ChatRowViewModel.ErrorRowViewModel) getItem(i)).onRetryClick);
                return;
            }
            if (!(viewHolder instanceof BottomBookmarkViewHolder)) {
                if (viewHolder instanceof LoadOldMessagesViewHolder) {
                    ((ChatRowViewModel.LoadOldMessagesRowViewModel) getItem(i)).onBind.invoke();
                    return;
                }
                return;
            }
            Space space = ((BottomBookmarkViewHolder) viewHolder).view;
            ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
            if (layoutParams2 == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                return;
            }
            RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
            int ordinal = ((ChatRowViewModel.BottomBookmarkRowViewModel) getItem(i)).model.height.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                } else {
                    Context context = space.getContext();
                    context.getClass();
                    i3 = Views.dip(context, 16);
                }
            }
            ((ViewGroup.MarginLayoutParams) layoutParams3).height = i3;
            space.setLayoutParams(layoutParams3);
            return;
        }
        final ChatRowViewModel.MessageRowViewModel messageRowViewModel8 = (ChatRowViewModel.MessageRowViewModel) getItem(i);
        MessageView messageView = ((MessageViewHolder) viewHolder).view;
        messageView.setOnStatusIconClickListener(new Function1() { // from class: com.squareup.cash.support.chat.views.transcript.ChatAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i2;
                ChatRowViewModel.MessageRowViewModel messageRowViewModel9 = messageRowViewModel8;
                switch (i4) {
                    case 0:
                        String str3 = (String) obj;
                        str3.getClass();
                        messageRowViewModel9.onMessageStatusIconClick.invoke(str3);
                        break;
                    case 1:
                        String str4 = (String) obj;
                        str4.getClass();
                        messageRowViewModel9.onUrlClick.invoke(str4);
                        break;
                    case 2:
                        BodyViewModel$ActionBodyViewModel.Action action = (BodyViewModel$ActionBodyViewModel.Action) obj;
                        action.getClass();
                        messageRowViewModel9.onActionClick.invoke(action);
                        break;
                    default:
                        messageRowViewModel9.onImageLoadFailed.invoke((String) obj);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        NameView nameView = messageView.nameView;
        MessageBodyLayout messageBodyLayout = messageView.messageBodyLayout;
        messageView.setUpdateCashAppClickListener(new BottomSheet$$ExternalSyntheticLambda2(messageRowViewModel8, 25));
        messageView.setUrlClickListener(new Function1() { // from class: com.squareup.cash.support.chat.views.transcript.ChatAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                ChatRowViewModel.MessageRowViewModel messageRowViewModel9 = messageRowViewModel8;
                switch (i4) {
                    case 0:
                        String str3 = (String) obj;
                        str3.getClass();
                        messageRowViewModel9.onMessageStatusIconClick.invoke(str3);
                        break;
                    case 1:
                        String str4 = (String) obj;
                        str4.getClass();
                        messageRowViewModel9.onUrlClick.invoke(str4);
                        break;
                    case 2:
                        BodyViewModel$ActionBodyViewModel.Action action = (BodyViewModel$ActionBodyViewModel.Action) obj;
                        action.getClass();
                        messageRowViewModel9.onActionClick.invoke(action);
                        break;
                    default:
                        messageRowViewModel9.onImageLoadFailed.invoke((String) obj);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i4 = 2;
        messageView.setActionClickListener(new Function1() { // from class: com.squareup.cash.support.chat.views.transcript.ChatAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i4;
                ChatRowViewModel.MessageRowViewModel messageRowViewModel9 = messageRowViewModel8;
                switch (i42) {
                    case 0:
                        String str3 = (String) obj;
                        str3.getClass();
                        messageRowViewModel9.onMessageStatusIconClick.invoke(str3);
                        break;
                    case 1:
                        String str4 = (String) obj;
                        str4.getClass();
                        messageRowViewModel9.onUrlClick.invoke(str4);
                        break;
                    case 2:
                        BodyViewModel$ActionBodyViewModel.Action action = (BodyViewModel$ActionBodyViewModel.Action) obj;
                        action.getClass();
                        messageRowViewModel9.onActionClick.invoke(action);
                        break;
                    default:
                        messageRowViewModel9.onImageLoadFailed.invoke((String) obj);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        messageView.setImageClickListener(messageRowViewModel8.onImageClick);
        final int i5 = 3;
        messageView.setImageLoadFailedListener(new Function1() { // from class: com.squareup.cash.support.chat.views.transcript.ChatAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i5;
                ChatRowViewModel.MessageRowViewModel messageRowViewModel9 = messageRowViewModel8;
                switch (i42) {
                    case 0:
                        String str3 = (String) obj;
                        str3.getClass();
                        messageRowViewModel9.onMessageStatusIconClick.invoke(str3);
                        break;
                    case 1:
                        String str4 = (String) obj;
                        str4.getClass();
                        messageRowViewModel9.onUrlClick.invoke(str4);
                        break;
                    case 2:
                        BodyViewModel$ActionBodyViewModel.Action action = (BodyViewModel$ActionBodyViewModel.Action) obj;
                        action.getClass();
                        messageRowViewModel9.onActionClick.invoke(action);
                        break;
                    default:
                        messageRowViewModel9.onImageLoadFailed.invoke((String) obj);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        messageView.setRetryImageLoadClickListener(messageRowViewModel8.onRetryImageLoadClick);
        messageView.setActivityTransactionClickListener(messageRowViewModel8.onActivityTransactionClick);
        ChatContentViewModel.EntryViewModel entryViewModel = messageRowViewModel8.model;
        StatusTimestampView statusTimestampView = messageView.statusTimestampView;
        ViewModelKt body = entryViewModel.getBody();
        ViewModelKt body2 = entryViewModel.getBody();
        ChatContentViewModel.EntryViewModel.Sender sender = entryViewModel.getSender();
        messageBodyLayout.getClass();
        body2.getClass();
        sender.getClass();
        messageBodyLayout.sender$delegate.setValue(sender);
        messageBodyLayout.messageBody$delegate.setValue(body2);
        messageBodyLayout.invalidateOutline();
        ComposeView composeView = messageBodyLayout.textView;
        composeView.setVisibility(8);
        AppCompatImageView appCompatImageView = messageBodyLayout.imageView;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        ImagePlaceholderView imagePlaceholderView = messageBodyLayout.imagePlaceholderView;
        if (imagePlaceholderView != null) {
            imagePlaceholderView.setVisibility(8);
        }
        FileAttachmentView fileAttachmentView = messageBodyLayout.fileView;
        if (fileAttachmentView != null) {
            fileAttachmentView.setVisibility(8);
        }
        ActionBodyView actionBodyView = messageBodyLayout.actionBodyView;
        if (actionBodyView != null) {
            actionBodyView.setVisibility(8);
        }
        ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$1 = messageBodyLayout.transactionBodyView;
        if (composeDialogKt$Modal$3$1$1$dialog$1 != null) {
            composeDialogKt$Modal$3$1$1$dialog$1.setVisibility(8);
        }
        TypingIndicatorBodyView typingIndicatorBodyView = messageBodyLayout.typingIndicatorBodyView;
        if (typingIndicatorBodyView != null) {
            typingIndicatorBodyView.setVisibility(8);
        }
        ComposeView composeView2 = messageBodyLayout.unifiedTransactionBodyView;
        if (composeView2 != null) {
            composeView2.setVisibility(8);
        }
        if (body2 instanceof BodyViewModel$TextBodyViewModel) {
            messageBodyLayout.setText(((BodyViewModel$TextBodyViewModel) body2).text);
            String str3 = messageBodyLayout.text;
            composeView.setVisibility((str3 == null || str3.length() <= 0) ? 8 : 0);
            View childAt8 = composeView.getChildAt(0);
            if (childAt8 != null) {
                childAt8.requestLayout();
            }
        } else if (body2 instanceof BodyViewModel$ImageBodyViewModel) {
            String str4 = ((BodyViewModel$ImageBodyViewModel) body2).imageUrl;
            if (!Intrinsics.areEqual(messageBodyLayout.imageUrl, str4)) {
                messageBodyLayout.imageUrl = str4;
                if (str4 != null) {
                    messageBodyLayout.createImageBodyViews();
                }
            }
            if (messageBodyLayout.imageUrl != null) {
                messageBodyLayout.createImageBodyViews();
                messageBodyLayout.loadImage(messageBodyLayout.imageView, messageBodyLayout.imagePlaceholderView, messageBodyLayout.imageUrl);
            }
        } else if (body2 instanceof BodyViewModel$FileBodyViewModel) {
            BodyViewModel$FileBodyViewModel bodyViewModel$FileBodyViewModel = (BodyViewModel$FileBodyViewModel) body2;
            if (!Intrinsics.areEqual(messageBodyLayout.file, bodyViewModel$FileBodyViewModel)) {
                messageBodyLayout.file = bodyViewModel$FileBodyViewModel;
                if (messageBodyLayout.fileView == null) {
                    Context context2 = messageBodyLayout.getContext();
                    context2.getClass();
                    FileAttachmentView fileAttachmentView2 = new FileAttachmentView(context2, new ChatSurveyKt$$ExternalSyntheticLambda11(3));
                    messageBodyLayout.addView(fileAttachmentView2, new FrameLayout.LayoutParams(-2, -2));
                    messageBodyLayout.fileView = fileAttachmentView2;
                }
                FileAttachmentView fileAttachmentView3 = messageBodyLayout.fileView;
                if (fileAttachmentView3 != null) {
                    fileAttachmentView3.setModel(new ChatAttachmentViewModel.FileAttachmentViewModel(bodyViewModel$FileBodyViewModel.uri, bodyViewModel$FileBodyViewModel.name, bodyViewModel$FileBodyViewModel.description, false));
                }
                FileAttachmentView fileAttachmentView4 = messageBodyLayout.fileView;
                if (fileAttachmentView4 != null) {
                    fileAttachmentView4.setVisibility(0);
                }
            }
            FileAttachmentView fileAttachmentView5 = messageBodyLayout.fileView;
            if (fileAttachmentView5 != null) {
                fileAttachmentView5.setVisibility(0);
            }
        } else if (body2 instanceof BodyViewModel$ActionBodyViewModel) {
            BodyViewModel$ActionBodyViewModel bodyViewModel$ActionBodyViewModel = (BodyViewModel$ActionBodyViewModel) body2;
            if (!Intrinsics.areEqual(messageBodyLayout.action, bodyViewModel$ActionBodyViewModel)) {
                messageBodyLayout.action = bodyViewModel$ActionBodyViewModel;
                if (messageBodyLayout.actionBodyView == null) {
                    Context context3 = messageBodyLayout.getContext();
                    context3.getClass();
                    ActionBodyView actionBodyView2 = new ActionBodyView(context3);
                    messageBodyLayout.addView(actionBodyView2, new FrameLayout.LayoutParams(-2, -2));
                    messageBodyLayout.actionBodyView = actionBodyView2;
                }
                ActionBodyView actionBodyView3 = messageBodyLayout.actionBodyView;
                if (actionBodyView3 != null) {
                    actionBodyView3.setVisibility(0);
                }
                ActionBodyView actionBodyView4 = messageBodyLayout.actionBodyView;
                if (actionBodyView4 != null) {
                    Function1 function1 = messageBodyLayout.onActionClick;
                    function1.getClass();
                    actionBodyView4.model$delegate.setValue(bodyViewModel$ActionBodyViewModel);
                    actionBodyView4.onActionBodyClick$delegate.setValue(function1);
                }
            }
            ActionBodyView actionBodyView5 = messageBodyLayout.actionBodyView;
            if (actionBodyView5 != null) {
                actionBodyView5.setVisibility(0);
            }
        } else if (body2 instanceof BodyViewModel$TransactionBodyViewModel) {
            BodyViewModel$TransactionBodyViewModel bodyViewModel$TransactionBodyViewModel = (BodyViewModel$TransactionBodyViewModel) body2;
            if (!Intrinsics.areEqual(messageBodyLayout.transaction, bodyViewModel$TransactionBodyViewModel)) {
                messageBodyLayout.transaction = bodyViewModel$TransactionBodyViewModel;
                if (messageBodyLayout.transactionBodyView == null) {
                    Context context4 = messageBodyLayout.getContext();
                    context4.getClass();
                    ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$12 = new ComposeDialogKt$Modal$3$1$1$dialog$1(context4, messageBodyLayout.stringManager, messageBodyLayout.imageLoader);
                    messageBodyLayout.addView(composeDialogKt$Modal$3$1$1$dialog$12, new FrameLayout.LayoutParams(-2, -2));
                    messageBodyLayout.transactionBodyView = composeDialogKt$Modal$3$1$1$dialog$12;
                }
                ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$13 = messageBodyLayout.transactionBodyView;
                if (composeDialogKt$Modal$3$1$1$dialog$13 != null) {
                    composeDialogKt$Modal$3$1$1$dialog$13.setVisibility(0);
                    ((ParcelableSnapshotMutableState) composeDialogKt$Modal$3$1$1$dialog$13.$onBack).setValue(bodyViewModel$TransactionBodyViewModel);
                }
            }
            ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$14 = messageBodyLayout.transactionBodyView;
            if (composeDialogKt$Modal$3$1$1$dialog$14 != null) {
                composeDialogKt$Modal$3$1$1$dialog$14.setVisibility(0);
            }
        } else if (body2 instanceof BodyViewModel$TypingIndicatorBodyViewModel) {
            BodyViewModel$TypingIndicatorBodyViewModel bodyViewModel$TypingIndicatorBodyViewModel = (BodyViewModel$TypingIndicatorBodyViewModel) body2;
            if (!Intrinsics.areEqual(messageBodyLayout.typingIndicator, bodyViewModel$TypingIndicatorBodyViewModel)) {
                messageBodyLayout.typingIndicator = bodyViewModel$TypingIndicatorBodyViewModel;
                if (messageBodyLayout.typingIndicatorBodyView == null) {
                    Context context5 = messageBodyLayout.getContext();
                    context5.getClass();
                    TypingIndicatorBodyView typingIndicatorBodyView2 = new TypingIndicatorBodyView(context5);
                    messageBodyLayout.addView(typingIndicatorBodyView2, new FrameLayout.LayoutParams(-2, -2));
                    messageBodyLayout.typingIndicatorBodyView = typingIndicatorBodyView2;
                }
            }
            TypingIndicatorBodyView typingIndicatorBodyView3 = messageBodyLayout.typingIndicatorBodyView;
            if (typingIndicatorBodyView3 != null) {
                typingIndicatorBodyView3.setVisibility(0);
                typingIndicatorBodyView3.viewModel$delegate.setValue(bodyViewModel$TypingIndicatorBodyViewModel);
            }
        } else if (body2 instanceof BodyViewModel$SystemMessageBodyViewModel) {
            messageBodyLayout.setText(((BodyViewModel$SystemMessageBodyViewModel) body2).text);
            String str5 = messageBodyLayout.text;
            composeView.setVisibility((str5 == null || str5.length() <= 0) ? 8 : 0);
            View childAt9 = composeView.getChildAt(0);
            if (childAt9 != null) {
                childAt9.requestLayout();
            }
        } else if (body2 instanceof BodyViewModel$UnknownBodyViewModel) {
            if (!messageBodyLayout.isUnknownMessage) {
                messageBodyLayout.isUnknownMessage = true;
                if (messageBodyLayout.unknownMessageBodyView == null) {
                    Context context6 = messageBodyLayout.getContext();
                    context6.getClass();
                    UnknownMessageBodyView unknownMessageBodyView = new UnknownMessageBodyView(context6, messageBodyLayout.onUpdateCashAppClick);
                    messageBodyLayout.unknownMessageBodyView = unknownMessageBodyView;
                    messageBodyLayout.addView(unknownMessageBodyView, new FrameLayout.LayoutParams(-1, -2));
                }
                UnknownMessageBodyView unknownMessageBodyView2 = messageBodyLayout.unknownMessageBodyView;
                if (unknownMessageBodyView2 != null) {
                    unknownMessageBodyView2.setVisibility(0);
                }
            }
        } else {
            if (!(body2 instanceof BodyViewModel$ActivityBodyViewModel)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            if (messageBodyLayout.unifiedTransactionBodyView == null) {
                Context context7 = messageBodyLayout.getContext();
                context7.getClass();
                ComposeView composeView3 = new ComposeView(context7, null, 0, 6, null);
                composeView3.setContent(new ComposableLambdaImpl(new MessageBodyLayout$$ExternalSyntheticLambda8(messageBodyLayout, i5), true, 1867145164));
                messageBodyLayout.unifiedTransactionBodyView = composeView3;
                messageBodyLayout.addView(composeView3, new FrameLayout.LayoutParams(-2, -2));
            }
            ComposeView composeView4 = messageBodyLayout.unifiedTransactionBodyView;
            if (composeView4 != null) {
                composeView4.setVisibility(0);
            }
            messageBodyLayout.activityBodyViewModel$delegate.setValue((BodyViewModel$ActivityBodyViewModel) body2);
        }
        if (messageBodyLayout.textHasLinks) {
            composeView.setImportantForAccessibility(1);
        } else {
            composeView.setImportantForAccessibility(2);
        }
        if (body instanceof BodyViewModel$TextBodyViewModel) {
            ChatContentViewModel.EntryViewModel.ContentDescription contentDescription = entryViewModel.getContentDescription();
            String str6 = ((BodyViewModel$TextBodyViewModel) body).text;
            if (messageBodyLayout.textHasLinks) {
                str6 = null;
            }
            createContentDescription = messageView.createContentDescription(contentDescription, str6);
        } else {
            createContentDescription = messageView.createContentDescription(entryViewModel.getContentDescription(), null);
        }
        messageView.setContentDescription(createContentDescription);
        if (entryViewModel instanceof ChatContentViewModel.MessageViewModel) {
            ChatContentViewModel.MessageViewModel messageViewModel = (ChatContentViewModel.MessageViewModel) entryViewModel;
            messageView.idempotenceToken = messageViewModel.idempotenceToken;
            FileTypes fileTypes = messageViewModel.status;
            if (!Intrinsics.areEqual(messageView.status, fileTypes)) {
                messageView.status = fileTypes;
                if (fileTypes != null) {
                    if (fileTypes instanceof ChatContentViewModel$MessageViewModel$Status$Failed) {
                        string2 = ((ChatContentViewModel$MessageViewModel$Status$Failed) fileTypes).reason;
                    } else if (fileTypes.equals(ChatContentViewModel$MessageViewModel$Status$Recorded.INSTANCE)) {
                        string2 = messageView.getResources().getString(R.string.support_chat_message_delivered);
                        string2.getClass();
                    } else if (!fileTypes.equals(ChatContentViewModel$MessageViewModel$Status$Sending.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    } else {
                        string2 = messageView.getResources().getString(R.string.support_chat_message_sending);
                        string2.getClass();
                    }
                    str2 = string2;
                } else {
                    str2 = null;
                }
                FileTypes fileTypes2 = messageView.status;
                statusTimestampView.model$delegate.setValue(ChatContentViewModel.StatusTimestampViewModel.copy$default(statusTimestampView.getModel(), str2, fileTypes2, fileTypes2 instanceof ChatContentViewModel$MessageViewModel$Status$Failed, null, false, 24));
                messageView.statusIconView.setVisibility(messageView.status instanceof ChatContentViewModel$MessageViewModel$Status$Failed ? 0 : 8);
                messageView.updateLayout();
            }
            String str7 = messageViewModel.timestamp;
            messageView.timestampText = str7;
            statusTimestampView.setTimestampText(str7);
        } else {
            messageView.timestampText = null;
            statusTimestampView.setTimestampText(null);
        }
        ChatContentViewModel.EntryViewModel.Sender sender2 = entryViewModel.getSender();
        if (messageView.sender != sender2) {
            messageView.sender = sender2;
            messageView.updateLayout();
            String str8 = messageView.name;
            Integer avatarDrawableRes = MessageView.avatarDrawableRes(sender2);
            ChatContentViewModel.NameDisplayViewModel.SpaceType spaceType = ChatContentViewModel.NameDisplayViewModel.SpaceType.LARGE;
            ChatContentViewModel.NameDisplayViewModel.NameColorType nameColorType = ChatContentViewModel.NameDisplayViewModel.NameColorType.SUBTLE;
            nameView.updateContent(avatarDrawableRes, str8);
        }
        if (entryViewModel.getShowSender()) {
            int ordinal2 = messageView.sender.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    str = messageView.getResources().getString(R.string.support_chat_message_sender_cash_app_advocate);
                } else if (ordinal2 == 2) {
                    str = messageView.getResources().getString(R.string.support_chat_message_sender_cash_app_bot);
                } else if (ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                if (!Intrinsics.areEqual(messageView.name, str)) {
                    messageView.name = str;
                    Integer avatarDrawableRes2 = MessageView.avatarDrawableRes(messageView.sender);
                    ChatContentViewModel.NameDisplayViewModel.SpaceType spaceType2 = ChatContentViewModel.NameDisplayViewModel.SpaceType.LARGE;
                    ChatContentViewModel.NameDisplayViewModel.NameColorType nameColorType2 = ChatContentViewModel.NameDisplayViewModel.NameColorType.SUBTLE;
                    nameView.updateContent(avatarDrawableRes2, str);
                }
                ViewGroup.LayoutParams layoutParams4 = messageBodyLayout.getLayoutParams();
                layoutParams = layoutParams4 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams != null) {
                    layoutParams.setMargins(0, 0, 0, 0);
                }
            }
            str = null;
            if (!Intrinsics.areEqual(messageView.name, str)) {
            }
            ViewGroup.LayoutParams layoutParams42 = messageBodyLayout.getLayoutParams();
            if (layoutParams42 instanceof LinearLayout.LayoutParams) {
            }
            if (layoutParams != null) {
            }
        } else {
            if (!Intrinsics.areEqual(messageView.name, (Object) null)) {
                messageView.name = null;
                Integer avatarDrawableRes3 = MessageView.avatarDrawableRes(messageView.sender);
                ChatContentViewModel.NameDisplayViewModel.SpaceType spaceType3 = ChatContentViewModel.NameDisplayViewModel.SpaceType.LARGE;
                ChatContentViewModel.NameDisplayViewModel.NameColorType nameColorType3 = ChatContentViewModel.NameDisplayViewModel.NameColorType.SUBTLE;
                nameView.updateContent(avatarDrawableRes3, null);
            }
            ViewGroup.LayoutParams layoutParams5 = messageBodyLayout.getLayoutParams();
            layoutParams = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams != null) {
                layoutParams.setMargins(0, 0, 0, 0);
            }
        }
        messageView.setPadding(messageView.getPaddingLeft(), Views.dip((View) messageView, entryViewModel.getShowSender() ? 16 : 8), messageView.getPaddingRight(), messageView.getPaddingBottom());
        statusTimestampView.model$delegate.setValue(ChatContentViewModel.StatusTimestampViewModel.copy$default(statusTimestampView.getModel(), null, null, false, null, false, 15));
        messageView.showTimestamp = false;
        messageView.updateClickListener();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        ViewType.Companion.getClass();
        switch (ViewType.values()[i].ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Context context = viewGroup.getContext();
                context.getClass();
                MessageView messageView = new MessageView(context, this.stringManager, this.imageLoader, this.authenticatedImageLoader, this.activityItemLoader);
                layoutRow(messageView);
                return new MessageViewHolder(messageView);
            case 9:
                Context context2 = viewGroup.getContext();
                context2.getClass();
                MessageTextComposeView messageTextComposeView = new MessageTextComposeView(context2);
                layoutRow(messageTextComposeView);
                return new MessageTextComposeViewHolder(messageTextComposeView);
            case 10:
                Context context3 = viewGroup.getContext();
                context3.getClass();
                MessageImageComposeView messageImageComposeView = new MessageImageComposeView(context3, this.authenticatedImageLoader);
                layoutRow(messageImageComposeView);
                return new MessageImageComposeViewHolder(messageImageComposeView);
            case 11:
                Context context4 = viewGroup.getContext();
                context4.getClass();
                MessageFileComposeView messageFileComposeView = new MessageFileComposeView(context4);
                layoutRow(messageFileComposeView);
                return new MessageFileComposeViewHolder(messageFileComposeView);
            case 12:
                Context context5 = viewGroup.getContext();
                context5.getClass();
                MessageActionComposeView messageActionComposeView = new MessageActionComposeView(context5);
                layoutRow(messageActionComposeView);
                return new MessageActionComposeViewHolder(messageActionComposeView);
            case 13:
                Context context6 = viewGroup.getContext();
                context6.getClass();
                MessageActivityComposeView messageActivityComposeView = new MessageActivityComposeView(context6, this.activityItemLoader, this.imageLoader);
                layoutRow(messageActivityComposeView);
                return new MessageActivityComposeViewHolder(messageActivityComposeView);
            case 14:
                Context context7 = viewGroup.getContext();
                context7.getClass();
                MessageTypingIndicatorComposeView messageTypingIndicatorComposeView = new MessageTypingIndicatorComposeView(context7);
                layoutRow(messageTypingIndicatorComposeView);
                return new MessageTypingIndicatorComposeViewHolder(messageTypingIndicatorComposeView);
            case 15:
                Context context8 = viewGroup.getContext();
                context8.getClass();
                MessageSystemMessageComposeView messageSystemMessageComposeView = new MessageSystemMessageComposeView(context8);
                layoutRow(messageSystemMessageComposeView);
                return new MessageSystemMessageComposeViewHolder(messageSystemMessageComposeView);
            case 16:
                Context context9 = viewGroup.getContext();
                context9.getClass();
                MessageUnknownComposeView messageUnknownComposeView = new MessageUnknownComposeView(context9);
                layoutRow(messageUnknownComposeView);
                return new MessageUnknownComposeViewHolder(messageUnknownComposeView);
            case 17:
                Context context10 = viewGroup.getContext();
                context10.getClass();
                DividerView dividerView = new DividerView(context10);
                layoutRow(dividerView);
                return new DividerViewHolder(dividerView);
            case 18:
                Context context11 = viewGroup.getContext();
                context11.getClass();
                DisclaimerView disclaimerView = new DisclaimerView(context11);
                layoutRow(disclaimerView);
                return new DisclaimerViewHolder(disclaimerView);
            case 19:
                Context context12 = viewGroup.getContext();
                context12.getClass();
                StatusView statusView = new StatusView(context12);
                layoutRow(statusView);
                return new StatusViewHolder(statusView);
            case 20:
                Context context13 = viewGroup.getContext();
                context13.getClass();
                TimestampDividerView timestampDividerView = new TimestampDividerView(context13, this.stringManager);
                layoutRow(timestampDividerView);
                return new TimestampDividerViewHolder(timestampDividerView);
            case 21:
                Context context14 = viewGroup.getContext();
                context14.getClass();
                StatusTimestampView statusTimestampView = new StatusTimestampView(context14);
                layoutRow(statusTimestampView);
                return new NameDisplayViewHolder(statusTimestampView);
            case 22:
                Context context15 = viewGroup.getContext();
                context15.getClass();
                SuggestedRepliesView suggestedRepliesView = new SuggestedRepliesView(context15);
                layoutRow(suggestedRepliesView);
                return new SuggestedRepliesViewHolder(suggestedRepliesView);
            case 23:
                Context context16 = viewGroup.getContext();
                context16.getClass();
                EnhancedSuggestedRepliesView enhancedSuggestedRepliesView = new EnhancedSuggestedRepliesView(context16);
                layoutRow(enhancedSuggestedRepliesView);
                return new EnhancedSuggestedRepliesViewHolder(enhancedSuggestedRepliesView);
            case 24:
                Context context17 = viewGroup.getContext();
                context17.getClass();
                LoadingRowView loadingRowView = new LoadingRowView(context17);
                layoutRow(loadingRowView);
                return new LoadOldMessagesViewHolder(loadingRowView);
            case 25:
                Context context18 = viewGroup.getContext();
                context18.getClass();
                ErrorRowView errorRowView = new ErrorRowView(context18);
                layoutRow(errorRowView);
                return new ErrorViewHolder(errorRowView);
            case 26:
                Space space = new Space(viewGroup.getContext());
                layoutRow(space);
                return new BottomBookmarkViewHolder(space);
            case 27:
                Context context19 = viewGroup.getContext();
                context19.getClass();
                NameView nameView = new NameView(context19);
                layoutRow(nameView);
                return new NameDisplayViewHolder(nameView);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
