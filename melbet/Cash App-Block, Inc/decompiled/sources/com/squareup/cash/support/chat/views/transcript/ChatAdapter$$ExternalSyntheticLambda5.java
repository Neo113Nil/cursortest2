package com.squareup.cash.support.chat.views.transcript;

import app.cash.broadway.ui.Ui;
import com.squareup.cash.investing.components.dependent.DependentWelcomeNullStateView;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewEvent;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final /* synthetic */ class ChatAdapter$$ExternalSyntheticLambda5 implements Ui.EventReceiver {
    public final /* synthetic */ int $r8$classId;

    @Override // app.cash.broadway.ui.Ui.EventReceiver
    public final void sendEvent(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Unit) obj).getClass();
                break;
            default:
                int i = DependentWelcomeNullStateView.$r8$clinit;
                ((DependentWelcomeViewEvent) obj).getClass();
                break;
        }
    }
}
