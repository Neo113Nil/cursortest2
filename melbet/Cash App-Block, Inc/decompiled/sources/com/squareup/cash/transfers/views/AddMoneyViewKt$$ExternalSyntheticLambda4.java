package com.squareup.cash.transfers.views;

import android.view.View;
import androidx.compose.ui.focus.FocusRequester;
import com.squareup.util.android.Keyboards;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class AddMoneyViewKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FocusRequester f$0;
    public final /* synthetic */ View f$1;

    public /* synthetic */ AddMoneyViewKt$$ExternalSyntheticLambda4(FocusRequester focusRequester, View view, int i) {
        this.$r8$classId = i;
        this.f$0 = focusRequester;
        this.f$1 = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        View view = this.f$1;
        FocusRequester focusRequester = this.f$0;
        switch (i) {
            case 0:
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                Keyboards.showKeyboard(view);
                break;
            case 1:
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                Keyboards.showKeyboard(view);
                break;
            default:
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                Keyboards.showKeyboard(view);
                break;
        }
        return Unit.INSTANCE;
    }
}
