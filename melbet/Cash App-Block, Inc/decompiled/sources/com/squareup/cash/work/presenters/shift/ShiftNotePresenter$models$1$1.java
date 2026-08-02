package com.squareup.cash.work.presenters.shift;

import androidx.compose.runtime.MutableState;
import app.cash.api.ApiResult;
import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.profile.presenters.personalizedads.RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings;
import com.squareup.cash.profile.presenters.searchprivacy.RealSearchPrivacySettingsPresenter$SettingInteractState;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.shopping.autofill.presenters.AutofillState;
import com.squareup.cash.support.chat.presenters.ChatExitPromptSheetState;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.franklin.lending.SyncPrepurchaseCashCardResponse;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class ShiftNotePresenter$models$1$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $toastState$delegate;

    public ShiftNotePresenter$models$1$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState) {
        this.$r8$classId = 1;
        this.$toastState$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$toastState$delegate;
        switch (i) {
            case 0:
                mutableState.setValue((ToastState) obj);
                break;
            case 1:
                SyncPrepurchaseCashCardResponse syncPrepurchaseCashCardResponse = (SyncPrepurchaseCashCardResponse) obj;
                syncPrepurchaseCashCardResponse.getClass();
                List list = syncPrepurchaseCashCardResponse.alternative_locale_applet_data_list;
                PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = syncPrepurchaseCashCardResponse.applet_data;
                prepurchaseCashCardAppletData.getClass();
                mutableState.setValue(CollectionsKt.plus((Collection) list, (Object) prepurchaseCashCardAppletData));
                break;
            case 2:
                Category category = (Category) obj;
                category.getClass();
                mutableState.setValue(category);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                break;
            case 4:
                ApiResult.Failure failure = (ApiResult.Failure) obj;
                failure.getClass();
                mutableState.setValue(new AutofillState.Error(failure));
                break;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings = (RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings) mutableState.getValue();
                mutableState.setValue(realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings != null ? new RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings(booleanValue, realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings.description) : null);
                break;
            case 6:
                ((RealSearchPrivacySettingsPresenter$SettingInteractState) obj).getClass();
                mutableState.setValue(MapsKt__MapsKt.plus((Map) mutableState.getValue(), new Pair(null, false)));
                break;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 8:
                ChatExitPromptSheetState chatExitPromptSheetState = (ChatExitPromptSheetState) obj;
                chatExitPromptSheetState.getClass();
                mutableState.setValue(chatExitPromptSheetState);
                break;
            case 9:
                ChatSurveyViewModel chatSurveyViewModel = (ChatSurveyViewModel) obj;
                chatSurveyViewModel.getClass();
                mutableState.setValue(chatSurveyViewModel);
                break;
            case 10:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                break;
            default:
                mutableState.setValue((ToastState) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShiftNotePresenter$models$1$1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.$toastState$delegate = mutableState;
    }
}
