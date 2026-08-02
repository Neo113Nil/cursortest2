package com.squareup.cash.support.chat.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.camera.view.PreviewView$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import app.cash.broadway.ui.Ui;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MonthsPagerAdapter;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.treehouse.RadioBinding$value$1;
import com.squareup.cash.filepicker.FilePickerResult;
import com.squareup.cash.filepicker.RealFilePicker;
import com.squareup.cash.filepicker.RealFilePicker$Factory$Impl;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$SystemMessageBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatViewModel;
import com.squareup.cash.support.chat.views.transcript.BetterScrollLinearLayoutManager;
import com.squareup.cash.support.chat.views.transcript.ChatAdapter;
import com.squareup.cash.support.chat.views.transcript.FileAttachmentView;
import com.squareup.cash.support.chat.views.transcript.ImageAttachmentView;
import com.squareup.cash.support.chat.views.transcript.TranscriptRecyclerView;
import com.squareup.cash.support.chat.views.transcript.TranscriptRecyclerView$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.views.util.UnreadMessageTransition;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.OnTransitionListener;
import com.squareup.cash.util.BackHandlerKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.HasTop$DefaultImpls;
import com.squareup.contour.YInt;
import com.squareup.contour.constraints.PositionConstraint;
import com.squareup.contour.utils.XYIntUtilsKt$unwrapXIntLambda$1;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.Views;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.wire.ByteArrayProtoReader32;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ChatView extends ContourLayout implements Ui, InsetsCollector.InsetsDispatcher, OnTransitionListener {
    public static final String ALLOWED_MIME_TYPES = CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"image/*", "text/*", "application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"}), ",", null, null, 0, null, null, 62);
    public final ComposeView attachmentButton;
    public final ParcelableSnapshotMutableState attachmentButtonEnabled$delegate;
    public final ChatAdapter chatAdapter;
    public final ComposeView chatInputArea;
    public final ParcelableSnapshotMutableState chatInputAreaAttachment;
    public final ParcelableSnapshotMutableState chatInputAreaAttachmentButtonEnabled;
    public final ParcelableSnapshotMutableState chatInputAreaShowAttachmentButton;
    public boolean chatUiUpliftEnabled;
    public final TranscriptRecyclerView chatView;
    public final boolean enableFilePicker;
    public Ui.EventReceiver eventReceiver;
    public final FileAttachmentView fileAttachmentView;
    public final RealFilePicker filePicker;
    public final ImageAttachmentView imageAttachmentView;
    public String imageUri;
    public final LinearLayout inputLayout;
    public final ChatInputView inputView;
    public boolean isAutoScrolling;
    public ChatViewModel model;
    public ChatViewModel.ScrollAction nextScrollActionAfterContentChange;
    public final ChatView$$ExternalSyntheticLambda1 onClickUnreadMessagesButton;
    public final RadioBinding$value$1 placeholderView;
    public boolean restoredFromInstanceState;
    public final ComposeView scrollToBottomButton;
    public final ComposeView sendButton;
    public final ParcelableSnapshotMutableState sendButtonEnabled$delegate;
    public final TextFieldState textFieldState;
    public final ComposeView toolbar;
    public final ParcelableSnapshotMutableState unreadMessageText$delegate;
    public final ComposeView unreadMessagesButton;
    public boolean viewInitialized;

    /* renamed from: com.squareup.cash.support.chat.views.ChatView$29, reason: invalid class name */
    public final class AnonymousClass29 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ ChatView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass29(ChatView chatView, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = chatView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            ChatView chatView = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass29(chatView, continuation, 0);
                default:
                    return new AnonymousClass29(chatView, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass29) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005a -> B:18:0x005e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            ChatView chatView = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (chatView.enableFilePicker) {
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        FilePickerResult filePickerResult = (FilePickerResult) obj;
                        if (filePickerResult instanceof FilePickerResult.Success) {
                            Ui.EventReceiver eventReceiver = chatView.eventReceiver;
                            if (eventReceiver == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver.sendEvent(new ChatViewEvent.AttachImage(((FilePickerResult.Success) filePickerResult).uri));
                        }
                        if (chatView.enableFilePicker) {
                            RealFilePicker realFilePicker = chatView.filePicker;
                            this.label = 1;
                            obj = realFilePicker.getResult(this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            FilePickerResult filePickerResult2 = (FilePickerResult) obj;
                            if (filePickerResult2 instanceof FilePickerResult.Success) {
                            }
                            if (chatView.enableFilePicker) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow debounce = FlowKt.debounce(chatView.chatView.scrollEvents, 250L);
                        ChatView$30$1 chatView$30$1 = new ChatView$30$1(chatView, 0);
                        this.label = 1;
                        if (debounce.collect(chatView$30$1, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    public ChatView(ContextThemeWrapper contextThemeWrapper, RealFilePicker$Factory$Impl realFilePicker$Factory$Impl, AndroidStringManager androidStringManager, RealImageLoader realImageLoader, RealImageLoader realImageLoader2, boolean z, SupportActivityItemLoader supportActivityItemLoader) {
        super(contextThemeWrapper);
        final int i = 1;
        this.enableFilePicker = true;
        ComponentActivity componentActivity = (ComponentActivity) realFilePicker$Factory$Impl.delegateFactory.activity.value;
        componentActivity.getClass();
        this.filePicker = new RealFilePicker(componentActivity, "ChatView");
        ChatAdapter chatAdapter = new ChatAdapter(androidStringManager, realImageLoader, realImageLoader2, supportActivityItemLoader);
        this.chatAdapter = chatAdapter;
        int i2 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i3 = 0;
        ComposeView composeView = new ComposeView(contextThemeWrapper, null, i3, i2, defaultConstructorMarker);
        composeView.setContent(new ComposableLambdaImpl(new ChatView$$ExternalSyntheticLambda0(this, androidStringManager, 0), true, -67104133));
        this.toolbar = composeView;
        Context context = getContext();
        context.getClass();
        TranscriptRecyclerView transcriptRecyclerView = new TranscriptRecyclerView(context);
        transcriptRecyclerView.setId(R.id.support_transcript_recycler_view);
        transcriptRecyclerView.setAdapter(chatAdapter);
        int i4 = 2;
        transcriptRecyclerView.setImportantForAccessibility(2);
        transcriptRecyclerView.setClipToPadding(false);
        this.chatView = transcriptRecyclerView;
        Boolean bool = Boolean.TRUE;
        this.attachmentButtonEnabled$delegate = Updater.mutableStateOf$default(bool);
        ComposeView composeView2 = new ComposeView(contextThemeWrapper, null, i3, i2, defaultConstructorMarker);
        composeView2.setMinimumWidth(Views.dip((View) composeView2, 56));
        composeView2.setMinimumHeight(Views.dip((View) composeView2, 56));
        composeView2.setContent(new ComposableLambdaImpl(new ChatView$$ExternalSyntheticLambda0(androidStringManager, this, i), true, 966053781));
        this.attachmentButton = composeView2;
        this.sendButtonEnabled$delegate = Updater.mutableStateOf$default(bool);
        ComposeView composeView3 = new ComposeView(contextThemeWrapper, null, 0, i2, defaultConstructorMarker);
        composeView3.setMinimumHeight(Views.dip((View) composeView3, 56));
        composeView3.setMinimumWidth(Views.dip((View) composeView3, 56));
        composeView3.setContent(new ComposableLambdaImpl(new ChatView$$ExternalSyntheticLambda0(androidStringManager, this, i4), true, -733720048));
        this.sendButton = composeView3;
        FileAttachmentView fileAttachmentView = new FileAttachmentView(contextThemeWrapper, new ChatView$$ExternalSyntheticLambda6(this, 10));
        fileAttachmentView.setVisibility(8);
        this.fileAttachmentView = fileAttachmentView;
        TextFieldState textFieldState = new TextFieldState((String) null, 3);
        this.textFieldState = textFieldState;
        Continuation continuation = null;
        ChatInputView chatInputView = new ChatInputView(contextThemeWrapper, textFieldState, new ChatView$$ExternalSyntheticLambda6(this, 11), new ChatView$$ExternalSyntheticLambda1(this, i4), z);
        this.inputView = chatInputView;
        this.chatInputAreaAttachment = Updater.mutableStateOf$default(null);
        this.chatInputAreaAttachmentButtonEnabled = Updater.mutableStateOf$default(bool);
        this.chatInputAreaShowAttachmentButton = Updater.mutableStateOf$default(bool);
        ComposeView composeView4 = new ComposeView(contextThemeWrapper, null, 0, 6, null);
        composeView4.setContent(new ComposableLambdaImpl(new ActionPillKt$$ExternalSyntheticLambda1(14, realImageLoader, this), true, 78074615));
        composeView4.addOnLayoutChangeListener(new PreviewView$$ExternalSyntheticLambda0(this, 4));
        this.chatInputArea = composeView4;
        RadioBinding$value$1 radioBinding$value$1 = new RadioBinding$value$1(contextThemeWrapper, androidStringManager);
        radioBinding$value$1.setVisibility(8);
        this.placeholderView = radioBinding$value$1;
        int i5 = 3;
        ImageAttachmentView imageAttachmentView = new ImageAttachmentView(contextThemeWrapper, realImageLoader, new ChatView$$ExternalSyntheticLambda1(this, i5));
        this.imageAttachmentView = imageAttachmentView;
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setOrientation(1);
        linearLayout.addView(imageAttachmentView, new ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(fileAttachmentView, new ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(chatInputView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(getDip(16), linearLayout.getPaddingTop(), composeView3.getMinimumWidth(), linearLayout.getPaddingBottom());
        this.inputLayout = linearLayout;
        ComposeView composeView5 = new ComposeView(contextThemeWrapper, null, 0, 6, null);
        composeView5.setContent(new ComposableLambdaImpl(new ChatView$$ExternalSyntheticLambda0(this, androidStringManager, i5), true, 1719680837));
        composeView5.setImportantForAccessibility(1);
        this.scrollToBottomButton = composeView5;
        this.unreadMessageText$delegate = Updater.mutableStateOf$default("");
        this.onClickUnreadMessagesButton = new ChatView$$ExternalSyntheticLambda1(this, 0);
        ComposeView composeView6 = new ComposeView(contextThemeWrapper, null, 0, 6, null);
        this.unreadMessagesButton = composeView6;
        setId(R.id.support_chat_view);
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(this);
        Colors colors = (getContext().getResources().getConfiguration().uiMode & 48) == 32 ? ColorsDarkKt.colorsDark : ColorsLightKt.colorsLight;
        setBackgroundColor(ColorKt.m694toArgb8_81llA(colors.semantic.background.f1047app));
        linearLayout.setBackgroundColor(ColorKt.m694toArgb8_81llA(colors.semantic.background.f1047app));
        Context context2 = getContext();
        context2.getClass();
        final ComposeView composeView7 = new ComposeView(context2, null, 0, 6, null);
        ComposableLambdaImpl composableLambdaImpl = ChatExitPromptViewKt.lambda$1549435119;
        composeView7.setContent(composableLambdaImpl);
        Context context3 = getContext();
        context3.getClass();
        final ComposeView composeView8 = new ComposeView(context3, null, 0, 6, null);
        composeView8.setContent(composableLambdaImpl);
        final int i6 = 0;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new ChatView$$ExternalSyntheticLambda2(i6));
        leftTo.rightTo(1, new ChatView$$ExternalSyntheticLambda2(24));
        ContourLayout.layoutBy$default(this, radioBinding$value$1, leftTo, ContourLayout.bottomTo(new Function1(this) { // from class: com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda4
            public final /* synthetic */ ChatView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i6;
                ComposeView composeView9 = composeView7;
                ChatView chatView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i7) {
                    case 0:
                        int m3819topdBGyhoQ = chatView.m3819topdBGyhoQ(chatView.chatUiUpliftEnabled ? chatView.chatInputArea : chatView.inputLayout);
                        return new YInt(Math.min(m3819topdBGyhoQ, (chatView.m3815heightdBGyhoQ(chatView.placeholderView) / 2) + ((chatView.m3810bottomdBGyhoQ(composeView9) + m3819topdBGyhoQ) / 2)));
                    case 1:
                        return new YInt(chatView.m3810bottomdBGyhoQ(composeView9));
                    default:
                        return new YInt(chatView.chatUiUpliftEnabled ? layoutSpec.getParent().m4372bottomh0YXg9w() : chatView.m3819topdBGyhoQ(composeView9));
                }
            }
        }));
        ContourLayout.layoutBy$default(this, composeView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new ChatView$$ExternalSyntheticLambda2(25)));
        ByteArrayProtoReader32 matchParentX = ContourLayout.matchParentX(0, 0);
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new ChatView$$ExternalSyntheticLambda6(this, i6));
        int i7 = 19;
        byteArrayProtoReader32.heightOf(1, new ChatView$$ExternalSyntheticLambda6(this, i7));
        ContourLayout.layoutBy$default(this, composeView7, matchParentX, byteArrayProtoReader32);
        ByteArrayProtoReader32 matchParentX2 = ContourLayout.matchParentX(0, 0);
        ByteArrayProtoReader32 byteArrayProtoReader322 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda4
            public final /* synthetic */ ChatView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i;
                ComposeView composeView9 = composeView7;
                ChatView chatView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i72) {
                    case 0:
                        int m3819topdBGyhoQ = chatView.m3819topdBGyhoQ(chatView.chatUiUpliftEnabled ? chatView.chatInputArea : chatView.inputLayout);
                        return new YInt(Math.min(m3819topdBGyhoQ, (chatView.m3815heightdBGyhoQ(chatView.placeholderView) / 2) + ((chatView.m3810bottomdBGyhoQ(composeView9) + m3819topdBGyhoQ) / 2)));
                    case 1:
                        return new YInt(chatView.m3810bottomdBGyhoQ(composeView9));
                    default:
                        return new YInt(chatView.chatUiUpliftEnabled ? layoutSpec.getParent().m4372bottomh0YXg9w() : chatView.m3819topdBGyhoQ(composeView9));
                }
            }
        });
        final int i8 = 2;
        HasTop$DefaultImpls.bottomTo$default(byteArrayProtoReader322, new Function1(this) { // from class: com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda4
            public final /* synthetic */ ChatView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i8;
                ComposeView composeView9 = composeView8;
                ChatView chatView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i72) {
                    case 0:
                        int m3819topdBGyhoQ = chatView.m3819topdBGyhoQ(chatView.chatUiUpliftEnabled ? chatView.chatInputArea : chatView.inputLayout);
                        return new YInt(Math.min(m3819topdBGyhoQ, (chatView.m3815heightdBGyhoQ(chatView.placeholderView) / 2) + ((chatView.m3810bottomdBGyhoQ(composeView9) + m3819topdBGyhoQ) / 2)));
                    case 1:
                        return new YInt(chatView.m3810bottomdBGyhoQ(composeView9));
                    default:
                        return new YInt(chatView.chatUiUpliftEnabled ? layoutSpec.getParent().m4372bottomh0YXg9w() : chatView.m3819topdBGyhoQ(composeView9));
                }
            }
        });
        ContourLayout.layoutBy$default(this, transcriptRecyclerView, matchParentX2, byteArrayProtoReader322);
        ByteArrayProtoReader32 matchParentX3 = ContourLayout.matchParentX(0, 0);
        ByteArrayProtoReader32 bottomTo = ContourLayout.bottomTo(new ChatView$$ExternalSyntheticLambda6(this, i));
        bottomTo.heightOf(1, new ChatView$$ExternalSyntheticLambda6(this, i8));
        ContourLayout.layoutBy$default(this, composeView8, matchParentX3, bottomTo);
        ByteArrayProtoReader32 matchParentX4 = ContourLayout.matchParentX(0, 0);
        ByteArrayProtoReader32 bottomTo2 = ContourLayout.bottomTo(new ChatView$$ExternalSyntheticLambda2(17));
        ChatView$$ExternalSyntheticLambda6 chatView$$ExternalSyntheticLambda6 = new ChatView$$ExternalSyntheticLambda6(this, 3);
        PositionConstraint positionConstraint = (PositionConstraint) bottomTo2.bufferStack;
        positionConstraint.getClass();
        positionConstraint.point = 1;
        positionConstraint.setMode(2);
        positionConstraint.lambda = new XYIntUtilsKt$unwrapXIntLambda$1(1, chatView$$ExternalSyntheticLambda6);
        ContourLayout.layoutBy$default(this, linearLayout, matchParentX4, bottomTo2);
        ContourLayout.layoutBy$default(this, composeView4, ContourLayout.matchParentX(0, 0), ContourLayout.bottomTo(new ChatView$$ExternalSyntheticLambda2(18)));
        ContourLayout.layoutBy$default(this, composeView2, ContourLayout.leftTo(new ChatView$$ExternalSyntheticLambda2(i7)), ContourLayout.bottomTo(new ChatView$$ExternalSyntheticLambda2(20)));
        ContourLayout.layoutBy$default(this, composeView3, ContourLayout.rightTo(new ChatView$$ExternalSyntheticLambda2(21)), ContourLayout.bottomTo(new ChatView$$ExternalSyntheticLambda2(22)));
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new ChatView$$ExternalSyntheticLambda2(23));
        centerHorizontallyTo.widthOf(2, new ChatView$$ExternalSyntheticLambda6(this, 4));
        ContourLayout.layoutBy$default(this, composeView6, centerHorizontallyTo, ContourLayout.topTo(new ChatView$$ExternalSyntheticLambda6(this, 5)));
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new ChatView$$ExternalSyntheticLambda6(this, 6));
        rightTo.widthOf(1, new ChatView$$ExternalSyntheticLambda6(this, 7));
        ByteArrayProtoReader32 bottomTo3 = ContourLayout.bottomTo(new ChatView$$ExternalSyntheticLambda6(this, 8));
        bottomTo3.heightOf(1, new ChatView$$ExternalSyntheticLambda6(this, 9));
        ContourLayout.layoutBy$default(this, composeView5, rightTo, bottomTo3);
        composeView5.setVisibility(8);
        composeView6.setVisibility(8);
        composeView4.setVisibility(8);
        composeView2.setId(R.id.support_chat_attachment_button);
        chatInputView.setId(R.id.support_chat_input_text_view);
        final int i9 = 0;
        ViewCompat.setAccessibilityDelegate(chatInputView, new AccessibilityDelegateCompat(this) { // from class: com.squareup.cash.support.chat.views.ChatView.25
            public final /* synthetic */ ChatView this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                int i10 = i9;
                ChatView chatView = this.this$0;
                View.AccessibilityDelegate accessibilityDelegate = this.mOriginalDelegate;
                view.getClass();
                switch (i10) {
                    case 0:
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                        accessibilityNodeInfoCompat.setTraversalAfter(chatView.attachmentButton);
                        break;
                    default:
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                        accessibilityNodeInfoCompat.setTraversalAfter(chatView.inputView);
                        break;
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(composeView3, new AccessibilityDelegateCompat(this) { // from class: com.squareup.cash.support.chat.views.ChatView.25
            public final /* synthetic */ ChatView this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                int i10 = i;
                ChatView chatView = this.this$0;
                View.AccessibilityDelegate accessibilityDelegate = this.mOriginalDelegate;
                view.getClass();
                switch (i10) {
                    case 0:
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                        accessibilityNodeInfoCompat.setTraversalAfter(chatView.attachmentButton);
                        break;
                    default:
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                        accessibilityNodeInfoCompat.setTraversalAfter(chatView.inputView);
                        break;
                }
            }
        });
        composeView3.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, i9));
        BackHandlerKt.setBackHandler(this, new ChatView$$ExternalSyntheticLambda1(this, i));
        AnonymousClass29 anonymousClass29 = new AnonymousClass29(this, continuation, i9);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        ViewKt.whileEachAttached(this, emptyCoroutineContext, anonymousClass29);
        ViewKt.whileEachAttached(this, emptyCoroutineContext, new AnonymousClass29(this, continuation, i));
        transcriptRecyclerView.addOnScrollListener(new AnonymousClass31(this));
        composeView6.setContent(new ComposableLambdaImpl(new ChatView$$ExternalSyntheticLambda57(this.chatUiUpliftEnabled, this, i9), true, 1186104396));
    }

    public static final void access$emitLastMessageVisibilityChange(ChatView chatView, boolean z) {
        ChatAdapter chatAdapter = chatView.chatAdapter;
        TranscriptRecyclerView transcriptRecyclerView = chatView.chatView;
        transcriptRecyclerView.getClass();
        BetterScrollLinearLayoutManager betterScrollLinearLayoutManager = transcriptRecyclerView.linearLayoutManager;
        int findFirstVisibleItemPosition = betterScrollLinearLayoutManager.findFirstVisibleItemPosition();
        IntRange intRange = new IntRange(findFirstVisibleItemPosition, betterScrollLinearLayoutManager.findLastVisibleItemPosition(), 1);
        if (findFirstVisibleItemPosition >= 0) {
            if (intRange.last > chatAdapter.getItemCount() - 1) {
                return;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
            IntProgressionIterator it = intRange.iterator();
            while (it.hasNext) {
                arrayList.add(chatAdapter.getItem(it.nextInt()).getModel());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof ChatContentViewModel.MessageViewModel) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (!(((ChatContentViewModel.MessageViewModel) next2).body instanceof BodyViewModel$SystemMessageBodyViewModel)) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                String str = ((ChatContentViewModel.MessageViewModel) it4.next()).messageToken;
                if (str != null) {
                    arrayList4.add(str);
                }
            }
            String str2 = (String) CollectionsKt.lastOrNull((List) arrayList4);
            if (str2 != null) {
                Ui.EventReceiver eventReceiver = chatView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new ChatViewEvent.BottomVisibleMessageChanged(str2, z));
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            }
        }
    }

    public static final void access$updateScrollToBottomButtonVisibility(ChatView chatView) {
        ComposeView composeView = chatView.scrollToBottomButton;
        if (chatView.isAutoScrolling) {
            composeView.setVisibility(8);
            return;
        }
        boolean z = chatView.chatView.linearLayoutManager.findLastVisibleItemPosition() < chatView.chatAdapter.getItemCount() + (-2);
        if (z != (composeView.getVisibility() == 0)) {
            Fade fade = new Fade();
            fade.mTargets.add(composeView);
            fade.mDuration = 120L;
            TransitionManager.beginDelayedTransition(chatView, fade);
            composeView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.squareup.cash.ui.InsetsCollector.InsetsDispatcher
    public final void dispatch(WindowInsetsCompat windowInsetsCompat, CashInsets cashInsets) {
        windowInsetsCompat.getClass();
        cashInsets.getClass();
        Insets insets = windowInsetsCompat.mImpl.getInsets(527);
        insets.getClass();
        int i = insets.top;
        ComposeView composeView = this.toolbar;
        composeView.setPadding(composeView.getPaddingLeft(), i, composeView.getPaddingRight(), composeView.getPaddingBottom());
        setPadding(insets.left, getPaddingTop(), insets.right, insets.bottom);
    }

    public final void handleSendButtonClick() {
        TextFieldState textFieldState = this.textFieldState;
        CharSequence charSequence = textFieldState.getValue$foundation().text;
        String obj = StringsKt.isBlank(charSequence) ? null : charSequence.toString();
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
        eventReceiver.sendEvent(new ChatViewEvent.SendMessage(obj));
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.buffer.length(), "");
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onExitTransitionStarted() {
        Keyboards.hideKeyboard(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        Bundle bundle = (Bundle) parcelable;
        String string2 = bundle.getString("imageAttachment");
        if (string2 != null) {
            this.imageUri = string2;
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            eventReceiver.sendEvent(new ChatViewEvent.AttachImage(string2));
        }
        this.restoredFromInstanceState = true;
        super.onRestoreInstanceState(bundle.getParcelable("superState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putString("imageAttachment", this.imageUri);
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0 < 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void scrollToFirstUnreadOrBottom() {
        int i;
        ChatViewModel chatViewModel = this.model;
        Integer num = chatViewModel != null ? chatViewModel.firstUnreadMessageIndex : null;
        TranscriptRecyclerView transcriptRecyclerView = this.chatView;
        if (num == null || num.intValue() < 0 || num.intValue() >= this.chatAdapter.getItemCount()) {
            transcriptRecyclerView.smoothScrollToBottom();
            return;
        }
        int intValue = num.intValue();
        RecyclerView.Adapter adapter = transcriptRecyclerView.mAdapter;
        if (adapter == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        if (intValue < 0 || intValue >= itemCount) {
            return;
        }
        int findLastVisibleItemPosition = transcriptRecyclerView.linearLayoutManager.findLastVisibleItemPosition();
        int i2 = 3;
        if (Math.abs(intValue - findLastVisibleItemPosition) < 3) {
            transcriptRecyclerView.smoothScrollToPosition(intValue);
            return;
        }
        if (intValue <= findLastVisibleItemPosition) {
            int i3 = intValue + 3;
            i = itemCount - 3;
            if (i3 <= i) {
                i2 = i3;
                transcriptRecyclerView.scrollToPosition(i2);
                transcriptRecyclerView.post(new TranscriptRecyclerView$$ExternalSyntheticLambda0(transcriptRecyclerView, intValue, 1));
                return;
            }
            i2 = i;
            transcriptRecyclerView.scrollToPosition(i2);
            transcriptRecyclerView.post(new TranscriptRecyclerView$$ExternalSyntheticLambda0(transcriptRecyclerView, intValue, 1));
            return;
        }
        i = intValue - 3;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r2v42, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$NameDisplayRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$BottomBookmarkRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$ErrorRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$LoadOldMessagesRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v46, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$SuggestedRepliesRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$StatusTimestampRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$TimestampDividerRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v49, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$StatusRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$DisclaimerRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v52, types: [com.squareup.cash.support.chat.viewmodels.ChatRowViewModel$DividerRowViewModel] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55 */
    @Override // app.cash.broadway.ui.Ui
    public void setModel(ChatViewModel chatViewModel) {
        ?? r12;
        Iterator it;
        boolean z;
        ?? nameDisplayRowViewModel;
        ChatRowViewModel.MessageRowViewModel messageRowViewModel;
        String str;
        chatViewModel.getClass();
        boolean z2 = chatViewModel.initialState;
        boolean z3 = chatViewModel.chatUiUpliftEnabled;
        boolean z4 = chatViewModel.shouldAllowFileAttachments;
        ChatAttachmentViewModel chatAttachmentViewModel = chatViewModel.attachment;
        if (z2) {
            return;
        }
        final int i = 0;
        if (!this.viewInitialized && (str = chatViewModel.savedInput) != null) {
            TextFieldState textFieldState = this.textFieldState;
            TextFieldBuffer startEdit = textFieldState.startEdit();
            try {
                startEdit.replace(0, startEdit.buffer.length(), str);
                textFieldState.commitEdit(startEdit);
            } finally {
                textFieldState.finishEditing();
            }
        }
        ArrayList arrayList = chatViewModel.content;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            ?? r10 = 1;
            if (!it2.hasNext()) {
                boolean z5 = z4;
                ChatViewModel.ScrollAction scrollAction = chatViewModel.scrollAction;
                if (scrollAction != null) {
                    this.nextScrollActionAfterContentChange = scrollAction;
                }
                this.chatAdapter.mDiffer.submitList(arrayList2, new Task$$ExternalSyntheticLambda0(this, 2));
                this.placeholderView.setVisibility(chatViewModel.shouldShowPlaceholder ? 0 : 8);
                if (z3 != this.chatUiUpliftEnabled) {
                    this.chatUiUpliftEnabled = z3;
                    this.unreadMessagesButton.setContent(new ComposableLambdaImpl(new ChatView$$ExternalSyntheticLambda57(z3, this, 0), true, 1186104396));
                    if (this.chatUiUpliftEnabled) {
                        int dip = getDip(80);
                        TranscriptRecyclerView transcriptRecyclerView = this.chatView;
                        transcriptRecyclerView.setPadding(transcriptRecyclerView.getPaddingLeft(), transcriptRecyclerView.getPaddingTop(), transcriptRecyclerView.getPaddingRight(), dip);
                    }
                    requestLayout();
                }
                ComposeView composeView = this.sendButton;
                LinearLayout linearLayout = this.inputLayout;
                ComposeView composeView2 = this.attachmentButton;
                ComposeView composeView3 = this.chatInputArea;
                if (z3) {
                    composeView3.setVisibility(0);
                    linearLayout.setVisibility(8);
                    composeView2.setVisibility(8);
                    composeView.setVisibility(8);
                    this.chatInputAreaAttachment.setValue(chatAttachmentViewModel);
                    this.chatInputAreaAttachmentButtonEnabled.setValue(Boolean.valueOf(chatAttachmentViewModel == null));
                    this.chatInputAreaShowAttachmentButton.setValue(Boolean.valueOf(z5));
                } else {
                    composeView3.setVisibility(8);
                    linearLayout.setVisibility(0);
                    composeView2.setVisibility(0);
                    composeView.setVisibility(0);
                    ChatInputView chatInputView = this.inputView;
                    chatInputView.setVisibility(0);
                    linearLayout.setPadding(composeView2.getMinimumWidth() - chatInputView.getPaddingLeft(), linearLayout.getPaddingTop(), composeView.getMinimumWidth(), linearLayout.getPaddingBottom());
                    boolean z6 = chatAttachmentViewModel instanceof ChatAttachmentViewModel.ImageAttachmentViewModel;
                    FileAttachmentView fileAttachmentView = this.fileAttachmentView;
                    ImageAttachmentView imageAttachmentView = this.imageAttachmentView;
                    if (z6) {
                        fileAttachmentView.setVisibility(8);
                        r12 = 0;
                        imageAttachmentView.setVisibility(0);
                        String str2 = ((ChatAttachmentViewModel.ImageAttachmentViewModel) chatAttachmentViewModel).uri;
                        this.imageUri = str2;
                        imageAttachmentView.setUri(str2);
                    } else {
                        r12 = 0;
                        if (chatAttachmentViewModel instanceof ChatAttachmentViewModel.FileAttachmentViewModel) {
                            fileAttachmentView.setVisibility(0);
                            imageAttachmentView.setVisibility(8);
                            this.imageUri = null;
                            imageAttachmentView.setUri(null);
                            fileAttachmentView.setModel((ChatAttachmentViewModel.FileAttachmentViewModel) chatAttachmentViewModel);
                        } else {
                            if (chatAttachmentViewModel != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            fileAttachmentView.setVisibility(8);
                            imageAttachmentView.setVisibility(8);
                            this.imageUri = null;
                            imageAttachmentView.setUri(null);
                        }
                    }
                    this.imageUri = z6 ? ((ChatAttachmentViewModel.ImageAttachmentViewModel) chatAttachmentViewModel).uri : null;
                    this.attachmentButtonEnabled$delegate.setValue(Boolean.valueOf(chatAttachmentViewModel != null ? r12 : true));
                    composeView2.setVisibility(z5 ? r12 : 8);
                    linearLayout.setPadding(z5 ? composeView2.getMinimumWidth() - chatInputView.getPaddingLeft() : getDip(20), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
                    updateSendButton();
                }
                this.model = chatViewModel;
                updateUnreadMessagesButtonVisibility();
                return;
            }
            ChatContentViewModel chatContentViewModel = (ChatContentViewModel) it2.next();
            int i2 = 16;
            int i3 = 15;
            int i4 = 14;
            int i5 = 12;
            if (chatContentViewModel instanceof ChatContentViewModel.MessageViewModel) {
                ChatContentViewModel.EntryViewModel entryViewModel = (ChatContentViewModel.EntryViewModel) chatContentViewModel;
                ChatView$$ExternalSyntheticLambda6 chatView$$ExternalSyntheticLambda6 = new ChatView$$ExternalSyntheticLambda6(this, i5);
                ChatView$$ExternalSyntheticLambda6 chatView$$ExternalSyntheticLambda62 = new ChatView$$ExternalSyntheticLambda6(this, i4);
                ChatView$$ExternalSyntheticLambda6 chatView$$ExternalSyntheticLambda63 = new ChatView$$ExternalSyntheticLambda6(this, i3);
                ChatView$$ExternalSyntheticLambda1 chatView$$ExternalSyntheticLambda1 = new ChatView$$ExternalSyntheticLambda1(this, 6);
                final ChatContentViewModel.MessageViewModel messageViewModel = (ChatContentViewModel.MessageViewModel) chatContentViewModel;
                Function1 function1 = new Function1(this) { // from class: com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda46
                    public final /* synthetic */ ChatView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = i;
                        ChatContentViewModel.MessageViewModel messageViewModel2 = messageViewModel;
                        ChatView chatView = this.f$0;
                        switch (i6) {
                            case 0:
                                String str3 = (String) obj;
                                str3.getClass();
                                Ui.EventReceiver eventReceiver = chatView.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(new ChatViewEvent.LaunchUrl(messageViewModel2.messageToken, str3));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            default:
                                BodyViewModel$ActionBodyViewModel.Action action = (BodyViewModel$ActionBodyViewModel.Action) obj;
                                action.getClass();
                                Ui.EventReceiver eventReceiver2 = chatView.eventReceiver;
                                if (eventReceiver2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                String str4 = messageViewModel2.messageToken;
                                if (str4 == null) {
                                    str4 = "UNKNOWN_MESSAGE_TOKEN";
                                }
                                eventReceiver2.sendEvent(new ChatViewEvent.ClickAction(str4, action));
                                return Unit.INSTANCE;
                        }
                    }
                };
                final ?? r102 = r10 == true ? 1 : 0;
                it = it2;
                z = z4;
                messageRowViewModel = new ChatRowViewModel.MessageRowViewModel(entryViewModel, chatView$$ExternalSyntheticLambda6, chatView$$ExternalSyntheticLambda62, chatView$$ExternalSyntheticLambda63, chatView$$ExternalSyntheticLambda1, function1, new Function1(this) { // from class: com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda46
                    public final /* synthetic */ ChatView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = r102;
                        ChatContentViewModel.MessageViewModel messageViewModel2 = messageViewModel;
                        ChatView chatView = this.f$0;
                        switch (i6) {
                            case 0:
                                String str3 = (String) obj;
                                str3.getClass();
                                Ui.EventReceiver eventReceiver = chatView.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(new ChatViewEvent.LaunchUrl(messageViewModel2.messageToken, str3));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            default:
                                BodyViewModel$ActionBodyViewModel.Action action = (BodyViewModel$ActionBodyViewModel.Action) obj;
                                action.getClass();
                                Ui.EventReceiver eventReceiver2 = chatView.eventReceiver;
                                if (eventReceiver2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                String str4 = messageViewModel2.messageToken;
                                if (str4 == null) {
                                    str4 = "UNKNOWN_MESSAGE_TOKEN";
                                }
                                eventReceiver2.sendEvent(new ChatViewEvent.ClickAction(str4, action));
                                return Unit.INSTANCE;
                        }
                    }
                }, new ChatView$$ExternalSyntheticLambda6(this, i2), new ChatView$$ExternalSyntheticLambda6(this, 17), new ChatView$$ExternalSyntheticLambda1(this, 7), new ChatView$$ExternalSyntheticLambda6(this, 18));
            } else {
                it = it2;
                z = z4;
                if (chatContentViewModel instanceof ChatContentViewModel.DividerViewModel) {
                    nameDisplayRowViewModel = new ChatRowViewModel.DividerRowViewModel((ChatContentViewModel.DividerViewModel) chatContentViewModel);
                } else {
                    int i6 = 13;
                    if (chatContentViewModel instanceof ChatContentViewModel.DisclaimerViewModel) {
                        ChatContentViewModel.DisclaimerViewModel disclaimerViewModel = (ChatContentViewModel.DisclaimerViewModel) chatContentViewModel;
                        nameDisplayRowViewModel = new ChatRowViewModel.DisclaimerRowViewModel(disclaimerViewModel, new BottomSheet$$ExternalSyntheticLambda3(i6, this, disclaimerViewModel));
                    } else if (chatContentViewModel instanceof ChatContentViewModel.TypingIndicatorViewModel) {
                        int i7 = 9;
                        messageRowViewModel = new ChatRowViewModel.MessageRowViewModel((ChatContentViewModel.EntryViewModel) chatContentViewModel, new ChatView$$ExternalSyntheticLambda2(i7), new ChatView$$ExternalSyntheticLambda2(10), new ChatView$$ExternalSyntheticLambda2(11), new SheetKt$$ExternalSyntheticLambda9(i7), new ChatView$$ExternalSyntheticLambda2(i5), new ChatView$$ExternalSyntheticLambda2(i6), new ChatView$$ExternalSyntheticLambda2(i4), new ChatView$$ExternalSyntheticLambda2(i3), new SheetKt$$ExternalSyntheticLambda9(10), new ChatView$$ExternalSyntheticLambda2(i2));
                    } else if (chatContentViewModel instanceof ChatContentViewModel.StatusViewModel) {
                        nameDisplayRowViewModel = new ChatRowViewModel.StatusRowViewModel((ChatContentViewModel.StatusViewModel) chatContentViewModel);
                    } else if (chatContentViewModel instanceof ChatContentViewModel.TimestampDividerViewModel) {
                        nameDisplayRowViewModel = new ChatRowViewModel.TimestampDividerRowViewModel((ChatContentViewModel.TimestampDividerViewModel) chatContentViewModel);
                    } else if (chatContentViewModel instanceof ChatContentViewModel.StatusTimestampViewModel) {
                        nameDisplayRowViewModel = new ChatRowViewModel.StatusTimestampRowViewModel((ChatContentViewModel.StatusTimestampViewModel) chatContentViewModel);
                    } else if (chatContentViewModel instanceof ChatContentViewModel.SuggestedRepliesViewModel) {
                        nameDisplayRowViewModel = new ChatRowViewModel.SuggestedRepliesRowViewModel((ChatContentViewModel.SuggestedRepliesViewModel) chatContentViewModel, new ChatView$$ExternalSyntheticLambda6(this, i6));
                    } else if (chatContentViewModel instanceof ChatContentViewModel.LoadOldMessagesViewModel) {
                        nameDisplayRowViewModel = new ChatRowViewModel.LoadOldMessagesRowViewModel((ChatContentViewModel.LoadOldMessagesViewModel) chatContentViewModel, new ChatView$$ExternalSyntheticLambda1(this, 4));
                    } else if (chatContentViewModel instanceof ChatContentViewModel.ErrorViewModel) {
                        nameDisplayRowViewModel = new ChatRowViewModel.ErrorRowViewModel((ChatContentViewModel.ErrorViewModel) chatContentViewModel, new ChatView$$ExternalSyntheticLambda1(this, 5));
                    } else if (chatContentViewModel instanceof ChatContentViewModel.BottomBookmarkViewModel) {
                        nameDisplayRowViewModel = new ChatRowViewModel.BottomBookmarkRowViewModel((ChatContentViewModel.BottomBookmarkViewModel) chatContentViewModel);
                    } else {
                        if (!(chatContentViewModel instanceof ChatContentViewModel.NameDisplayViewModel)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        nameDisplayRowViewModel = new ChatRowViewModel.NameDisplayRowViewModel((ChatContentViewModel.NameDisplayViewModel) chatContentViewModel);
                    }
                }
                arrayList2.add(nameDisplayRowViewModel);
                it2 = it;
                z4 = z;
                i = 0;
            }
            nameDisplayRowViewModel = messageRowViewModel;
            arrayList2.add(nameDisplayRowViewModel);
            it2 = it;
            z4 = z;
            i = 0;
        }
    }

    public final void updateSendButton() {
        this.sendButtonEnabled$delegate.setValue(Boolean.valueOf((StringsKt.isBlank(this.textFieldState.getValue$foundation().text) && this.imageUri == null && this.fileAttachmentView.getVisibility() != 0) ? false : true));
    }

    public final void updateUnreadMessagesButtonVisibility() {
        boolean z = this.isAutoScrolling;
        ComposeView composeView = this.unreadMessagesButton;
        if (z) {
            composeView.setVisibility(8);
            return;
        }
        boolean z2 = this.chatView.linearLayoutManager.findLastVisibleItemPosition() < this.chatAdapter.getItemCount() - 1;
        ChatViewModel chatViewModel = this.model;
        String str = chatViewModel != null ? chatViewModel.unreadMessagesButtonText : null;
        if (str == null || !z2) {
            if (composeView.getVisibility() == 0) {
                UnreadMessageTransition unreadMessageTransition = new UnreadMessageTransition();
                unreadMessageTransition.mTargets.add(composeView);
                unreadMessageTransition.mDuration = 120L;
                TransitionManager.beginDelayedTransition(this, unreadMessageTransition);
                composeView.setVisibility(8);
                return;
            }
            return;
        }
        this.unreadMessageText$delegate.setValue(str);
        if (composeView.getVisibility() == 0) {
            return;
        }
        UnreadMessageTransition unreadMessageTransition2 = new UnreadMessageTransition();
        unreadMessageTransition2.mTargets.add(composeView);
        unreadMessageTransition2.mDuration = 120L;
        TransitionManager.beginDelayedTransition(this, unreadMessageTransition2);
        composeView.setVisibility(0);
    }

    /* renamed from: com.squareup.cash.support.chat.views.ChatView$31, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass31 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ int $r8$classId = 1;
        public Object lastScrollState;
        public final /* synthetic */ Object this$0;

        public AnonymousClass31(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter) {
            this.this$0 = materialCalendar;
            this.lastScrollState = monthsPagerAdapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            PagerSnapHelper pagerSnapHelper;
            int i2 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i2) {
                case 0:
                    ChatView chatView = (ChatView) obj;
                    Integer num = (Integer) this.lastScrollState;
                    chatView.isAutoScrolling = num != null && num.intValue() == 0 && i == 2;
                    this.lastScrollState = Integer.valueOf(i);
                    ChatView.access$updateScrollToBottomButtonVisibility(chatView);
                    chatView.updateUnreadMessagesButtonVisibility();
                    break;
                default:
                    MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.lastScrollState;
                    MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                    if (i == 0 && (pagerSnapHelper = materialCalendar.pagerSnapHelper) != null) {
                        View findSnapView = pagerSnapHelper.findSnapView((LinearLayoutManager) materialCalendar.recyclerView.mLayout);
                        if (findSnapView != null) {
                            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(findSnapView);
                            int absoluteAdapterPosition = childViewHolderInt != null ? childViewHolderInt.getAbsoluteAdapterPosition() : -1;
                            if (absoluteAdapterPosition != -1) {
                                materialCalendar.current = monthsPagerAdapter.getPageMonth(absoluteAdapterPosition);
                                materialCalendar.monthDropSelect.setText(monthsPagerAdapter.getPageMonth(absoluteAdapterPosition).getLongName());
                                materialCalendar.updateNavigationButtonsEnabled(absoluteAdapterPosition);
                            }
                        }
                        materialCalendar.updateCurrentVisibleMonth();
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i3) {
                case 0:
                    ChatView chatView = (ChatView) obj;
                    ChatView.access$updateScrollToBottomButtonVisibility(chatView);
                    chatView.updateUnreadMessagesButtonVisibility();
                    break;
                default:
                    MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.lastScrollState;
                    MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                    RecyclerView recyclerView2 = materialCalendar.recyclerView;
                    int findFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) recyclerView2.mLayout).findFirstVisibleItemPosition() : ((LinearLayoutManager) recyclerView2.mLayout).findLastVisibleItemPosition();
                    if (materialCalendar.pagerSnapHelper == null) {
                        materialCalendar.current = monthsPagerAdapter.getPageMonth(findFirstVisibleItemPosition);
                    }
                    materialCalendar.monthDropSelect.setText(monthsPagerAdapter.getPageMonth(findFirstVisibleItemPosition).getLongName());
                    materialCalendar.updateNavigationButtonsEnabled(findFirstVisibleItemPosition);
                    break;
            }
        }

        public AnonymousClass31(ChatView chatView) {
            this.this$0 = chatView;
        }
    }
}
