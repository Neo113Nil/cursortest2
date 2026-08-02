package com.squareup.cash.support.chat.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.support.backend.api.activities.Amount;
import com.squareup.cash.support.chat.backend.api.Conversation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class SupportChatScreens implements Screen {

    public abstract class SupportChatDialogs extends SupportChatScreens implements DialogScreen {

        public final class ChatErrorDialog extends SupportChatDialogs {
            public static final Parcelable.Creator<ChatErrorDialog> CREATOR = new Amount.Creator(14);
            public final String message;
            public final String title;

            public ChatErrorDialog(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.message = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChatErrorDialog)) {
                    return false;
                }
                ChatErrorDialog chatErrorDialog = (ChatErrorDialog) obj;
                return Intrinsics.areEqual(this.title, chatErrorDialog.title) && Intrinsics.areEqual(this.message, chatErrorDialog.message);
            }

            public final int hashCode() {
                return this.message.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("ChatErrorDialog(title=", this.title, ", message=", this.message, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.title);
                parcel.writeString(this.message);
            }
        }

        public final class ChatExitPrompt extends SupportChatDialogs {
            public static final Parcelable.Creator<ChatExitPrompt> CREATOR = new Amount.Creator(18);
            public final String flowToken;
            public final AskedQuestion question;

            /* loaded from: classes7.dex */
            public final class ChatExitPromptQuestion implements Question {
                public static final ChatExitPromptQuestion INSTANCE = new ChatExitPromptQuestion();
                public static final Parcelable.Creator<ChatExitPromptQuestion> CREATOR = new Amount.Creator(15);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof ChatExitPromptQuestion);
                }

                public final int hashCode() {
                    return -1234328820;
                }

                public final String toString() {
                    return "ChatExitPromptQuestion";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            /* loaded from: classes7.dex */
            public abstract class ChatExitPromptResult implements Parcelable {

                public final class EndConversation extends ChatExitPromptResult {
                    public static final EndConversation INSTANCE = new EndConversation();
                    public static final Parcelable.Creator<EndConversation> CREATOR = new Amount.Creator(16);

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof EndConversation);
                    }

                    public final int hashCode() {
                        return 2025241011;
                    }

                    public final String toString() {
                        return "EndConversation";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeInt(1);
                    }
                }

                public final class SaveAndContinue extends ChatExitPromptResult {
                    public static final SaveAndContinue INSTANCE = new SaveAndContinue();
                    public static final Parcelable.Creator<SaveAndContinue> CREATOR = new Amount.Creator(17);

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof SaveAndContinue);
                    }

                    public final int hashCode() {
                        return 356366998;
                    }

                    public final String toString() {
                        return "SaveAndContinue";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeInt(1);
                    }
                }
            }

            public ChatExitPrompt(String str, AskedQuestion askedQuestion) {
                str.getClass();
                askedQuestion.getClass();
                this.flowToken = str;
                this.question = askedQuestion;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChatExitPrompt)) {
                    return false;
                }
                ChatExitPrompt chatExitPrompt = (ChatExitPrompt) obj;
                return Intrinsics.areEqual(this.flowToken, chatExitPrompt.flowToken) && Intrinsics.areEqual(this.question, chatExitPrompt.question);
            }

            public final int hashCode() {
                return this.question.hashCode() + (this.flowToken.hashCode() * 31);
            }

            public final String toString() {
                return "ChatExitPrompt(flowToken=" + this.flowToken + ", question=" + this.question + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.flowToken);
                parcel.writeParcelable(this.question, i);
            }
        }

        public final class ChatSurveyUnavailable extends SupportChatDialogs {
            public static final Parcelable.Creator<ChatSurveyUnavailable> CREATOR = new Amount.Creator(19);
            public final String surveyToken;

            public ChatSurveyUnavailable(String str) {
                str.getClass();
                this.surveyToken = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChatSurveyUnavailable) && Intrinsics.areEqual(this.surveyToken, ((ChatSurveyUnavailable) obj).surveyToken);
            }

            public final int hashCode() {
                return this.surveyToken.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChatSurveyUnavailable(surveyToken=", this.surveyToken, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.surveyToken);
            }
        }
    }

    public abstract class SupportChatSheets extends SupportChatScreens implements OnlyOneOverlayTreatment {

        public final class ChatExitPromptSheet extends SupportChatSheets {
            public static final Parcelable.Creator<ChatExitPromptSheet> CREATOR = new Amount.Creator(23);
            public final String flowToken;
            public final AskedQuestion question;

            /* loaded from: classes7.dex */
            public final class ChatExitPromptSheetQuestion implements Question {
                public static final ChatExitPromptSheetQuestion INSTANCE = new ChatExitPromptSheetQuestion();
                public static final Parcelable.Creator<ChatExitPromptSheetQuestion> CREATOR = new Amount.Creator(20);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof ChatExitPromptSheetQuestion);
                }

                public final int hashCode() {
                    return 923970413;
                }

                public final String toString() {
                    return "ChatExitPromptSheetQuestion";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            /* loaded from: classes7.dex */
            public abstract class ChatExitPromptSheetResult implements Parcelable {

                public final class EndConversation extends ChatExitPromptSheetResult {
                    public static final EndConversation INSTANCE = new EndConversation();
                    public static final Parcelable.Creator<EndConversation> CREATOR = new Amount.Creator(21);

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof EndConversation);
                    }

                    public final int hashCode() {
                        return 1544619092;
                    }

                    public final String toString() {
                        return "EndConversation";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeInt(1);
                    }
                }

                public final class SaveAndContinue extends ChatExitPromptSheetResult {
                    public static final SaveAndContinue INSTANCE = new SaveAndContinue();
                    public static final Parcelable.Creator<SaveAndContinue> CREATOR = new Amount.Creator(22);

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof SaveAndContinue);
                    }

                    public final int hashCode() {
                        return -124254921;
                    }

                    public final String toString() {
                        return "SaveAndContinue";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeInt(1);
                    }
                }
            }

            public ChatExitPromptSheet(String str, AskedQuestion askedQuestion) {
                str.getClass();
                askedQuestion.getClass();
                this.flowToken = str;
                this.question = askedQuestion;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChatExitPromptSheet)) {
                    return false;
                }
                ChatExitPromptSheet chatExitPromptSheet = (ChatExitPromptSheet) obj;
                return Intrinsics.areEqual(this.flowToken, chatExitPromptSheet.flowToken) && Intrinsics.areEqual(this.question, chatExitPromptSheet.question);
            }

            public final int hashCode() {
                return this.question.hashCode() + (this.flowToken.hashCode() * 31);
            }

            public final String toString() {
                return "ChatExitPromptSheet(flowToken=" + this.flowToken + ", question=" + this.question + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.flowToken);
                parcel.writeParcelable(this.question, i);
            }
        }

        public final class ChatFailedDeliverySheet extends SupportChatSheets {
            public static final Parcelable.Creator<ChatFailedDeliverySheet> CREATOR = new Amount.Creator(24);
            public final boolean allowResend;
            public final Conversation conversation;
            public final String flowToken;
            public final boolean isTypingIndicatorDisplayed;
            public final String messageIdempotenceToken;

            public ChatFailedDeliverySheet(String str, boolean z, String str2, Conversation conversation, boolean z2) {
                str.getClass();
                this.messageIdempotenceToken = str;
                this.allowResend = z;
                this.flowToken = str2;
                this.conversation = conversation;
                this.isTypingIndicatorDisplayed = z2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChatFailedDeliverySheet)) {
                    return false;
                }
                ChatFailedDeliverySheet chatFailedDeliverySheet = (ChatFailedDeliverySheet) obj;
                return Intrinsics.areEqual(this.messageIdempotenceToken, chatFailedDeliverySheet.messageIdempotenceToken) && this.allowResend == chatFailedDeliverySheet.allowResend && Intrinsics.areEqual(this.flowToken, chatFailedDeliverySheet.flowToken) && Intrinsics.areEqual(this.conversation, chatFailedDeliverySheet.conversation) && this.isTypingIndicatorDisplayed == chatFailedDeliverySheet.isTypingIndicatorDisplayed;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.messageIdempotenceToken.hashCode() * 31, 31, this.allowResend);
                String str = this.flowToken;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                Conversation conversation = this.conversation;
                return Boolean.hashCode(this.isTypingIndicatorDisplayed) + ((hashCode + (conversation != null ? conversation.botStatus.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("ChatFailedDeliverySheet(messageIdempotenceToken=", this.messageIdempotenceToken, ", allowResend=", ", flowToken=", this.allowResend);
                m1540m.append(this.flowToken);
                m1540m.append(", conversation=");
                m1540m.append(this.conversation);
                m1540m.append(", isTypingIndicatorDisplayed=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.isTypingIndicatorDisplayed, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.messageIdempotenceToken);
                parcel.writeInt(this.allowResend ? 1 : 0);
                parcel.writeString(this.flowToken);
                parcel.writeParcelable(this.conversation, i);
                parcel.writeInt(this.isTypingIndicatorDisplayed ? 1 : 0);
            }
        }
    }

    public abstract class FlowScreen extends SupportChatScreens {

        public final class ChatImageDetail extends FlowScreen {
            public static final Parcelable.Creator<ChatImageDetail> CREATOR = new Amount.Creator(9);
            public final String url;

            public ChatImageDetail(String str) {
                str.getClass();
                this.url = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChatImageDetail) && Intrinsics.areEqual(this.url, ((ChatImageDetail) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChatImageDetail(url=", this.url, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.url);
            }
        }

        public final class ChatScreen extends FlowScreen {
            public static final Parcelable.Creator<ChatScreen> CREATOR = new Amount.Creator(11);
            public final boolean autoKeyboard;
            public final String flowToken;
            public final List ignoredPhrases;

            public ChatScreen(String str, List list, boolean z) {
                str.getClass();
                this.flowToken = str;
                this.ignoredPhrases = list;
                this.autoKeyboard = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChatScreen)) {
                    return false;
                }
                ChatScreen chatScreen = (ChatScreen) obj;
                return Intrinsics.areEqual(this.flowToken, chatScreen.flowToken) && Intrinsics.areEqual(this.ignoredPhrases, chatScreen.ignoredPhrases) && this.autoKeyboard == chatScreen.autoKeyboard;
            }

            public final int hashCode() {
                int hashCode = this.flowToken.hashCode() * 31;
                List list = this.ignoredPhrases;
                return Boolean.hashCode(this.autoKeyboard) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return "support_chat_screen";
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("ChatScreen(flowToken=", this.flowToken, ", ignoredPhrases=", ", autoKeyboard=", this.ignoredPhrases), this.autoKeyboard, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.flowToken);
                parcel.writeStringList(this.ignoredPhrases);
                parcel.writeInt(this.autoKeyboard ? 1 : 0);
            }
        }

        public final class ChatSurveyScreen extends FlowScreen {
            public static final Parcelable.Creator<ChatSurveyScreen> CREATOR = new Amount.Creator(12);
            public final String surveyToken;

            public ChatSurveyScreen(String str) {
                str.getClass();
                this.surveyToken = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChatSurveyScreen) && Intrinsics.areEqual(this.surveyToken, ((ChatSurveyScreen) obj).surveyToken);
            }

            public final int hashCode() {
                return this.surveyToken.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChatSurveyScreen(surveyToken=", this.surveyToken, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.surveyToken);
            }
        }

        public final class ChatTransactionPicker extends FlowScreen {
            public static final Parcelable.Creator<ChatTransactionPicker> CREATOR = new Amount.Creator(13);
            public final AskedQuestion question;

            public ChatTransactionPicker(AskedQuestion askedQuestion) {
                askedQuestion.getClass();
                this.question = askedQuestion;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChatTransactionPicker) && Intrinsics.areEqual(this.question, ((ChatTransactionPicker) obj).question);
            }

            public final int hashCode() {
                return this.question.hashCode();
            }

            public final String toString() {
                return "ChatTransactionPicker(question=" + this.question + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.question, i);
            }
        }

        public final class ChatLoading extends FlowScreen {
            public static final Parcelable.Creator<ChatLoading> CREATOR = new Amount.Creator(10);
            public final String entityId;
            public final Screen exitScreen;
            public final String flowToken;
            public final BlockersData.MoneybotContext moneybotContext;
            public final String nodeToken;
            public final Source source;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* loaded from: classes7.dex */
            public final class Source {
                public static final /* synthetic */ Source[] $VALUES;
                public static final Source NOTIFICATION;
                public static final Source OTHER;
                public static final Source SUPPORT_HOME_NOTIFICATION;

                static {
                    Source source = new Source("NOTIFICATION", 0);
                    NOTIFICATION = source;
                    Source source2 = new Source("SUPPORT_HOME_NOTIFICATION", 1);
                    SUPPORT_HOME_NOTIFICATION = source2;
                    Source source3 = new Source("OTHER", 2);
                    OTHER = source3;
                    $VALUES = new Source[]{source, source2, source3};
                }

                public static Source valueOf(String str) {
                    return (Source) Enum.valueOf(Source.class, str);
                }

                public static Source[] values() {
                    return (Source[]) $VALUES.clone();
                }
            }

            public ChatLoading(Screen screen, String str, String str2, String str3, Source source, BlockersData.MoneybotContext moneybotContext) {
                screen.getClass();
                str3.getClass();
                source.getClass();
                this.exitScreen = screen;
                this.entityId = str;
                this.nodeToken = str2;
                this.flowToken = str3;
                this.source = source;
                this.moneybotContext = moneybotContext;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChatLoading)) {
                    return false;
                }
                ChatLoading chatLoading = (ChatLoading) obj;
                return Intrinsics.areEqual(this.exitScreen, chatLoading.exitScreen) && Intrinsics.areEqual(this.entityId, chatLoading.entityId) && Intrinsics.areEqual(this.nodeToken, chatLoading.nodeToken) && Intrinsics.areEqual(this.flowToken, chatLoading.flowToken) && this.source == chatLoading.source && Intrinsics.areEqual(this.moneybotContext, chatLoading.moneybotContext);
            }

            public final int hashCode() {
                int hashCode = this.exitScreen.hashCode() * 31;
                String str = this.entityId;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.nodeToken;
                int hashCode3 = (this.source.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.flowToken)) * 31;
                BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
                return hashCode3 + (moneybotContext != null ? moneybotContext.hashCode() : 0);
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return "support_chat_loading_screen";
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ChatLoading(exitScreen=");
                sb.append(this.exitScreen);
                sb.append(", entityId=");
                sb.append(this.entityId);
                sb.append(", nodeToken=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.nodeToken, ", flowToken=", this.flowToken, ", source=");
                sb.append(this.source);
                sb.append(", moneybotContext=");
                sb.append(this.moneybotContext);
                sb.append(")");
                return sb.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.exitScreen, i);
                parcel.writeString(this.entityId);
                parcel.writeString(this.nodeToken);
                parcel.writeString(this.flowToken);
                parcel.writeString(this.source.name());
                parcel.writeParcelable(this.moneybotContext, i);
            }

            public /* synthetic */ ChatLoading(Screen screen, String str, String str2, String str3, Source source, BlockersData.MoneybotContext moneybotContext, int i) {
                this(screen, str, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? Source.OTHER : source, (i & 32) != 0 ? null : moneybotContext);
            }
        }
    }
}
