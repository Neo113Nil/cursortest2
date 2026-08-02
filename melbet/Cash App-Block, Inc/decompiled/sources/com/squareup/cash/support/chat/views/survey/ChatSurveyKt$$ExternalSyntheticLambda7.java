package com.squareup.cash.support.chat.views.survey;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatSurveyKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatSurveyViewModel.Loaded f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ChatSurveyKt$$ExternalSyntheticLambda7(ChatSurveyViewModel.Loaded loaded, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = loaded;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ChatSurveyKt.Satisfaction(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                ChatSurveyKt.Resolution(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
