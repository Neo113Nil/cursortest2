package com.squareup.cash.transfers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class AddMoneyViewKt$$ExternalSyntheticLambda23 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ AddMoneyViewKt$$ExternalSyntheticLambda23(Modifier modifier, String str, String str2, boolean z, int i) {
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.AtmHeader(Updater.updateChangedFlags(1), (Composer) obj, this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((Integer) obj2).getClass();
                MessageFileKt.MessageSenderName(Updater.updateChangedFlags(1), (Composer) obj, this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AddMoneyViewKt$$ExternalSyntheticLambda23(String str, String str2, boolean z, Modifier modifier, int i) {
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = z;
        this.f$0 = modifier;
    }
}
