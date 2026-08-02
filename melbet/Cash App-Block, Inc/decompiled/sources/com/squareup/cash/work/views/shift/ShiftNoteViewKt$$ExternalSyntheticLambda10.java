package com.squareup.cash.work.views.shift;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftNoteViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ShiftNoteViewKt$$ExternalSyntheticLambda10(Function0 function0, Function0 function02, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ShiftListViewKt.DeleteConfirmationDialog(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
            case 1:
                AvatarsKt.MessageDismissModal(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
            case 2:
                ChannelListViewKt.EnablePushDialog(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
            default:
                MessageFileKt.MessageRetryPopupMenuContent(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
