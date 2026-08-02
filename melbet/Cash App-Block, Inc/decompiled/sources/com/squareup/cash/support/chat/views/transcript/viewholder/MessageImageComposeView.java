package com.squareup.cash.support.chat.views.transcript.viewholder;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class MessageImageComposeView extends AbstractComposeView {
    public final ParcelableSnapshotMutableState entryViewModel$delegate;
    public final RealImageLoader imageLoader;
    public Function1 onDeleteMessage;
    public Function1 onImageClick;
    public Function1 onImageLoadFailed;
    public Function1 onResendMessage;
    public Function0 onRetryImageLoadClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageImageComposeView(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        this.entryViewModel$delegate = Updater.mutableStateOf$default(null);
        this.onImageClick = new ChatSurveyKt$$ExternalSyntheticLambda11(28);
        this.onImageLoadFailed = new ChatSurveyKt$$ExternalSyntheticLambda11(29);
        this.onRetryImageLoadClick = new SheetKt$$ExternalSyntheticLambda9(20);
        this.onResendMessage = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(1);
        this.onDeleteMessage = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1400779535);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ChatContentViewModel.MessageViewModel messageViewModel = (ChatContentViewModel.MessageViewModel) this.entryViewModel$delegate.getValue();
            if (messageViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, i3) { // from class: com.squareup.cash.support.chat.views.transcript.viewholder.MessageImageComposeView$$ExternalSyntheticLambda5
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ MessageImageComposeView f$0;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            MessageImageComposeView messageImageComposeView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    messageImageComposeView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    messageImageComposeView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(1343899215, new MessageImageComposeView$$ExternalSyntheticLambda6(messageViewModel, this, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i4) { // from class: com.squareup.cash.support.chat.views.transcript.viewholder.MessageImageComposeView$$ExternalSyntheticLambda5
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ MessageImageComposeView f$0;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    MessageImageComposeView messageImageComposeView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            messageImageComposeView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            messageImageComposeView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void setOnDeleteMessage(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onDeleteMessage = function1;
    }

    public final void setOnImageClickListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onImageClick = function1;
    }

    public final void setOnImageLoadFailedListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onImageLoadFailed = function1;
    }

    public final void setOnResendMessage(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onResendMessage = function1;
    }

    public final void setOnRetryImageLoadClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.onRetryImageLoadClick = function0;
    }

    public final void setViewModel(ChatContentViewModel.EntryViewModel entryViewModel) {
        entryViewModel.getClass();
        this.entryViewModel$delegate.setValue(entryViewModel instanceof ChatContentViewModel.MessageViewModel ? (ChatContentViewModel.MessageViewModel) entryViewModel : null);
    }
}
