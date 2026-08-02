package com.squareup.cash.support.views.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SupportHomeViewKt$$ExternalSyntheticLambda15 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SupportHomeViewModel.Loaded f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SupportHomeViewKt$$ExternalSyntheticLambda15(SupportHomeViewModel.Loaded loaded, Function1 function1, int i) {
        this.$r8$classId = 0;
        this.f$0 = loaded;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        SupportHomeViewModel.Loaded loaded = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                SupportHomeViewKt.Loaded(loaded, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    List list = loaded.notifications;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(18, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SupportHomeViewKt.SupportNotifications(list, (Function1) rememberedValue, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    List list2 = loaded.suggestedActions;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(19, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    SupportHomeViewKt.SuggestedActions(list2, (Function1) rememberedValue2, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                int intValue3 = num.intValue();
                GapComposer gapComposer3 = (GapComposer) composer;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                } else if (loaded.showArticleError) {
                    gapComposer3.startReplaceGroup(702698204);
                    SupportHomeViewKt.SupportHomeAlert(gapComposer3, 0);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(702745882);
                    List list3 = loaded.categories;
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda5(17, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    SupportHomeViewKt.BrowseCategories(list3, (Function1) rememberedValue3, gapComposer3, 0);
                    gapComposer3.end(false);
                }
                break;
            default:
                int intValue4 = num.intValue();
                GapComposer gapComposer4 = (GapComposer) composer;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    SupportHomeViewKt.ContactUs(loaded.contactOptions, function1, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SupportHomeViewKt$$ExternalSyntheticLambda15(SupportHomeViewModel.Loaded loaded, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = loaded;
        this.f$1 = function1;
    }
}
