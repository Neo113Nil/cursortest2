package com.squareup.cash.support.backend.api.activities;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.chat.backend.api.ChatStatus;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.screens.ChatTransactionPickerResult;
import com.squareup.cash.support.chat.screens.ChatTransactionQuestion;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.screens.SupportScreens;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Amount implements Parcelable {
    public static final Parcelable.Creator<Amount> CREATOR = new Creator(0);
    public final String amountFormatted;
    public final AmountTreatment amountTreatment;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf = null;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Amount(parcel.readString(), AmountTreatment.valueOf(parcel.readString()));
                case 1:
                    parcel.getClass();
                    return new Avatar(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 2:
                    parcel.getClass();
                    return new SupportTransaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Avatar.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null);
                case 3:
                    parcel.getClass();
                    return new ChatStatus.Enabled(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
                case 4:
                    parcel.getClass();
                    parcel.readInt();
                    return ChatStatus.FeatureDisabled.INSTANCE;
                case 5:
                    parcel.getClass();
                    return new Conversation(Conversation.BotStatus.valueOf(parcel.readString()));
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return ChatTransactionPickerResult.Failure.INSTANCE;
                case 7:
                    parcel.getClass();
                    return new ChatTransactionPickerResult.Success(parcel.readString());
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return ChatTransactionQuestion.INSTANCE;
                case 9:
                    parcel.getClass();
                    return new SupportChatScreens.FlowScreen.ChatImageDetail(parcel.readString());
                case 10:
                    parcel.getClass();
                    return new SupportChatScreens.FlowScreen.ChatLoading((Screen) parcel.readParcelable(SupportChatScreens.FlowScreen.ChatLoading.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), SupportChatScreens.FlowScreen.ChatLoading.Source.valueOf(parcel.readString()), (BlockersData.MoneybotContext) parcel.readParcelable(SupportChatScreens.FlowScreen.ChatLoading.class.getClassLoader()));
                case 11:
                    parcel.getClass();
                    return new SupportChatScreens.FlowScreen.ChatScreen(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
                case 12:
                    parcel.getClass();
                    return new SupportChatScreens.FlowScreen.ChatSurveyScreen(parcel.readString());
                case 13:
                    parcel.getClass();
                    return new SupportChatScreens.FlowScreen.ChatTransactionPicker((AskedQuestion) parcel.readParcelable(SupportChatScreens.FlowScreen.ChatTransactionPicker.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new SupportChatScreens.SupportChatDialogs.ChatErrorDialog(parcel.readString(), parcel.readString());
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.INSTANCE;
                case 16:
                    parcel.getClass();
                    parcel.readInt();
                    return SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.EndConversation.INSTANCE;
                case 17:
                    parcel.getClass();
                    parcel.readInt();
                    return SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.SaveAndContinue.INSTANCE;
                case 18:
                    parcel.getClass();
                    return new SupportChatScreens.SupportChatDialogs.ChatExitPrompt(parcel.readString(), (AskedQuestion) parcel.readParcelable(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    return new SupportChatScreens.SupportChatDialogs.ChatSurveyUnavailable(parcel.readString());
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.INSTANCE;
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation.INSTANCE;
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.SaveAndContinue.INSTANCE;
                case 23:
                    parcel.getClass();
                    return new SupportChatScreens.SupportChatSheets.ChatExitPromptSheet(parcel.readString(), (AskedQuestion) parcel.readParcelable(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet(parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Conversation) parcel.readParcelable(SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet.class.getClassLoader()), parcel.readInt() != 0);
                case 25:
                    parcel.getClass();
                    return new Incident(parcel.readString(), parcel.readString(), parcel.readString(), (Instant) parcel.readSerializable(), parcel.readInt() != 0, Incident.Status.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 26:
                    parcel.getClass();
                    return new SupportScreens.ContactScreens.ContactSupportEmailInputScreen(parcel.readString(), (Redacted) parcel.readParcelable(SupportScreens.ContactScreens.ContactSupportEmailInputScreen.class.getClassLoader()), SupportScreens.ContactScreens.Data.CREATOR.createFromParcel(parcel));
                case 27:
                    parcel.getClass();
                    return new SupportScreens.ContactScreens.ContactSupportMessageScreen(SupportScreens.ContactScreens.Data.CREATOR.createFromParcel(parcel));
                case 28:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    Article.ContactOption valueOf2 = Article.ContactOption.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new SupportScreens.ContactScreens.Data(readString, readString2, readString3, valueOf2, valueOf, (Redacted) parcel.readParcelable(SupportScreens.ContactScreens.Data.class.getClassLoader()), (Redacted) parcel.readParcelable(SupportScreens.ContactScreens.Data.class.getClassLoader()), (Redacted) parcel.readParcelable(SupportScreens.ContactScreens.Data.class.getClassLoader()), (Screen) parcel.readParcelable(SupportScreens.ContactScreens.Data.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new SupportScreens.FlowScreens.ArticleScreen((SupportScreens.FlowScreens.SupportArticleConfig) parcel.readParcelable(SupportScreens.FlowScreens.ArticleScreen.class.getClassLoader()), SupportScreens.FlowScreens.Data.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Amount[i];
                case 1:
                    return new Avatar[i];
                case 2:
                    return new SupportTransaction[i];
                case 3:
                    return new ChatStatus.Enabled[i];
                case 4:
                    return new ChatStatus.FeatureDisabled[i];
                case 5:
                    return new Conversation[i];
                case 6:
                    return new ChatTransactionPickerResult.Failure[i];
                case 7:
                    return new ChatTransactionPickerResult.Success[i];
                case 8:
                    return new ChatTransactionQuestion[i];
                case 9:
                    return new SupportChatScreens.FlowScreen.ChatImageDetail[i];
                case 10:
                    return new SupportChatScreens.FlowScreen.ChatLoading[i];
                case 11:
                    return new SupportChatScreens.FlowScreen.ChatScreen[i];
                case 12:
                    return new SupportChatScreens.FlowScreen.ChatSurveyScreen[i];
                case 13:
                    return new SupportChatScreens.FlowScreen.ChatTransactionPicker[i];
                case 14:
                    return new SupportChatScreens.SupportChatDialogs.ChatErrorDialog[i];
                case 15:
                    return new SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion[i];
                case 16:
                    return new SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.EndConversation[i];
                case 17:
                    return new SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.SaveAndContinue[i];
                case 18:
                    return new SupportChatScreens.SupportChatDialogs.ChatExitPrompt[i];
                case 19:
                    return new SupportChatScreens.SupportChatDialogs.ChatSurveyUnavailable[i];
                case 20:
                    return new SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion[i];
                case 21:
                    return new SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation[i];
                case 22:
                    return new SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.SaveAndContinue[i];
                case 23:
                    return new SupportChatScreens.SupportChatSheets.ChatExitPromptSheet[i];
                case 24:
                    return new SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet[i];
                case 25:
                    return new Incident[i];
                case 26:
                    return new SupportScreens.ContactScreens.ContactSupportEmailInputScreen[i];
                case 27:
                    return new SupportScreens.ContactScreens.ContactSupportMessageScreen[i];
                case 28:
                    return new SupportScreens.ContactScreens.Data[i];
                default:
                    return new SupportScreens.FlowScreens.ArticleScreen[i];
            }
        }
    }

    public Amount(String str, AmountTreatment amountTreatment) {
        str.getClass();
        amountTreatment.getClass();
        this.amountFormatted = str;
        this.amountTreatment = amountTreatment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj;
        return Intrinsics.areEqual(this.amountFormatted, amount.amountFormatted) && this.amountTreatment == amount.amountTreatment;
    }

    public final int hashCode() {
        return this.amountTreatment.hashCode() + (this.amountFormatted.hashCode() * 31);
    }

    public final String toString() {
        return "Amount(amountFormatted=" + this.amountFormatted + ", amountTreatment=" + this.amountTreatment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.amountFormatted);
        parcel.writeString(this.amountTreatment.name());
    }
}
