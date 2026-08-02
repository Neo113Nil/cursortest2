package com.squareup.cash.support.chat.views.transcript.message;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ComposeDialogKt$Modal$3$1$1$dialog$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TransactionBodyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class TransactionBodyView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposeDialogKt$Modal$3$1$1$dialog$1 f$0;

    public /* synthetic */ TransactionBodyView$$ExternalSyntheticLambda0(ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$1, int i) {
        this.$r8$classId = 1;
        this.f$0 = composeDialogKt$Modal$3$1$1$dialog$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 2;
        byte b = 0;
        ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$1 = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-505795980, new TransactionBodyView$$ExternalSyntheticLambda0(composeDialogKt$Modal$3$1$1$dialog$1, i2, b), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                composeDialogKt$Modal$3$1$1$dialog$1.Content(composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) composeDialogKt$Modal$3$1$1$dialog$1.$onBack;
                    AndroidStringManager androidStringManager = (AndroidStringManager) composeDialogKt$Modal$3$1$1$dialog$1.$content;
                    ActionBodyViewKt.TransactionBodyContent((BodyViewModel$TransactionBodyViewModel) parcelableSnapshotMutableState.getValue(), androidStringManager.get(R.string.support_chat_transaction_loading), androidStringManager.get(R.string.support_chat_transaction_missing), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TransactionBodyView$$ExternalSyntheticLambda0(ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = composeDialogKt$Modal$3$1$1$dialog$1;
    }
}
