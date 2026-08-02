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
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class MessageActivityComposeView extends AbstractComposeView {
    public final SupportActivityItemLoader activityItemLoader;
    public final ParcelableSnapshotMutableState entryViewModel$delegate;
    public final RealImageLoader imageLoader;
    public Function1 onActivityClick;
    public Function1 onDeleteMessage;
    public Function1 onResendMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageActivityComposeView(Context context, SupportActivityItemLoader supportActivityItemLoader, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        supportActivityItemLoader.getClass();
        realImageLoader.getClass();
        this.activityItemLoader = supportActivityItemLoader;
        this.imageLoader = realImageLoader;
        this.entryViewModel$delegate = Updater.mutableStateOf$default(null);
        this.onActivityClick = new ChatSurveyKt$$ExternalSyntheticLambda11(23);
        this.onResendMessage = new ChatSurveyKt$$ExternalSyntheticLambda11(24);
        this.onDeleteMessage = new ChatSurveyKt$$ExternalSyntheticLambda11(25);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1387752585);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ChatContentViewModel.MessageViewModel messageViewModel = (ChatContentViewModel.MessageViewModel) this.entryViewModel$delegate.getValue();
            if (messageViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, i3) { // from class: com.squareup.cash.support.chat.views.transcript.viewholder.MessageActivityComposeView$$ExternalSyntheticLambda3
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ MessageActivityComposeView f$0;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            MessageActivityComposeView messageActivityComposeView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    messageActivityComposeView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    messageActivityComposeView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-745408034, new ActionPillKt$$ExternalSyntheticLambda1(28, messageViewModel, this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i4) { // from class: com.squareup.cash.support.chat.views.transcript.viewholder.MessageActivityComposeView$$ExternalSyntheticLambda3
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ MessageActivityComposeView f$0;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    MessageActivityComposeView messageActivityComposeView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            messageActivityComposeView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            messageActivityComposeView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void setOnActivityClickListener(Function1<? super FormattedPaymentHistoryActivityItem, Unit> function1) {
        function1.getClass();
        this.onActivityClick = function1;
    }

    public final void setOnDeleteMessage(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onDeleteMessage = function1;
    }

    public final void setOnResendMessage(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onResendMessage = function1;
    }

    public final void setViewModel(ChatContentViewModel.EntryViewModel entryViewModel) {
        entryViewModel.getClass();
        this.entryViewModel$delegate.setValue(entryViewModel instanceof ChatContentViewModel.MessageViewModel ? (ChatContentViewModel.MessageViewModel) entryViewModel : null);
    }
}
